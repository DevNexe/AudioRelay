package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ee5 extends zo1 implements uy1 {
    public final float x;
    public final float y;

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

    public ee5() {
        throw null;
    }

    public ee5(float f, float f2) {
        super(wo1.a);
        this.x = f;
        this.y = f2;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        int iJ;
        float f = this.x;
        int i = 0;
        if (wm0.a(f, Float.NaN) || g70.j(j) != 0) {
            iJ = g70.j(j);
        } else {
            iJ = vb2Var.p0(f);
            int iH = g70.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
            if (iJ < 0) {
                iJ = 0;
            }
        }
        int iH2 = g70.h(j);
        float f2 = this.y;
        if (wm0.a(f2, Float.NaN) || g70.i(j) != 0) {
            i = g70.i(j);
        } else {
            int iP0 = vb2Var.p0(f2);
            int iG = g70.g(j);
            if (iP0 > iG) {
                iP0 = iG;
            }
            if (iP0 >= 0) {
                i = iP0;
            }
        }
        b43 b43VarY = ob2Var.y(FWT.m(iJ, iH2, i, g70.g(j)));
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new QnHx(b43VarY));
    }

    @Override // defpackage.uy1
    public final int O(vb2 vb2Var, kz1 kz1Var, int i) {
        int iC = kz1Var.c(i);
        float f = this.y;
        int iP0 = !wm0.a(f, Float.NaN) ? vb2Var.p0(f) : 0;
        return iC < iP0 ? iP0 : iC;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ee5)) {
            return false;
        }
        ee5 ee5Var = (ee5) obj;
        return wm0.a(this.x, ee5Var.x) && wm0.a(this.y, ee5Var.y);
    }

    @Override // defpackage.uy1
    public final int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        int iU = kz1Var.u(i);
        float f = this.x;
        int iP0 = !wm0.a(f, Float.NaN) ? vb2Var.p0(f) : 0;
        return iU < iP0 ? iP0 : iU;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
    }

    @Override // defpackage.uy1
    public final int k0(vb2 vb2Var, kz1 kz1Var, int i) {
        int iW = kz1Var.W(i);
        float f = this.y;
        int iP0 = !wm0.a(f, Float.NaN) ? vb2Var.p0(f) : 0;
        return iW < iP0 ? iP0 : iW;
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.uy1
    public final int x(vb2 vb2Var, kz1 kz1Var, int i) {
        int iX = kz1Var.x(i);
        float f = this.x;
        int iP0 = !wm0.a(f, Float.NaN) ? vb2Var.p0(f) : 0;
        return iX < iP0 ? iP0 : iX;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
