package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v80 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ b84 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i, b84 b84Var, x81 x81Var) {
            super(2);
            this.w = b84Var;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            v80.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ j45 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(j45 j45Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = j45Var;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            v80.b(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(b84 b84Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(605522716);
        if ((i & 112) == 0) {
            i2 = (j30VarQ.I(x81Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            x81Var.invoke(j30VarQ, Integer.valueOf((i2 >> 3) & 14));
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i, b84Var, x81Var);
    }

    public static final void b(j45 j45Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1985516685);
        if ((i & 112) == 0) {
            i2 = (j30VarQ.I(x81Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            x81Var.invoke(j30VarQ, Integer.valueOf((i2 >> 3) & 14));
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(j45Var, x81Var, i);
    }
}
