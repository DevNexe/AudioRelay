package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class yh1 {

    public static final class CQf extends cx1 implements j81<wb4, sd5> {
        public final /* synthetic */ j81<VV4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(j81<? super VV4, sd5> j81Var) {
            super(1);
            this.w = j81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(wb4 wb4Var) {
            wb4 wb4Var2 = wb4Var;
            a62.a.h("server", "start_server", wb4Var2.w);
            this.w.invoke(new VV4.y(wb4Var2));
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ tg x;
        public final /* synthetic */ j81<VV4, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(pg2 pg2Var, tg tgVar, j81<? super VV4, sd5> j81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = tgVar;
            this.y = j81Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            yh1.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ String A;
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ String x;
        public final /* synthetic */ int y;
        public final /* synthetic */ ej1 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(int i, ej1 ej1Var, String str, String str2, h81 h81Var) {
            super(3);
            this.w = h81Var;
            this.x = str;
            this.y = i;
            this.z = ej1Var;
            this.A = str2;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                pg2.QnHx qnHx = pg2.QnHx.w;
                float f = 16;
                pg2 pg2VarT = ps0.T(hr.c(qnHx, false, this.w, 7), f);
                String str = this.x;
                ej1 ej1Var = this.z;
                String str2 = this.A;
                g30Var2.e(693286680);
                CZ9P.byN byn = CZ9P.a;
                da.CQf cQf2 = One.QnHx.j;
                rb2 rb2VarA = uu3.a(byn, cQf2, g30Var2);
                g30Var2.e(-1323940314);
                jt4 jt4Var = r40.e;
                ij0 ij0Var = (ij0) g30Var2.E(jt4Var);
                jt4 jt4Var2 = r40.k;
                jy1 jy1Var = (jy1) g30Var2.E(jt4Var2);
                jt4 jt4Var3 = r40.o;
                ti5 ti5Var = (ti5) g30Var2.E(jt4Var3);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(pg2VarT);
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
                a30.QnHx.F1 f1 = a30.QnHx.e;
                hH.u(g30Var2, rb2VarA, f1);
                a30.QnHx.C0012QnHx c0012QnHx = a30.QnHx.d;
                hH.u(g30Var2, ij0Var, c0012QnHx);
                a30.QnHx.CQf cQf3 = a30.QnHx.f;
                hH.u(g30Var2, jy1Var, cQf3);
                a30.QnHx.NUlFixed nUl = a30.QnHx.g;
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, nUl, g30Var2), g30Var2, 2058660585, -678309503);
                xu3 xu3Var = xu3.a;
                pg2 pg2VarA = xu3Var.a(qnHx, 1.0f, true);
                g30Var2.e(-483455358);
                rb2 rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var2 = (ij0) g30Var2.E(jt4Var);
                jy1 jy1Var2 = (jy1) g30Var2.E(jt4Var2);
                ti5 ti5Var2 = (ti5) g30Var2.E(jt4Var3);
                sz szVarJ2 = S12N.j(pg2VarA);
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
                qc0.c(0, szVarJ2, Xs.b(g30Var2, g30Var2, rb2VarA2, f1, g30Var2, ij0Var2, c0012QnHx, g30Var2, jy1Var2, cQf3, g30Var2, ti5Var2, nUl, g30Var2), g30Var2, 2058660585, -1163856341);
                g30Var2.e(693286680);
                rb2 rb2VarA3 = uu3.a(byn, cQf2, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var3 = (ij0) g30Var2.E(jt4Var);
                jy1 jy1Var3 = (jy1) g30Var2.E(jt4Var2);
                ti5 ti5Var3 = (ti5) g30Var2.E(jt4Var3);
                sz szVarJ3 = S12N.j(qnHx);
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
                qc0.c(0, szVarJ3, Xs.b(g30Var2, g30Var2, rb2VarA3, f1, g30Var2, ij0Var3, c0012QnHx, g30Var2, jy1Var3, cQf3, g30Var2, ti5Var3, nUl, g30Var2), g30Var2, 2058660585, -678309503);
                da.CQf cQf4 = One.QnHx.k;
                pg2 pg2VarB = xu3Var.b(qnHx, cQf4);
                int i = this.y;
                rh1.a(ej1Var, null, pg2VarB, 0L, g30Var2, ((i >> 6) & 14) | 48, 8);
                pq4.a(8, g30Var2, 6);
                pg2 pg2VarB2 = xu3Var.b(qnHx, cQf4);
                jt4 jt4Var4 = sc5.a;
                j55.b(str2, pg2VarB2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, XTd3.d(((rc5) g30Var2.E(jt4Var4)).i), g30Var2, i & 14, 0, 32764);
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                pq4.b(8, g30Var2, 6);
                j55.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(jt4Var4)).j, g30Var2, (i >> 3) & 14, 0, 32766);
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                pq4.a(f, g30Var2, 6);
                rh1.a(m21.b(), null, xu3Var.b(qnHx, cQf4), 0L, g30Var2, 48, 8);
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ String w;
        public final /* synthetic */ String x;
        public final /* synthetic */ ej1 y;
        public final /* synthetic */ h81<sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i, ej1 ej1Var, String str, String str2, h81 h81Var) {
            super(2);
            this.w = str;
            this.x = str2;
            this.y = ej1Var;
            this.z = h81Var;
            this.A = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            yh1.b(this.w, this.x, this.y, this.z, g30Var, this.A | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<VV4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(j81<? super VV4, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(VV4.F1.a);
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ j81<wb4, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public T23(boolean z, j81<? super wb4, sd5> j81Var, int i) {
            super(2);
            this.w = z;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            yh1.c(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<wb4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public YKK(j81<? super wb4, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(wb4.Microphone);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<wb4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(j81<? super wb4, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(wb4.Playback);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final void a(pg2 pg2Var, tg tgVar, j81<? super VV4, sd5> j81Var, g30 g30Var, int i, int i2) {
        pg2 pg2Var2;
        int i3;
        pg2 pg2Var3;
        ?? r9;
        int i4;
        int i5;
        j30 j30VarQ = g30Var.q(605519183);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(tgVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
            pg2Var3 = pg2Var2;
        } else {
            pg2.QnHx qnHx = pg2.QnHx.w;
            pg2Var3 = i6 != 0 ? qnHx : pg2Var2;
            e40.CQf cQf = e40.a;
            Boolean bool = tgVar.b;
            if (bool != null) {
                bool.booleanValue();
                pg2 pg2VarX = ob.x(pg2Var3, ob.w(0, j30VarQ, 1));
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
                j30VarQ.e(-1470391827);
                boolean zBooleanValue = bool.booleanValue();
                Object obj = g30.QnHx.a;
                if (zBooleanValue) {
                    float f = 16;
                    i5 = 6;
                    i4 = 1157296644;
                    r9 = 0;
                    pg2 pg2VarX2 = ps0.X(qnHx, f, f, f, 0.0f, 8);
                    j30VarQ.e(1157296644);
                    boolean zI = j30VarQ.I(j81Var);
                    Object objB0 = j30VarQ.b0();
                    if (zI || objB0 == obj) {
                        objB0 = new QnHx(j81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ti4.a(pg2VarX2, (h81) objB0, j30VarQ, 6, 0);
                } else {
                    r9 = 0;
                    i4 = 1157296644;
                    i5 = 6;
                }
                j30VarQ.R(r9);
                j30VarQ.e(i4);
                boolean zI2 = j30VarQ.I(j81Var);
                Object objB1 = j30VarQ.b0();
                if (zI2 || objB1 == obj) {
                    objB1 = new CQf(j81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(r9);
                c(tgVar.e, (j81) objB1, j30VarQ, r9);
                pq4.b(16, j30VarQ, i5);
                j30VarQ.R(r9);
                j30VarQ.R(r9);
                j30VarQ.R(true);
                j30VarQ.R(r9);
                j30VarQ.R(r9);
                bool.booleanValue();
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(pg2Var3, tgVar, j81Var, i, i2);
    }

    public static final void b(String str, String str2, ej1 ej1Var, h81<sd5> h81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1830053100);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(str2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(ej1Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(h81Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, -909757219, new LPt8Fixed(i3, ej1Var, str2, str, h81Var)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(i, ej1Var, str, str2, h81Var);
    }

    public static final void c(boolean z, j81<? super wb4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-578741924);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
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
            float f = 16;
            wo1.QnHx qnHx = wo1.a;
            zx2 zx2Var = new zx2(f, f, f, f);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(zx2Var);
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
            Uff4.a(R.string.server_input_sources, null, j30VarQ, 0, 2);
            pq4.c(f, j30VarQ, 6);
            String strX = hH.x(R.string.server_mic_input_source_title, j30VarQ);
            String strX2 = hH.x(R.string.server_mic_input_source_summary, j30VarQ);
            ej1 ej1VarG = qLd.g();
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new YKK(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            b(strX, strX2, ej1VarG, (h81) objB0, j30VarQ, 0);
            if (z) {
                pq4.c(f, j30VarQ, 6);
                String strX3 = hH.x(R.string.server_apps_input_source_title, j30VarQ);
                String strX4 = hH.x(R.string.server_apps_input_source_summary, j30VarQ);
                ej1 ej1VarD = XTd3.w;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx3 = new ej1.QnHx("Outlined.Cast");
                    int i3 = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(21.0f, 3.0f);
                    le3Var.g(3.0f, 3.0f);
                    le3Var.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    le3Var.n(3.0f);
                    le3Var.f(2.0f);
                    le3Var.g(3.0f, 5.0f);
                    le3Var.f(18.0f);
                    le3Var.n(14.0f);
                    le3Var.f(-7.0f);
                    le3Var.n(2.0f);
                    le3Var.f(7.0f);
                    le3Var.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    le3Var.g(23.0f, 5.0f);
                    le3Var.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    le3Var.b();
                    le3Var.i(1.0f, 18.0f);
                    le3Var.n(3.0f);
                    le3Var.f(3.0f);
                    le3Var.d(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                    le3Var.b();
                    le3Var.i(1.0f, 14.0f);
                    le3Var.n(2.0f);
                    le3Var.d(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
                    le3Var.f(2.0f);
                    le3Var.d(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
                    le3Var.b();
                    le3Var.i(1.0f, 10.0f);
                    le3Var.n(2.0f);
                    le3Var.d(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
                    le3Var.f(2.0f);
                    le3Var.d(0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f);
                    le3Var.b();
                    qnHx3.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx3.d();
                    XTd3.w = ej1VarD;
                }
                j30VarQ.e(1157296644);
                boolean zI2 = j30VarQ.I(j81Var);
                Object objB1 = j30VarQ.b0();
                if (zI2 || objB1 == c0132QnHx) {
                    objB1 = new auxFixed(j81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                b(strX3, strX4, ej1VarD, (h81) objB1, j30VarQ, 0);
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new T23(z, j81Var, i);
    }
}
