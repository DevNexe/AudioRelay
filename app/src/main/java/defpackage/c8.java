package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c8 extends FJCM implements pa0 {
    public final /* synthetic */ v7 x;

    /* JADX WARN: Illegal instructions before constructor call */
    public c8(v7 v7Var) {
        pa0.QnHx qnHx = pa0.QnHx.w;
        this.x = v7Var;
        super(qnHx);
    }

    @Override // defpackage.pa0
    public final void M(la0 la0Var, Throwable th) {
        v7 v7Var = this.x;
        nj4 nj4Var = v7Var.k;
        h81<? extends s7<Inputs, Events, State>> h81Var = v7Var.e;
        if (h81Var != 0) {
            nj4Var.e(new n7.lPt3Fixed((s7) h81Var.invoke(), th));
        } else {
            ur1.e("host");
            throw null;
        }
    }
}
