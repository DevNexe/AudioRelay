package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c25 {
    public final Z7jl a;
    public final w55 b;
    public final int c;
    public final boolean d;
    public final int e;
    public final ij0 f;
    public final e41.QnHx g;
    public final List<Z7jl.CQf<e43>> h;
    public lh2 i;
    public jy1 j;

    public c25(Z7jl z7jl, w55 w55Var, int i, boolean z, int i2, ij0 ij0Var, e41.QnHx qnHx, List list) {
        this.a = z7jl;
        this.b = w55Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = ij0Var;
        this.g = qnHx;
        this.h = list;
        if (!(i > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    public final o55 a(long j, jy1 jy1Var, o55 o55Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.c;
        boolean z5 = this.d;
        int i2 = this.e;
        if (o55Var != null) {
            kh2 kh2Var = o55Var.b;
            boolean zA = kh2Var.a.a();
            m55 m55Var = o55Var.a;
            if (!zA && ur1.a(m55Var.a, this.a)) {
                w55 w55Var = this.b;
                w55 w55Var2 = m55Var.b;
                if (w55Var2 != w55Var) {
                    z4 = ur1.a(w55Var2.b, w55Var.b) && w55Var2.a.b(w55Var.a);
                    if (!z4 && ur1.a(m55Var.c, this.h) && m55Var.d == i && m55Var.e == z5) {
                        if ((m55Var.f == i2) && ur1.a(m55Var.g, this.f) && m55Var.h == jy1Var && ur1.a(m55Var.i, this.g)) {
                            int iJ = g70.j(j);
                            long j2 = m55Var.j;
                            if (iJ != g70.j(j2)) {
                                z3 = false;
                            } else if (!z5) {
                                if (i2 == 2) {
                                    if (g70.h(j) == g70.h(j2)) {
                                    }
                                    z3 = false;
                                }
                                z3 = true;
                            } else if (g70.h(j) == g70.h(j2) || g70.g(j) != g70.g(j2)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    w55Var2.getClass();
                }
                if (!z4) {
                    z3 = false;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                return new o55(new m55(m55Var.a, this.b, m55Var.c, m55Var.d, m55Var.e, m55Var.f, m55Var.g, m55Var.h, m55Var.i, j), kh2Var, FWT.t(j, C0239D.e((int) Math.ceil(kh2Var.d), (int) Math.ceil(kh2Var.e))));
            }
        }
        b(jy1Var);
        int iJ2 = g70.j(j);
        if (z5) {
            z = true;
        } else {
            if (i2 == 2) {
                z = true;
            } else {
                z = false;
            }
        }
        int iH = (z && g70.d(j)) ? g70.h(j) : Integer.MAX_VALUE;
        if (z5) {
            z2 = false;
        } else {
            if (i2 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        int i3 = z2 ? 1 : i;
        if (iJ2 != iH) {
            lh2 lh2Var = this.i;
            if (lh2Var == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            iH = AY.o((int) Math.ceil(lh2Var.c()), iJ2, iH);
        }
        lh2 lh2Var2 = this.i;
        if (lh2Var2 == null) {
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }
        kh2 kh2Var2 = new kh2(lh2Var2, FWT.n(iH, g70.g(j), 5), i3, i2 == 2);
        return new o55(new m55(this.a, this.b, this.h, this.c, this.d, this.e, this.f, jy1Var, this.g, j), kh2Var2, FWT.t(j, C0239D.e((int) Math.ceil(kh2Var2.d), (int) Math.ceil(kh2Var2.e))));
    }

    public final void b(jy1 jy1Var) {
        lh2 lh2Var = this.i;
        if (lh2Var == null || jy1Var != this.j || lh2Var.a()) {
            this.j = jy1Var;
            lh2Var = new lh2(this.a, m57.f(this.b, jy1Var), this.h, this.f, this.g);
        }
        this.i = lh2Var;
    }

    public /* synthetic */ c25(Z7jl z7jl, w55 w55Var, int i, boolean z, int i2, ij0 ij0Var, e41.QnHx qnHx, int i3) {
        this(z7jl, w55Var, (i3 & 4) != 0 ? Integer.MAX_VALUE : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? 1 : i2, ij0Var, qnHx, (i3 & 128) != 0 ? cs0.w : null);
    }
}
