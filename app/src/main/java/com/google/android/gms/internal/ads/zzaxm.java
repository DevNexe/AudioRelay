package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxm implements zzaym {
    public final zzaym[] w;

    public zzaxm(zzaym[] zzaymVarArr) {
        this.w = zzaymVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final long zza() {
        long jMin = Long.MAX_VALUE;
        for (zzaym zzaymVar : this.w) {
            long jZza = zzaymVar.zza();
            if (jZza != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZza);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzbj(long j) {
        boolean zZzbj;
        boolean z = false;
        do {
            long jZza = zza();
            if (jZza == Long.MIN_VALUE) {
                break;
            }
            zZzbj = false;
            for (zzaym zzaymVar : this.w) {
                if (zzaymVar.zza() == jZza) {
                    zZzbj |= zzaymVar.zzbj(j);
                }
            }
            z |= zZzbj;
        } while (zZzbj);
        return z;
    }
}
