package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e45 extends cx1 implements j81<Float, Float> {
    public final /* synthetic */ g45 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e45(g45 g45Var) {
        super(1);
        this.w = g45Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j81
    public final Float invoke(Float f) {
        float fFloatValue = f.floatValue();
        g45 g45Var = this.w;
        float fA = g45Var.a() + fFloatValue;
        kz2 kz2Var = g45Var.b;
        if (fA > ((Number) kz2Var.getValue()).floatValue()) {
            fFloatValue = ((Number) kz2Var.getValue()).floatValue() - g45Var.a();
        } else if (fA < 0.0f) {
            fFloatValue = -g45Var.a();
        }
        g45Var.a.setValue(Float.valueOf(g45Var.a() + fFloatValue));
        return Float.valueOf(fFloatValue);
    }
}
