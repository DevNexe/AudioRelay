package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ut4 {

    public static final class CQf extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ vy3 w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(vy3 vy3Var, boolean z, int i) {
            super(3);
            this.w = vy3Var;
            this.x = z;
            this.y = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var2.e(693286680);
                pg2.QnHx qnHx = pg2.QnHx.w;
                rb2 rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, g30Var2);
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
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -678309503);
                xu3 xu3Var = xu3.a;
                int i = this.y << 3;
                int i2 = (i & 896) | (i & 112) | 6;
                vy3 vy3Var = this.w;
                boolean z = this.x;
                ut4.c(xu3Var, vy3Var, z, g30Var2, i2);
                hH.i(gm4.k(qnHx, 16), g30Var2, 6);
                ut4.e(xu3Var, vy3Var, z, g30Var2, i2);
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                ut4.d(vy3Var.f, g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ vy3 w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(vy3 vy3Var, boolean z, int i) {
            super(2);
            this.w = vy3Var;
            this.x = z;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ut4.b(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(String str, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = str;
            this.x = pg2Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            pg2 pg2Var = this.x;
            int i2 = this.z;
            ut4.a(this.w, pg2Var, g30Var, i, i2);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        int i4;
        pg2 pg2Var3;
        j30 j30Var;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1431470326);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 91) == 18 || !j30VarQ.t()) {
                if (i5 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf = e40.a;
                j30Var = j30VarQ;
                j55.b(str, pg2Var3, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30Var, (i4 & 14) | 196608 | (i4 & 112), 0, 32732);
                pg2Var2 = pg2Var3;
            } else {
                j30VarQ.x();
                j30Var = j30VarQ;
            }
            tk3VarU = j30Var.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(str, pg2Var2, i, i2);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        i4 = i3;
        if ((i4 & 91) == 18) {
            if (i5 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf2 = e40.a;
            j30Var = j30VarQ;
            j55.b(str, pg2Var3, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30Var, (i4 & 14) | 196608 | (i4 & 112), 0, 32732);
            pg2Var2 = pg2Var3;
        } else {
            if (i5 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf3 = e40.a;
            j30Var = j30VarQ;
            j55.b(str, pg2Var3, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30Var, (i4 & 14) | 196608 | (i4 & 112), 0, 32732);
            pg2Var2 = pg2Var3;
        }
        tk3VarU = j30Var.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(str, pg2Var2, i, i2);
    }

    public static final void b(vy3 vy3Var, boolean z, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1902591618);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(vy3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(ps0.V(pg2.QnHx.w, 16, 0.0f, 2), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, 1197552879, new CQf(vy3Var, z, i2)), j30VarQ, 196614, 30);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(vy3Var, z, i);
    }

    public static final void c(wu3 wu3Var, vy3 vy3Var, boolean z, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1053936454);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(wu3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(vy3Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.c(z) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            pg2 pg2VarC = xj4.c(qnHx, z);
            ej1 ej1VarD = AY.A;
            if (ej1VarD == null) {
                ej1.QnHx qnHx2 = new ej1.QnHx("Outlined.QueueMusic");
                int i3 = sg5.a;
                jq4 jq4Var = new jq4(yu.b);
                le3 le3Var = new le3();
                le3Var.i(22.0f, 6.0f);
                le3Var.f(-5.0f);
                le3Var.n(8.18f);
                le3Var.c(16.69f, 14.07f, 16.35f, 14.0f, 16.0f, 14.0f);
                le3Var.d(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                le3Var.k(1.34f, 3.0f, 3.0f, 3.0f);
                le3Var.k(3.0f, -1.34f, 3.0f, -3.0f);
                le3Var.m(8.0f);
                le3Var.f(3.0f);
                le3Var.m(6.0f);
                le3Var.b();
                le3Var.i(15.0f, 6.0f);
                le3Var.e(3.0f);
                le3Var.n(2.0f);
                le3Var.f(12.0f);
                le3Var.m(6.0f);
                le3Var.b();
                le3Var.i(15.0f, 10.0f);
                le3Var.e(3.0f);
                le3Var.n(2.0f);
                le3Var.f(12.0f);
                le3Var.m(10.0f);
                le3Var.b();
                le3Var.i(11.0f, 14.0f);
                le3Var.e(3.0f);
                le3Var.n(2.0f);
                le3Var.f(8.0f);
                le3Var.m(14.0f);
                le3Var.b();
                qnHx2.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                ej1VarD = qnHx2.d();
                AY.A = ej1VarD;
            }
            rh1.a(ej1VarD, null, pg2VarC, 0L, j30VarQ, 48, 8);
            float f = 16;
            hH.i(gm4.k(qnHx, f), j30VarQ, 6);
            pg2 pg2VarJ = gm4.j(wu3Var.a(qnHx, 1.0f, true), 0.0f, 0.0f, RCHTTPStatusCodes.SUCCESS, 0.0f, 11);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx3 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarJ);
            if (!(j30VarQ.a instanceof jE)) {
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
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            hH.i(gm4.g(qnHx, 5), j30VarQ, 6);
            j55.b(hH.x(R.string.player_stats_audio_buffer_title, j30VarQ).toUpperCase(Locale.ROOT), xj4.c(qnHx, z), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).m, j30VarQ, 0, 0, 32764);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            a(vy3Var.c, xj4.c(qnHx, z), j30VarQ, 0, 0);
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
        tk3VarU.d = new pt4(wu3Var, vy3Var, z, i);
    }

    public static final void d(kj1 kj1Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1386676100);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(kj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            if (kj1Var.isEmpty()) {
                tk3 tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new qt4(kj1Var, i);
                return;
            }
            float f = 16;
            wo1.QnHx qnHx = wo1.a;
            hH.i(new lm4(0.0f, f, 0.0f, f, 5), j30VarQ, 6);
            q70.a(X.m(j30VarQ, -449816369, new rt4(kj1Var)), j30VarQ, 6);
        }
        tk3 tk3VarU2 = j30VarQ.U();
        if (tk3VarU2 == null) {
            return;
        }
        tk3VarU2.d = new st4(kj1Var, i);
    }

    public static final void e(wu3 wu3Var, vy3 vy3Var, boolean z, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(634927076);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(wu3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(vy3Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.c(z) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            pg2 pg2VarC = xj4.c(qnHx, z);
            ej1 ej1VarD = CXJ.k;
            if (ej1VarD == null) {
                ej1.QnHx qnHx2 = new ej1.QnHx("Outlined.Wifi");
                int i3 = sg5.a;
                jq4 jq4Var = new jq4(yu.b);
                le3 le3Var = new le3();
                le3Var.i(1.0f, 9.0f);
                le3Var.h(2.0f, 2.0f);
                le3Var.d(4.97f, -4.97f, 13.03f, -4.97f, 18.0f, 0.0f);
                le3Var.h(2.0f, -2.0f);
                le3Var.c(16.93f, 2.93f, 7.08f, 2.93f, 1.0f, 9.0f);
                le3Var.b();
                le3Var.i(9.0f, 17.0f);
                le3Var.h(3.0f, 3.0f);
                le3Var.h(3.0f, -3.0f);
                le3Var.d(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
                le3Var.b();
                le3Var.i(5.0f, 13.0f);
                le3Var.h(2.0f, 2.0f);
                le3Var.d(2.76f, -2.76f, 7.24f, -2.76f, 10.0f, 0.0f);
                le3Var.h(2.0f, -2.0f);
                le3Var.c(15.14f, 9.14f, 8.87f, 9.14f, 5.0f, 13.0f);
                le3Var.b();
                qnHx2.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                ej1VarD = qnHx2.d();
                CXJ.k = ej1VarD;
            }
            rh1.a(ej1VarD, null, pg2VarC, 0L, j30VarQ, 48, 8);
            float f = 16;
            hH.i(gm4.k(qnHx, f), j30VarQ, 6);
            pg2 pg2VarA = wu3Var.a(qnHx, 1.0f, true);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx3 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarA);
            if (!(j30VarQ.a instanceof jE)) {
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
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            hH.i(gm4.g(qnHx, 5), j30VarQ, 6);
            pg2 pg2VarC2 = xj4.c(qnHx, z);
            String upperCase = hH.x(R.string.player_stats_latency_title, j30VarQ).toUpperCase(Locale.ROOT);
            jt4 jt4Var = sc5.a;
            j55.b(upperCase, pg2VarC2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(jt4Var)).m, j30VarQ, 0, 0, 32764);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            j55.b(hH.x(R.string.player_stats_average_latency, j30VarQ), xj4.c(qnHx, z), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(jt4Var)).j, j30VarQ, 0, 0, 32764);
            float f2 = 4;
            hH.i(gm4.g(qnHx, f2), j30VarQ, 6);
            a(vy3Var.d, xj4.c(qnHx, z), j30VarQ, 0, 0);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            pg2 pg2VarC3 = xj4.c(qnHx, z);
            qu4.QnHx qnHx4 = qu4.a;
            Context context = kd.w;
            if (context == null) {
                ur1.e("context");
                throw null;
            }
            qu4.a.getClass();
            j55.b(iZUl.b(qu4.QnHx.b, context, R.string.player_stats_max_latency), pg2VarC3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(jt4Var)).j, j30VarQ, 0, 0, 32764);
            hH.i(gm4.g(qnHx, f2), j30VarQ, 6);
            a(vy3Var.e, xj4.c(qnHx, z), j30VarQ, 0, 0);
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
        tk3VarU.d = new tt4(wu3Var, vy3Var, z, i);
    }
}
