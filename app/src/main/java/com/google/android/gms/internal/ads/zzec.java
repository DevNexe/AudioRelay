package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzec {
    public int a;
    public int b;
    public int c;
    public byte[] zza;

    public zzec() {
        this.zza = zzel.zzf;
    }

    public zzec(byte[] bArr, int i) {
        this.zza = bArr;
        this.c = i;
    }

    public final void a() {
        int i;
        int i2 = this.a;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.c) || (i2 == i && this.b == 0))) {
            z = true;
        }
        zzdd.zzf(z);
    }

    public final int zza() {
        return ((this.c - this.a) * 8) - this.b;
    }

    public final int zzb() {
        return (this.a * 8) + this.b;
    }

    public final int zzc(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.b += i;
        int i3 = 0;
        while (true) {
            i2 = this.b;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.b = i4;
            byte[] bArr = this.zza;
            int i5 = this.a;
            this.a = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.zza;
        int i6 = this.a;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.b = 0;
            this.a = i6 + 1;
        }
        a();
        return i7;
    }

    public final void zzd() {
        if (this.b == 0) {
            return;
        }
        this.b = 0;
        this.a++;
        a();
    }

    public final void zze(int i, int i2) {
        int i3 = i & 16383;
        int iMin = Math.min(8 - this.b, 14);
        int i4 = this.b;
        int i5 = (8 - i4) - iMin;
        byte[] bArr = this.zza;
        int i6 = this.a;
        byte b = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b;
        int i7 = 14 - iMin;
        bArr[i6] = (byte) (b | ((i3 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            i7 -= 8;
            this.zza[i8] = (byte) (i3 >>> i7);
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.zza;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i3 & ((1 << i7) - 1)) << i9) | b2);
        zzj(14);
        a();
    }

    public final void zzf(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.zza;
            int i5 = this.a;
            int i6 = i5 + 1;
            this.a = i6;
            byte b = bArr2[i5];
            int i7 = this.b;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b2);
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b3;
        int i9 = this.b;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.zza;
            int i10 = this.a;
            this.a = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.b = i11;
        byte[] bArr4 = this.zza;
        int i12 = this.a;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.b = 0;
            this.a = i12 + 1;
        }
        a();
    }

    public final void zzg(byte[] bArr, int i) {
        this.zza = bArr;
        this.a = 0;
        this.b = 0;
        this.c = i;
    }

    public final void zzh(int i) {
        int i2 = i / 8;
        this.a = i2;
        this.b = i - (i2 * 8);
        a();
    }

    public final void zzi() {
        int i = this.b + 1;
        this.b = i;
        if (i == 8) {
            this.b = 0;
            this.a++;
        }
        a();
    }

    public final void zzj(int i) {
        int i2 = i / 8;
        int i3 = this.a + i2;
        this.a = i3;
        int i4 = (i - (i2 * 8)) + this.b;
        this.b = i4;
        if (i4 > 7) {
            this.a = i3 + 1;
            this.b = i4 - 8;
        }
        a();
    }

    public final void zzk(int i) {
        zzdd.zzf(this.b == 0);
        this.a += i;
        a();
    }

    public final boolean zzl() {
        boolean z = (this.zza[this.a] & (128 >> this.b)) != 0;
        zzi();
        return z;
    }
}
