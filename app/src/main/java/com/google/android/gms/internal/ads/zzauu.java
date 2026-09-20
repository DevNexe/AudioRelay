package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauu {
    public static final byte[] g = new byte[4096];
    public final zzazi a;
    public final long b;
    public long c;
    public byte[] d = new byte[65536];
    public int e;
    public int f;

    public zzauu(zzazi zzaziVar, long j, long j2) {
        this.a = zzaziVar;
        this.c = j;
        this.b = j2;
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, EOFException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iZza = this.a.zza(bArr, i + i3, i2 - i3);
        if (iZza != -1) {
            return i3 + iZza;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void b(int i) {
        int i2 = this.f - i;
        this.f = i2;
        this.e = 0;
        byte[] bArr = this.d;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.d = bArr2;
    }

    public final int zza(byte[] bArr, int i, int i2) throws InterruptedException, EOFException {
        int i3 = this.f;
        int iA = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.d, 0, bArr, i, iMin);
            b(iMin);
            iA = iMin;
        }
        if (iA == 0) {
            iA = a(bArr, i, i2, 0, true);
        }
        if (iA != -1) {
            this.c += (long) iA;
        }
        return iA;
    }

    public final int zzb(int i) throws InterruptedException, EOFException {
        int iMin = Math.min(this.f, i);
        b(iMin);
        if (iMin == 0) {
            iMin = a(g, 0, Math.min(i, 4096), 0, true);
        }
        if (iMin != -1) {
            this.c += (long) iMin;
        }
        return iMin;
    }

    public final long zzc() {
        return this.b;
    }

    public final long zzd() {
        return this.c;
    }

    public final void zze() {
        this.e = 0;
    }

    public final boolean zzf(int i, boolean z) throws InterruptedException, EOFException {
        int i2 = this.e + i;
        int length = this.d.length;
        if (i2 > length) {
            this.d = Arrays.copyOf(this.d, zzban.zze(length + length, 65536 + i2, i2 + 524288));
        }
        int iMin = Math.min(this.f - this.e, i);
        while (iMin < i) {
            iMin = a(this.d, this.e, i, iMin, false);
            if (iMin == -1) {
                return false;
            }
        }
        int i3 = this.e + i;
        this.e = i3;
        this.f = Math.max(this.f, i3);
        return true;
    }

    public final boolean zzg(byte[] bArr, int i, int i2, boolean z) {
        if (!zzf(i2, false)) {
            return false;
        }
        System.arraycopy(this.d, this.e - i2, bArr, i, i2);
        return true;
    }

    public final boolean zzh(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, EOFException {
        int iMin;
        int i3 = this.f;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.d, 0, bArr, i, iMin);
            b(iMin);
        }
        int iA = iMin;
        while (iA < i2 && iA != -1) {
            iA = a(bArr, i, i2, iA, z);
        }
        if (iA != -1) {
            this.c += (long) iA;
        }
        return iA != -1;
    }

    public final boolean zzi(int i, boolean z) throws InterruptedException, EOFException {
        int iMin = Math.min(this.f, i);
        b(iMin);
        int iA = iMin;
        while (iA < i && iA != -1) {
            iA = a(g, -iA, Math.min(i, iA + 4096), iA, false);
        }
        if (iA != -1) {
            this.c += (long) iA;
        }
        return iA != -1;
    }
}
