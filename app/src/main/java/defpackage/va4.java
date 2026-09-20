package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class va4 implements Executor {
    public final Executor x;
    public volatile Runnable z;
    public final ArrayDeque<QnHx> w = new ArrayDeque<>();
    public final Object y = new Object();

    public static class QnHx implements Runnable {
        public final va4 w;
        public final Runnable x;

        public QnHx(va4 va4Var, Runnable runnable) {
            this.w = va4Var;
            this.x = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            va4 va4Var = this.w;
            try {
                this.x.run();
            } finally {
                va4Var.a();
            }
        }
    }

    public va4(ExecutorService executorService) {
        this.x = executorService;
    }

    public final void a() {
        synchronized (this.y) {
            QnHx qnHxPoll = this.w.poll();
            this.z = qnHxPoll;
            if (qnHxPoll != null) {
                this.x.execute(this.z);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.y) {
            this.w.add(new QnHx(this, runnable));
            if (this.z == null) {
                a();
            }
        }
    }
}
