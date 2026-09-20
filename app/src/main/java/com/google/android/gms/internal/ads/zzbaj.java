package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbaj implements zzbac {
    public boolean a;
    public long b;
    public long c;
    public zzasw d = zzasw.zza;

    @Override // com.google.android.gms.internal.ads.zzbac
    public final long zzI() {
        long j = this.b;
        if (!this.a) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        zzasw zzaswVar = this.d;
        return j + (zzaswVar.zzb == 1.0f ? zzasd.zza(jElapsedRealtime) : zzaswVar.zza(jElapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzbac
    public final zzasw zzJ() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbac
    public final zzasw zzK(zzasw zzaswVar) {
        if (this.a) {
            zza(zzI());
        }
        this.d = zzaswVar;
        return zzaswVar;
    }

    public final void zza(long j) {
        this.b = j;
        if (this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public final void zzb() {
        if (this.a) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    public final void zzc() {
        if (this.a) {
            zza(zzI());
            this.a = false;
        }
    }

    public final void zzd(zzbac zzbacVar) {
        zza(zzbacVar.zzI());
        this.d = zzbacVar.zzJ();
    }
}
