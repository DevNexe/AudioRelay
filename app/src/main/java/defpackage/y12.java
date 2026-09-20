package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y12 extends cx1 implements h81<Float> {
    public final /* synthetic */ q12 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y12(q12 q12Var) {
        super(0);
        this.w = q12Var;
    }

    @Override // defpackage.h81
    public final Float invoke() {
        q12 q12Var = this.w;
        return Float.valueOf((q12Var.f() / 100000.0f) + q12Var.e());
    }
}
