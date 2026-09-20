package defpackage;

import io.ktor.utils.io.QnHx;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1186, 1257, 1265}, m = "copyDirect$ktor_io")
public final class lj extends b90 {
    public QnHx A;
    public vs1 B;
    public il3 C;
    public QnHx D;
    public QnHx E;
    public io.ktor.utils.io.internal.QnHx F;
    public io.ktor.utils.io.internal.QnHx G;
    public ByteBuffer H;
    public QnHx I;
    public long J;
    public long K;
    public boolean L;
    public /* synthetic */ Object M;
    public final /* synthetic */ QnHx N;
    public int O;
    public QnHx z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(QnHx qnHx, z80<? super lj> z80Var) {
        super(z80Var);
        this.N = qnHx;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.u(null, 0L, this);
    }
}
