package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
public final class oj4 extends b90 {
    public nz0 A;
    public pj4 B;
    public ms1 C;
    public /* synthetic */ Object D;
    public final /* synthetic */ nj4<Object> E;
    public int F;
    public nj4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj4(nj4<Object> nj4Var, z80<? super oj4> z80Var) {
        super(z80Var);
        this.E = nj4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        nj4.n(this.E, null, this);
        return va0.COROUTINE_SUSPENDED;
    }
}
