package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class hp3 implements ThreadFactory {
    public final String w = "fonts-androidx";
    public final int x = 10;

    public static class QnHx extends Thread {
        public final int w;

        public QnHx(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.w = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.w);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new QnHx(runnable, this.w, this.x);
    }
}
