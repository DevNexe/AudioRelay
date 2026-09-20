package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h11<T> extends a11<T> implements s34<T> {
    public final T x;

    /* JADX WARN: Multi-variable type inference failed */
    public h11(Long l) {
        this.x = l;
    }

    @Override // defpackage.s34, java.util.concurrent.Callable
    public final T call() {
        return this.x;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        gw4Var.d(new t34(this.x, gw4Var));
    }
}
