package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler", f = "PremiumInputHandler.kt", l = {252, 255}, m = "loadPlans")
public final class gc3 extends b90 {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ uc3 C;
    public int D;
    public uc3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc3(uc3 uc3Var, z80<? super gc3> z80Var) {
        super(z80Var);
        this.C = uc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return uc3.b(this.C, false, false, this);
    }
}
