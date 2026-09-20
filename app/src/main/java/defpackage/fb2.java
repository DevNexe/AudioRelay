package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fb2<T> extends xa2<T> {
    public final rl4<T> w;

    public static final class QnHx<T> implements ml4<T>, vl0 {
        public final gb2<? super T> w;
        public vl0 x;

        public QnHx(gb2<? super T> gb2Var) {
            this.w = gb2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.x.a();
            this.x = bm0.DISPOSED;
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.x, vl0Var)) {
                this.x = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x.e();
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            this.x = bm0.DISPOSED;
            this.w.onError(th);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            this.x = bm0.DISPOSED;
            this.w.onSuccess(t);
        }
    }

    public fb2(fl4 fl4Var) {
        this.w = fl4Var;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        this.w.b(new QnHx(gb2Var));
    }
}
