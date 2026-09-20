package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mb2<T> extends a11<T> {
    public final jb2<T> x;

    public static final class QnHx<T> extends qi0<T> implements gb2<T> {
        public vl0 y;

        public QnHx(gw4<? super T> gw4Var) {
            super(gw4Var);
        }

        @Override // defpackage.gb2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.gb2
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

        @Override // defpackage.gb2
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.gb2
        public final void onSuccess(T t) {
            e(t);
        }
    }

    public mb2(ib2 ib2Var) {
        this.x = ib2Var;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.a(new QnHx(gw4Var));
    }
}
