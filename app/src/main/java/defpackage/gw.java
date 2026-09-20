package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class gw {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i, String str, h81 h81Var) {
            super(2);
            this.w = str;
            this.x = h81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            gw.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ int x;
        public final /* synthetic */ h81<sd5> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, String str, h81 h81Var) {
            super(2);
            this.w = str;
            this.x = i;
            this.y = h81Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                pg2.QnHx qnHx = pg2.QnHx.w;
                float f = 16;
                pg2 pg2VarJ = gm4.j(f30.a(ps0.T(qnHx, f), wo1.a, new pw1(ob.w(0, g30Var2, 1))), 280, 0.0f, 0.0f, 0.0f, 14);
                String str = this.w;
                g30Var2.e(-483455358);
                rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(pg2VarJ);
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
                zv zvVar = zv.a;
                qu4.QnHx qnHx3 = qu4.a;
                Context context = kd.w;
                if (context == null) {
                    ur1.e("context");
                    throw null;
                }
                qu4.a.getClass();
                String strB = iZUl.b(qu4.QnHx.b, context, R.string.copy_url_title);
                jt4 jt4Var = sc5.a;
                j55.b(strB, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(jt4Var)).f, g30Var2, 0, 0, 32766);
                hH.i(gm4.g(qnHx, 24), g30Var2, 6);
                qu4.QnHx qnHx4 = qu4.a;
                Context context2 = kd.w;
                if (context2 == null) {
                    ur1.e("context");
                    throw null;
                }
                qu4.a.getClass();
                j55.b(iZUl.b(qu4.QnHx.b, context2, R.string.copy_url_summary), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(jt4Var)).j, g30Var2, 0, 0, 32766);
                hH.i(gm4.g(qnHx, f), g30Var2, 6);
                s35.a(str, ew.w, gm4.a, false, false, null, o00.a, null, null, null, false, null, null, null, true, 0, null, null, null, g30Var2, (this.x & 14) | 1573296, 24576, 507832);
                pq4.d(zvVar, g30Var2, 6);
                hH.i(gm4.g(qnHx, f), g30Var2, 6);
                pg2 pg2VarA = zvVar.a(One.QnHx.o);
                qu4.QnHx qnHx5 = qu4.a;
                Context context3 = kd.w;
                if (context3 == null) {
                    ur1.e("context");
                    throw null;
                }
                qu4.a.getClass();
                qu4.QnHx.b.getClass();
                String string = context3.getResources().getString(R.string.generic_dismiss_button);
                g30Var2.e(1157296644);
                h81<sd5> h81Var = this.y;
                boolean zI = g30Var2.I(h81Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new fw(h81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                ti.b((h81) objF, string, false, pg2VarA, g30Var2, 0, 4);
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }

    public static final void a(String str, h81<sd5> h81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(485493678);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(h81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j90.a(h81Var, X.m(j30VarQ, -396655679, new QnHx(i2, str, h81Var)), j30VarQ, ((i2 >> 3) & 14) | 48);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i, str, h81Var);
    }
}
