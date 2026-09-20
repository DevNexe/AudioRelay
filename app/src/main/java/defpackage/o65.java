package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o65 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(boolean z, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = z;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            o65.a(this.w, this.x, g30Var, i);
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
                jt4 jt4Var = sv.a;
                ix4.a(null, null, ((rv) g30Var2.E(jt4Var)).a(), sv.b(((rv) g30Var2.E(jt4Var)).a(), g30Var2), null, 0.0f, X.m(g30Var2, -894572672, new n65(this.x, this.w)), g30Var2, 1572864, 51);
            }
            return sd5.a;
        }
    }

    public static final void a(boolean z, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-740858138);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
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
            na2.a(z, X.m(j30VarQ, 1414154044, new QnHx(i2, x81Var)), j30VarQ, (i2 & 14) | 48);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(z, x81Var, i);
    }
}
