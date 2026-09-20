package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r04 implements nx {
    public final /* synthetic */ wm<sd5> w;

    public r04(xm xmVar) {
        this.w = xmVar;
    }

    @Override // defpackage.nx
    public final void b() {
        this.w.x(sd5.a);
    }

    @Override // defpackage.nx
    public final void c(vl0 vl0Var) {
        this.w.B(new u04(vl0Var));
    }

    @Override // defpackage.nx
    public final void onError(Throwable th) {
        this.w.x(new fq3.QnHx(th));
    }
}
