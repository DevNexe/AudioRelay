package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrq implements zzty {
    public final zzty[] w;

    public zzrq(zzty[] zztyVarArr) {
        this.w = zztyVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        for (zzty zztyVar : this.w) {
            long jZzb = zztyVar.zzb();
            if (jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (zzty zztyVar : this.w) {
            long jZzc = zztyVar.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzm(long j) {
        for (zzty zztyVar : this.w) {
            zztyVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final boolean zzo(long j) {
        boolean zZzo;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (zzty zztyVar : this.w) {
                long jZzc2 = zztyVar.zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= j;
                if (jZzc2 == jZzc || z2) {
                    zZzo |= zztyVar.zzo(j);
                }
            }
            z |= zZzo;
        } while (zZzo);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final boolean zzp() {
        for (zzty zztyVar : this.w) {
            if (zztyVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
