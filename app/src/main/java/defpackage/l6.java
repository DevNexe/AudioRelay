package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection", f = "BallastDebuggerClientConnection.kt", l = {134, 138}, m = "attemptConnection-KLykuaI")
public final class l6 extends b90 {
    public h81 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k6<hf1> C;
    public int D;
    public k6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(k6<hf1> k6Var, z80<? super l6> z80Var) {
        super(z80Var);
        this.C = k6Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return k6.a(this.C, 0L, null, this);
    }
}
