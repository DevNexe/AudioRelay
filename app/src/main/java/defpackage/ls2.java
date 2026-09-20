package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ls2<T> extends Z<T, T> {
    public final pa3<? super Throwable> x;
    public final long y;

    public static final class QnHx<T> extends AtomicInteger implements ht2<T> {
        public long A;
        public final ht2<? super T> w;
        public final av3 x;
        public final us2<? extends T> y;
        public final pa3<? super Throwable> z;

        public QnHx(ht2<? super T> ht2Var, long j, pa3<? super Throwable> pa3Var, av3 av3Var, us2<? extends T> us2Var) {
            this.w = ht2Var;
            this.x = av3Var;
            this.y = us2Var;
            this.z = pa3Var;
            this.A = j;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.x.e()) {
                    this.y.a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            av3 av3Var = this.x;
            av3Var.getClass();
            bm0.g(av3Var, vl0Var);
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            this.w.g(t);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            long j = this.A;
            if (j != Long.MAX_VALUE) {
                this.A = j - 1;
            }
            ht2<? super T> ht2Var = this.w;
            if (j == 0) {
                ht2Var.onError(th);
                return;
            }
            try {
                if (this.z.test(th)) {
                    a();
                } else {
                    ht2Var.onError(th);
                }
            } catch (Throwable th2) {
                XTd3.w(th2);
                ht2Var.onError(new CompositeException(th, th2));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls2(ys2 ys2Var) {
        super(ys2Var);
        m91.Xn1 xn1 = m91.f;
        this.x = xn1;
        this.y = Long.MAX_VALUE;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        av3 av3Var = new av3();
        ht2Var.c(av3Var);
        new QnHx(ht2Var, this.y, this.x, av3Var, this.w).a();
    }
}
