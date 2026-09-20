package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class vl4 extends vk4<Long> {
    public final long w = 1;
    public final TimeUnit x;
    public final c54 y;

    public static final class QnHx extends AtomicReference<vl0> implements vl0, Runnable {
        public final ml4<? super Long> w;

        public QnHx(ml4<? super Long> ml4Var) {
            this.w = ml4Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.w.onSuccess(0L);
        }
    }

    public vl4(TimeUnit timeUnit, c54 c54Var) {
        this.x = timeUnit;
        this.y = c54Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super Long> ml4Var) {
        QnHx qnHx = new QnHx(ml4Var);
        ml4Var.c(qnHx);
        bm0.g(qnHx, this.y.c(qnHx, this.w, this.x));
    }
}
