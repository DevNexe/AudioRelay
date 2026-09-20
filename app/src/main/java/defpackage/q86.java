package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class q86 implements ThreadFactory {
    public final AtomicInteger w = new AtomicInteger(1);
    public final /* synthetic */ String x;

    public q86(String str) {
        this.x = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.x + ") #" + this.w.getAndIncrement());
    }
}
