package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s04 implements ml4<Object> {
    public final /* synthetic */ wm<Object> w;

    public s04(xm xmVar) {
        this.w = xmVar;
    }

    @Override // defpackage.ml4
    public final void c(vl0 vl0Var) {
        this.w.B(new u04(vl0Var));
    }

    @Override // defpackage.ml4
    public final void onError(Throwable th) {
        this.w.x(new fq3.QnHx(th));
    }

    @Override // defpackage.ml4
    public final void onSuccess(Object obj) {
        this.w.x(obj);
    }
}
