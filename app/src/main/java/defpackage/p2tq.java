package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p2tq {
    public static final float a;
    public static final float b;

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ long w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(long j, pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = j;
            this.x = pg2Var;
            this.y = x81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            p2tq.a(this.w, this.x, this.y, g30Var, this.z | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(pg2 pg2Var, int i) {
            super(2);
            this.w = pg2Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            p2tq.b(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(x81<? super g30, ? super Integer, sd5> x81Var, pg2 pg2Var, int i) {
            super(2);
            this.w = x81Var;
            this.x = pg2Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                int i = this.y;
                x81<g30, Integer, sd5> x81Var = this.w;
                if (x81Var == null) {
                    g30Var2.e(1275643833);
                    p2tq.b(this.x, g30Var2, (i >> 3) & 14);
                    g30Var2.G();
                } else {
                    g30Var2.e(1275643903);
                    x81Var.invoke(g30Var2, Integer.valueOf((i >> 6) & 14));
                    g30Var2.G();
                }
            }
            return sd5.a;
        }
    }

    static {
        float f = 25;
        a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(long j, pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-5185995);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.j(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(pg2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            ukJW.b(j, gb1.TopMiddle, X.m(j30VarQ, -1458480226, new QnHx(x81Var, pg2Var, i2)), j30VarQ, (i2 & 14) | 432);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(j, pg2Var, x81Var, i);
    }

    public static final void b(pg2 pg2Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(694251107);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            hH.i(f30.a(gm4.i(pg2Var, b, a), wo1.a, w8L.w), j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(pg2Var, i);
    }
}
