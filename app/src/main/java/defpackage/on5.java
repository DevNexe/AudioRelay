package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class on5 implements c15 {
    public final va4 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final QnHx c = new QnHx();

    public class QnHx implements Executor {
        public QnHx() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            on5.this.b.post(runnable);
        }
    }

    public on5(ExecutorService executorService) {
        this.a = new va4(executorService);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
