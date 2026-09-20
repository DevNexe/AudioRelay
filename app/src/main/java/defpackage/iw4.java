package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iw4<T> implements nx, mw4 {
    public final gw4<? super T> w;
    public vl0 x;

    public iw4(gw4<? super T> gw4Var) {
        this.w = gw4Var;
    }

    @Override // defpackage.mw4
    public final void a(long j) {
    }

    @Override // defpackage.nx
    public final void b() {
        this.w.b();
    }

    @Override // defpackage.nx
    public final void c(vl0 vl0Var) {
        if (bm0.p(this.x, vl0Var)) {
            this.x = vl0Var;
            this.w.d(this);
        }
    }

    @Override // defpackage.mw4
    public final void cancel() {
        this.x.a();
    }

    @Override // defpackage.nx
    public final void onError(Throwable th) {
        this.w.onError(th);
    }
}
