package com.google.android.gms.internal.ads;

import defpackage.ht6;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgnc extends OutputStream {
    public static final byte[] B = new byte[0];
    public int A;
    public int y;
    public final int w = 128;
    public final ArrayList x = new ArrayList();
    public byte[] z = new byte[128];

    public final void b(int i) {
        this.x.add(new ht6(this.z));
        int length = this.y + this.z.length;
        this.y = length;
        this.z = new byte[Math.max(this.w, Math.max(i, length >>> 1))];
        this.A = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.A == this.z.length) {
            b(1);
        }
        byte[] bArr = this.z;
        int i2 = this.A;
        this.A = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized int zza() {
        return this.y + this.A;
    }

    public final synchronized zzgnf zzb() {
        int i = this.A;
        byte[] bArr = this.z;
        if (i >= bArr.length) {
            this.x.add(new ht6(this.z));
            this.z = B;
        } else if (i > 0) {
            this.x.add(new ht6(Arrays.copyOf(bArr, i)));
        }
        this.y += this.A;
        this.A = 0;
        return zzgnf.zzu(this.x);
    }

    public final synchronized void zzc() {
        this.x.clear();
        this.y = 0;
        this.A = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.z;
        int length = bArr2.length;
        int i3 = this.A;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.A += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        b(i5);
        System.arraycopy(bArr, i + i4, this.z, 0, i5);
        this.A = i5;
    }
}
