package com.google.android.gms.internal.ads;

import defpackage.GM;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbag {
    public int a;
    public int b;
    public byte[] zza;

    public zzbag() {
    }

    public zzbag(int i) {
        this.zza = new byte[i];
        this.b = i;
    }

    public final int zza() {
        return this.b - this.a;
    }

    public final int zzb() {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int zzc() {
        return this.a;
    }

    public final int zzd() {
        return this.b;
    }

    public final int zze() {
        byte[] bArr = this.zza;
        int i = this.a;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.a = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int zzf() {
        byte[] bArr = this.zza;
        int i = this.a;
        int i2 = i + 1;
        byte b = bArr[i];
        this.a = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final int zzg() {
        byte[] bArr = this.zza;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    public final int zzh() {
        byte[] bArr = this.zza;
        int i = this.a;
        int i2 = i + 1;
        byte b = bArr[i];
        byte b2 = bArr[i2];
        this.a = i2 + 1 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    public final int zzi() {
        int iZze = zze();
        if (iZze >= 0) {
            return iZze;
        }
        throw new IllegalStateException(GM.a("Top bit not zero: ", iZze));
    }

    public final int zzj() {
        byte[] bArr = this.zza;
        int i = this.a;
        int i2 = i + 1;
        byte b = bArr[i];
        this.a = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final long zzk() {
        byte[] bArr = this.zza;
        int i = this.a;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.a = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public final long zzl() {
        byte[] bArr = this.zza;
        int i = this.a;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        this.a = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public final long zzm() {
        byte[] bArr = this.zza;
        int i = this.a;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.a = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public final long zzn() {
        long jZzl = zzl();
        if (jZzl >= 0) {
            return jZzl;
        }
        throw new IllegalStateException("Top bit not zero: " + jZzl);
    }

    public final String zzo(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.a;
        int i3 = i2 + i;
        int i4 = i3 - 1;
        if (i4 < this.b && this.zza[i4] == 0) {
            i--;
        }
        String str = new String(this.zza, i2, i);
        this.a = i3;
        return str;
    }

    public final short zzp() {
        byte[] bArr = this.zza;
        int i = this.a;
        int i2 = i + 1;
        byte b = bArr[i];
        this.a = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    public final void zzq(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zza, this.a, bArr, i, i2);
        this.a += i2;
    }

    public final void zzr() {
        this.a = 0;
        this.b = 0;
    }

    public final void zzs(int i) {
        zzt(zzb() < i ? new byte[i] : this.zza, i);
    }

    public final void zzt(byte[] bArr, int i) {
        this.zza = bArr;
        this.b = i;
        this.a = 0;
    }

    public final void zzu(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zza.length) {
            z = true;
        }
        zzazy.zzc(z);
        this.b = i;
    }

    public final void zzv(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.b) {
            z = true;
        }
        zzazy.zzc(z);
        this.a = i;
    }

    public final void zzw(int i) {
        zzv(this.a + i);
    }

    public zzbag(byte[] bArr) {
        this.zza = bArr;
        this.b = bArr.length;
    }
}
