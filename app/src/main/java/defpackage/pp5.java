package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pp5 implements l5.QnHx {
    public final /* synthetic */ pa1 a;

    public pp5(pa1 pa1Var) {
        this.a = pa1Var;
    }

    @Override // l5.QnHx
    public final void a(boolean z) {
        mr5 mr5Var = this.a.I;
        mr5Var.sendMessage(mr5Var.obtainMessage(1, Boolean.valueOf(z)));
    }
}
