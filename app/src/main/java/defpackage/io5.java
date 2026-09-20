package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class io5 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ y81<x81<? super g30, ? super Integer, sd5>, g30, Integer, sd5> x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(boolean z, y81<? super x81<? super g30, ? super Integer, sd5>, ? super g30, ? super Integer, sd5> y81Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = z;
            this.x = y81Var;
            this.y = x81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            y81<x81<? super g30, ? super Integer, sd5>, g30, Integer, sd5> y81Var = this.x;
            x81<g30, Integer, sd5> x81Var = this.y;
            io5.a(this.w, y81Var, x81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(boolean z, y81<? super x81<? super g30, ? super Integer, sd5>, ? super g30, ? super Integer, sd5> y81Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(2070601908);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(y81Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            if (z) {
                j30VarQ.e(466802801);
                y81Var.invoke(x81Var, j30VarQ, Integer.valueOf((i2 & 112) | ((i2 >> 6) & 14)));
                j30VarQ.R(false);
            } else {
                j30VarQ.e(466802851);
                x81Var.invoke(j30VarQ, Integer.valueOf((i2 >> 6) & 14));
                j30VarQ.R(false);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(z, y81Var, x81Var, i);
    }
}
