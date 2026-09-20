package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xm4 extends l91 implements j81<Float, Float> {
    public final /* synthetic */ rt<Float> F;
    public final /* synthetic */ gl3 G;
    public final /* synthetic */ gl3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm4(rt<Float> rtVar, gl3 gl3Var, gl3 gl3Var2) {
        super(1, ur1.QnHx.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.F = rtVar;
        this.G = gl3Var;
        this.H = gl3Var2;
    }

    @Override // defpackage.j81
    public final Float invoke(Float f) {
        return Float.valueOf(cn4.QnHx.a(f.floatValue(), this.G, this.H, this.F));
    }
}
