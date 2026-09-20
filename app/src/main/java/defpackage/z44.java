package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public final class z44 extends y implements Callable<Void> {
    public z44(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask<Void> futureTask = y.y;
        this.x = Thread.currentThread();
        try {
            this.w.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.x = null;
        }
    }
}
