package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ti4 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(pg2 pg2Var, h81<sd5> h81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = h81Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ti4.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ Context y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(h81<sd5> h81Var, int i, Context context) {
            super(3);
            this.w = h81Var;
            this.x = i;
            this.y = context;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                Uff4.a(R.string.setup_card_title, null, g30Var2, 0, 2);
                float f = 8;
                float f2 = 0.0f;
                float f3 = 0.0f;
                wo1.QnHx qnHx = wo1.a;
                int i = 5;
                hH.i(new lm4(f2, f, f3, f, i), g30Var2, 6);
                ti4.b(g30Var2, 0);
                wo1.QnHx qnHx2 = wo1.a;
                hH.i(new lm4(f2, f, f3, f, i), g30Var2, 6);
                hx0 hx0Var = gm4.a;
                CZ9P.F1 f1 = CZ9P.b;
                h81<sd5> h81Var = this.w;
                g30Var2.e(693286680);
                rb2 rb2VarA = uu3.a(f1, One.QnHx.j, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx3 = a30.QnHx.b;
                sz szVarJ = S12N.j(hx0Var);
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
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -678309503);
                si.c(h81Var, null, false, null, h20.a, g30Var2, ((this.x >> 3) & 14) | 805306368, 510);
                float f4 = 16;
                wo1.QnHx qnHx4 = wo1.a;
                hH.i(new lm4(f4, 0.0f, f4, 0.0f, 10), g30Var2, 6);
                si.b(new si4(this.y), null, false, h20.b, g30Var2, 805306368, 510);
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }

    public static final void a(pg2 pg2Var, h81<sd5> h81Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(2004549796);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(h81Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            a_.b(pg2Var, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -675218605, new QnHx(h81Var, i3, (Context) j30VarQ.E(Ll.b))), j30VarQ, (i3 & 14) | 196608, 30);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var, h81Var, i, i2);
    }

    public static final void b(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-36698636);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-318489891);
            yf yfVarB = ag.b(j30VarQ);
            ag.a(yfVarB, j30VarQ, 0);
            j30VarQ.R(false);
            j30VarQ.e(-2111989553);
            Z7jl.QnHx qnHx = new Z7jl.QnHx();
            String strY = hH.y(R.string.generic_setup_card_instructions, new Object[]{"https://audiorelay.net"}, j30VarQ);
            int iF = mv4.F(strY, "https://audiorelay.net", 0, false, 6);
            int i2 = iF + 22;
            jt4 jt4Var = sv.a;
            int iD = qnHx.d(new rq4(((rv) j30VarQ.E(jt4Var)).f(), 0L, (x41) null, (v41) null, (w41) null, (e41) null, (String) null, 0L, (x8) null, (a55) null, (z42) null, 0L, (a25) null, (yi4) null, 16382));
            try {
                qnHx.a.append(strY);
                sd5 sd5Var = sd5.a;
                qnHx.c(iD);
                rq4 rq4Var = new rq4(((rv) j30VarQ.E(jt4Var)).g(), 0L, (x41) null, (v41) null, (w41) null, (e41) null, (String) null, 0L, (x8) null, (a55) null, (z42) null, 0L, a25.c, (yi4) null, 12286);
                qnHx.d.add(new Z7jl.QnHx.C0011QnHx("https://audiorelay.net", iF, i2, "URL"));
                qnHx.a(rq4Var, iF, i2);
                Z7jl z7jlE = qnHx.e();
                j30VarQ.R(false);
                w55 w55Var = ((rc5) j30VarQ.E(sc5.a)).j;
                j30VarQ.e(511388516);
                boolean zI = j30VarQ.I(z7jlE) | j30VarQ.I(yfVarB);
                Object objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new ui4(z7jlE, yfVarB);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                xr.a(z7jlE, null, w55Var, false, 0, 0, null, (j81) objB0, j30VarQ, 0, 122);
            } catch (Throwable th) {
                qnHx.c(iD);
                throw th;
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new vi4(i);
    }
}
