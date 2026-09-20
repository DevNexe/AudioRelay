package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nb2<T> extends vq2<T> {
    public final jb2<T> w;

    public static final class QnHx<T> extends pi0<T> implements gb2<T> {
        public vl0 y;

        public QnHx(ht2<? super T> ht2Var) {
            super(ht2Var);
        }

        @Override // defpackage.pi0, defpackage.vl0
        public final void a() {
            super.a();
            this.y.a();
        }

        @Override // defpackage.gb2
        public final void b() {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.w.b();
        }

        @Override // defpackage.gb2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.gb2
        public final void onError(Throwable th) {
            if ((get() & 54) != 0) {
                m14.b(th);
            } else {
                lazySet(2);
                this.w.onError(th);
            }
        }

        @Override // defpackage.gb2
        public final void onSuccess(T t) {
            d(t);
        }
    }

    public nb2(ib2 ib2Var) {
        this.w = ib2Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var));
    }
}
