package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {605}, m = "awaitSuspend")
public final class vj extends b90 {
    public /* synthetic */ Object A;
    public final /* synthetic */ wj B;
    public int C;
    public wj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(wj wjVar, z80<? super vj> z80Var) {
        super(z80Var);
        this.B = wjVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        this.B.j(0, this);
        return va0.COROUTINE_SUSPENDED;
    }
}
