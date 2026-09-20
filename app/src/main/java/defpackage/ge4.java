package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ge4 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ rd4 w;
        public final /* synthetic */ j81<qd4, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(rd4 rd4Var, j81<? super qd4, sd5> j81Var, int i) {
            super(2);
            this.w = rd4Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ge4.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<kj1<pd4>, g30, Integer, sd5> {
        public final /* synthetic */ j81<qd4, sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, j81 j81Var) {
            super(3);
            this.w = j81Var;
            this.x = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(kj1<pd4> kj1Var, g30 g30Var, Integer num) {
            kj1<pd4> kj1Var2 = kj1Var;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(kj1Var2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                if (kj1Var2.isEmpty()) {
                    g30Var2.e(-603870533);
                    a_.b(null, 0L, 0, null, 0.0f, f20.a, g30Var2, 196992, 27);
                    g30Var2.G();
                } else {
                    g30Var2.e(-603870196);
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
                    int i = 0;
                    for (pd4 pd4Var : kj1Var2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            ps0.j0();
                            throw null;
                        }
                        ge4.b(pd4Var.b, this.w, g30Var2, this.x & 112);
                        if (!(i == kj1Var2.size() - 1)) {
                            float f = 16;
                            wo1.QnHx qnHx3 = wo1.a;
                            hH.i(new lm4(0.0f, f, 0.0f, f, 5), g30Var2, 6);
                        }
                        i = i2;
                    }
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.H();
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.G();
                }
                e40.CQf cQf2 = e40.a;
            }
            return sd5.a;
        }
    }

    public static final void a(rd4 rd4Var, j81<? super qd4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(587290413);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(rd4Var) ? 4 : 2) | i;
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
            qu4.QnHx qnHx3 = qu4.a;
            Context context = kd.w;
            if (context == null) {
                ur1.e("context");
                throw null;
            }
            qu4.a.getClass();
            u15.a(iZUl.b(qu4.QnHx.b, context, R.string.player_servers_title), 0.0f, null, j30VarQ, 0, 6);
            pc0.b(rd4Var.a, null, null, X.m(j30VarQ, -2040467329, new QnHx(i2, j81Var)), j30VarQ, 3072, 6);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(rd4Var, j81Var, i);
    }

    public static final void b(jf4 jf4Var, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1121232105);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(jf4Var) ? 4 : 2) | i;
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
            pg2.QnHx qnHx = pg2.QnHx.w;
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(j81Var) | j30VarQ.I(jf4Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new ce4(j81Var, jf4Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pg2 pg2VarH = fTO$.h(cw1.a(qnHx, new lw1((h81) objB0)), j30VarQ);
            j30VarQ.e(511388516);
            boolean zI2 = j30VarQ.I(j81Var) | j30VarQ.I(jf4Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new de4(j81Var, jf4Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            a_.b(hr.c(pg2VarH, false, (h81) objB1, 7), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -1302071334, new ee4(jf4Var, i2)), j30VarQ, 196608, 30);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new fe4(jf4Var, j81Var, i);
    }
}
