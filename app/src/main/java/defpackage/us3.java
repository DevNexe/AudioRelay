package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class us3 implements vj1 {
    public final ms4 w;

    public us3(ri2 ri2Var, boolean z) {
        this.w = new ms4(ri2Var, z);
    }

    public abstract void e(qd3 qd3Var, ua0 ua0Var);

    public final void f(float f, long j, ez1 ez1Var) {
        ms4 ms4Var = this.w;
        ms4Var.getClass();
        boolean zIsNaN = Float.isNaN(f);
        boolean z = ms4Var.a;
        float fA = zIsNaN ? qs3.a(ez1Var, z, ez1Var.d()) : ez1Var.b0(f);
        float fFloatValue = ms4Var.c.d().floatValue();
        if (fFloatValue > 0.0f) {
            long jB = yu.b(j, fFloatValue);
            if (!z) {
                ez1Var.V(jB, (124 & 2) != 0 ? cm4.d(ez1Var.d()) / 2.0f : fA, (124 & 4) != 0 ? ez1Var.t0() : 0L, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? gx0.w : null, null, (124 & 64) != 0 ? 3 : 0);
                return;
            }
            float fE = cm4.e(ez1Var.d());
            float fC = cm4.c(ez1Var.d());
            en.CQf cQf = ez1Var.w.x;
            long jD = cQf.d();
            cQf.b().e();
            cQf.a.b(0.0f, 0.0f, fE, fC, 1);
            ez1Var.V(jB, (124 & 2) != 0 ? cm4.d(ez1Var.d()) / 2.0f : fA, (124 & 4) != 0 ? ez1Var.t0() : 0L, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? gx0.w : null, null, (124 & 64) != 0 ? 3 : 0);
            cQf.b().r();
            cQf.a(jD);
        }
    }

    public abstract void g(qd3 qd3Var);
}
