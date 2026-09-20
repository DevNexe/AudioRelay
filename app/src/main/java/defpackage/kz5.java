package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class kz5 implements ThreadFactory {
    public final ThreadFactory w = Executors.defaultThreadFactory();
    public final AtomicInteger x = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.w.newThread(runnable);
        threadNewThread.setName("gads-" + this.x.getAndIncrement());
        return threadNewThread;
    }
}
