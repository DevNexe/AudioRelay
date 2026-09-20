package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n31 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ua0 x;
    public final /* synthetic */ ri2<j21> y;
    public final /* synthetic */ ci2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(boolean z, ua0 ua0Var, ri2<j21> ri2Var, ci2 ci2Var) {
        super(1);
        this.w = z;
        this.x = ua0Var;
        this.y = ri2Var;
        this.z = ci2Var;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        if (!this.w) {
            fp1.k0(this.x, null, 0, new l31(this.z, this.y, null), 3);
        }
        return new m31();
    }
}
