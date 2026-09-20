package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {73}, m = "emitAbort$FlowKt__LimitKt")
public final class d01<T> extends b90 {
    public /* synthetic */ Object A;
    public int B;
    public nz0 z;

    public d01(z80<? super d01> z80Var) {
        super(z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        YKK.a(null, null, this);
        return va0.COROUTINE_SUSPENDED;
    }
}
