package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y extends AtomicReference<Future<?>> implements vl0 {
    public static final FutureTask<Void> y;
    public static final FutureTask<Void> z;
    public final Runnable w;
    public Thread x;

    static {
        m91.EQ eq = m91.b;
        y = new FutureTask<>(eq, null);
        z = new FutureTask<>(eq, null);
    }

    public y(Runnable runnable) {
        this.w = runnable;
    }

    @Override // defpackage.vl0
    public final void a() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == y || future == (futureTask = z) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.x != Thread.currentThread());
    }

    public final void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == y) {
                return;
            }
            if (future2 == z) {
                future.cancel(this.x != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.vl0
    public final boolean e() {
        Future<?> future = get();
        return future == y || future == z;
    }
}
