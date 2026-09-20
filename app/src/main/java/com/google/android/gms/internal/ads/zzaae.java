package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaae {
    public final byte[] a;
    public final int b;
    public int c;
    public int d = 0;

    public zzaae(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        a();
    }

    public final void a() {
        int i;
        int i2 = this.c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0))) {
            z = true;
        }
        zzdd.zzf(z);
    }

    public final boolean b(int i) {
        if (i < 2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public final int zza(int i) {
        int i2;
        byte[] bArr;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            int i4 = 2;
            bArr = this.a;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            int i6 = this.c;
            i3 |= (bArr[i6] & 255) << i5;
            if (true != b(i6 + 1)) {
                i4 = 1;
            }
            this.c = i6 + i4;
        }
        int i7 = this.c;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            this.c = i7 + (true != b(i7 + 1) ? 1 : 2);
        }
        a();
        return i8;
    }

    public final int zzb() {
        int i = 0;
        while (!zzf()) {
            i++;
        }
        int iZza = ((1 << i) - 1) + (i > 0 ? zza(i) : 0);
        return ((iZza + 1) / 2) * (iZza % 2 != 0 ? 1 : -1);
    }

    public final int zzc() {
        int i = 0;
        while (!zzf()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zza(i) : 0);
    }

    public final void zzd() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (true == b(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public final void zze(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
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

    public final boolean zzf() {
        boolean z = (this.a[this.c] & (128 >> this.d)) != 0;
        zzd();
        return z;
    }
}
