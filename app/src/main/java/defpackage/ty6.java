package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ty6 implements Runnable {
    public final /* synthetic */ dz6 A;
    public final /* synthetic */ qy6 w;
    public final /* synthetic */ qy6 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    public ty6(dz6 dz6Var, qy6 qy6Var, qy6 qy6Var2, long j, boolean z) {
        this.A = dz6Var;
        this.w = qy6Var;
        this.x = qy6Var2;
        this.y = j;
        this.z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.i(this.w, this.x, this.y, this.z, null);
    }
}
