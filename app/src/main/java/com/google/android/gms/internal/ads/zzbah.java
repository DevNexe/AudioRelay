package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbah {
    public final byte[] a;
    public final int b;
    public int c;
    public int d = 0;

    public zzbah(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        a();
    }

    public final void a() {
        int i;
        int i2;
        int i3 = this.c;
        boolean z = false;
        if (i3 >= 0 && (i = this.d) >= 0 && i < 8 && (i3 < (i2 = this.b) || (i3 == i2 && i == 0))) {
            z = true;
        }
        zzazy.zze(z);
    }

    public final boolean b(int i) {
        if (i < 2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public final int zza(int i) {
        byte[] bArr;
        int i2;
        int i3;
        int i4 = i >> 3;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            bArr = this.a;
            if (i5 >= i4) {
                break;
            }
            int i7 = b(this.c + 1) ? this.c + 2 : this.c + 1;
            int i8 = this.d;
            if (i8 != 0) {
                i3 = ((bArr[i7] & 255) >>> (8 - i8)) | ((bArr[this.c] & 255) << i8);
            } else {
                i3 = bArr[this.c];
            }
            i -= 8;
            i6 |= (i3 & 255) << i;
            this.c = i7;
            i5++;
        }
        if (i > 0) {
            int i9 = this.d + i;
            byte b = (byte) (255 >> (8 - i));
            int i10 = b(this.c + 1) ? this.c + 2 : this.c + 1;
            if (i9 > 8) {
                i2 = (b & (((bArr[i10] & 255) >> (16 - i9)) | ((bArr[this.c] & 255) << (i9 - 8)))) | i6;
                this.c = i10;
            } else {
                i2 = (b & ((bArr[this.c] & 255) >> (8 - i9))) | i6;
                if (i9 == 8) {
                    this.c = i10;
                }
            }
            i6 = i2;
            this.d = i9 % 8;
        }
        a();
        return i6;
    }

    public final int zzb() {
        int i = 0;
        while (!zze()) {
            i++;
        }
        int iZza = ((1 << i) - 1) + (i > 0 ? zza(i) : 0);
        return ((iZza + 1) / 2) * (iZza % 2 != 0 ? 1 : -1);
    }

    public final int zzc() {
        int i = 0;
        while (!zze()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zza(i) : 0);
    }

    public final void zzd(int i) {
        int i2 = this.c;
        int i3 = (i >> 3) + i2;
        this.c = i3;
        int i4 = this.d + (i & 7);
        this.d = i4;
        if (i4 > 7) {
            this.c = i3 + 1;
            this.d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                a();
                return;
            } else if (b(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }

    public final boolean zze() {
        return zza(1) == 1;
    }
}
