package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class th1 implements ap1 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final w56 a;
    public final Context b;
    public final String c;
    public final yx0 d;
    public final oe0 e;
    public String f;

    public th1(Context context, String str, yx0 yx0Var, oe0 oe0Var) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = yx0Var;
        this.e = oe0Var;
        this.a = new w56();
    }

    public static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized String c() {
        String strB;
        String str = this.f;
        if (str != null) {
            return str;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
        }
        boolean z = false;
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        String str2 = "Cached Firebase Installation ID: " + string;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        if (this.e.b()) {
            try {
                strB = (String) tf5.a(this.d.getId());
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e);
                strB = null;
            }
            String str3 = "Fetched Firebase Installation ID: " + strB;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            if (strB == null) {
                strB = string == null ? b() : string;
            }
            if (strB.equals(string)) {
                this.f = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f = a(sharedPreferences, strB);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                z = true;
            }
            if (z) {
                this.f = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f = a(sharedPreferences, b());
            }
        }
        if (this.f == null) {
            Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
            this.f = a(sharedPreferences, b());
        }
        String str4 = "Crashlytics installation ID: " + this.f;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str4, null);
        }
        return this.f;
    }

    public final String d() {
        String str;
        w56 w56Var = this.a;
        Context context = this.b;
        synchronized (w56Var) {
            if (w56Var.w == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                w56Var.w = installerPackageName;
            }
            str = "".equals(w56Var.w) ? null : w56Var.w;
        }
        return str;
    }
}
