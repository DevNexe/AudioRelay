package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cy4 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ Object w;
    public final /* synthetic */ iy4<Object> x;
    public final /* synthetic */ j81<Object, sd5> y;
    public final /* synthetic */ ri2<Boolean> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy4(Boolean bool, iy4 iy4Var, j81 j81Var, ri2 ri2Var) {
        super(1);
        this.w = bool;
        this.x = iy4Var;
        this.y = j81Var;
        this.z = ri2Var;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        iy4<Object> iy4Var = this.x;
        if (!ur1.a(this.w, iy4Var.b())) {
            this.y.invoke(iy4Var.b());
            ri2<Boolean> ri2Var = this.z;
            ri2Var.setValue(Boolean.valueOf(!ri2Var.getValue().booleanValue()));
        }
        return new by4();
    }
}
