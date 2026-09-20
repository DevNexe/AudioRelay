package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzq implements zzaai {
    public final zzzs a;
    public final long b;

    public zzzq(zzzs zzzsVar, long j) {
        this.a = zzzsVar;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        zzzs zzzsVar = this.a;
        zzdd.zzb(zzzsVar.zzk);
        zzzr zzzrVar = zzzsVar.zzk;
        long[] jArr = zzzrVar.zza;
        long[] jArr2 = zzzrVar.zzb;
        int iZzd = zzel.zzd(jArr, zzzsVar.zzb(j), true, false);
        long j2 = iZzd == -1 ? 0L : jArr[iZzd];
        long j3 = iZzd != -1 ? jArr2[iZzd] : 0L;
        long j4 = (j2 * 1000000) / ((long) zzzsVar.zze);
        long j5 = this.b;
        zzaaj zzaajVar = new zzaaj(j4, j3 + j5);
        if (zzaajVar.zzb == j || iZzd == jArr.length - 1) {
            return new zzaag(zzaajVar, zzaajVar);
        }
        int i = iZzd + 1;
        return new zzaag(zzaajVar, new zzaaj((jArr[i] * 1000000) / ((long) zzzsVar.zze), j5 + jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return true;
    }
}
