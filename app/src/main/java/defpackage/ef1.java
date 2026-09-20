package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ef1 extends cx1 implements h81<la0> {
    public final /* synthetic */ df1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef1(df1 df1Var) {
        super(0);
        this.w = df1Var;
    }

    @Override // defpackage.h81
    public final la0 invoke() {
        la0 la0VarA = la0.QnHx.a(new xw4(null), new ab0());
        df1 df1Var = this.w;
        return la0VarA.g0((oa0) ((tt2) df1Var).A.getValue()).g0(new ta0(i5.b(new StringBuilder(), df1Var.w, "-context")));
    }
}
