package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq4 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i, int i2) {
            super(2);
            this.w = i;
            this.x = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            pq4.b(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ float w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(float f, int i) {
            super(2);
            this.w = f;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            pq4.c(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ wu3 w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(wu3 wu3Var, int i) {
            super(2);
            this.w = wu3Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            pq4.e(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ wv w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(wv wvVar, int i) {
            super(2);
            this.w = wvVar;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            pq4.d(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ float w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(float f, int i) {
            super(2);
            this.w = f;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            pq4.a(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(float f, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(971384052);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.g(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            wo1.QnHx qnHx = wo1.a;
            hH.i(new lm4(f, 0.0f, f, 0.0f, 10), j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(f, i);
    }

    public static final void b(int i, g30 g30Var, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(1970533013);
        if ((i2 & 14) == 0) {
            i3 = (j30VarQ.i(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            c(i, j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i, i2);
    }

    public static final void c(float f, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-638612638);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.g(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            wo1.QnHx qnHx = wo1.a;
            hH.i(new lm4(0.0f, f, 0.0f, f, 5), j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(f, i);
    }

    public static final void d(wv wvVar, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1142141308);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(wvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            hH.i(wvVar.b(true), j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(wvVar, i);
    }

    public static final void e(wu3 wu3Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-899130212);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(wu3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            hH.i(wu3Var.a(pg2.QnHx.w, 1.0f, true), j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(wu3Var, i);
    }
}
