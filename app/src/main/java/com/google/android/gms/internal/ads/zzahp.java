package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahp implements zzahy {
    public zzaf w;
    public zzej x;
    public zzaam y;

    public zzahp(String str) {
        zzad zzadVar = new zzad();
        zzadVar.zzS(str);
        this.w = zzadVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zza(zzed zzedVar) {
        zzdd.zzb(this.x);
        int i = zzel.zza;
        long jZzd = this.x.zzd();
        long jZze = this.x.zze();
        if (jZzd == -9223372036854775807L || jZze == -9223372036854775807L) {
            return;
        }
        zzaf zzafVar = this.w;
        if (jZze != zzafVar.zzq) {
            zzad zzadVarZzb = zzafVar.zzb();
            zzadVarZzb.zzW(jZze);
            zzaf zzafVarZzY = zzadVarZzb.zzY();
            this.w = zzafVarZzY;
            this.y.zzk(zzafVarZzY);
        }
        int iZza = zzedVar.zza();
        this.y.zzq(zzedVar, iZza);
        this.y.zzs(jZzd, 1, iZza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zzb(zzej zzejVar, zzzi zzziVar, zzail zzailVar) {
        this.x = zzejVar;
        zzailVar.zzc();
        zzaam zzaamVarZzv = zzziVar.zzv(zzailVar.zza(), 5);
        this.y = zzaamVarZzv;
        zzaamVarZzv.zzk(this.w);
    }
}
