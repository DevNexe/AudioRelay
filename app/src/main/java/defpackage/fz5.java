package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fz5 {
    public static volatile w66 d;
    public final xv6 a;
    public final ta7 b;
    public volatile long c;

    public fz5(xv6 xv6Var) {
        oa3.h(xv6Var);
        this.a = xv6Var;
        this.b = new ta7(this, xv6Var, 9);
    }

    public final void a() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public abstract void b();

    public final void c(long j) {
        a();
        if (j >= 0) {
            this.c = this.a.b().b();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            this.a.zzay().f.c(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final Handler d() {
        w66 w66Var;
        if (d != null) {
            return d;
        }
        synchronized (fz5.class) {
            if (d == null) {
                d = new w66(this.a.c().getMainLooper());
            }
            w66Var = d;
        }
        return w66Var;
    }
}
