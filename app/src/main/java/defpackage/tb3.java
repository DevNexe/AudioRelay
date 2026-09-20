package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler", f = "PremiumInputHandler.kt", l = {50, 55, 77, 85, 87, 88, 92, 93, 97, 102, 103, 108, 121, 122, 123, 124, 127}, m = "handleInput")
public final class tb3 extends b90 {
    public za3 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ uc3 C;
    public int D;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb3(uc3 uc3Var, z80<? super tb3> z80Var) {
        super(z80Var);
        this.C = uc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, null, this);
    }
}
