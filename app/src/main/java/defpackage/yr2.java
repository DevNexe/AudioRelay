package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yr2<T> extends Z<T, T> {

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public final ht2<? super T> w;
        public vl0 x;

        public QnHx(ht2<? super T> ht2Var) {
            this.w = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.x.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            this.x = vl0Var;
            this.w.c(this);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.w.onError(th);
        }
    }

    public yr2(us2<T> us2Var) {
        super(us2Var);
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var));
    }
}
