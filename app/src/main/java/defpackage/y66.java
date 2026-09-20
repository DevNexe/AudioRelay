package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y66 implements Runnable {
    public final /* synthetic */ long w;
    public final /* synthetic */ id6 x;

    public y66(id6 id6Var, long j) {
        this.x = id6Var;
        this.w = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.k(this.w);
    }
}
