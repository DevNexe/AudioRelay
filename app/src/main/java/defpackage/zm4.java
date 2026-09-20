package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zm4 extends cx1 implements j81<Float, sd5> {
    public final /* synthetic */ is4<j81<Float, sd5>> A;
    public final /* synthetic */ rt<Float> B;
    public final /* synthetic */ ri2<Float> w;
    public final /* synthetic */ ri2<Float> x;
    public final /* synthetic */ gl3 y;
    public final /* synthetic */ gl3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zm4(ri2<Float> ri2Var, ri2<Float> ri2Var2, gl3 gl3Var, gl3 gl3Var2, is4<? extends j81<? super Float, sd5>> is4Var, rt<Float> rtVar) {
        super(1);
        this.w = ri2Var;
        this.x = ri2Var2;
        this.y = gl3Var;
        this.z = gl3Var2;
        this.A = is4Var;
        this.B = rtVar;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Float f) {
        float fFloatValue = f.floatValue();
        ri2<Float> ri2Var = this.w;
        float fFloatValue2 = ri2Var.getValue().floatValue() + fFloatValue;
        ri2<Float> ri2Var2 = this.x;
        ri2Var.setValue(Float.valueOf(ri2Var2.getValue().floatValue() + fFloatValue2));
        ri2Var2.setValue(Float.valueOf(0.0f));
        float fFloatValue3 = ri2Var.getValue().floatValue();
        gl3 gl3Var = this.y;
        float f2 = gl3Var.w;
        gl3 gl3Var2 = this.z;
        float fN = AY.n(fFloatValue3, f2, gl3Var2.w);
        j81<Float, sd5> value = this.A.getValue();
        float f3 = gl3Var.w;
        float f4 = gl3Var2.w;
        rt<Float> rtVar = this.B;
        float fFloatValue4 = rtVar.b().floatValue();
        float fFloatValue5 = rtVar.e().floatValue();
        float f5 = cn4.a;
        float f6 = f4 - f3;
        value.invoke(Float.valueOf(C0239D.y(fFloatValue4, fFloatValue5, AY.n((f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (fN - f3) / f6, 0.0f, 1.0f))));
        return sd5.a;
    }
}
