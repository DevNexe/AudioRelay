package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xj4 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(pg2 pg2Var, int i, int i2) {
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
            xj4.a(this.w, g30Var, i, i2);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<pg2, g30, Integer, pg2> {
        public final /* synthetic */ boolean w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(boolean z) {
            super(3);
            this.w = z;
        }

        @Override // defpackage.y81
        public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(1193178513);
            e40.CQf cQf = e40.a;
            pg2 pg2VarD = hn.d(pg2Var, this.w, ac.k(g30Var2));
            g30Var2.G();
            return pg2VarD;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ float x;
        public final /* synthetic */ float y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pg2 pg2Var, float f, float f2, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = f;
            this.y = f2;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            xj4.b(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final void a(pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(-2102422293);
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
            fe.a(hn.d(pg2Var, true, ac.k(j30VarQ)), j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var, i, i2);
    }

    public static final void b(pg2 pg2Var, float f, float f2, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(1291582635);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.g(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= j30VarQ.g(f2) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            a(gm4.i(pg2Var, f2, f), j30VarQ, 0, 0);
        }
        pg2 pg2Var2 = pg2Var;
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(pg2Var2, f, f2, i, i2);
    }

    public static final pg2 c(pg2 pg2Var, boolean z) {
        return f30.a(pg2Var, wo1.a, new F1(z));
    }
}
