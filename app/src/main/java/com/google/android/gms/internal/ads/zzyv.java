package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyv implements zzzg {
    public final zzr b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        zzbh.zzb("media3.extractor");
    }

    public zzyv(zzr zzrVar, long j, long j2) {
        this.b = zzrVar;
        this.d = j;
        this.c = j2;
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.b.zza(bArr, i + i3, i2 - i3);
        if (iZza != -1) {
            return i3 + iZza;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void b(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzzg, com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.g;
        int iA = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            b(iMin);
            iA = iMin;
        }
        if (iA == 0) {
            iA = a(bArr, i, i2, 0, true);
        }
        if (iA != -1) {
            this.d += (long) iA;
        }
        return iA;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzb(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f + i2;
        int length = this.e.length;
        if (i3 > length) {
            this.e = Arrays.copyOf(this.e, zzel.zzf(length + length, 65536 + i3, i3 + 524288));
        }
        int i4 = this.g;
        int i5 = this.f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            iMin = a(this.e, i5, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.g += iMin;
        } else {
            iMin = Math.min(i2, i6);
        }
        System.arraycopy(this.e, this.f, bArr, i, iMin);
        this.f += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzc(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, 1);
        b(iMin);
        if (iMin == 0) {
            iMin = a(this.a, 0, Math.min(1, 4096), 0, true);
        }
        if (iMin != -1) {
            this.d += (long) iMin;
        }
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final long zzd() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final long zze() {
        return this.d + ((long) this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final long zzf() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzg(int i) throws EOFException, InterruptedIOException {
        zzl(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzh(byte[] bArr, int i, int i2) {
        zzm(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzi(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        zzn(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzj() {
        this.f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzk(int i) throws EOFException, InterruptedIOException {
        zzo(i, false);
    }

    public final boolean zzl(int i, boolean z) throws EOFException, InterruptedIOException {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(this.e, zzel.zzf(length + length, 65536 + i2, i2 + 524288));
        }
        int iA = this.g - this.f;
        while (iA < i) {
            iA = a(this.e, this.f, i, iA, z);
            if (iA == -1) {
                return false;
            }
            this.g = this.f + iA;
        }
        this.f += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zzm(byte[] bArr, int i, int i2, boolean z) {
        if (!zzl(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zzn(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            b(iMin);
        }
        int iA = iMin;
        while (iA < i2 && iA != -1) {
            iA = a(bArr, i, i2, iA, z);
        }
        if (iA != -1) {
            this.d += (long) iA;
        }
        return iA != -1;
    }

    public final boolean zzo(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        b(iMin);
        int iA = iMin;
        while (iA < i && iA != -1) {
            iA = a(this.a, -iA, Math.min(i, iA + 4096), iA, false);
        }
        if (iA != -1) {
            this.d += (long) iA;
        }
        return iA != -1;
    }
}
