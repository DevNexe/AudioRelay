package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w94 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = i;
            this.y = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            int i2 = this.y;
            w94.a(this.w, g30Var, i, i2);
            return sd5.a;
        }
    }

    public static final void a(pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(2053321487);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            fe.a(ps0.k(gm4.g(gm4.f(pg2Var), 1), yu.b(((rv) j30VarQ.E(sv.a)).c(), 0.1f), el3.a), j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(pg2Var, i, i2);
    }
}
