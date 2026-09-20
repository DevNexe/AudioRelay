package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class oe0 {
    public final SharedPreferences a;
    public final qx0 b;
    public final Object c;
    public z05<Void> d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final z05<Void> h;

    public oe0(qx0 qx0Var) {
        Boolean boolValueOf;
        Object obj = new Object();
        this.c = obj;
        this.d = new z05<>();
        this.e = false;
        this.f = false;
        this.h = new z05<>();
        qx0Var.a();
        Context context = qx0Var.a;
        this.b = qx0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        this.g = boolValueOf == null ? a(context) : boolValueOf;
        synchronized (obj) {
            if (b()) {
                this.d.c(null);
                this.e = true;
            }
        }
    }

    public final Boolean a(Context context) {
        Boolean boolValueOf;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
        }
        if (boolValueOf == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    public final synchronized boolean b() {
        boolean z;
        boolean zBooleanValue;
        Boolean bool = this.g;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            qx0 qx0Var = this.b;
            qx0Var.a();
            pe0 pe0Var = qx0Var.g.get();
            synchronized (pe0Var) {
                z = pe0Var.b;
            }
            zBooleanValue = z;
        }
        c(zBooleanValue);
        return zBooleanValue;
    }

    public final void c(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String str3 = String.format("Crashlytics automatic data collection %s by %s.", str2, str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str3, null);
        }
    }
}
