package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hx0 extends zo1 implements uy1 {
    public final int x;
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

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;FLj81<-Lyo1;Lsd5;>;)V */
    public hx0(int i, float f, j81 j81Var) {
        super(j81Var);
        this.x = i;
        this.y = f;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        int iJ;
        int iH;
        int iG;
        int iO;
        boolean zD = g70.d(j);
        float f = this.y;
        int i = this.x;
        if (!zD || i == 1) {
            iJ = g70.j(j);
            iH = g70.h(j);
        } else {
            iJ = AY.o(sy4.c(g70.h(j) * f), g70.j(j), g70.h(j));
            iH = iJ;
        }
        if (!g70.c(j) || i == 2) {
            int i2 = g70.i(j);
            iG = g70.g(j);
            iO = i2;
        } else {
            iO = AY.o(sy4.c(g70.g(j) * f), g70.i(j), g70.g(j));
            iG = iO;
        }
        b43 b43VarY = ob2Var.y(FWT.m(iJ, iH, iO, iG));
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new QnHx(b43VarY));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hx0)) {
            return false;
        }
        hx0 hx0Var = (hx0) obj;
        if (this.x == hx0Var.x) {
            return (this.y > hx0Var.y ? 1 : (this.y == hx0Var.y ? 0 : -1)) == 0;
        }
        return false;
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.y) + (O.h(this.x) * 31);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int k0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.c(this, vb2Var, kz1Var, i);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int x(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.b(this, vb2Var, kz1Var, i);
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
