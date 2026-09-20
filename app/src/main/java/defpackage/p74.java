package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p74 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = x81Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            p74.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ s84 w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ b84 y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(s84 s84Var, pg2 pg2Var, b84 b84Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = s84Var;
            this.x = pg2Var;
            this.y = b84Var;
            this.z = x81Var;
            this.A = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                q40.a(new ng3[]{u84.a.b(this.w)}, X.m(g30Var2, 935424596, new s74(this.x, this.y, this.z, this.A)), g30Var2, 56);
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ b84 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(b84 b84Var) {
            super(1);
            this.w = b84Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            return new t74(this.w);
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ n74 x;
        public final /* synthetic */ j81<n74, sd5> y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NUlFixed(pg2 pg2Var, n74 n74Var, j81<? super n74, sd5> j81Var, x81<? super g30, ? super Integer, sd5> x81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = n74Var;
            this.y = j81Var;
            this.z = x81Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            p74.b(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<n74, sd5> {
        public final /* synthetic */ ri2<n74> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ri2<n74> ri2Var) {
            super(1);
            this.w = ri2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(n74 n74Var) {
            this.w.setValue(n74Var);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(-1075498320);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(null);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2 ri2Var = (ri2) objB0;
            n74 n74Var = (n74) ri2Var.getValue();
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(ri2Var);
            Object objB1 = j30VarQ.b0();
            if (zI || objB1 == c0132QnHx) {
                objB1 = new QnHx(ri2Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            b(pg2Var, n74Var, (j81) objB1, x81Var, j30VarQ, (i3 & 14) | ((i3 << 6) & 7168), 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var, x81Var, i, i2);
    }

    public static final void b(pg2 pg2Var, n74 n74Var, j81<? super n74, sd5> j81Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(2078139907);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(n74Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= j30VarQ.I(x81Var) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = new s84();
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            s84 s84Var = (s84) objB0;
            j30VarQ.e(-492369756);
            Object objB1 = j30VarQ.b0();
            if (objB1 == c0132QnHx) {
                objB1 = new b84(s84Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            b84 b84Var = (b84) objB1;
            b84Var.d = (vb1) j30VarQ.E(r40.i);
            b84Var.e = (ys) j30VarQ.E(r40.d);
            b84Var.f = (x55) j30VarQ.E(r40.m);
            b84Var.c = j81Var;
            b84Var.b.setValue(n74Var);
            if (n74Var != null) {
                b84Var.k();
            }
            v80.a(b84Var, X.m(j30VarQ, -123806316, new F1(s84Var, pg2Var, b84Var, x81Var, i5)), j30VarQ, 56);
            wq0.a(b84Var, new LPt8Fixed(b84Var), j30VarQ);
        }
        pg2 pg2Var2 = pg2Var;
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(pg2Var2, n74Var, j81Var, x81Var, i, i2);
    }
}
