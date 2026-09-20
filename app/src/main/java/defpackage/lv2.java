package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lv2 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(h81<sd5> h81Var, int i) {
            super(2);
            this.w = h81Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            lv2.a(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(h81<sd5> h81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(158817599);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            vQgK.a(h81Var, null, c10.d, j30VarQ, (i2 & 14) | 384, 2);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(h81Var, i);
    }
}
