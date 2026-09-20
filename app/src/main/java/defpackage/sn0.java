package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sn0 extends cx1 implements x81<d93, Float, sd5> {
    public final /* synthetic */ oh5 w;
    public final /* synthetic */ gl3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(oh5 oh5Var, gl3 gl3Var) {
        super(2);
        this.w = oh5Var;
        this.x = gl3Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(d93 d93Var, Float f) {
        d93 d93Var2 = d93Var;
        float fFloatValue = f.floatValue();
        Cz.f(this.w, d93Var2);
        d93Var2.a();
        this.x.w = fFloatValue;
        return sd5.a;
    }
}
