package defpackage;

import com.azefsw.audioconnect.R;
import com.facebook.ads.AdError;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ QsF6 w;
        public final /* synthetic */ j81<wXc, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(QsF6 qsF6, j81<? super wXc, sd5> j81Var, int i) {
            super(2);
            this.w = qsF6;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            j0.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<wXc, sd5> {
        public final /* synthetic */ o0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(o0 o0Var) {
            super(1);
            this.w = o0Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(wXc wxc) {
            this.w.g(wxc);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<wXc, sd5> {
        public final /* synthetic */ o0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(o0 o0Var) {
            super(1);
            this.w = o0Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(wXc wxc) {
            this.w.g(wxc);
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
            j0.b(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ QsF6 w;
        public final /* synthetic */ j81<wXc, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(QsF6 qsF6, j81<? super wXc, sd5> j81Var, int i) {
            super(3);
            this.w = qsF6;
            this.x = j81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                String strX = hH.x(R.string.audio_quality_uncompressed_title, g30Var2);
                String strX2 = hH.x(R.string.audio_quality_uncompressed_summary, g30Var2);
                QsF6 qsF6 = this.w;
                boolean z = qsF6.a == bLBI.Uncompressed;
                boolean z2 = qsF6.e;
                boolean z3 = qsF6.f;
                Boolean boolValueOf = Boolean.valueOf(z);
                j81<wXc, sd5> j81Var = this.x;
                xh3.b(strX, boolValueOf, strX2, null, z3, null, z2, new g0(qsF6, j81Var), g30Var2, 0, 40);
                String strX3 = hH.x(R.string.audio_quality_compressed_title, g30Var2);
                String strX4 = hH.x(R.string.audio_quality_compressed_summary, g30Var2);
                boolean z4 = qsF6.a == bLBI.Compressed;
                boolean z5 = qsF6.e;
                Boolean boolValueOf2 = Boolean.valueOf(z4);
                g30Var2.e(1157296644);
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new i0(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                xh3.b(strX3, boolValueOf2, strX4, null, false, null, z5, (h81) objF, g30Var2, 0, 56);
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ QsF6 w;
        public final /* synthetic */ j81<wXc, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public YKK(QsF6 qsF6, j81<? super wXc, sd5> j81Var) {
            super(3);
            this.w = qsF6;
            this.x = j81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                float f = 16;
                wo1.QnHx qnHx = wo1.a;
                Uff4.a(R.string.audio_quality_compression_options_title, new zx2(f, f, f, f), g30Var2, 48, 0);
                List<wv2> list = xv2.a;
                int size = list.size() - 1;
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ps0.j0();
                        throw null;
                    }
                    wv2 wv2Var = (wv2) obj;
                    QsF6 qsF6 = this.w;
                    j0.d(wv2Var, qsF6.e, ur1.a(qsF6.b, wv2Var), qsF6.f, new l0(wv2Var, qsF6, this.x), g30Var2, 0);
                    if (size != i) {
                        om0.a(null, 0L, 0.0f, 0.0f, g30Var2, 0, 15);
                    }
                    i = i2;
                }
                e40.CQf cQf2 = e40.a;
            }
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ QsF6 w;
        public final /* synthetic */ j81<wXc, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(QsF6 qsF6, j81<? super wXc, sd5> j81Var, int i) {
            super(2);
            this.w = qsF6;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            j0.c(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(QsF6 qsF6, j81<? super wXc, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(2137154293);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(qsF6) ? 4 : 2) | i;
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
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, -1192586972, new QnHx(qsF6, j81Var, i2)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(qsF6, j81Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-428658527);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-934087085);
            bm2 bm2Var = (bm2) j30VarQ.E(u42.a);
            m0 m0Var = m0.w;
            n0 n0Var = new n0(bm2Var);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(m0Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(n0Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(o0.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            o0 o0Var = (o0) ((ZUx) obj);
            j30VarQ.R(false);
            ri2 ri2VarT = ps0.t(o0Var.f(), j30VarQ);
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
            QsF6 qsF6 = (QsF6) ri2VarT.getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(o0Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new F1(o0Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            a(qsF6, (j81) objB1, j30VarQ, 0);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            if (((QsF6) ri2VarT.getValue()).g) {
                QsF6 qsF7 = (QsF6) ri2VarT.getValue();
                j30VarQ.e(1157296644);
                boolean zI3 = j30VarQ.I(o0Var);
                Object objB2 = j30VarQ.b0();
                if (zI3 || objB2 == c0132QnHx) {
                    objB2 = new LPt8Fixed(o0Var);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                c(qsF7, (j81) objB2, j30VarQ, 0);
                hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(i);
    }

    public static final void c(QsF6 qsF6, j81<? super wXc, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-270273539);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(qsF6) ? 4 : 2) | i;
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
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, -594189202, new YKK(qsF6, j81Var)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new auxFixed(qsF6, j81Var, i);
    }

    public static final void d(wv2 wv2Var, boolean z, boolean z2, boolean z3, h81 h81Var, g30 g30Var, int i) {
        int i2;
        String strX;
        j30 j30VarQ = g30Var.q(-252294984);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(wv2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.c(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.c(z3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(h81Var) ? 16384 : 8192;
        }
        if ((46811 & i2) == 9362 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            String strY = hH.y(R.string.audio_quality_bitrate_seconds, new Object[]{Integer.valueOf(wv2Var.a / AdError.NETWORK_ERROR_CODE)}, j30VarQ);
            j30VarQ.e(964335356);
            int i3 = wv2Var.a;
            if (i3 <= 10000) {
                j30VarQ.e(-1879726525);
                strX = hH.x(R.string.audio_quality_bitrate_usage_voip, j30VarQ);
                j30VarQ.R(false);
            } else if (i3 <= 96000) {
                j30VarQ.e(-1879726412);
                strX = hH.x(R.string.audio_quality_bitrate_usage_talks, j30VarQ);
                j30VarQ.R(false);
            } else if (i3 <= 450000) {
                j30VarQ.e(-1879726301);
                strX = hH.x(R.string.audio_quality_bitrate_usage_music, j30VarQ);
                j30VarQ.R(false);
            } else {
                j30VarQ.e(1858029138);
                j30VarQ.R(false);
                strX = "";
            }
            j30VarQ.R(false);
            xh3.b(strY, Boolean.valueOf(z2), strX, null, wv2Var.b && z3, null, z, h81Var, j30VarQ, ((i2 >> 3) & 112) | ((i2 << 15) & 3670016) | ((i2 << 9) & 29360128), 40);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new k0(wv2Var, z, z2, z3, h81Var, i);
    }
}
