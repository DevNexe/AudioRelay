package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d74 extends cx1 implements h81<pa4> {
    public final /* synthetic */ String w;
    public final /* synthetic */ e74<Object> x;
    public final /* synthetic */ rv1<Object>[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d74(String str, e74<Object> e74Var, rv1<Object>[] rv1VarArr) {
        super(0);
        this.w = str;
        this.x = e74Var;
        this.y = rv1VarArr;
    }

    @Override // defpackage.h81
    public final pa4 invoke() {
        c74 c74Var = new c74(this.x, this.y);
        return FWT.r(this.w, q93.CQf.a, new pa4[0], c74Var);
    }
}
