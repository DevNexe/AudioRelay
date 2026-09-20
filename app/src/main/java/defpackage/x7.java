package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl", f = "BallastViewModelImpl.kt", l = {354, 356, 370}, m = "safelyHandleEvent")
public final class x7 extends b90 {
    public Object A;
    public bu0 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ v7<Object, Object, Object> D;
    public int E;
    public v7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(v7<Object, Object, Object> v7Var, z80<? super x7> z80Var) {
        super(z80Var);
        this.D = v7Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return v7.k(null, this.D, null, this);
    }
}
