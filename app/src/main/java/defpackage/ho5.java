package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ho5 extends zo1 implements uy1 {
    public final Object A;
    public final int x;
    public final boolean y;
    public final x81<sp1, jy1, mp1> z;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ vb2 A;
        public final /* synthetic */ int x;
        public final /* synthetic */ b43 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, b43 b43Var, int i2, vb2 vb2Var) {
            super(1);
            this.x = i;
            this.y = b43Var;
            this.z = i2;
            this.A = vb2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            x81<sp1, jy1, mp1> x81Var = ho5.this.z;
            b43 b43Var = this.y;
            b43.QnHx.e(qnHx, b43Var, x81Var.invoke(new sp1(C0239D.e(this.x - b43Var.w, this.z - b43Var.x)), this.A.getLayoutDirection()).a);
            return sd5.a;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;ZLx81<-Lsp1;-Ljy1;Lmp1;>;Ljava/lang/Object;Lj81<-Lyo1;Lsd5;>;)V */
    public ho5(int i, boolean z, x81 x81Var, Object obj, j81 j81Var) {
        super(j81Var);
        this.x = i;
        this.y = z;
        this.z = x81Var;
        this.A = obj;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        int i = this.x;
        int iJ = i != 1 ? 0 : g70.j(j);
        int i2 = i == 2 ? g70.i(j) : 0;
        boolean z = this.y;
        b43 b43VarY = ob2Var.y(FWT.m(iJ, (i == 1 || !z) ? g70.h(j) : Integer.MAX_VALUE, i2, (i == 2 || !z) ? g70.g(j) : Integer.MAX_VALUE));
        int iO = AY.o(b43VarY.w, g70.j(j), g70.h(j));
        int iO2 = AY.o(b43VarY.x, g70.i(j), g70.g(j));
        return vb2Var.K(iO, iO2, ds0.w, new QnHx(iO, b43VarY, iO2, vb2Var));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ho5)) {
            return false;
        }
        ho5 ho5Var = (ho5) obj;
        return this.x == ho5Var.x && this.y == ho5Var.y && ur1.a(this.A, ho5Var.A);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        return this.A.hashCode() + (((O.h(this.x) * 31) + (this.y ? 1231 : 1237)) * 31);
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
