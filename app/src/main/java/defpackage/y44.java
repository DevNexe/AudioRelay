package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y44 extends y implements Runnable {
    public y44(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x = Thread.currentThread();
        try {
            this.w.run();
            this.x = null;
        } catch (Throwable th) {
            this.x = null;
            lazySet(y.y);
            m14.b(th);
        }
    }
}
