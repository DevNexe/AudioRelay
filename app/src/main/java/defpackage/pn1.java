package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pn1 extends kz1 implements ij0 {
    public static final jtf Y;
    public final /* synthetic */ vb2 X;

    static {
        jtf jtfVar = new jtf();
        jtfVar.k(yu.e);
        jtfVar.v(1.0f);
        jtfVar.w(1);
        Y = jtfVar;
    }

    public pn1(yy1 yy1Var) {
        super(yy1Var);
        this.X = yy1Var.M;
    }

    @Override // defpackage.kz1
    public final int C0(IlK ilK) {
        yy1 yy1Var = this.A;
        boolean z = yy1Var.Z.E;
        dz1 dz1Var = yy1Var.P;
        if (!z) {
            if (yy1Var.E == 1) {
                dz1Var.f = true;
                if (dz1Var.b) {
                    yy1Var.n0 = true;
                }
            } else {
                dz1Var.g = true;
            }
        }
        yy1Var.F();
        Integer num = (Integer) dz1Var.i.get(ilK);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.kz1
    public final vb2 K0() {
        return this.A.M;
    }

    @Override // defpackage.ij0
    public final float Q(float f) {
        return this.X.Q(f);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    @Override // defpackage.kz1
    public final <T extends fz1<T, M>, C, M extends pg2> void R0(kz1.NUlFixed<T, C, M> nUl, long j, cd1<C> cd1Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        yy1[] yy1VarArr;
        boolean z5;
        boolean z6;
        yy1 yy1Var = this.A;
        if (!nUl.d(yy1Var)) {
            z3 = z2;
            z4 = false;
        } else if (e1(j)) {
            z3 = z2;
            z4 = true;
        } else if (z) {
            float fF0 = F0(j, L0());
            if ((Float.isInfinite(fF0) || Float.isNaN(fF0)) ? false : true) {
                z4 = true;
                z3 = false;
            } else {
                z3 = z2;
                z4 = false;
            }
        } else {
            z3 = z2;
            z4 = false;
        }
        if (z4) {
            int i = cd1Var.y;
            ui2<yy1> ui2VarT = yy1Var.t();
            int i2 = ui2VarT.y;
            if (i2 > 0) {
                yy1[] yy1VarArr2 = ui2VarT.w;
                int i3 = i2 - 1;
                while (true) {
                    yy1 yy1Var2 = yy1VarArr2[i3];
                    if (yy1Var2.Q) {
                        yy1VarArr = yy1VarArr2;
                        nUl.a(yy1Var2, j, cd1Var, z, z3);
                        long jA = cd1Var.a();
                        if (!(Float.intBitsToFloat((int) (jA >> 32)) < 0.0f && fp1.g0(jA))) {
                            z6 = true;
                        } else if (yy1Var2.Z.B.a1()) {
                            cd1Var.y = cd1Var.z - 1;
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z5 = z6 ? false : true;
                        if (!!z5 || (i3 = i3 - 1) < 0) {
                            break;
                        } else {
                            yy1VarArr2 = yy1VarArr;
                        }
                    } else {
                        yy1VarArr = yy1VarArr2;
                    }
                    if (!z5) {
                        break;
                    }
                    break;
                    break;
                }
            }
            cd1Var.y = i;
        }
    }

    @Override // defpackage.ij0
    public final float U() {
        return this.X.U();
    }

    @Override // defpackage.zq1
    public final int W(int i) {
        yr1 yr1Var = this.A.K;
        rb2 rb2VarA = yr1Var.a();
        yy1 yy1Var = yr1Var.a;
        return rb2VarA.b(yy1Var.M, yy1Var.q(), i);
    }

    @Override // defpackage.kz1
    public final void X0(dn dnVar) {
        yy1 yy1Var = this.A;
        ww2 ww2VarB = Cz.B(yy1Var);
        ui2<yy1> ui2VarT = yy1Var.t();
        int i = ui2VarT.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarT.w;
            int i2 = 0;
            do {
                yy1 yy1Var2 = yy1VarArr[i2];
                if (yy1Var2.Q) {
                    yy1Var2.p(dnVar);
                }
                i2++;
            } while (i2 < i);
        }
        if (ww2VarB.getShowLayoutBounds()) {
            long j = this.y;
            dnVar.g(new dl3(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, sp1.b(j) - 0.5f), Y);
        }
    }

    @Override // defpackage.ij0
    public final float b0(float f) {
        return this.X.b0(f);
    }

    @Override // defpackage.zq1
    public final int c(int i) {
        yr1 yr1Var = this.A.K;
        rb2 rb2VarA = yr1Var.a();
        yy1 yy1Var = yr1Var.a;
        return rb2VarA.e(yy1Var.M, yy1Var.q(), i);
    }

    @Override // defpackage.ij0
    public final float getDensity() {
        return this.X.getDensity();
    }

    @Override // defpackage.ij0
    public final float j(int i) {
        return this.X.j(i);
    }

    @Override // defpackage.kz1, defpackage.b43
    public final void m0(long j, float f, j81<? super ta1, sd5> j81Var) {
        super.m0(j, f, j81Var);
        kz1 kz1Var = this.B;
        if (kz1Var != null && kz1Var.M) {
            return;
        }
        for (fz1 fz1Var = this.O[4]; fz1Var != null; fz1Var = fz1Var.y) {
            ((qu2) ((pk4) fz1Var).x).l(this);
        }
        yy1 yy1Var = this.A;
        yy1 yy1VarS = yy1Var.s();
        pn1 pn1Var = yy1Var.Y;
        float f2 = pn1Var.L;
        kz1 kz1Var2 = yy1Var.Z.B;
        while (!ur1.a(kz1Var2, pn1Var)) {
            og2 og2Var = (og2) kz1Var2;
            f2 += og2Var.L;
            kz1Var2 = og2Var.X;
        }
        if (!(f2 == yy1Var.a0)) {
            yy1Var.a0 = f2;
            if (yy1VarS != null) {
                yy1VarS.L();
            }
            if (yy1VarS != null) {
                yy1VarS.A();
            }
        }
        if (!yy1Var.Q) {
            if (yy1VarS != null) {
                yy1VarS.A();
            }
            yy1Var.G();
        }
        if (yy1VarS == null) {
            yy1Var.R = 0;
        } else if (!yy1Var.l0 && yy1VarS.E == 2) {
            if (!(yy1Var.R == Integer.MAX_VALUE)) {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
            int i = yy1VarS.T;
            yy1Var.R = i;
            yy1VarS.T = i + 1;
        }
        yy1Var.F();
    }

    @Override // defpackage.ij0
    public final int p0(float f) {
        return this.X.p0(f);
    }

    @Override // defpackage.zq1
    public final int u(int i) {
        yr1 yr1Var = this.A.K;
        rb2 rb2VarA = yr1Var.a();
        yy1 yy1Var = yr1Var.a;
        return rb2VarA.c(yy1Var.M, yy1Var.q(), i);
    }

    @Override // defpackage.ij0
    public final long v(long j) {
        return this.X.v(j);
    }

    @Override // defpackage.ij0
    public final long v0(long j) {
        return this.X.v0(j);
    }

    @Override // defpackage.zq1
    public final int x(int i) {
        yr1 yr1Var = this.A.K;
        rb2 rb2VarA = yr1Var.a();
        yy1 yy1Var = yr1Var.a;
        return rb2VarA.d(yy1Var.M, yy1Var.q(), i);
    }

    @Override // defpackage.ij0
    public final float x0(long j) {
        return this.X.x0(j);
    }

    @Override // defpackage.ob2
    public final b43 y(long j) {
        w0(j);
        yy1 yy1Var = this.A;
        ui2<yy1> ui2VarV = yy1Var.v();
        int i = ui2VarV.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i2 = 0;
            do {
                yy1VarArr[i2].U = 3;
                i2++;
            } while (i2 < i);
        }
        yy1Var.Y.Z0(yy1Var.J.a(yy1Var.M, yy1Var.q(), j));
        V0();
        return this;
    }
}
