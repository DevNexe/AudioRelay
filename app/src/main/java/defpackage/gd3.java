package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class gd3 {

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
            gd3.b(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class EQ extends cx1 implements y81<wu3, g30, Integer, sd5> {
        public final /* synthetic */ fb3 w;
        public final /* synthetic */ ri2<wm0> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EQ(fb3 fb3Var, ri2<wm0> ri2Var) {
            super(3);
            this.w = fb3Var;
            this.x = ri2Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                AOdm aOdmB = WDjj.b(this.w.f ? 1.0f : 0.0f, null, g30Var2, 14);
                g30Var2.e(-1145129448);
                jt4 jt4Var = r40.e;
                ij0 ij0Var = (ij0) g30Var2.E(jt4Var);
                pg2.QnHx qnHx = pg2.QnHx.w;
                pg2 pg2VarK = hH.k(qnHx, ((Number) aOdmB.getValue()).floatValue());
                g30Var2.e(511388516);
                ri2<wm0> ri2Var = this.x;
                boolean zI = g30Var2.I(ri2Var) | g30Var2.I(ij0Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new hd3(ij0Var, ri2Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                wo1.QnHx qnHx2 = wo1.a;
                pg2 pg2VarY = pg2VarK.y(new xu2((j81) objF));
                g30Var2.e(693286680);
                rb2 rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var2 = (ij0) g30Var2.E(jt4Var);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx3 = a30.QnHx.b;
                sz szVarJ = S12N.j(pg2VarY);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx3);
                } else {
                    g30Var2.A();
                }
                g30Var2.u();
                hH.u(g30Var2, rb2VarA, a30.QnHx.e);
                hH.u(g30Var2, ij0Var2, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -678309503);
                float f = 16;
                ff3.a(2, 390, 2, 0L, g30Var2, gm4.h(qnHx, f));
                hH.i(gm4.k(qnHx, f), g30Var2, 6);
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                g30Var2.G();
                j55.b(hH.x(R.string.premium_restore_purchases_action, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, 0, 0, 65534);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public final /* synthetic */ md3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(md3 md3Var) {
            super(0);
            this.w = md3Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.g(za3.PRnFixed.a);
            return sd5.a;
        }
    }

    public static final class FJCM extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ fb3 w;
        public final /* synthetic */ j81<za3, sd5> x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FJCM(fb3 fb3Var, j81<? super za3, sd5> j81Var, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = fb3Var;
            this.x = j81Var;
            this.y = pg2Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            gd3.f(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<za3, sd5> {
        public final /* synthetic */ md3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(md3 md3Var) {
            super(1);
            this.w = md3Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(za3 za3Var) {
            this.w.g(za3Var);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            gd3.c(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class PRnFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PRnFixed(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            gd3.g(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            gd3.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            gd3.e(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ fb3 w;
        public final /* synthetic */ j81<za3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public YKK(fb3 fb3Var, j81<? super za3, sd5> j81Var, int i) {
            super(2);
            this.w = fb3Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            gd3.d(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements h81<sd5> {
        public static final auxFixed w = new auxFixed();

        public auxFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ sd5 invoke() {
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<za3, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public byN(j81<? super za3, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(za3.y.a);
            return sd5.a;
        }
    }

    public static final void a(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1184108864);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0.0f, null, 0.0f, o10.c, j30VarQ, 196608, 31);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(i);
    }

    public static final void b(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-885420130);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0.0f, null, 0.0f, o10.d, j30VarQ, 196608, 31);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-1242601764);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(2133398968);
            Context context = (Context) j30VarQ.E(Ll.b);
            sn4 sn4Var = (sn4) j30VarQ.E(tn4.a);
            j30VarQ.e(-366436168);
            yf yfVarB = ag.b(j30VarQ);
            ag.a(yfVarB, j30VarQ, 0);
            j30VarQ.R(false);
            kd3 kd3Var = kd3.w;
            ld3 ld3Var = new ld3(context, sn4Var, yfVarB);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(kd3Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(ld3Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(md3.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            md3 md3Var = (md3) ((ZUx) obj);
            j30VarQ.R(false);
            ri2 ri2VarT = ps0.t(md3Var.f(), j30VarQ);
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(md3Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new F1(md3Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            w22.b((h81) objB1, j30VarQ, 0);
            fb3 fb3Var = (fb3) ri2VarT.getValue();
            j30VarQ.e(1157296644);
            boolean zI3 = j30VarQ.I(md3Var);
            Object objB2 = j30VarQ.b0();
            if (zI3 || objB2 == c0132QnHx) {
                objB2 = new LPt8Fixed(md3Var);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            d(fb3Var, (j81) objB2, j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, int] */
    public static final void d(fb3 fb3Var, j81<? super za3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        yy1.QnHx qnHx;
        j81<? super za3, sd5> j81Var2;
        j81<? super za3, sd5> j81Var3;
        int i3;
        ?? r11;
        boolean z;
        j30 j30Var;
        j81<? super za3, sd5> j81Var4 = j81Var;
        j30 j30VarQ = g30Var.q(1363804867);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(fb3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var4) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
            j30Var = j30VarQ;
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(1693869160);
            if (fb3Var.a) {
                e(j30VarQ, 0);
            }
            j30VarQ.R(false);
            j30VarQ.e(-483455358);
            pg2.QnHx qnHx2 = pg2.QnHx.w;
            CZ9P.EQ eq = CZ9P.c;
            da.QnHx qnHx3 = One.QnHx.m;
            rb2 rb2VarA = tv.a(eq, qnHx3, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4 jt4Var = r40.e;
            ij0 ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4 jt4Var2 = r40.k;
            jy1 jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4 jt4Var3 = r40.o;
            ti5 ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            yy1.QnHx qnHx4 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx2);
            jE<?> jEVar = j30VarQ.a;
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
            a30.QnHx.F1 f1 = a30.QnHx.e;
            hH.u(j30VarQ, rb2VarA, f1);
            a30.QnHx.C0012QnHx c0012QnHx = a30.QnHx.d;
            hH.u(j30VarQ, ij0Var, c0012QnHx);
            a30.QnHx.CQf cQf2 = a30.QnHx.f;
            hH.u(j30VarQ, jy1Var, cQf2);
            a30.QnHx.NUlFixed nUl = a30.QnHx.g;
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            wo1.QnHx qnHx5 = wo1.a;
            float f = 16;
            pg2 pg2VarT = ps0.T(ob.x(new mz1(1.0f, true), ob.w(0, j30VarQ, 1)), f);
            j30VarQ.e(-483455358);
            rb2 rb2VarA2 = tv.a(eq, qnHx3, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var2 = (ij0) j30VarQ.E(jt4Var);
            jy1 jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
            ti5 ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
            sz szVarJ2 = S12N.j(pg2VarT);
            if (!(jEVar instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                qnHx = qnHx4;
                j30VarQ.l(qnHx);
            } else {
                qnHx = qnHx4;
                j30VarQ.A();
            }
            j30VarQ.x = false;
            yy1.QnHx qnHx6 = qnHx;
            Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf2, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
            h(0, j30VarQ, fb3Var.d);
            hH.i(gm4.g(qnHx2, f), j30VarQ, 6);
            boolean z2 = fb3Var.b == null;
            boolean z3 = fb3Var.e;
            if (z2 || !z3) {
                j30VarQ.e(-1625319371);
                j81Var2 = j81Var;
                s43.c(fb3Var, j81Var2, j30VarQ, (i2 & 14) | (i2 & 112));
                j30VarQ.R(false);
            } else {
                j30VarQ.e(-1625319426);
                a(j30VarQ, 0);
                j30VarQ.R(false);
                j81Var2 = j81Var;
            }
            hH.i(gm4.g(qnHx2, f), j30VarQ, 6);
            j30VarQ.e(-1625319165);
            boolean z4 = fb3Var.j;
            if (z4) {
                j81Var3 = j81Var2;
                r11 = 0;
                C0239D.f((i2 >> 3) & 14, 0, j30VarQ, gm4.f(gm4.j(qnHx2, 0.0f, 0.0f, u60.a, 0.0f, 11)), j81Var3);
                i3 = 6;
                hH.i(gm4.g(qnHx2, f), j30VarQ, 6);
            } else {
                j81Var3 = j81Var2;
                i3 = 6;
                r11 = 0;
            }
            j30VarQ.R(r11);
            j30VarQ.e(-1625318799);
            if (fb3Var.h) {
                b(j30VarQ, r11);
                hH.i(gm4.g(qnHx2, f), j30VarQ, i3);
            }
            j30VarQ.R(r11);
            vw0.b(j30VarQ, r11);
            hH.i(gm4.g(qnHx2, f), j30VarQ, i3);
            j30VarQ.e(-1625318570);
            if (z3 || !(z4 || fb3Var.i)) {
                z = false;
            } else {
                z = false;
                g(j30VarQ, 0);
                hH.i(gm4.g(qnHx2, f), j30VarQ, 6);
            }
            j30VarQ.R(z);
            pg2 pg2VarF = gm4.f(gm4.j(qnHx2, 0.0f, 0.0f, u60.a, 0.0f, 11));
            j30VarQ.e(733328855);
            rb2 rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var3 = (ij0) j30VarQ.E(jt4Var);
            jy1 jy1Var3 = (jy1) j30VarQ.E(jt4Var2);
            ti5 ti5Var3 = (ti5) j30VarQ.E(jt4Var3);
            sz szVarJ3 = S12N.j(pg2VarF);
            if (!(jEVar instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx6);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            j81Var4 = j81Var3;
            Xs.c(0, szVarJ3, u40.b(j30VarQ, rb2VarC, f1, j30VarQ, ij0Var3, c0012QnHx, j30VarQ, jy1Var3, cQf2, j30VarQ, ti5Var3, nUl, j30VarQ), j30VarQ, 2058660585, -2137368960);
            da daVar = One.QnHx.e;
            wo1.QnHx qnHx7 = wo1.a;
            int i4 = (i2 & 14) | (i2 & 112);
            j30 j30Var2 = j30VarQ;
            f(fb3Var, j81Var, new ee(daVar, false), j30VarQ, i4, 0);
            O.g(j30Var2, false, false, true, false);
            O.g(j30Var2, false, false, false, true);
            j30Var2.R(false);
            j30Var2.R(false);
            jl.a(fb3Var, j81Var4, j30Var2, i4);
            j30Var2.R(false);
            j30Var2.R(false);
            j30Var2.R(true);
            j30Var2.R(false);
            j30Var2.R(false);
            j30Var = j30Var2;
        }
        tk3 tk3VarU = j30Var.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(fb3Var, j81Var4, i);
    }

    public static final void e(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(2050341981);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            vQgK.a(auxFixed.w, null, o10.b, j30VarQ, 390, 2);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new T23(i);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(fb3 fb3Var, j81<? super za3, sd5> j81Var, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        Object objB0;
        g30.QnHx.C0132QnHx c0132QnHx;
        boolean zI;
        Object objB1;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1386723275);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(fb3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 896) == 0) {
                i3 |= j30VarQ.I(pg2Var) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !j30VarQ.t()) {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                e40.CQf cQf = e40.a;
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(new wm0(0));
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2 ri2Var = (ri2) objB0;
                pg2 pg2VarT = hH.t(pg2Var2, (-((wm0) ri2Var.getValue()).w) / 2, 0.0f, 2);
                boolean z = !fb3Var.f;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(j81Var);
                objB1 = j30VarQ.b0();
                if (zI || objB1 == c0132QnHx) {
                    objB1 = new byN(j81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                ti.e(3072, 0, j30VarQ, pg2VarT, (h81) objB1, X.m(j30VarQ, 1881437723, new EQ(fb3Var, ri2Var)), z);
            } else {
                j30VarQ.x();
                pg2Var2 = pg2Var;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new FJCM(fb3Var, j81Var, pg2Var2, i, i2);
        }
        i3 |= 384;
        if ((i3 & 731) == 146) {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf2 = e40.a;
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(new wm0(0));
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2 ri2Var2 = (ri2) objB0;
            pg2 pg2VarT2 = hH.t(pg2Var2, (-((wm0) ri2Var2.getValue()).w) / 2, 0.0f, 2);
            boolean z2 = !fb3Var.f;
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(j81Var);
            objB1 = j30VarQ.b0();
            if (zI) {
                objB1 = new byN(j81Var);
                j30VarQ.F0(objB1);
            } else {
                objB1 = new byN(j81Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            ti.e(3072, 0, j30VarQ, pg2VarT2, (h81) objB1, X.m(j30VarQ, 1881437723, new EQ(fb3Var, ri2Var2)), z2);
        } else {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf3 = e40.a;
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(new wm0(0));
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2 ri2Var3 = (ri2) objB0;
            pg2 pg2VarT3 = hH.t(pg2Var2, (-((wm0) ri2Var3.getValue()).w) / 2, 0.0f, 2);
            boolean z3 = !fb3Var.f;
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(j81Var);
            objB1 = j30VarQ.b0();
            if (zI) {
                objB1 = new byN(j81Var);
                j30VarQ.F0(objB1);
            } else {
                objB1 = new byN(j81Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            ti.e(3072, 0, j30VarQ, pg2VarT3, (h81) objB1, X.m(j30VarQ, 1881437723, new EQ(fb3Var, ri2Var3)), z3);
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new FJCM(fb3Var, j81Var, pg2Var2, i, i2);
    }

    public static final void g(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(717338948);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0.0f, null, 0.0f, o10.e, j30VarQ, 196608, 31);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new PRnFixed(i);
    }

    public static final void h(int i, g30 g30Var, String str) {
        int i2;
        j30 j30VarQ = g30Var.q(1703889037);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            if (str != null) {
                a_.b(null, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, 1985411706, new id3(str, i2)), j30VarQ, 196608, 31);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new jd3(str, i);
    }
}
