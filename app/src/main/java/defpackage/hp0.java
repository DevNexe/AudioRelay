package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hp0 extends cx1 implements h81<Float> {
    public final /* synthetic */ float w;
    public final /* synthetic */ xp0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(float f, xp0 xp0Var) {
        super(0);
        this.w = f;
        this.x = xp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h81
    public final Float invoke() {
        float fFloatValue = ((Number) this.x.a.e.getValue()).floatValue();
        float f = np0.a;
        float f2 = this.w;
        return Float.valueOf(AY.n((fFloatValue - f2) / (0.0f - f2), 0.0f, 1.0f));
    }
}
