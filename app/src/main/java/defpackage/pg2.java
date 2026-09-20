package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface pg2 {
    public static final /* synthetic */ int k = 0;

    public interface CQf extends pg2 {
    }

    public static final class QnHx implements pg2 {
        public static final /* synthetic */ QnHx w = new QnHx();

        @Override // defpackage.pg2
        public final boolean B(f30.F1 f1) {
            return true;
        }

        @Override // defpackage.pg2
        public final <R> R m0(R r, x81<? super R, ? super CQf, ? extends R> x81Var) {
            return r;
        }

        public final String toString() {
            return "Modifier";
        }

        @Override // defpackage.pg2
        public final pg2 y(pg2 pg2Var) {
            return pg2Var;
        }

        @Override // defpackage.pg2
        public final <R> R z(R r, x81<? super CQf, ? super R, ? extends R> x81Var) {
            return r;
        }
    }

    boolean B(f30.F1 f1);

    <R> R m0(R r, x81<? super R, ? super CQf, ? extends R> x81Var);

    pg2 y(pg2 pg2Var);

    <R> R z(R r, x81<? super CQf, ? super R, ? extends R> x81Var);
}
