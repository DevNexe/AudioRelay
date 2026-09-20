package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class f24 implements Executor {
    public final Executor w;

    public static class QnHx implements Runnable {
        public final Runnable w;

        public QnHx(Runnable runnable) {
            this.w = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.w.run();
            } catch (Exception e) {
                y52.b("Executor", "Background execution failure.", e);
            }
        }
    }

    public f24(ExecutorService executorService) {
        this.w = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.w.execute(new QnHx(runnable));
    }
}
