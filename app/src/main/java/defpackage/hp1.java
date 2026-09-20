package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hp1 implements Callable<Void>, vl0 {
    public static final FutureTask<Void> B = new FutureTask<>(m91.b, null);
    public Thread A;
    public final Runnable w;
    public final ExecutorService z;
    public final AtomicReference<Future<?>> y = new AtomicReference<>();
    public final AtomicReference<Future<?>> x = new AtomicReference<>();

    public hp1(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.w = runnable;
        this.z = scheduledExecutorService;
    }

    @Override // defpackage.vl0
    public final void a() {
        AtomicReference<Future<?>> atomicReference = this.y;
        FutureTask<Void> futureTask = B;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.A != Thread.currentThread());
        }
        Future<?> andSet2 = this.x.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.A != Thread.currentThread());
    }

    public final void b(Future<?> future) {
        boolean z;
        do {
            AtomicReference<Future<?>> atomicReference = this.y;
            Future<?> future2 = atomicReference.get();
            z = false;
            if (future2 == B) {
                future.cancel(this.A != Thread.currentThread());
                return;
            }
            do {
                if (atomicReference.compareAndSet(future2, future)) {
                    z = true;
                    break;
                }
            } while (atomicReference.get() == future2);
        } while (!z);
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        boolean z;
        this.A = Thread.currentThread();
        try {
            this.w.run();
            Future<?> futureSubmit = this.z.submit(this);
            do {
                AtomicReference<Future<?>> atomicReference = this.x;
                Future<?> future = atomicReference.get();
                z = false;
                if (future == B) {
                    futureSubmit.cancel(this.A != Thread.currentThread());
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(future, futureSubmit)) {
                        z = true;
                        break;
                    }
                } while (atomicReference.get() == future);
            } while (!z);
            this.A = null;
        } catch (Throwable th) {
            this.A = null;
            m14.b(th);
        }
        return null;
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return this.y.get() == B;
    }
}
