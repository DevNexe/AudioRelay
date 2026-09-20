package defpackage;

import io.ktor.utils.io.QnHx;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1493}, m = "write$suspendImpl")
public final class mj extends b90 {
    public j81 A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ QnHx D;
    public int E;
    public QnHx z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(QnHx qnHx, z80<? super mj> z80Var) {
        super(z80Var);
        this.D = qnHx;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return QnHx.T(this.D, 0, null, this);
    }
}
