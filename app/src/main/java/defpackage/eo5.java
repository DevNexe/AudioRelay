package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eo5 implements Runnable {
    public final /* synthetic */ j42 w;
    public final /* synthetic */ pg4 x;
    public final /* synthetic */ go5 y;

    public eo5(go5 go5Var, pg4 pg4Var, pg4 pg4Var2) {
        this.y = go5Var;
        this.w = pg4Var;
        this.x = pg4Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg4 pg4Var = this.x;
        go5 go5Var = this.y;
        try {
            ((Xn1) this.w).get();
            s52.c().a(go5.P, String.format("Starting work for %s", go5Var.A.c), new Throwable[0]);
            go5Var.N = go5Var.B.startWork();
            pg4Var.k(go5Var.N);
        } catch (Throwable th) {
            pg4Var.j(th);
        }
    }
}
