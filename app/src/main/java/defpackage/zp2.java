package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class zp2 {
    public xp2 a;

    public void a(Bundle bundle) {
        String strC = c();
        if (strC != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
        }
    }

    public abstract void b(eq2 eq2Var);

    public String c() {
        return null;
    }

    public void d() {
    }

    public void e() {
    }

    public final void f(xp2 xp2Var) {
        if (this.a != xp2Var) {
            this.a = xp2Var;
            if (xp2Var != null) {
                xp2Var.d(this);
            }
        }
    }
}
