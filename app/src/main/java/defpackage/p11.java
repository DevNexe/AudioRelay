package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p11<T, U> extends nw4 implements v11<T> {
    public final gw4<? super T> E;
    public final n11<U> F;
    public final mw4 G;
    public long H;

    public p11(hb4 hb4Var, n11 n11Var, o11 o11Var) {
        this.E = hb4Var;
        this.F = n11Var;
        this.G = o11Var;
    }

    @Override // defpackage.nw4, defpackage.mw4
    public final void cancel() {
        super.cancel();
        this.G.cancel();
    }

    @Override // defpackage.v11, defpackage.gw4
    public final void d(mw4 mw4Var) {
        h(mw4Var);
    }

    @Override // defpackage.gw4
    public final void g(T t) {
        this.H++;
        this.E.g(t);
    }
}
