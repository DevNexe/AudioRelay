package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q70 {

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
            num.intValue();
            int i = this.x | 1;
            q70.a(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1986466014);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(x81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            q40.a(new ng3[]{p70.a.b(Float.valueOf(AY.C(j30VarQ, 8)))}, x81Var, j30VarQ, ((i2 << 3) & 112) | 8);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(i, x81Var);
    }
}
