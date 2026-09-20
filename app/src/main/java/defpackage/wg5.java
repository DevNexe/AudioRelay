package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wg5 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ a91<Float, Float, g30, Integer, sd5> w;
    public final /* synthetic */ vg5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wg5(a91<? super Float, ? super Float, ? super g30, ? super Integer, sd5> a91Var, vg5 vg5Var) {
        super(2);
        this.w = a91Var;
        this.x = vg5Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            vg5 vg5Var = this.x;
            this.w.I(Float.valueOf(vg5Var.D.g), Float.valueOf(vg5Var.D.h), g30Var2, 0);
        }
        return sd5.a;
    }
}
