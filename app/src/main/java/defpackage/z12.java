package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z12 extends cx1 implements h81<Float> {
    public final /* synthetic */ q12 w;
    public final /* synthetic */ o02 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z12(q12 q12Var, p02 p02Var) {
        super(0);
        this.w = q12Var;
        this.x = p02Var;
    }

    @Override // defpackage.h81
    public final Float invoke() {
        float fE;
        float f;
        q12 q12Var = this.w;
        if (q12Var.q) {
            f = this.x.g();
            fE = 1.0f;
        } else {
            fE = q12Var.e();
            f = q12Var.f() / 100000.0f;
        }
        return Float.valueOf(f + fE);
    }
}
