package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class y11 extends a11<Long> {
    public final c54 x;
    public final long y;
    public final TimeUnit z;

    public static final class QnHx extends AtomicReference<vl0> implements mw4, Runnable {
        public final gw4<? super Long> w;
        public volatile boolean x;

        public QnHx(gw4<? super Long> gw4Var) {
            this.w = gw4Var;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (qw4.l(j)) {
                this.x = true;
            }
        }

        @Override // defpackage.mw4
        public final void cancel() {
            bm0.c(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != bm0.DISPOSED) {
                boolean z = this.x;
                yr0 yr0Var = yr0.INSTANCE;
                if (!z) {
                    lazySet(yr0Var);
                    this.w.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.w.g(0L);
                    lazySet(yr0Var);
                    this.w.b();
                }
            }
        }
    }

    public y11(long j, TimeUnit timeUnit, c54 c54Var) {
        this.y = j;
        this.z = timeUnit;
        this.x = c54Var;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super Long> gw4Var) {
        QnHx qnHx = new QnHx(gw4Var);
        gw4Var.d(qnHx);
        bm0.o(qnHx, this.x.c(qnHx, this.y, this.z));
    }
}
