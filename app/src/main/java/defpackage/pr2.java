package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pr2<T> extends Z<T, T> {
    public final pa3<? super T> x;

    public static final class QnHx<T> extends b9<T, T> {
        public final pa3<? super T> B;

        public QnHx(ht2<? super T> ht2Var, pa3<? super T> pa3Var) {
            super(ht2Var);
            this.B = pa3Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.ht2
        public final void g(T t) {
            int i = this.A;
            ht2<? super R> ht2Var = this.w;
            if (i != 0) {
                ht2Var.g(null);
                return;
            }
            try {
                if (this.B.test(t)) {
                    ht2Var.g((Object) t);
                }
            } catch (Throwable th) {
                XTd3.w(th);
                this.x.a();
                onError(th);
            }
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            return d(i);
        }

        @Override // defpackage.uk4
        public final T poll() {
            T tPoll;
            do {
                tPoll = this.y.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.B.test(tPoll));
            return tPoll;
        }
    }

    public pr2(us2<T> us2Var, pa3<? super T> pa3Var) {
        super(us2Var);
        this.x = pa3Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x));
    }
}
