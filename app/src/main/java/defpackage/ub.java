package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ub {

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
            ub.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ rFi w;
        public final /* synthetic */ Bv x;
        public final /* synthetic */ j81<FEQ, sd5> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(rFi rfi, Bv bv, j81<? super FEQ, sd5> j81Var, int i) {
            super(3);
            this.w = rfi;
            this.x = bv;
            this.y = j81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                String strX = hH.x(R.string.pref_player_respect_audio_focus_strategy_title, g30Var2);
                String strX2 = hH.x(R.string.pref_player_respect_audio_focus_strategy_summary, g30Var2);
                rFi rfi = rFi.Respect;
                rFi rfi2 = this.w;
                boolean z = rfi2 == rfi;
                Bv bv = this.x;
                boolean z2 = !bv.c;
                Boolean boolValueOf = Boolean.valueOf(z);
                g30Var2.e(1157296644);
                j81<FEQ, sd5> j81Var = this.y;
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objF == c0132QnHx) {
                    objF = new iJjm(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                xh3.b(strX, boolValueOf, strX2, null, false, null, z2, (h81) objF, g30Var2, 0, 56);
                String strX3 = hH.x(R.string.pref_player_ignore_audio_focus_strategy_title, g30Var2);
                String strX4 = hH.x(R.string.pref_player_ignore_audio_focus_strategy_summary, g30Var2);
                boolean z3 = rfi2 == rFi.Ignore;
                boolean z4 = !bv.c;
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                g30Var2.e(1157296644);
                boolean zI2 = g30Var2.I(j81Var);
                Object objF2 = g30Var2.f();
                if (zI2 || objF2 == c0132QnHx) {
                    objF2 = new oJr(j81Var);
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                xh3.b(strX3, boolValueOf2, strX4, null, false, null, z4, (h81) objF2, g30Var2, 0, 56);
                String strX5 = hH.x(R.string.pref_player_phone_call_fix_audio_focus_strategy_title, g30Var2);
                String strX6 = hH.x(R.string.pref_player_phone_call_fix_audio_focus_strategy_summary, g30Var2);
                Boolean boolValueOf3 = Boolean.valueOf(rfi2 == rFi.RestartOnPhoneCall);
                g30Var2.e(1157296644);
                boolean zI3 = g30Var2.I(j81Var);
                Object objF3 = g30Var2.f();
                if (zI3 || objF3 == c0132QnHx) {
                    objF3 = new PL1(j81Var);
                    g30Var2.B(objF3);
                }
                g30Var2.G();
                xh3.b(strX5, boolValueOf3, strX6, null, false, null, z4, (h81) objF3, g30Var2, 0, 56);
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<Integer, Integer> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final Integer invoke(Integer num) {
            num.intValue();
            return -16;
        }
    }

    public static final class NUlFixed extends cx1 implements j81<Integer, Integer> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final Integer invoke(Integer num) {
            num.intValue();
            return -16;
        }
    }

    public static final class QnHx extends cx1 implements j81<FEQ, sd5> {
        public final /* synthetic */ B2fJ w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(B2fJ b2fJ) {
            super(1);
            this.w = b2fJ;
        }

        @Override // defpackage.j81
        public final sd5 invoke(FEQ feq) {
            this.w.g(feq);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements y81<lcO, g30, Integer, sd5> {
        public final /* synthetic */ j81<FEQ, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(int i, j81 j81Var) {
            super(3);
            this.w = j81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(lcO lco, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            e40.CQf cQf = e40.a;
            g30Var2.e(-483455358);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
            g30Var2.e(-1323940314);
            ij0 ij0Var = (ij0) g30Var2.E(r40.e);
            jy1 jy1Var = (jy1) g30Var2.E(r40.k);
            ti5 ti5Var = (ti5) g30Var2.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
            if (!(g30Var2.v() instanceof jE)) {
                fp1.c0();
                throw null;
            }
            g30Var2.s();
            if (g30Var2.m()) {
                g30Var2.l(qnHx2);
            } else {
                g30Var2.A();
            }
            g30Var2.u();
            hH.u(g30Var2, rb2VarA, a30.QnHx.e);
            hH.u(g30Var2, ij0Var, a30.QnHx.d);
            hH.u(g30Var2, jy1Var, a30.QnHx.f);
            qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -1163856341);
            float f = 16;
            pg2 pg2VarV = ps0.V(qnHx, f, 0.0f, 2);
            sz szVar = f00.a;
            g30Var2.e(1157296644);
            j81<FEQ, sd5> j81Var = this.w;
            boolean zI = g30Var2.I(j81Var);
            Object objF = g30Var2.f();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objF == c0132QnHx) {
                objF = new Ldb(j81Var);
                g30Var2.B(objF);
            }
            g30Var2.G();
            h81 h81Var = (h81) objF;
            g30Var2.e(1157296644);
            boolean zI2 = g30Var2.I(j81Var);
            Object objF2 = g30Var2.f();
            if (zI2 || objF2 == c0132QnHx) {
                objF2 = new XI(j81Var);
                g30Var2.B(objF2);
            }
            g30Var2.G();
            p03.c(pg2VarV, "android.permission.READ_PHONE_STATE", null, szVar, h81Var, (j81) objF2, g30Var2, 3078, 4);
            pq4.c(f, g30Var2, 6);
            g30Var2.G();
            g30Var2.G();
            g30Var2.H();
            g30Var2.G();
            g30Var2.G();
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Bv w;
        public final /* synthetic */ j81<FEQ, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(Bv bv, j81<? super FEQ, sd5> j81Var, int i) {
            super(2);
            this.w = bv;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ub.b(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-297062832);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(112850728);
            sn4 sn4Var = (sn4) j30VarQ.E(tn4.a);
            Context context = (Context) j30VarQ.E(Ll.b);
            Tc tc = Tc.w;
            BKqc bKqc = new BKqc(context, sn4Var);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(tc, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(bKqc, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(B2fJ.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            B2fJ b2fJ = (B2fJ) ((ZUx) obj);
            j30VarQ.R(false);
            Bv bv = (Bv) ps0.t(b2fJ.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(b2fJ);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new QnHx(b2fJ);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            b(bv, (j81) objB1, j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    public static final void b(Bv bv, j81<? super FEQ, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        boolean z;
        j30 j30VarQ = g30Var.q(391478517);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(bv) ? 4 : 2) | i;
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
            rFi rfi = bv.a;
            if (rfi != null) {
                pg2.QnHx qnHx = pg2.QnHx.w;
                pg2 pg2VarX = ob.x(qnHx, ob.w(0, j30VarQ, 1));
                j30VarQ.e(-483455358);
                rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(pg2VarX);
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
                zv zvVar = zv.a;
                a_.b(ps0.T(qnHx, 16), 0L, 0, null, 0.0f, X.m(j30VarQ, -922464355, new F1(rfi, bv, j81Var, i3)), j30VarQ, 196998, 26);
                if (bv.d) {
                    if (ur1.a(bv.b, Boolean.TRUE)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                CO.b(zvVar, z, null, us0.b(null, 3).b(us0.e(LPt8Fixed.w)), us0.c().b(us0.f(NUlFixed.w)), null, X.m(j30VarQ, -1122177706, new YKK(i3, j81Var)), j30VarQ, 1600518, 18);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new auxFixed(bv, j81Var, i);
    }
}
