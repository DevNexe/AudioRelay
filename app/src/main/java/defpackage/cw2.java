package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw2 extends b43 implements ob2 {
    public final yy1 A;
    public kz1 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F = mp1.b;
    public j81<? super ta1, sd5> G;
    public float H;
    public Object I;

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ long x;
        public final /* synthetic */ float y;
        public final /* synthetic */ j81<ta1, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(long j, float f, j81<? super ta1, sd5> j81Var) {
            super(0);
            this.x = j;
            this.y = f;
            this.z = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            cw2 cw2Var = cw2.this;
            cw2Var.getClass();
            b43.QnHx.C0045QnHx c0045QnHx = b43.QnHx.a;
            float f = this.y;
            j81<ta1, sd5> j81Var = this.z;
            long j = this.x;
            if (j81Var == null) {
                kz1 kz1Var = cw2Var.B;
                c0045QnHx.getClass();
                b43.QnHx.d(kz1Var, j, f);
            } else {
                kz1 kz1Var2 = cw2Var.B;
                c0045QnHx.getClass();
                b43.QnHx.i(kz1Var2, j, f, j81Var);
            }
            return sd5.a;
        }
    }

    public cw2(yy1 yy1Var, pn1 pn1Var) {
        this.A = yy1Var;
        this.B = pn1Var;
    }

    public final boolean A0(long j) {
        yy1 yy1Var = this.A;
        ww2 ww2VarB = Cz.B(yy1Var);
        yy1 yy1VarS = yy1Var.s();
        boolean z = true;
        yy1Var.X = yy1Var.X || (yy1VarS != null && yy1VarS.X);
        if (!yy1Var.m0 && g70.b(this.z, j)) {
            ww2VarB.b(yy1Var);
            yy1Var.Q();
            return false;
        }
        yy1Var.P.f = false;
        ui2<yy1> ui2VarV = yy1Var.v();
        int i = ui2VarV.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i2 = 0;
            do {
                yy1VarArr[i2].P.c = false;
                i2++;
            } while (i2 < i);
        }
        this.C = true;
        long j2 = this.B.y;
        w0(j);
        yy1Var.E = 1;
        yy1Var.m0 = false;
        cx2 snapshotObserver = Cz.B(yy1Var).getSnapshotObserver();
        snapshotObserver.a(yy1Var, snapshotObserver.b, new bz1(yy1Var, j));
        if (yy1Var.E == 1) {
            yy1Var.n0 = true;
            yy1Var.E = 3;
        }
        if (sp1.a(this.B.y, j2)) {
            kz1 kz1Var = this.B;
            if (kz1Var.w == this.w && kz1Var.x == this.x) {
                z = false;
            }
        }
        kz1 kz1Var2 = this.B;
        r0(C0239D.e(kz1Var2.w, kz1Var2.x));
        return z;
    }

    @Override // defpackage.b43, defpackage.zq1
    public final Object B() {
        return this.I;
    }

    @Override // defpackage.wb2
    public final int J(IlK ilK) {
        yy1 yy1Var = this.A;
        yy1 yy1VarS = yy1Var.s();
        int i = yy1VarS != null ? yy1VarS.E : 0;
        dz1 dz1Var = yy1Var.P;
        if (i == 1) {
            dz1Var.c = true;
        } else {
            yy1 yy1VarS2 = yy1Var.s();
            if ((yy1VarS2 != null ? yy1VarS2.E : 0) == 2) {
                dz1Var.d = true;
            }
        }
        this.E = true;
        int iJ = this.B.J(ilK);
        this.E = false;
        return iJ;
    }

    @Override // defpackage.zq1
    public final int W(int i) {
        z0();
        return this.B.W(i);
    }

    @Override // defpackage.zq1
    public final int c(int i) {
        z0();
        return this.B.c(i);
    }

    @Override // defpackage.b43
    public final int h0() {
        return this.B.h0();
    }

    @Override // defpackage.b43
    public final int k0() {
        return this.B.k0();
    }

    @Override // defpackage.b43
    public final void m0(long j, float f, j81<? super ta1, sd5> j81Var) {
        this.F = j;
        this.H = f;
        this.G = j81Var;
        kz1 kz1Var = this.B;
        kz1 kz1Var2 = kz1Var.B;
        if (!(kz1Var2 != null && kz1Var2.M)) {
            this.D = true;
            yy1 yy1Var = this.A;
            yy1Var.P.g = false;
            cx2 snapshotObserver = Cz.B(yy1Var).getSnapshotObserver();
            snapshotObserver.a(yy1Var, snapshotObserver.d, new QnHx(j, f, j81Var));
            return;
        }
        b43.QnHx.C0045QnHx c0045QnHx = b43.QnHx.a;
        if (j81Var == null) {
            c0045QnHx.getClass();
            b43.QnHx.d(kz1Var, j, f);
        } else {
            c0045QnHx.getClass();
            b43.QnHx.i(kz1Var, j, f, j81Var);
        }
    }

    @Override // defpackage.zq1
    public final int u(int i) {
        z0();
        return this.B.u(i);
    }

    @Override // defpackage.zq1
    public final int x(int i) {
        z0();
        return this.B.x(i);
    }

    @Override // defpackage.ob2
    public final b43 y(long j) {
        yy1 yy1Var = this.A;
        yy1 yy1VarS = yy1Var.s();
        if (yy1VarS != null) {
            int i = 1;
            if (!(yy1Var.U == 3 || yy1Var.X)) {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + bj0.c(yy1Var.U) + ". Parent state " + IGp3.b(yy1VarS.E) + '.').toString());
            }
            int iH = O.h(yy1VarS.E);
            if (iH != 0) {
                if (iH != 1) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is ".concat(IGp3.b(yy1VarS.E)));
                }
                i = 2;
            }
            yy1Var.U = i;
        } else {
            yy1Var.U = 3;
        }
        A0(j);
        return this;
    }

    public final void z0() {
        yy1 yy1Var = this.A;
        yy1Var.P(false);
        yy1 yy1VarS = yy1Var.s();
        if (yy1VarS == null || yy1Var.V != 3) {
            return;
        }
        int iH = O.h(yy1VarS.E);
        int i = 1;
        if (iH != 0) {
            i = iH != 1 ? yy1VarS.V : 2;
        }
        yy1Var.V = i;
    }
}
