package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class j90 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(h81<sd5> h81Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = h81Var;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            j90.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, x81 x81Var) {
            super(2);
            this.w = x81Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                float f = RCHTTPStatusCodes.UNSUCCESSFUL;
                wo1.QnHx qnHx = wo1.a;
                ix4.a(ps0.T(new lm4(0.0f, f, 0.0f, f, 5), 16), null, 0L, 0L, null, 0.0f, X.m(g30Var2, 1997738195, new i90(this.x, this.w)), g30Var2, 1572870, 62);
            }
            return sd5.a;
        }
    }

    public static final void a(h81<sd5> h81Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(801124998);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            vQgK.a(h81Var, null, X.m(j30VarQ, 165773455, new QnHx(i2, x81Var)), j30VarQ, (i2 & 14) | 384, 2);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(h81Var, x81Var, i);
    }
}
