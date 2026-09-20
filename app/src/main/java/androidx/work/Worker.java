package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import defpackage.j42;
import defpackage.pg4;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public pg4<ListenableWorker.QnHx> B;

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.B.i(worker.doWork());
            } catch (Throwable th) {
                worker.B.j(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.QnHx doWork();

    @Override // androidx.work.ListenableWorker
    public final j42<ListenableWorker.QnHx> startWork() {
        this.B = new pg4<>();
        getBackgroundExecutor().execute(new QnHx());
        return this.B;
    }
}
