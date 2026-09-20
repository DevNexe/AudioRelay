package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaao {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public zzaao(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public final int zza() {
        return (this.c * 8) + this.d;
    }

    public final int zzb(int i) {
        int i2 = this.c;
        int iMin = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        byte[] bArr = this.a;
        int i4 = ((bArr[i2] & 255) >> this.d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        zzc(i);
        return ((-1) >>> (32 - i)) & i4;
    }

    public final void zzc(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            i4++;
            this.c = i4;
            i5 -= 8;
            this.d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        zzdd.zzf(z);
    }

    public final boolean zzd() {
        byte b = this.a[this.c];
        int i = this.d;
        zzc(1);
        return 1 == (((b & 255) >> i) & 1);
    }
}
