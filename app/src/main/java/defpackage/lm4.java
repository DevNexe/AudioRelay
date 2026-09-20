package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lm4 extends zo1 implements uy1 {
    public final float A;
    public final boolean B;
    public final float x;
    public final float y;
    public final float z;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(b43 b43Var) {
            super(1);
            this.w = b43Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx.f(qnHx, this.w, 0, 0);
            return sd5.a;
        }
    }

    public lm4() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm4(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
        wo1.QnHx qnHx = wo1.a;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jM;
        long jB = b(vb2Var);
        if (this.B) {
            jM = FWT.u(j, jB);
        } else {
            if (wm0.a(this.x, Float.NaN)) {
                iJ = g70.j(j);
                int iH2 = g70.h(jB);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = g70.j(jB);
            }
            if (wm0.a(this.z, Float.NaN)) {
                iH = g70.h(j);
                int iJ2 = g70.j(jB);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = g70.h(jB);
            }
            if (wm0.a(this.y, Float.NaN)) {
                i = g70.i(j);
                int iG2 = g70.g(jB);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = g70.i(jB);
            }
            if (wm0.a(this.A, Float.NaN)) {
                iG = g70.g(j);
                int i2 = g70.i(jB);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = g70.g(jB);
            }
            jM = FWT.m(iJ, iH, i, iG);
        }
        b43 b43VarY = ob2Var.y(jM);
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new QnHx(b43VarY));
    }

    @Override // defpackage.uy1
    public final int O(vb2 vb2Var, kz1 kz1Var, int i) {
        long jB = b(vb2Var);
        return g70.e(jB) ? g70.g(jB) : FWT.v(kz1Var.c(i), jB);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    public final long b(ij0 ij0Var) {
        int iP0;
        int iP1;
        int iP2;
        float f = this.z;
        int i = 0;
        if (wm0.a(f, Float.NaN)) {
            iP0 = Integer.MAX_VALUE;
        } else {
            wm0 wm0Var = new wm0(f);
            wm0 wm0Var2 = new wm0(0);
            if (wm0Var.compareTo(wm0Var2) < 0) {
                wm0Var = wm0Var2;
            }
            iP0 = ij0Var.p0(wm0Var.w);
        }
        float f2 = this.A;
        if (wm0.a(f2, Float.NaN)) {
            iP1 = Integer.MAX_VALUE;
        } else {
            wm0 wm0Var3 = new wm0(f2);
            wm0 wm0Var4 = new wm0(0);
            if (wm0Var3.compareTo(wm0Var4) < 0) {
                wm0Var3 = wm0Var4;
            }
            iP1 = ij0Var.p0(wm0Var3.w);
        }
        float f3 = this.x;
        if (wm0.a(f3, Float.NaN)) {
            iP2 = 0;
        } else {
            iP2 = ij0Var.p0(f3);
            if (iP2 > iP0) {
                iP2 = iP0;
            }
            if (iP2 < 0) {
                iP2 = 0;
            }
            if (iP2 == Integer.MAX_VALUE) {
                iP2 = 0;
            }
        }
        float f4 = this.y;
        if (!wm0.a(f4, Float.NaN)) {
            int iP3 = ij0Var.p0(f4);
            if (iP3 > iP1) {
                iP3 = iP1;
            }
            if (iP3 < 0) {
                iP3 = 0;
            }
            if (iP3 != Integer.MAX_VALUE) {
                i = iP3;
            }
        }
        return FWT.m(iP2, iP0, i, iP1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lm4)) {
            return false;
        }
        lm4 lm4Var = (lm4) obj;
        return wm0.a(this.x, lm4Var.x) && wm0.a(this.y, lm4Var.y) && wm0.a(this.z, lm4Var.z) && wm0.a(this.A, lm4Var.A) && this.B == lm4Var.B;
    }

    @Override // defpackage.uy1
    public final int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        long jB = b(vb2Var);
        return g70.f(jB) ? g70.h(jB) : FWT.w(kz1Var.u(i), jB);
    }

    public final int hashCode() {
        return ry0.b(this.A, ry0.b(this.z, ry0.b(this.y, Float.floatToIntBits(this.x) * 31, 31), 31), 31);
    }

    @Override // defpackage.uy1
    public final int k0(vb2 vb2Var, kz1 kz1Var, int i) {
        long jB = b(vb2Var);
        return g70.e(jB) ? g70.g(jB) : FWT.v(kz1Var.W(i), jB);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.uy1
    public final int x(vb2 vb2Var, kz1 kz1Var, int i) {
        long jB = b(vb2Var);
        return g70.f(jB) ? g70.h(jB) : FWT.w(kz1Var.x(i), jB);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }

    public lm4(float f, float f2, float f3, float f4, boolean z) {
        super(wo1.a);
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.B = z;
    }
}
