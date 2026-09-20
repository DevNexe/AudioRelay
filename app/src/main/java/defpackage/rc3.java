package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler", f = "PremiumInputHandler.kt", l = {223, 227, 229, 233}, m = "restorePurchases")
public final class rc3 extends b90 {
    public Object A;
    public /* synthetic */ Object B;
    public final /* synthetic */ uc3 C;
    public int D;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc3(uc3 uc3Var, z80<? super rc3> z80Var) {
        super(z80Var);
        this.C = uc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.h(null, this);
    }
}
