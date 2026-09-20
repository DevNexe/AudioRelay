package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rs2<T> extends Z<T, T> {
    public final long x;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public final ht2<? super T> w;
        public long x;
        public vl0 y;

        public QnHx(ht2<? super T> ht2Var, long j) {
            this.w = ht2Var;
            this.x = j;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            long j = this.x;
            if (j != 0) {
                this.x = j - 1;
            } else {
                this.w.g(t);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.w.onError(th);
        }
    }

    public rs2(us2 us2Var) {
        super(us2Var);
        this.x = 1L;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x));
    }
}
