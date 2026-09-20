package defpackage;

import com.google.android.gms.internal.ads.zzfxi;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class s86 extends zzfxi {
    public final /* synthetic */ int w = 0;
    public final Executor x;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.w) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.x).awaitTermination(j, timeUnit);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.w;
        Executor executor = this.x;
        switch (i) {
            case 0:
                executor.execute(runnable);
                break;
            default:
                ((ExecutorService) executor).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.w) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.x).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.w) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.x).isTerminated();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.w) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.x).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.w) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.x).shutdownNow();
        }
    }

    public final String toString() {
        switch (this.w) {
            case 1:
                return super.toString() + "[" + ((ExecutorService) this.x) + "]";
            default:
                return super.toString();
        }
    }

    public s86(ExecutorService executorService) {
        executorService.getClass();
        this.x = executorService;
    }
}
