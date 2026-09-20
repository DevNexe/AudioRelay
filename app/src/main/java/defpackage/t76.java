package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class t76 implements Executor {
    public final ThreadPoolExecutor x;
    public final AtomicInteger w = new AtomicInteger(1);
    public WeakReference<Thread> y = new WeakReference<>(null);

    public t76() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: q76
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                t76 t76Var = this.w;
                t76Var.getClass();
                int andIncrement = t76Var.w.getAndIncrement();
                StringBuilder sb = new StringBuilder(34);
                sb.append("Google consent worker #");
                sb.append(andIncrement);
                Thread thread = new Thread(runnable, sb.toString());
                t76Var.y = new WeakReference<>(thread);
                return thread;
            }
        });
        this.x = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.y.get()) {
            runnable.run();
        } else {
            this.x.execute(runnable);
        }
    }
}
