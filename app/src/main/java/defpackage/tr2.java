package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tr2<T> extends vq2<T> {
    public final T[] w;

    public static final class QnHx<T> extends g9<T> {
        public volatile boolean A;
        public final ht2<? super T> w;
        public final T[] x;
        public int y;
        public boolean z;

        public QnHx(ht2<? super T> ht2Var, T[] tArr) {
            this.w = ht2Var;
            this.x = tArr;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.A = true;
        }

        @Override // defpackage.uk4
        public final void clear() {
            this.y = this.x.length;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.A;
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return this.y == this.x.length;
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.z = true;
            return 1;
        }

        @Override // defpackage.uk4
        public final T poll() {
            int i = this.y;
            T[] tArr = this.x;
            if (i == tArr.length) {
                return null;
            }
            this.y = i + 1;
            T t = tArr[i];
            mq2.b(t, "The array element is null");
            return t;
        }
    }

    public tr2(T[] tArr) {
        this.w = tArr;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        T[] tArr = this.w;
        QnHx qnHx = new QnHx(ht2Var, tArr);
        ht2Var.c(qnHx);
        if (qnHx.z) {
            return;
        }
        int length = tArr.length;
        for (int i = 0; i < length && !qnHx.A; i++) {
            T t = tArr[i];
            if (t == null) {
                qnHx.w.onError(new NullPointerException(ex0.b("The element at index ", i, " is null")));
                return;
            }
            qnHx.w.g(t);
        }
        if (qnHx.A) {
            return;
        }
        qnHx.w.b();
    }
}
