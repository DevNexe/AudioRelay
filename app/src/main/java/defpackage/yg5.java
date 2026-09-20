package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yg5 extends cx1 implements a91<Float, Float, g30, Integer, sd5> {
    public final /* synthetic */ ej1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg5(ej1 ej1Var) {
        super(4);
        this.w = ej1Var;
    }

    @Override // defpackage.a91
    public final sd5 I(Float f, Float f2, g30 g30Var, Integer num) {
        f.floatValue();
        f2.floatValue();
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            xg5.a(this.w.f, null, g30Var2, 0, 2);
        }
        return sd5.a;
    }
}
