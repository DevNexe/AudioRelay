package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class mj2 {

    public static final class CQf extends cx1 implements j81<ej2, sd5> {
        public final /* synthetic */ tj2 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(tj2 tj2Var) {
            super(1);
            this.w = tj2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ej2 ej2Var) {
            this.w.g(ej2Var);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            mj2.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<ri2<x45>> {
        public final /* synthetic */ is4<fj2> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(ri2 ri2Var) {
            super(0);
            this.w = ri2Var;
        }

        @Override // defpackage.h81
        public final ri2<x45> invoke() {
            return ps0.R(new x45(this.w.getValue().a, 0L, 6));
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x45 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ j81<x45, sd5> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i, x45 x45Var, j81 j81Var) {
            super(2);
            this.w = x45Var;
            this.x = i;
            this.y = j81Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                pg2 pg2VarB = xnX3.b(gm4.a, this.w, g30Var2);
                x45 x45Var = this.w;
                j81<x45, sd5> j81Var = this.y;
                sz szVar = b10.a;
                int i = this.x;
                iw2.a(x45Var, j81Var, pg2VarB, false, false, null, szVar, null, null, null, false, null, null, null, true, 0, null, null, null, g30Var2, (i & 14) | 1572864 | (i & 112), 24576, 507832);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<x45, sd5> {
        public final /* synthetic */ tj2 w;
        public final /* synthetic */ ri2<x45> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(tj2 tj2Var, ri2<x45> ri2Var) {
            super(1);
            this.w = tj2Var;
            this.x = ri2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(x45 x45Var) {
            x45 x45Var2 = x45Var;
            this.x.setValue(x45Var2);
            this.w.g(new ej2.QnHx(x45Var2.a.w));
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ kj1<uj2> w;
        public final /* synthetic */ j81<ej2, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public T23(kj1<uj2> kj1Var, j81<? super ej2, sd5> j81Var, int i) {
            super(2);
            this.w = kj1Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            mj2.c(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x45 w;
        public final /* synthetic */ j81<x45, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(int i, x45 x45Var, j81 j81Var) {
            super(2);
            this.w = x45Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            mj2.b(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ kj1<uj2> w;
        public final /* synthetic */ j81<ej2, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(kj1<uj2> kj1Var, j81<? super ej2, sd5> j81Var, int i) {
            super(3);
            this.w = kj1Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var2.e(511388516);
                kj1<uj2> kj1Var = this.w;
                boolean zI = g30Var2.I(kj1Var);
                j81<ej2, sd5> j81Var = this.x;
                boolean zI2 = zI | g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                if (zI2 || objF == g30.QnHx.a) {
                    objF = new rj2(kj1Var, j81Var, this.y);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                rz1.a(null, null, null, false, null, null, null, false, (j81) objF, g30Var2, 0, 255);
            }
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-1054366201);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-1450894567);
            sj2 sj2Var = sj2.w;
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(sj2Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(null, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(tj2.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            tj2 tj2Var = (tj2) ((ZUx) obj);
            j30VarQ.R(false);
            ri2 ri2VarT = ps0.t(tj2Var.f(), j30VarQ);
            boolean z = ((fj2) ri2VarT.getValue()).c;
            jE<?> jEVar = j30VarQ.a;
            if (z) {
                j30VarQ.e(-1675732448);
                hx0 hx0Var = gm4.c;
                j30VarQ.e(733328855);
                rb2 rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx = a30.QnHx.b;
                sz szVarJ = S12N.j(hx0Var);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                da daVar = One.QnHx.e;
                wo1.QnHx qnHx2 = wo1.a;
                ff3.a(0.0f, 0, 6, 0L, j30VarQ, new ee(daVar, false));
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                j30VarQ.R(false);
            } else {
                j30VarQ.e(-1675732293);
                Object[] objArr = {((fj2) ri2VarT.getValue()).a};
                f34 f34Var = x45.d;
                j30VarQ.e(1157296644);
                boolean zI2 = j30VarQ.I(ri2VarT);
                Object objB1 = j30VarQ.b0();
                if (zI2 || objB1 == c0132QnHx) {
                    objB1 = new LPt8Fixed(ri2VarT);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                ri2 ri2VarE = g7.e(objArr, f34Var, (h81) objB1, j30VarQ);
                float f = 16;
                wo1.QnHx qnHx3 = wo1.a;
                zx2 zx2Var = new zx2(f, f, f, f);
                j30VarQ.e(-483455358);
                rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0 ij0Var2 = (ij0) j30VarQ.E(r40.e);
                jy1 jy1Var2 = (jy1) j30VarQ.E(r40.k);
                ti5 ti5Var2 = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx4 = a30.QnHx.b;
                sz szVarJ2 = S12N.j(zx2Var);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx4);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var2, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var2, a30.QnHx.f);
                Xs.c(0, szVarJ2, sN.a(j30VarQ, ti5Var2, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
                x45 x45Var = (x45) ri2VarE.getValue();
                j30VarQ.e(511388516);
                boolean zI3 = j30VarQ.I(ri2VarE) | j30VarQ.I(tj2Var);
                Object objB2 = j30VarQ.b0();
                if (zI3 || objB2 == c0132QnHx) {
                    objB2 = new QnHx(tj2Var, ri2VarE);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                b(x45Var, (j81) objB2, j30VarQ, 0);
                if (!((fj2) ri2VarT.getValue()).b.isEmpty()) {
                    pq4.c(32, j30VarQ, 6);
                    kj1<uj2> kj1Var = ((fj2) ri2VarT.getValue()).b;
                    j30VarQ.e(1157296644);
                    boolean zI4 = j30VarQ.I(tj2Var);
                    Object objB3 = j30VarQ.b0();
                    if (zI4 || objB3 == c0132QnHx) {
                        objB3 = new CQf(tj2Var);
                        j30VarQ.F0(objB3);
                    }
                    j30VarQ.R(false);
                    c(kj1Var, (j81) objB3, j30VarQ, 0);
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                j30VarQ.R(false);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(i);
    }

    public static final void b(x45 x45Var, j81<? super x45, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1602942668);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(x45Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-483455358);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
            if (!(j30VarQ.a instanceof jE)) {
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
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            j55.b(hH.x(R.string.pref_name_editor_subtitle, j30VarQ), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).l, j30VarQ, 0, 0, 32766);
            pq4.c(8, j30VarQ, 6);
            gw2.a(yu.b(((rv) j30VarQ.E(sv.a)).k(), 0.7f), X.m(j30VarQ, 562767183, new NUlFixed(i3, x45Var, j81Var)), j30VarQ, 48);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(i, x45Var, j81Var);
    }

    public static final void c(kj1<uj2> kj1Var, j81<? super ej2, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-392065058);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(kj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j55.b(hH.x(R.string.pref_name_editor_suggestions_subtitle, j30VarQ), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).l, j30VarQ, 0, 0, 32766);
            pq4.c(16, j30VarQ, 6);
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, -1785906227, new auxFixed(kj1Var, j81Var, i3)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new T23(kj1Var, j81Var, i);
    }
}
