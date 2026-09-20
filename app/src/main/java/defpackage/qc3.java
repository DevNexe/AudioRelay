package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler", f = "PremiumInputHandler.kt", l = {159}, m = "reloadIfPendingPurchase")
public final class qc3 extends b90 {
    public /* synthetic */ Object A;
    public final /* synthetic */ uc3 B;
    public int C;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc3(uc3 uc3Var, z80<? super qc3> z80Var) {
        super(z80Var);
        this.B = uc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.g(null, this);
    }
}
