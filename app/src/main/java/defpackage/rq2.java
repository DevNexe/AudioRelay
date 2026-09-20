package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rq2 extends cx1 implements h81<pa4> {
    public final /* synthetic */ String w = "sd5";
    public final /* synthetic */ sq2<Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq2(sq2 sq2Var) {
        super(0);
        this.x = sq2Var;
    }

    @Override // defpackage.h81
    public final pa4 invoke() {
        qq2 qq2Var = new qq2(this.x);
        return FWT.r(this.w, uv4.LPt8Fixed.a, new pa4[0], qq2Var);
    }
}
