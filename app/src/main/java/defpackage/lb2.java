package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class lb2 extends xa2<Long> {
    public final long w;
    public final TimeUnit x;
    public final c54 y;

    public static final class QnHx extends AtomicReference<vl0> implements vl0, Runnable {
        public final gb2<? super Long> w;

        public QnHx(gb2<? super Long> gb2Var) {
            this.w = gb2Var;
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

    public lb2(long j, TimeUnit timeUnit, c54 c54Var) {
        this.w = j;
        this.x = timeUnit;
        this.y = c54Var;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super Long> gb2Var) {
        QnHx qnHx = new QnHx(gb2Var);
        gb2Var.c(qnHx);
        bm0.g(qnHx, this.y.c(qnHx, this.w, this.x));
    }
}
