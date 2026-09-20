package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzry implements zzse, zzsd {
    public long A = -9223372036854775807L;
    public final zzwf B;
    public final long w;
    public zzsi x;
    public zzse y;
    public zzsd z;
    public final zzsg zza;

    public zzry(zzsg zzsgVar, zzwf zzwfVar, long j, byte[] bArr) {
        this.zza = zzsgVar;
        this.B = zzwfVar;
        this.w = j;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zza(long j, zzkb zzkbVar) {
        zzse zzseVar = this.y;
        int i = zzel.zza;
        return zzseVar.zza(j, zzkbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzb() {
        zzse zzseVar = this.y;
        int i = zzel.zza;
        return zzseVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzc() {
        zzse zzseVar = this.y;
        int i = zzel.zza;
        return zzseVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzd() {
        zzse zzseVar = this.y;
        int i = zzel.zza;
        return zzseVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zze(long j) {
        zzse zzseVar = this.y;
        int i = zzel.zza;
        return zzseVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzf(zzvq[] zzvqVarArr, boolean[] zArr, zztw[] zztwVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.A;
        if (j3 == -9223372036854775807L || j != this.w) {
            j2 = j;
        } else {
            this.A = -9223372036854775807L;
            j2 = j3;
        }
        zzse zzseVar = this.y;
        int i = zzel.zza;
        return zzseVar.zzf(zzvqVarArr, zArr, zztwVarArr, zArr2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zztx
    public final /* bridge */ /* synthetic */ void zzg(zzty zztyVar) {
        zzsd zzsdVar = this.z;
        int i = zzel.zza;
        zzsdVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzue zzh() {
        zzse zzseVar = this.y;
        int i = zzel.zza;
        return zzseVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzi(zzse zzseVar) {
        zzsd zzsdVar = this.z;
        int i = zzel.zza;
        zzsdVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzj(long j, boolean z) {
        zzse zzseVar = this.y;
        int i = zzel.zza;
        zzseVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzk() throws IOException {
        try {
            zzse zzseVar = this.y;
            if (zzseVar != null) {
                zzseVar.zzk();
                return;
            }
            zzsi zzsiVar = this.x;
            if (zzsiVar != null) {
                zzsiVar.zzw();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzl(zzsd zzsdVar, long j) {
        this.z = zzsdVar;
        zzse zzseVar = this.y;
        if (zzseVar != null) {
            long j2 = this.A;
            if (j2 == -9223372036854775807L) {
                j2 = this.w;
            }
            zzseVar.zzl(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final void zzm(long j) {
        zzse zzseVar = this.y;
        int i = zzel.zza;
        zzseVar.zzm(j);
    }

    public final long zzn() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzo(long j) {
        zzse zzseVar = this.y;
        return zzseVar != null && zzseVar.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzp() {
        zzse zzseVar = this.y;
        return zzseVar != null && zzseVar.zzp();
    }

    public final long zzq() {
        return this.w;
    }

    public final void zzr(zzsg zzsgVar) {
        long j = this.A;
        if (j == -9223372036854775807L) {
            j = this.w;
        }
        zzsi zzsiVar = this.x;
        zzsiVar.getClass();
        zzse zzseVarZzD = zzsiVar.zzD(zzsgVar, this.B, j);
        this.y = zzseVarZzD;
        if (this.z != null) {
            zzseVarZzD.zzl(this, j);
        }
    }

    public final void zzs(long j) {
        this.A = j;
    }

    public final void zzt() {
        zzse zzseVar = this.y;
        if (zzseVar != null) {
            zzsi zzsiVar = this.x;
            zzsiVar.getClass();
            zzsiVar.zzB(zzseVar);
        }
    }

    public final void zzu(zzsi zzsiVar) {
        zzdd.zzf(this.x == null);
        this.x = zzsiVar;
    }
}
