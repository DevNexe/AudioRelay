package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzale extends ByteArrayOutputStream {
    public final zzakr w;

    public zzale(zzakr zzakrVar, int i) {
        this.w = zzakrVar;
        ((ByteArrayOutputStream) this).buf = zzakrVar.zzb(Math.max(i, 256));
    }

    public final void b(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        zzakr zzakrVar = this.w;
        byte[] bArrZzb = zzakrVar.zzb(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrZzb, 0, ((ByteArrayOutputStream) this).count);
        zzakrVar.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrZzb;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.w.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.w.zza(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        b(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        b(i2);
        super.write(bArr, i, i2);
    }
}
