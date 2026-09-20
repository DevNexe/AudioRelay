package defpackage;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class fo5 implements Runnable {
    public final /* synthetic */ pg4 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ go5 y;

    public fo5(go5 go5Var, pg4 pg4Var, String str) {
        this.y = go5Var;
        this.w = pg4Var;
        this.x = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.x;
        go5 go5Var = this.y;
        try {
            try {
                ListenableWorker.QnHx qnHx = (ListenableWorker.QnHx) this.w.get();
                if (qnHx == null) {
                    s52.c().b(go5.P, String.format("%s returned a null result. Treating it as a failure.", go5Var.A.c), new Throwable[0]);
                } else {
                    s52.c().a(go5.P, String.format("%s returned a %s result.", go5Var.A.c, qnHx), new Throwable[0]);
                    go5Var.D = qnHx;
                }
            } catch (InterruptedException e) {
                e = e;
                s52.c().b(go5.P, String.format("%s failed because it threw an exception/error", str), e);
            } catch (CancellationException e2) {
                s52.c().d(go5.P, String.format("%s was cancelled", str), e2);
            } catch (ExecutionException e3) {
                e = e3;
                s52.c().b(go5.P, String.format("%s failed because it threw an exception/error", str), e);
            }
            go5Var.c();
        } catch (Throwable th) {
            go5Var.c();
            throw th;
        }
    }
}
