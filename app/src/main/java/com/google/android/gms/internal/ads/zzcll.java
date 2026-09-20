package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcll implements zzjf {
    public final zzwf a = new zzwf(true, 65536);
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    @Override // com.google.android.gms.internal.ads.zzjf
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final void zzb() {
        this.f = 0;
        this.g = false;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final void zzc() {
        this.f = 0;
        this.g = false;
        this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final void zzd() {
        this.f = 0;
        this.g = false;
        this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final void zze(zzjy[] zzjyVarArr, zzue zzueVar, zzvq[] zzvqVarArr) {
        int i = 0;
        this.f = 0;
        while (true) {
            int length = zzjyVarArr.length;
            if (i >= 2) {
                this.a.zzf(this.f);
                return;
            } else {
                if (zzvqVarArr[i] != null) {
                    this.f += zzjyVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final boolean zzg(long j, long j2, float f) {
        char c;
        boolean z = true;
        if (j2 > this.c) {
            c = 0;
        } else {
            c = j2 < this.b ? (char) 2 : (char) 1;
        }
        int iZza = this.a.zza();
        int i = this.f;
        if (c != 2 && (c != 1 || !this.g || iZza >= i)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final boolean zzh(long j, float f, boolean z, long j2) {
        long j3 = z ? this.e : this.d;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final zzwf zzi() {
        return this.a;
    }

    public final synchronized void zzk(int i) {
        this.d = ((long) i) * 1000;
    }

    public final synchronized void zzl(int i) {
        this.e = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.c = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.b = ((long) i) * 1000;
    }
}
