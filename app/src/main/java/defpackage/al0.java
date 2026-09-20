package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class al0 extends jh0<ByteBuffer> {
    public final int B;

    public al0(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.jh0
    public final ByteBuffer c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.clear();
        byteBuffer2.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer2;
    }

    @Override // defpackage.jh0
    public final ByteBuffer g() {
        return ByteBuffer.allocateDirect(this.B);
    }

    @Override // defpackage.jh0
    public final void i(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!(byteBuffer2.capacity() == this.B)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!byteBuffer2.isDirect()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
