package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class og2 extends kz1 {
    public static final jtf b0;
    public kz1 X;
    public uy1 Y;
    public boolean Z;
    public ri2<uy1> a0;

    static {
        jtf jtfVar = new jtf();
        jtfVar.k(yu.f);
        jtfVar.v(1.0f);
        jtfVar.w(1);
        b0 = jtfVar;
    }

    public og2(kz1 kz1Var, uy1 uy1Var) {
        super(kz1Var.A);
        this.X = kz1Var;
        this.Y = uy1Var;
    }

    @Override // defpackage.kz1
    public final int C0(IlK ilK) {
        if (J0().c().containsKey(ilK)) {
            Integer num = J0().c().get(ilK);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iJ = this.X.J(ilK);
        if (iJ == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        this.M = true;
        m0(this.K, this.L, this.D);
        this.M = false;
        return ilK instanceof ed1 ? mp1.a(this.X.K) + iJ : ((int) (this.X.K >> 32)) + iJ;
    }

    @Override // defpackage.kz1
    public final vb2 K0() {
        return this.X.K0();
    }

    @Override // defpackage.kz1
    public final kz1 N0() {
        return this.X;
    }

    @Override // defpackage.zq1
    public final int W(int i) {
        return f1().k0(K0(), this.X, i);
    }

    @Override // defpackage.kz1
    public final void W0() {
        super.W0();
        ri2<uy1> ri2Var = this.a0;
        if (ri2Var == null) {
            return;
        }
        ri2Var.setValue(this.Y);
    }

    @Override // defpackage.kz1
    public final void X0(dn dnVar) {
        this.X.G0(dnVar);
        if (Cz.B(this.A).getShowLayoutBounds()) {
            long j = this.y;
            dnVar.g(new dl3(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, sp1.b(j) - 0.5f), b0);
        }
    }

    @Override // defpackage.zq1
    public final int c(int i) {
        return f1().O(K0(), this.X, i);
    }

    public final uy1 f1() {
        ri2<uy1> ri2VarR = this.a0;
        if (ri2VarR == null) {
            ri2VarR = ps0.R(this.Y);
        }
        this.a0 = ri2VarR;
        return ri2VarR.getValue();
    }

    public final void g1() {
        uw2 uw2Var = this.R;
        if (uw2Var != null) {
            uw2Var.invalidate();
        }
        this.X.B = this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    @Override // defpackage.kz1, defpackage.b43
    public final void m0(long j, float f, j81<? super ta1, sd5> j81Var) {
        boolean z;
        super.m0(j, f, j81Var);
        kz1 kz1Var = this.B;
        if (kz1Var != null) {
            z = kz1Var.M;
        }
        if (z) {
            return;
        }
        for (fz1 fz1Var = this.O[4]; fz1Var != null; fz1Var = fz1Var.y) {
            ((qu2) ((pk4) fz1Var).x).l(this);
        }
        b43.QnHx.C0045QnHx c0045QnHx = b43.QnHx.a;
        int i = (int) (this.y >> 32);
        jy1 layoutDirection = K0().getLayoutDirection();
        c0045QnHx.getClass();
        int i2 = b43.QnHx.c;
        jy1 jy1Var = b43.QnHx.b;
        b43.QnHx.c = i;
        b43.QnHx.b = layoutDirection;
        J0().a();
        b43.QnHx.c = i2;
        b43.QnHx.b = jy1Var;
    }

    @Override // defpackage.zq1
    public final int u(int i) {
        return f1().h0(K0(), this.X, i);
    }

    @Override // defpackage.zq1
    public final int x(int i) {
        return f1().x(K0(), this.X, i);
    }

    @Override // defpackage.ob2
    public final b43 y(long j) {
        w0(j);
        Z0(this.Y.J(K0(), this.X, j));
        uw2 uw2Var = this.R;
        if (uw2Var != null) {
            uw2Var.f(this.y);
        }
        V0();
        return this;
    }
}
