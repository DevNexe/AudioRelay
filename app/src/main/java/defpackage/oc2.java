package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class oc2 {
    public static final ByteBuffer a = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);

    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        if (byteBuffer.hasArray() && byteBuffer2.hasArray() && !byteBuffer.isReadOnly() && !byteBuffer2.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i, byteBuffer2.array(), byteBuffer2.arrayOffset() + i3, i2);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
        byteBufferDuplicate2.position(i3);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }
}
