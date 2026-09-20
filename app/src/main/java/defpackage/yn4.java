package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yn4 extends cx1 implements h81<sd5> {
    public final /* synthetic */ rn4 w;
    public final /* synthetic */ ow0<rn4> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn4(rn4 rn4Var, ow0<rn4> ow0Var) {
        super(0);
        this.w = rn4Var;
        this.x = ow0Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        ow0<rn4> ow0Var = this.x;
        Object obj = ow0Var.a;
        rn4 rn4Var = this.w;
        if (!ur1.a(rn4Var, obj)) {
            su.z0(new xn4(rn4Var), ow0Var.b);
            rk3 rk3Var = ow0Var.c;
            if (rk3Var != null) {
                rk3Var.invalidate();
            }
        }
        return sd5.a;
    }
}
