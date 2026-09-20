package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sx6 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ ww5 B;
    public final /* synthetic */ dy6 C;
    public final /* synthetic */ ww5 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ int y;
    public final /* synthetic */ long z;

    public sx6(dy6 dy6Var, ww5 ww5Var, long j, int i, long j2, boolean z, ww5 ww5Var2) {
        this.C = dy6Var;
        this.w = ww5Var;
        this.x = j;
        this.y = i;
        this.z = j2;
        this.A = z;
        this.B = ww5Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy6 dy6Var = this.C;
        ww5 ww5Var = this.w;
        dy6Var.s(ww5Var);
        dy6Var.o(this.x, false);
        dy6.z(this.C, this.w, this.y, this.z, true, this.A);
        g87.a();
        if (dy6Var.a.g.n(null, lg6.q0)) {
            dy6.y(dy6Var, ww5Var, this.B);
        }
    }
}
