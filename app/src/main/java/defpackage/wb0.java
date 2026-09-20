package defpackage;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class wb0 implements Callable<Boolean> {
    public final /* synthetic */ vb0 w;

    public wb0(vb0 vb0Var) {
        this.w = vb0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        rb0 rb0Var = this.w.h;
        ss3 ss3Var = rb0Var.c;
        fx0 fx0Var = (fx0) ss3Var.y;
        String str = (String) ss3Var.x;
        fx0Var.getClass();
        if (!new File(fx0Var.b, str).exists()) {
            String strF = rb0Var.f();
            boolean z = strF != null && rb0Var.j.c(strF);
            return Boolean.valueOf(z);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
        }
        fx0 fx0Var2 = (fx0) ss3Var.y;
        String str2 = (String) ss3Var.x;
        fx0Var2.getClass();
        new File(fx0Var2.b, str2).delete();
        return Boolean.valueOf(z);
    }
}
