package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vh5 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ m64 x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pg2 pg2Var, m64 m64Var, int i) {
            super(2);
            this.w = pg2Var;
            this.x = m64Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            vh5.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(pg2 pg2Var, m64 m64Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(167891722);
        if ((i & 1) == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(pg2Var, m64Var, i);
    }
}
