package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaan {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void zza(zzaam zzaamVar, zzaal zzaalVar) {
        if (this.c > 0) {
            zzaamVar.zzs(this.d, this.e, this.f, this.g, zzaalVar);
            this.c = 0;
        }
    }

    public final void zzb() {
        this.b = false;
        this.c = 0;
    }

    public final void zzc(zzaam zzaamVar, long j, int i, int i2, int i3, zzaal zzaalVar) {
        if (this.g > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                zza(zzaamVar, zzaalVar);
            }
        }
    }

    public final void zzd(zzzg zzzgVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        zzzgVar.zzh(bArr, 0, 10);
        zzzgVar.zzj();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }
}
