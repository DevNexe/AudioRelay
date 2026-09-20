package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class vs2<T> extends Z<T, T> {
    public final c54 x;

    public final class CQf implements Runnable {
        public final QnHx<T> w;

        public CQf(QnHx<T> qnHx) {
            this.w = qnHx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            vs2.this.w.a(this.w);
        }
    }

    public static final class QnHx<T> extends AtomicReference<vl0> implements ht2<T>, vl0 {
        public final ht2<? super T> w;
        public final AtomicReference<vl0> x = new AtomicReference<>();

        public QnHx(ht2<? super T> ht2Var) {
            this.w = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this.x);
            bm0.c(this);
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            bm0.n(this.x, vl0Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
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

    public vs2(us2<T> us2Var, c54 c54Var) {
        super(us2Var);
        this.x = c54Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        QnHx qnHx = new QnHx(ht2Var);
        ht2Var.c(qnHx);
        bm0.n(qnHx, this.x.b(new CQf(qnHx)));
    }
}
