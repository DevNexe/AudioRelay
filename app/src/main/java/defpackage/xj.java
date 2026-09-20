package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {193}, m = "writeFully$suspendImpl")
public final class xj extends b90 {
    public fg A;
    public /* synthetic */ Object B;
    public final /* synthetic */ wj C;
    public int D;
    public wj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(wj wjVar, z80<? super xj> z80Var) {
        super(z80Var);
        this.C = wjVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        wj.v(this.C, null, this);
        return va0.COROUTINE_SUSPENDED;
    }
}
