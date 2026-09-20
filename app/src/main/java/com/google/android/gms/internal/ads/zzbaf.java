package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbaf {
    public int a;
    public int b;
    public final int c;
    public byte[] zza;

    public zzbaf() {
    }

    public zzbaf(byte[] bArr, int i) {
        this.zza = bArr;
        this.c = i;
    }

    public final int zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i >> 3;
        boolean z = false;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = this.b;
            if (i9 != 0) {
                byte[] bArr = this.zza;
                int i10 = this.a;
                i5 = ((bArr[i10 + 1] & 255) >>> (8 - i9)) | ((bArr[i10] & 255) << i9);
            } else {
                i5 = this.zza[this.a];
            }
            i -= 8;
            i7 |= (255 & i5) << i;
            this.a++;
        }
        if (i > 0) {
            int i11 = this.b + i;
            byte b = (byte) (255 >> (8 - i));
            if (i11 > 8) {
                byte[] bArr2 = this.zza;
                int i12 = this.a;
                int i13 = i12 + 1;
                i4 = (b & (((255 & bArr2[i13]) >> (16 - i11)) | ((bArr2[i12] & 255) << (i11 - 8)))) | i7;
                this.a = i13;
            } else {
                byte[] bArr3 = this.zza;
                int i14 = this.a;
                i4 = (b & ((255 & bArr3[i14]) >> (8 - i11))) | i7;
                if (i11 == 8) {
                    this.a = i14 + 1;
                }
            }
            i7 = i4;
            this.b = i11 % 8;
        }
        int i15 = this.a;
        if (i15 >= 0 && (i2 = this.b) >= 0 && (i15 < (i3 = this.c) || (i15 == i3 && i2 == 0))) {
            z = true;
        }
        zzazy.zze(z);
        return i7;
    }
}
