package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class as2 extends vq2<Long> {
    public final c54 w;
    public final long x;
    public final long y;
    public final TimeUnit z;

    public static final class QnHx extends AtomicReference<vl0> implements vl0, Runnable {
        public final ht2<? super Long> w;
        public long x;

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
            if (get() != bm0.DISPOSED) {
                long j = this.x;
                this.x = 1 + j;
                this.w.g(Long.valueOf(j));
            }
        }
    }

    public as2(long j, long j2, TimeUnit timeUnit, c54 c54Var) {
        this.x = j;
        this.y = j2;
        this.z = timeUnit;
        this.w = c54Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super Long> ht2Var) {
        QnHx qnHx = new QnHx(ht2Var);
        ht2Var.c(qnHx);
        c54 c54Var = this.w;
        if (!(c54Var instanceof k95)) {
            bm0.n(qnHx, c54Var.d(qnHx, this.x, this.y, this.z));
            return;
        }
        c54.F1 f1A = c54Var.a();
        bm0.n(qnHx, f1A);
        f1A.f(qnHx, this.x, this.y, this.z);
    }
}
