package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ux6 implements Runnable {
    public final /* synthetic */ ww5 A;
    public final /* synthetic */ dy6 B;
    public final /* synthetic */ ww5 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    public ux6(dy6 dy6Var, ww5 ww5Var, int i, long j, boolean z, ww5 ww5Var2) {
        this.B = dy6Var;
        this.w = ww5Var;
        this.x = i;
        this.y = j;
        this.z = z;
        this.A = ww5Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy6 dy6Var = this.B;
        ww5 ww5Var = this.w;
        dy6Var.s(ww5Var);
        dy6.z(this.B, this.w, this.x, this.y, false, this.z);
        g87.a();
        if (dy6Var.a.g.n(null, lg6.q0)) {
            dy6.y(dy6Var, ww5Var, this.A);
        }
    }
}
