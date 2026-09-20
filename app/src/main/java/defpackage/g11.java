package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class g11 extends a11<Long> {
    public final TimeUnit A;
    public final c54 x;
    public final long y;
    public final long z;

    public static final class QnHx extends AtomicLong implements mw4, Runnable {
        public final gw4<? super Long> w;
        public long x;
        public final AtomicReference<vl0> y = new AtomicReference<>();

        public QnHx(gw4<? super Long> gw4Var) {
            this.w = gw4Var;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (qw4.l(j)) {
                ps0.h(this, j);
            }
        }

        @Override // defpackage.mw4
        public final void cancel() {
            bm0.c(this.y);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference<vl0> atomicReference = this.y;
            if (atomicReference.get() != bm0.DISPOSED) {
                long j = get();
                gw4<? super Long> gw4Var = this.w;
                if (j == 0) {
                    gw4Var.onError(new MissingBackpressureException(hc2.a(new StringBuilder("Can't deliver value "), this.x, " due to lack of requests")));
                    bm0.c(atomicReference);
                } else {
                    long j2 = this.x;
                    this.x = j2 + 1;
                    gw4Var.g(Long.valueOf(j2));
                    ps0.c0(this, 1L);
                }
            }
        }
    }

    public g11(long j, long j2, TimeUnit timeUnit, c54 c54Var) {
        this.y = j;
        this.z = j2;
        this.A = timeUnit;
        this.x = c54Var;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super Long> gw4Var) {
        QnHx qnHx = new QnHx(gw4Var);
        gw4Var.d(qnHx);
        c54 c54Var = this.x;
        boolean z = c54Var instanceof k95;
        AtomicReference<vl0> atomicReference = qnHx.y;
        if (!z) {
            bm0.n(atomicReference, c54Var.d(qnHx, this.y, this.z, this.A));
            return;
        }
        c54.F1 f1A = c54Var.a();
        bm0.n(atomicReference, f1A);
        f1A.f(qnHx, this.y, this.z, this.A);
    }
}
