package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class EQ implements Runnable {
    public final /* synthetic */ FJCM.F1 w;

    public EQ(FJCM.F1 f1) {
        this.w = f1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.a();
    }
}
