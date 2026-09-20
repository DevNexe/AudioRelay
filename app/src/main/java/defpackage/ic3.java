package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler", f = "PremiumInputHandler.kt", l = {286}, m = "loadWarnings")
public final class ic3 extends b90 {
    public final /* synthetic */ uc3 A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic3(uc3 uc3Var, z80<? super ic3> z80Var) {
        super(z80Var);
        this.A = uc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return uc3.c(this.A, this);
    }
}
