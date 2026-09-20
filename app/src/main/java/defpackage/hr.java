package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hr {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ci2 w;
        public final /* synthetic */ ri2<qd3> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(ci2 ci2Var, ri2<qd3> ri2Var, int i) {
            super(2);
            this.w = ci2Var;
            this.x = ri2Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            hr.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ ri2<qd3> w;
        public final /* synthetic */ ci2 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ri2<qd3> ri2Var, ci2 ci2Var) {
            super(1);
            this.w = ri2Var;
            this.x = ci2Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            return new gr(this.w, this.x);
        }
    }

    public static final void a(ci2 ci2Var, ri2<qd3> ri2Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1761107222);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ci2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(ri2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(ri2Var) | j30VarQ.I(ci2Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new QnHx(ri2Var, ci2Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            wq0.a(ci2Var, (j81) objB0, j30VarQ);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(ci2Var, ri2Var, i);
    }

    public static pg2 b(pg2 pg2Var, ci2 ci2Var, uj1 uj1Var, boolean z, zs3 zs3Var, h81 h81Var, int i) {
        boolean z2 = (i & 4) != 0 ? true : z;
        if ((i & 16) != 0) {
            zs3Var = null;
        }
        return f30.a(pg2Var, wo1.a, new mr(uj1Var, ci2Var, zs3Var, null, h81Var, z2));
    }

    public static pg2 c(pg2 pg2Var, boolean z, h81 h81Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return f30.a(pg2Var, wo1.a, new ir(z, null, null, h81Var));
    }
}
