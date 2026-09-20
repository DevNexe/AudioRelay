package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl", f = "BallastViewModelImpl.kt", l = {RCHTTPStatusCodes.NOT_MODIFIED, 308, 339, 345}, m = "safelyHandleInput")
public final class z7 extends b90 {
    public Object A;
    public Object B;
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ v7<Object, Object, Object> E;
    public int F;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(v7<Object, Object, Object> v7Var, z80<? super z7> z80Var) {
        super(z80Var);
        this.E = v7Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return v7.l(null, this.E, null, this, null);
    }
}
