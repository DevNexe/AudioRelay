package com.google.android.gms.internal.ads;

import defpackage.GM;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzed {
    public byte[] a;
    public int b;
    public int c;

    public zzed() {
        this.a = zzel.zzf;
    }

    public zzed(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final void zzA(zzec zzecVar, int i) {
        zzB(zzecVar.zza, 0, i);
        zzecVar.zzh(0);
    }

    public final void zzB(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void zzC(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzD(bArr, i);
    }

    public final void zzD(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void zzE(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        zzdd.zzd(z);
        this.c = i;
    }

    public final void zzF(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        zzdd.zzd(z);
        this.b = i;
    }

    public final void zzG(int i) {
        zzF(this.b + i);
    }

    public final byte[] zzH() {
        return this.a;
    }

    public final int zza() {
        return this.c - this.b;
    }

    public final int zzb() {
        return this.a.length;
    }

    public final int zzc() {
        return this.b;
    }

    public final int zzd() {
        return this.c;
    }

    public final int zze() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int zzf() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        this.b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    public final int zzg() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    public final int zzh() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new IllegalStateException(GM.a("Top bit not zero: ", iZzg));
    }

    public final int zzi() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final int zzj() {
        return (zzk() << 21) | (zzk() << 14) | (zzk() << 7) | zzk();
    }

    public final int zzk() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int zzl() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        byte b2 = bArr[i2];
        this.b = i2 + 1 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    public final int zzm() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        this.b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    public final int zzn() {
        int iZze = zze();
        if (iZze >= 0) {
            return iZze;
        }
        throw new IllegalStateException(GM.a("Top bit not zero: ", iZze));
    }

    public final int zzo() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final long zzp() {
        byte[] bArr = this.a;
        int i = this.b;
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
        this.b = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    public final long zzq() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public final long zzr() {
        byte[] bArr = this.a;
        int i = this.b;
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
        this.b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public final long zzs() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public final long zzt() {
        long jZzr = zzr();
        if (jZzr >= 0) {
            return jZzr;
        }
        throw new IllegalStateException("Top bit not zero: " + jZzr);
    }

    public final long zzu() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) == 0) {
                if (i3 >= 6) {
                    if (i3 != 7) {
                        break;
                    }
                    i = 1;
                    break;
                }
                j &= (long) (i4 - 1);
                i = 7 - i3;
                break;
            }
            i3--;
        }
        if (i == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            byte b = this.a[this.b + i2];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i;
        return j;
    }

    public final String zzv(char c) {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c && this.a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        String strZzJ = zzel.zzJ(bArr, i3, i2 - i3);
        this.b = i2;
        if (i2 < this.c) {
            this.b = i2 + 1;
        }
        return strZzJ;
    }

    public final String zzw(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String strZzJ = zzel.zzJ(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return strZzJ;
    }

    public final String zzx(int i, Charset charset) {
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    public final short zzy() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    public final void zzz(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public zzed(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public zzed(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
