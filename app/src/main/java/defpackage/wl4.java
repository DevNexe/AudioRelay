package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wl4<T> extends a11<T> {
    public final rl4<? extends T> x;

    public static final class QnHx<T> extends qi0<T> implements ml4<T> {
        public vl0 y;

        public QnHx(gw4<? super T> gw4Var) {
            super(gw4Var);
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                this.w.d(this);
            }
        }

        @Override // defpackage.mw4
        public final void cancel() {
            set(4);
            this.x = null;
            this.y.a();
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            e(t);
        }
    }

    public wl4(al4 al4Var) {
        this.x = al4Var;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.b(new QnHx(gw4Var));
    }
}
