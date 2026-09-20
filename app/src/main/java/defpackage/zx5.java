package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zx5 extends FilterInputStream {
    public final long w;
    public long x;

    public zx5(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.w = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.x++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.x += (long) i3;
        }
        return i3;
    }
}
