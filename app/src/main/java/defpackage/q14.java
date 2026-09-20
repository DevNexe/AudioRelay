package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class q14 extends AtomicLong implements ThreadFactory {
    public final String w;
    public final int x;
    public final boolean y;

    public static final class QnHx extends Thread {
        public QnHx(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public q14(String str) {
        this(false, str, 5);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.w + '-' + incrementAndGet();
        Thread qnHx = this.y ? new QnHx(runnable, str) : new Thread(runnable, str);
        qnHx.setPriority(this.x);
        qnHx.setDaemon(true);
        return qnHx;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return i5.b(new StringBuilder("RxThreadFactory["), this.w, "]");
    }

    public q14(boolean z, String str, int i) {
        this.w = str;
        this.x = i;
        this.y = z;
    }
}
