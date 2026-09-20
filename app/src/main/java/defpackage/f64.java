package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f64 extends cx1 implements x81<Float, Float, Boolean> {
    public final /* synthetic */ ua0 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ m64 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f64(ua0 ua0Var, boolean z, m64 m64Var) {
        super(2);
        this.w = ua0Var;
        this.x = z;
        this.y = m64Var;
    }

    @Override // defpackage.x81
    public final Boolean invoke(Float f, Float f2) {
        float fFloatValue = f.floatValue();
        fp1.k0(this.w, null, 0, new e64(this.x, this.y, f2.floatValue(), fFloatValue, null), 3);
        return Boolean.TRUE;
    }
}
