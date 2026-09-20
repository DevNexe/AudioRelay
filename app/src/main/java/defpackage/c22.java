package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c22 extends cx1 implements x81<Float, Float, Boolean> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ua0 x;
    public final /* synthetic */ q12 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c22(boolean z, ua0 ua0Var, q12 q12Var) {
        super(2);
        this.w = z;
        this.x = ua0Var;
        this.y = q12Var;
    }

    @Override // defpackage.x81
    public final Boolean invoke(Float f, Float f2) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        if (this.w) {
            fFloatValue = fFloatValue2;
        }
        fp1.k0(this.x, null, 0, new b22(this.y, fFloatValue, null), 3);
        return Boolean.TRUE;
    }
}
