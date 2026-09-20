package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler", f = "PremiumInputHandler.kt", l = {199, RCHTTPStatusCodes.CREATED, 202}, m = "makePurchase")
public final class jc3 extends b90 {
    public za3.YKK A;
    public /* synthetic */ Object B;
    public final /* synthetic */ uc3 C;
    public int D;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc3(uc3 uc3Var, z80<? super jc3> z80Var) {
        super(z80Var);
        this.C = uc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.e(null, null, this);
    }
}
