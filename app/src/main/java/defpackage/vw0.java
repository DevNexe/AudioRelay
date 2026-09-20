package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class vw0 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ kj1<ib3> x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(String str, kj1<ib3> kj1Var, int i, int i2) {
            super(2);
            this.w = str;
            this.x = kj1Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            kj1<ib3> kj1Var = this.x;
            int i2 = this.z;
            vw0.a(this.w, kj1Var, g30Var, i, i2);
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
            vw0.b(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ kj1<ib3> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(String str, kj1<ib3> kj1Var, int i) {
            super(3);
            this.w = str;
            this.x = kj1Var;
            this.y = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            int i;
            g30 g30Var2;
            g30 g30Var3;
            g30 g30Var4 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var4.t()) {
                g30Var4.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var4.e(-1699737249);
                String str = this.w;
                if (str != null) {
                    u15.a(str, 0.0f, null, g30Var4, this.y & 14, 6);
                    sd5 sd5Var = sd5.a;
                }
                g30Var4.G();
                kj1<ib3> kj1Var = this.x;
                int i2 = 0;
                for (ib3 ib3Var : kj1Var) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        ps0.j0();
                        throw null;
                    }
                    ib3 ib3Var2 = ib3Var;
                    da.CQf cQf2 = One.QnHx.k;
                    g30Var4.e(693286680);
                    pg2.QnHx qnHx = pg2.QnHx.w;
                    rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, g30Var4);
                    g30Var4.e(-1323940314);
                    jt4 jt4Var = r40.e;
                    ij0 ij0Var = (ij0) g30Var4.E(jt4Var);
                    jt4 jt4Var2 = r40.k;
                    jy1 jy1Var = (jy1) g30Var4.E(jt4Var2);
                    jt4 jt4Var3 = r40.o;
                    ti5 ti5Var = (ti5) g30Var4.E(jt4Var3);
                    a30.e.getClass();
                    yy1.QnHx qnHx2 = a30.QnHx.b;
                    sz szVarJ = S12N.j(qnHx);
                    if (!(g30Var4.v() instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    g30Var4.s();
                    if (g30Var4.m()) {
                        g30Var4.l(qnHx2);
                    } else {
                        g30Var4.A();
                    }
                    g30Var4.u();
                    a30.QnHx.F1 f1 = a30.QnHx.e;
                    hH.u(g30Var4, rb2VarA, f1);
                    a30.QnHx.C0012QnHx c0012QnHx = a30.QnHx.d;
                    hH.u(g30Var4, ij0Var, c0012QnHx);
                    a30.QnHx.CQf cQf3 = a30.QnHx.f;
                    hH.u(g30Var4, jy1Var, cQf3);
                    a30.QnHx.NUlFixed nUl = a30.QnHx.g;
                    qc0.c(0, szVarJ, bl2.b(g30Var4, ti5Var, nUl, g30Var4), g30Var4, 2058660585, -678309503);
                    ej1 ej1Var = ib3Var2.c;
                    g30Var4.e(-1415788580);
                    if (ej1Var == null) {
                        i = -1323940314;
                    } else {
                        rh1.a(ib3Var2.c, null, null, 0L, g30Var4, 48, 12);
                        hH.i(gm4.k(qnHx, 16), g30Var4, 6);
                        sd5 sd5Var2 = sd5.a;
                        i = -1323940314;
                    }
                    g30Var4.G();
                    g30Var4.e(-483455358);
                    rb2 rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, g30Var4);
                    g30Var4.e(i);
                    ij0 ij0Var2 = (ij0) g30Var4.E(jt4Var);
                    jy1 jy1Var2 = (jy1) g30Var4.E(jt4Var2);
                    ti5 ti5Var2 = (ti5) g30Var4.E(jt4Var3);
                    sz szVarJ2 = S12N.j(qnHx);
                    if (!(g30Var4.v() instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    g30Var4.s();
                    if (g30Var4.m()) {
                        g30Var4.l(qnHx2);
                    } else {
                        g30Var4.A();
                    }
                    int i4 = i2;
                    kj1<ib3> kj1Var2 = kj1Var;
                    qc0.c(0, szVarJ2, Xs.b(g30Var4, g30Var4, rb2VarA2, f1, g30Var4, ij0Var2, c0012QnHx, g30Var4, jy1Var2, cQf3, g30Var4, ti5Var2, nUl, g30Var4), g30Var4, 2058660585, -1163856341);
                    String strX = hH.x(ib3Var2.a, g30Var4);
                    jt4 jt4Var4 = sc5.a;
                    g30 g30Var5 = g30Var4;
                    j55.b(strX, null, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var4.E(jt4Var4)).j, g30Var5, 196608, 0, 32734);
                    pq4.c(4, g30Var5, 6);
                    g30Var5.e(-1699736550);
                    Integer num2 = ib3Var2.b;
                    if (num2 == null) {
                        g30Var2 = g30Var5;
                    } else {
                        num2.intValue();
                        g30Var2 = g30Var5;
                        j55.b(hH.x(num2.intValue(), g30Var5), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var5.E(jt4Var4)).j, g30Var5, 0, 0, 32766);
                        sd5 sd5Var3 = sd5.a;
                    }
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.H();
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.H();
                    g30Var2.G();
                    g30Var2.G();
                    if (i4 < ps0.J(kj1Var2)) {
                        g30Var3 = g30Var2;
                        pq4.c(16, g30Var3, 6);
                    } else {
                        g30Var3 = g30Var2;
                    }
                    g30Var4 = g30Var3;
                    i2 = i3;
                    kj1Var = kj1Var2;
                }
                e40.CQf cQf4 = e40.a;
            }
            return sd5.a;
        }
    }

    public static final void a(String str, kj1<ib3> kj1Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(461746990);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(kj1Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                str = null;
            }
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, 1934274205, new QnHx(str, kj1Var, i3)), j30VarQ, 196608, 31);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(str, kj1Var, i, i2);
    }

    public static final void b(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-22067850);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a(hH.x(R.string.premium_feature_player_mode_title, j30VarQ), ib3.d, j30VarQ, 48, 0);
            float f = 16;
            float f2 = 0.0f;
            float f3 = 0.0f;
            wo1.QnHx qnHx = wo1.a;
            int i2 = 5;
            hH.i(new lm4(f2, f, f3, f, i2), j30VarQ, 6);
            a(hH.x(R.string.premium_feature_server_mode_title, j30VarQ), ib3.e, j30VarQ, 48, 0);
            hH.i(new lm4(f2, f, f3, f, i2), j30VarQ, 6);
            a(null, ib3.f, j30VarQ, 48, 1);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(i);
    }
}
