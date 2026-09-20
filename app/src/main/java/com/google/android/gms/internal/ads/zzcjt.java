package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcjt {
    public final zzazl a = new zzazl(true, 65536);
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    public final void zza() {
        this.f = 0;
        this.g = false;
    }

    public final void zzb() {
        this.f = 0;
        this.g = false;
        this.a.zze();
    }

    public final void zzc() {
        this.f = 0;
        this.g = false;
        this.a.zze();
    }

    public final void zzd(zzasx[] zzasxVarArr, zzayp zzaypVar, zzazb zzazbVar) {
        this.f = 0;
        for (int i = 0; i < 2; i++) {
            if (zzazbVar.zza(i) != null) {
                this.f = zzban.zzf(zzasxVarArr[i].zzc()) + this.f;
            }
        }
        this.a.zzf(this.f);
    }

    public final synchronized void zzf(int i) {
        this.d = ((long) i) * 1000;
    }

    public final synchronized void zzg(int i) {
        this.e = ((long) i) * 1000;
    }

    public final synchronized void zzh(int i) {
        this.c = ((long) i) * 1000;
    }

    public final synchronized void zzi(int i) {
        this.b = ((long) i) * 1000;
    }

    public final synchronized boolean zzj(long j) {
        boolean z;
        char c;
        z = true;
        if (j > this.c) {
            c = 0;
        } else {
            c = j < this.b ? (char) 2 : (char) 1;
        }
        int iZza = this.a.zza();
        int i = this.f;
        if (c != 2 && (c != 1 || !this.g || iZza >= i)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    public final synchronized boolean zzk(long j, boolean z) {
        try {
            long j2 = z ? this.e : this.d;
            return j2 <= 0 || j >= j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzazl zzl() {
        return this.a;
    }
}
