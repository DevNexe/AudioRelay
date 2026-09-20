package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {88}, m = "awaitAtLeastNBytesAvailableForRead$ktor_io")
public final class pj extends b90 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ wj C;
    public int D;
    public wj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(wj wjVar, z80<? super pj> z80Var) {
        super(z80Var);
        this.C = wjVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.h(0, this);
    }
}
