package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class e8 {
    public final int a;
    public ByteBuffer b;
    public byte[] c;

    public e8(int i) {
        this.a = i;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4096);
        byteBufferAllocateDirect.limit(0);
        this.b = byteBufferAllocateDirect;
        this.c = new byte[i];
    }

    public final void a(qk qkVar, boolean z, j81<? super qk, sd5> j81Var) {
        int iRemaining = this.b.remaining();
        int i = qkVar.b;
        int i2 = this.a;
        byte[] bArr = qkVar.a;
        int i3 = qkVar.c;
        if (iRemaining == 0) {
            if (i3 == i2) {
                j81Var.invoke(qkVar);
                return;
            }
            if (i3 > i2 && i3 % i2 == 0) {
                int i4 = i3 / i2;
                for (int i5 = 0; i5 < i4; i5++) {
                    j81Var.invoke(new qk(bArr, i, i2, false));
                    i += i2;
                }
                return;
            }
        }
        int i6 = i3 + iRemaining;
        int iFloor = (int) Math.floor(((double) i6) / ((double) i2));
        int i7 = i6 % i2;
        if (!(iRemaining < i2)) {
            throw new IllegalStateException(bj0.a("assert remain < targetSize (", iRemaining, " < ", i2, ")").toString());
        }
        int i8 = 0;
        int i9 = i;
        while (i8 < iFloor) {
            int iRemaining2 = this.b.remaining();
            if (this.b.hasRemaining()) {
                this.b.get(this.c, 0, iRemaining2);
                this.b.position(0);
                this.b.limit(0);
            }
            int i10 = (i2 - iRemaining2) + i9;
            System.arraycopy(bArr, i9, this.c, iRemaining2, i10 - i9);
            j81Var.invoke(new qk(this.c, 0, i2, false));
            i8++;
            i9 = i10;
        }
        if (i7 > 0) {
            if (i7 > this.b.capacity()) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i7 * 2);
                byteBufferAllocateDirect.put(this.b);
                byteBufferAllocateDirect.position(0);
                byteBufferAllocateDirect.limit(this.b.limit());
                this.b = byteBufferAllocateDirect;
            }
            if (!z) {
                int iMin = Math.min(i7, i3);
                ByteBuffer byteBuffer = this.b;
                byteBuffer.position(byteBuffer.limit());
                ByteBuffer byteBuffer2 = this.b;
                byteBuffer2.limit(byteBuffer2.limit() + iMin);
                this.b.put(bArr, i + (i3 - iMin), iMin);
                this.b.position(0);
                return;
            }
            int iMin2 = Math.min(i7, i3);
            int i11 = i3 - iMin2;
            int i12 = i7 - iMin2;
            if (this.c.length < i7) {
                this.c = new byte[i7];
            }
            ByteBuffer byteBuffer3 = this.b;
            byteBuffer3.get(this.c, 0, byteBuffer3.remaining());
            this.b.position(0);
            this.b.limit(0);
            System.arraycopy(bArr, i11, this.c, i12, (iMin2 + i11) - i11);
            j81Var.invoke(new qk(this.c, 0, i7, false));
        }
    }
}
