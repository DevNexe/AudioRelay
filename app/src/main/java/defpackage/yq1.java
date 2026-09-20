package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface yq1<T> {

    public static final class QnHx<T> {
        public final int a;
        public final int b;
        public final T c;

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(int i, int i2, j02 j02Var) {
            this.a = i;
            this.b = i2;
            this.c = j02Var;
            if (!(i >= 0)) {
                throw new IllegalArgumentException(GM.a("startIndex should be >= 0, but was ", i).toString());
            }
            if (!(i2 > 0)) {
                throw new IllegalArgumentException(GM.a("size should be >0, but was ", i2).toString());
            }
        }
    }

    int a();

    QnHx<T> get(int i);
}
