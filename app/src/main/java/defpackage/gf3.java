package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gf3 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ float w;
    public final /* synthetic */ rt<Float> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf3(float f, rt<Float> rtVar, int i) {
        super(1);
        this.w = f;
        this.x = rtVar;
        this.y = i;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        Float fValueOf = Float.valueOf(this.w);
        rt<Float> rtVar = this.x;
        ze3 ze3Var = new ze3(((Number) AY.r(fValueOf, rtVar)).floatValue(), rtVar, this.y);
        qv1<Object> qv1Var = l94.a[1];
        n94 n94Var = l94.b;
        n94Var.getClass();
        o94Var.a(n94Var, ze3Var);
        return sd5.a;
    }
}
