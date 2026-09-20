package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class et2 extends vq2<Long> {
    public final c54 w;
    public final long x;
    public final TimeUnit y;

    public static final class QnHx extends AtomicReference<vl0> implements vl0, Runnable {
        public final ht2<? super Long> w;

        public QnHx(ht2<? super Long> ht2Var) {
            this.w = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get() == bm0.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (e()) {
                return;
            }
            ht2<? super Long> ht2Var = this.w;
            ht2Var.g(0L);
            lazySet(yr0.INSTANCE);
            ht2Var.b();
        }
    }

    public et2(long j, TimeUnit timeUnit, c54 c54Var) {
        this.x = j;
        this.y = timeUnit;
        this.w = c54Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super Long> ht2Var) {
        QnHx qnHx = new QnHx(ht2Var);
        ht2Var.c(qnHx);
        bm0.o(qnHx, this.w.c(qnHx, this.x, this.y));
    }
}
