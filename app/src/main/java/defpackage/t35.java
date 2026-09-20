package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t35 extends cx1 implements j81<w70, sd5> {
    public final /* synthetic */ float w;
    public final /* synthetic */ nd x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t35(float f, nd ndVar) {
        super(1);
        this.w = f;
        this.x = ndVar;
    }

    @Override // defpackage.j81
    public final sd5 invoke(w70 w70Var) {
        w70 w70Var2 = w70Var;
        w70Var2.B0();
        float f = this.w;
        if (!wm0.a(f, 0.0f)) {
            float density = w70Var2.getDensity() * f;
            float fC = cm4.c(w70Var2.d()) - (density / 2);
            w70Var2.T(this.x.b, X.a(0.0f, fC), X.a(cm4.e(w70Var2.d()), fC), (496 & 8) != 0 ? 0.0f : density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, (496 & 256) != 0 ? 3 : 0);
        }
        return sd5.a;
    }
}
