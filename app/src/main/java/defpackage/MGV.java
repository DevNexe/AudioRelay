package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class MGV implements Runnable {
    public final /* synthetic */ HR47.QnHx w;
    public final /* synthetic */ Object x;

    public MGV(HR47.QnHx qnHx, Object obj) {
        this.w = qnHx;
        this.x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.w = this.x;
    }
}
