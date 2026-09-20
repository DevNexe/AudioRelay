package defpackage;

import android.util.Log;
import defpackage.ic0;
import defpackage.kt4;
import defpackage.sx0;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sx0 implements yb0 {
    public final ic0 a;
    public final boolean b;
    public String c;

    public sx0(ic0 ic0Var, boolean z) {
        this.a = ic0Var;
        this.b = z;
    }

    @Override // defpackage.yb0
    public final fk2 a(String str) {
        return new pq2(this.a.a(str));
    }

    @Override // defpackage.yb0
    public final boolean b() {
        String str = this.c;
        return str != null && c(str);
    }

    @Override // defpackage.yb0
    public final boolean c(String str) {
        File file = this.a.a(str).a;
        return file != null && file.exists();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.firebase.crashlytics.ndk.CQf] */
    @Override // defpackage.yb0
    public final synchronized void d(final String str, final String str2, final long j, final kt4 kt4Var) {
        this.c = str;
        ?? r7 = new Object() { // from class: com.google.firebase.crashlytics.ndk.CQf
            public final void a() throws Throwable {
                boolean z;
                String str3 = str2;
                long j2 = j;
                kt4 kt4Var2 = kt4Var;
                sx0 sx0Var = this.a;
                sx0Var.getClass();
                StringBuilder sb = new StringBuilder("Initializing native session: ");
                String str4 = str;
                sb.append(str4);
                String string = sb.toString();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", string, null);
                }
                ic0 ic0Var = sx0Var.a;
                try {
                    if (((JniNativeApi) ic0Var.b).b(ic0Var.a.getAssets(), ic0Var.c.b(str4).getCanonicalPath())) {
                        ic0Var.c(str4, str3, j2);
                        ic0Var.d(str4, kt4Var2.a());
                        ic0Var.g(str4, kt4Var2.c());
                        ic0Var.e(str4, kt4Var2.b());
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Error initializing Crashlytics NDK", e);
                }
                if (z) {
                    return;
                }
                Log.w("FirebaseCrashlytics", "Failed to initialize Crashlytics NDK for session " + str4, null);
            }
        };
        if (this.b) {
            r7.a();
        }
    }
}
