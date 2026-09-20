package defpackage;

import android.os.Build;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class Ix {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ T9r w;
        public final /* synthetic */ j81<If$, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(T9r t9r, j81<? super If$, sd5> j81Var, int i) {
            super(2);
            this.w = t9r;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            Ix.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<If$, sd5> {
        public final /* synthetic */ PIKr w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(PIKr pIKr) {
            super(1);
            this.w = pIKr;
        }

        @Override // defpackage.j81
        public final sd5 invoke(If$ if$) {
            this.w.g(if$);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<If$, sd5> {
        public final /* synthetic */ PIKr w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(PIKr pIKr) {
            super(1);
            this.w = pIKr;
        }

        @Override // defpackage.j81
        public final sd5 invoke(If$ if$) {
            this.w.g(if$);
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
            Ix.b(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ T9r w;
        public final /* synthetic */ j81<If$, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(T9r t9r, j81<? super If$, sd5> j81Var, int i) {
            super(3);
            this.w = t9r;
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
                T9r t9r = this.w;
                pc0.b(t9r.a, null, null, X.m(g30Var2, 675486149, new LE9j(t9r, this.x, this.y)), g30Var2, 3072, 6);
            }
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
            Ix.d(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ T9r w;
        public final /* synthetic */ A$Y4 x;
        public final /* synthetic */ j81<If$, sd5> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public YKK(T9r t9r, A$Y4 a$y4, j81<? super If$, sd5> j81Var, int i) {
            super(3);
            this.w = t9r;
            this.x = a$y4;
            this.y = j81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                String strX = hH.x(R.string.audio_output_opensl_es_title, g30Var2);
                String strX2 = hH.x(R.string.audio_output_opensl_es_summary, g30Var2);
                g30Var2.e(1046420127);
                String strX3 = Build.VERSION.SDK_INT >= 25 ? hH.x(R.string.audio_output_opensl_es_warning, g30Var2) : null;
                g30Var2.G();
                T9r t9r = this.w;
                boolean z = t9r.d;
                A$Y4 a$y4 = A$Y4.OpenSL;
                A$Y4 a$y5 = this.x;
                Boolean boolValueOf = Boolean.valueOf(a$y5 == a$y4);
                g30Var2.e(1157296644);
                j81<If$, sd5> j81Var = this.y;
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objF == c0132QnHx) {
                    objF = new SQ(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                xh3.b(strX, boolValueOf, strX2, strX3, false, null, z, (h81) objF, g30Var2, 0, 48);
                String strX4 = hH.x(R.string.audio_output_audio_track_title, g30Var2);
                String strX5 = hH.x(R.string.audio_output_audio_track_summary, g30Var2);
                boolean z2 = t9r.d;
                Boolean boolValueOf2 = Boolean.valueOf(a$y5 == A$Y4.AudioTrack);
                g30Var2.e(1157296644);
                boolean zI2 = g30Var2.I(j81Var);
                Object objF2 = g30Var2.f();
                if (zI2 || objF2 == c0132QnHx) {
                    objF2 = new A6H(j81Var);
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                xh3.b(strX4, boolValueOf2, strX5, null, false, null, z2, (h81) objF2, g30Var2, 0, 56);
            }
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ T9r w;
        public final /* synthetic */ j81<If$, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(T9r t9r, j81<? super If$, sd5> j81Var, int i) {
            super(2);
            this.w = t9r;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            Ix.c(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(T9r t9r, j81<? super If$, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1496775683);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(t9r) ? 4 : 2) | i;
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
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, 752884782, new QnHx(t9r, j81Var, i2)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(t9r, j81Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(77874737);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-792630737);
            CHH chh = CHH.w;
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(chh, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(null, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(PIKr.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            PIKr pIKr = (PIKr) ((ZUx) obj);
            j30VarQ.R(false);
            ri2 ri2VarT = ps0.t(pIKr.f(), j30VarQ);
            pg2.QnHx qnHx = pg2.QnHx.w;
            float f = 16;
            pg2 pg2VarT = ps0.T(ob.x(qnHx, ob.w(0, j30VarQ, 1)), f);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarT);
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
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            d(j30VarQ, 0);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            T9r t9r = (T9r) ri2VarT.getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(pIKr);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new F1(pIKr);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            c(t9r, (j81) objB1, j30VarQ, 0);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            T9r t9r2 = (T9r) ri2VarT.getValue();
            j30VarQ.e(1157296644);
            boolean zI3 = j30VarQ.I(pIKr);
            Object objB2 = j30VarQ.b0();
            if (zI3 || objB2 == c0132QnHx) {
                objB2 = new LPt8Fixed(pIKr);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            a(t9r2, (j81) objB2, j30VarQ, 0);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
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
        tk3VarU.d = new NUlFixed(i);
    }

    public static final void c(T9r t9r, j81<? super If$, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(298635970);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(t9r) ? 4 : 2) | i;
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
            A$Y4 a$y4 = t9r.a;
            if (a$y4 != null) {
                a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, -1950130645, new YKK(t9r, a$y4, j81Var, i2)), j30VarQ, 196992, 27);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new auxFixed(t9r, j81Var, i);
    }

    public static final void d(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(384928603);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0.0f, null, 0.0f, g00.a, j30VarQ, 196608, 31);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new T23(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(nj1 nj1Var, boolean z, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30Var;
        j30 j30VarQ = g30Var.q(1279513473);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(nj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
            j30Var = j30VarQ;
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
            Uff4.a(R.string.audio_output_audio_track_options_title, ps0.T(qnHx, 16), j30VarQ, 48, 0);
            String strX = hH.x(R.string.audio_output_audio_track_low_latency_option_title, j30VarQ);
            String strX2 = hH.x(R.string.audio_output_audio_track_low_latency_option_summary, j30VarQ);
            Boolean boolValueOf = Boolean.valueOf(((q1) nj1Var.a).a);
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new d$iR(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            oy4.a(strX, null, null, boolValueOf, strX2, null, z, false, null, (j81) objB0, j30VarQ, (i2 << 15) & 3670016, 422);
            j30Var = j30VarQ;
            O.g(j30Var, false, false, true, false);
            j30Var.R(false);
        }
        tk3 tk3VarU = j30Var.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new iPTK(nj1Var, z, j81Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(nj1 nj1Var, boolean z, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30Var;
        j30 j30VarQ = g30Var.q(76258995);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(nj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
            j30Var = j30VarQ;
        } else {
            e40.CQf cQf = e40.a;
            if (!(Build.VERSION.SDK_INT >= 25)) {
                tk3 tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new t3G(nj1Var, z, j81Var, i);
                return;
            }
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
            Uff4.a(R.string.audio_output_opensl_track_options_title, ps0.T(qnHx, 16), j30VarQ, 48, 0);
            String strX = hH.x(R.string.audio_output_opensl_performance_mode_option_title, j30VarQ);
            String strX2 = hH.x(R.string.audio_output_opensl_performance_mode_option_summary, j30VarQ);
            Boolean boolValueOf = Boolean.valueOf(((jv2) nj1Var.a).a == kv2.LatencyWithEffects);
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new zgQ(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            oy4.a(strX, null, null, boolValueOf, strX2, null, z, false, null, (j81) objB0, j30VarQ, (i2 << 15) & 3670016, 422);
            j30Var = j30VarQ;
            O.g(j30Var, false, false, true, false);
            j30Var.R(false);
        }
        tk3 tk3VarU2 = j30Var.U();
        if (tk3VarU2 == null) {
            return;
        }
        tk3VarU2.d = new f_d(nj1Var, z, j81Var, i);
    }
}
