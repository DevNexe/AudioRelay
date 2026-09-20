package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {81}, m = "awaitAtLeastNBytesAvailableForWrite$ktor_io")
public final class uj extends b90 {
    public final /* synthetic */ wj A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(wj wjVar, z80<? super uj> z80Var) {
        super(z80Var);
        this.A = wjVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.i(0, this);
    }
}
