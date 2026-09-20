package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r17 implements Runnable {
    public final long w;
    public final long x;
    public final /* synthetic */ cq4 y;

    public r17(cq4 cq4Var, long j, long j2) {
        this.y = cq4Var;
        this.w = j;
        this.x = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ro6 ro6Var = ((w17) this.y.y).a.j;
        dq6.h(ro6Var);
        ro6Var.m(new o17(this, 8));
    }
}
