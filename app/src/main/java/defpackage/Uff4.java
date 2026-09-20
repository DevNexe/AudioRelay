package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Uff4 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, pg2 pg2Var, int i2, int i3) {
            super(2);
            this.w = i;
            this.x = pg2Var;
            this.y = i2;
            this.z = i3;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            Uff4.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final void a(int i, pg2 pg2Var, g30 g30Var, int i2, int i3) {
        int i4;
        j30 j30VarQ = g30Var.q(-1516462530);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (j30VarQ.i(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= j30VarQ.I(pg2Var) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i5 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            u15.a(hH.x(i, j30VarQ), 0, pg2Var, j30VarQ, ((i4 << 3) & 896) | 48, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(i, pg2Var, i2, i3);
    }
}
