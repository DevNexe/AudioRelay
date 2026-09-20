package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w74 {
    public static final Bd_ a = new Bd_(Float.NaN, Float.NaN);
    public static final qb5 b;
    public static final long c;
    public static final hr4<kt2> d;

    public static final class CQf extends cx1 implements j81<Bd_, kt2> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final kt2 invoke(Bd_ bd_) {
            Bd_ bd_2 = bd_;
            return new kt2(X.a(bd_2.a, bd_2.b));
        }
    }

    public static final class QnHx extends cx1 implements j81<kt2, Bd_> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final Bd_ invoke(kt2 kt2Var) {
            long j = kt2Var.a;
            return X.w(j) ? new Bd_(kt2.c(j), kt2.d(j)) : w74.a;
        }
    }

    static {
        qb5 qb5Var = mg5.a;
        b = new qb5(QnHx.w, CQf.w);
        long jA = X.a(0.01f, 0.01f);
        c = jA;
        d = new hr4<>(new kt2(jA), 3);
    }
}
