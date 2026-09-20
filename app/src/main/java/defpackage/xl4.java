package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xl4<T> extends vq2<T> {
    public final rl4<? extends T> w;

    public static final class QnHx<T> extends pi0<T> implements ml4<T> {
        public vl0 y;

        public QnHx(ht2<? super T> ht2Var) {
            super(ht2Var);
        }

        @Override // defpackage.pi0, defpackage.vl0
        public final void a() {
            super.a();
            this.y.a();
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            if ((get() & 54) != 0) {
                m14.b(th);
            } else {
                lazySet(2);
                this.w.onError(th);
            }
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            d(t);
        }
    }

    public xl4(rl4<? extends T> rl4Var) {
        this.w = rl4Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.b(new QnHx(ht2Var));
    }
}
