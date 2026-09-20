package defpackage;

import io.ktor.utils.io.QnHx;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1107, 1109}, m = "writeFullySuspend")
public final class nj extends b90 {
    public fg A;
    public /* synthetic */ Object B;
    public final /* synthetic */ QnHx C;
    public int D;
    public QnHx z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(QnHx qnHx, z80<? super nj> z80Var) {
        super(z80Var);
        this.C = qnHx;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.j;
        return this.C.W(null, this);
    }
}
