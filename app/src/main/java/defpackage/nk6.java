package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class nk6 implements ThreadFactory {
    public final AtomicInteger w = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, GM.a("AdWorker(NG) #", this.w.getAndIncrement()));
    }
}
