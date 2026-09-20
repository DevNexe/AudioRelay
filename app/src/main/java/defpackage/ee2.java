package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ee2 {

    public static class QnHx {
        public final ByteBuffer a;

        public QnHx(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() {
            return ((long) this.a.getInt()) & 4294967295L;
        }

        public final void b(int i) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    public static de2 a(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long jA;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        QnHx qnHx = new QnHx(byteBufferDuplicate);
        qnHx.b(4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        qnHx.b(6);
        int i2 = 0;
        while (true) {
            byteBuffer = qnHx.a;
            if (i2 >= i) {
                jA = -1;
                break;
            }
            int i3 = byteBuffer.getInt();
            qnHx.b(4);
            jA = qnHx.a();
            qnHx.b(4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (jA != -1) {
            qnHx.b((int) (jA - ((long) byteBufferDuplicate.position())));
            qnHx.b(12);
            long jA2 = qnHx.a();
            for (int i4 = 0; i4 < jA2; i4++) {
                int i5 = byteBuffer.getInt();
                long jA3 = qnHx.a();
                qnHx.a();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (jA3 + jA));
                    de2 de2Var = new de2();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    de2Var.b(byteBufferDuplicate, byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position()));
                    return de2Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
