package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f11<T> extends a11<T> {
    public final vq2<T> x;

    public static final class QnHx<T> implements ht2<T>, mw4 {
        public final gw4<? super T> w;
        public vl0 x;

        public QnHx(gw4<? super T> gw4Var) {
            this.w = gw4Var;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            this.x = vl0Var;
            this.w.d(this);
        }

        @Override // defpackage.mw4
        public final void cancel() {
            this.x.a();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            this.w.g(t);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.w.onError(th);
        }
    }

    public f11(vq2<T> vq2Var) {
        this.x = vq2Var;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.a(new QnHx(gw4Var));
    }
}
