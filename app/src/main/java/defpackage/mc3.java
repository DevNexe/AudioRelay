package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler", f = "PremiumInputHandler.kt", l = {168}, m = "reload")
public final class mc3 extends b90 {
    public fo1 A;
    public za3.FJCM B;
    public /* synthetic */ Object C;
    public final /* synthetic */ uc3 D;
    public int E;
    public uc3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc3(uc3 uc3Var, z80<? super mc3> z80Var) {
        super(z80Var);
        this.D = uc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.f(null, null, this);
    }
}
