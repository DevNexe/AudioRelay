package defpackage;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class k22 extends OutputStream {
    public long w = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.w++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.w += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.w += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
