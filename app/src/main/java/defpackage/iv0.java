package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class iv0 implements ThreadFactory {
    public final /* synthetic */ String w;
    public final /* synthetic */ AtomicLong x;

    public class QnHx extends n5 {
        public final /* synthetic */ Runnable w;

        public QnHx(Runnable runnable) {
            this.w = runnable;
        }

        @Override // defpackage.n5
        public final void a() {
            this.w.run();
        }
    }

    public iv0(String str, AtomicLong atomicLong) {
        this.w = str;
        this.x = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new QnHx(runnable));
        threadNewThread.setName(this.w + this.x.getAndIncrement());
        return threadNewThread;
    }
}
