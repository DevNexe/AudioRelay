package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class l50 implements ThreadFactory {
    public final AtomicInteger w = new AtomicInteger(0);
    public final /* synthetic */ boolean x;

    public l50(boolean z) {
        this.x = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbG = Md5A.g(this.x ? "WM.task-" : "androidx.work-");
        sbG.append(this.w.incrementAndGet());
        return new Thread(runnable, sbG.toString());
    }
}
