package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qp5 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ tp5 x;

    public qp5(tp5 tp5Var, int i) {
        this.x = tp5Var;
        this.w = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.f(this.w);
    }
}
