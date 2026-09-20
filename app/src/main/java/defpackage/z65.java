package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z65 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            z65.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ is4<q65> w;
        public final /* synthetic */ b75 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ri2 ri2Var, b75 b75Var) {
            super(3);
            this.w = ri2Var;
            this.x = b75Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                List<r65> list = this.w.getValue().a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    r65 r65Var = list.get(i);
                    g30Var2.e(1157296644);
                    b75 b75Var = this.x;
                    boolean zI = g30Var2.I(b75Var);
                    Object objF = g30Var2.f();
                    if (zI || objF == g30.QnHx.a) {
                        objF = new y65(b75Var);
                        g30Var2.B(objF);
                    }
                    g30Var2.G();
                    z65.b(r65Var, (j81) objF, g30Var2, 0);
                }
                e40.CQf cQf2 = e40.a;
            }
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-872680445);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(1956624615);
            a75 a75Var = a75.w;
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(a75Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(null, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(b75.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            obj = objB0;
            j30VarQ.R(false);
            j30VarQ.R(false);
            b75 b75Var = (b75) ((ZUx) obj);
            j30VarQ.R(false);
            ri2 ri2VarT = ps0.t(b75Var.f(), j30VarQ);
            List<r65> list = ((q65) ri2VarT.getValue()).a;
            da daVar = One.QnHx.a;
            jE<?> jEVar = j30VarQ.a;
            if (list != null) {
                j30VarQ.e(1311139979);
                j30VarQ.e(733328855);
                pg2.QnHx qnHx = pg2.QnHx.w;
                rb2 rb2VarC = fe.c(daVar, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(qnHx);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                a_.b(ps0.T(qnHx, 16), 0L, 0, null, 0.0f, X.m(j30VarQ, -1551707947, new QnHx(ri2VarT, b75Var)), j30VarQ, 196998, 26);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                j30VarQ.R(false);
            } else {
                j30VarQ.e(1311140315);
                hx0 hx0Var = gm4.c;
                j30VarQ.e(733328855);
                rb2 rb2VarC2 = fe.c(daVar, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0 ij0Var2 = (ij0) j30VarQ.E(r40.e);
                jy1 jy1Var2 = (jy1) j30VarQ.E(r40.k);
                ti5 ti5Var2 = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx3 = a30.QnHx.b;
                sz szVarJ2 = S12N.j(hx0Var);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx3);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC2, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var2, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var2, a30.QnHx.f);
                Xs.c(0, szVarJ2, sN.a(j30VarQ, ti5Var2, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                da daVar2 = One.QnHx.e;
                wo1.QnHx qnHx4 = wo1.a;
                ff3.a(0.0f, 0, 6, 0L, j30VarQ, new ee(daVar2, false));
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                j30VarQ.R(false);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i);
    }

    public static final void b(r65 r65Var, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1035552595);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(r65Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            boolean z = r65Var.d;
            String strX = hH.x(r65Var.a, j30VarQ);
            j30VarQ.e(2096482861);
            Integer num = r65Var.b;
            String strX2 = num == null ? null : hH.x(num.intValue(), j30VarQ);
            j30VarQ.R(false);
            Boolean boolValueOf = Boolean.valueOf(z);
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(j81Var) | j30VarQ.I(r65Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new w65(j81Var, r65Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            xh3.b(strX, boolValueOf, strX2, null, false, null, false, (h81) objB0, j30VarQ, 0, 120);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new x65(r65Var, j81Var, i);
    }
}
