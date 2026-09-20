package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class wx extends qw {
    public final long w;
    public final TimeUnit x;
    public final c54 y;

    public static final class QnHx extends AtomicReference<vl0> implements vl0, Runnable {
        public final nx w;

        public QnHx(nx nxVar) {
            this.w = nxVar;
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
            this.w.b();
        }
    }

    public wx(long j, TimeUnit timeUnit, c54 c54Var) {
        this.w = j;
        this.x = timeUnit;
        this.y = c54Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        QnHx qnHx = new QnHx(nxVar);
        nxVar.c(qnHx);
        bm0.g(qnHx, this.y.c(qnHx, this.w, this.x));
    }
}
