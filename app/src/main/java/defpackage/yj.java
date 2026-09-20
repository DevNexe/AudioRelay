package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {204}, m = "writeFully$suspendImpl")
public final class yj extends b90 {
    public byte[] A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ wj E;
    public int F;
    public wj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(wj wjVar, z80<? super yj> z80Var) {
        super(z80Var);
        this.E = wjVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return wj.w(this.E, null, 0, this);
    }
}
