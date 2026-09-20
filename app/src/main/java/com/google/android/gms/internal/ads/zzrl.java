package com.google.android.gms.internal.ads;

import defpackage.la7;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrl implements zzse, zzsd {
    public zzsd w;
    public la7[] x = new la7[0];
    public long y = 0;
    public long z;
    public final zzse zza;

    public zzrl(zzse zzseVar, boolean z, long j, long j2) {
        this.zza = zzseVar;
        this.z = j2;
    }

    public final boolean a() {
        return this.y != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zza(long j, zzkb zzkbVar) {
        if (j == 0) {
            return 0L;
        }
        long jZzr = zzel.zzr(zzkbVar.zzf, 0L, j);
        long j2 = zzkbVar.zzg;
        long j3 = this.z;
        long jZzr2 = zzel.zzr(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jZzr != zzkbVar.zzf || jZzr2 != zzkbVar.zzg) {
            zzkbVar = new zzkb(jZzr, jZzr2);
        }
        return this.zza.zza(j, zzkbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.z;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.z;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzd() {
        if (a()) {
            long j = this.y;
            this.y = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzdd.zzf(jZzd2 >= 0);
        long j2 = this.z;
        zzdd.zzf(j2 == Long.MIN_VALUE || jZzd2 <= j2);
        return jZzd2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzse
    public final long zze(long j) {
        this.y = -9223372036854775807L;
        boolean z = false;
        for (la7 la7Var : this.x) {
            if (la7Var != null) {
                la7Var.b = false;
            }
        }
        long jZze = this.zza.zze(j);
        if (jZze == j) {
            z = true;
        } else if (jZze >= 0) {
            long j2 = this.z;
            if (j2 == Long.MIN_VALUE || jZze <= j2) {
                z = true;
            }
        }
        zzdd.zzf(z);
        return jZze;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzf(zzvq[] zzvqVarArr, boolean[] zArr, zztw[] zztwVarArr, boolean[] zArr2, long j) {
        int length = zztwVarArr.length;
        this.x = new la7[length];
        zztw[] zztwVarArr2 = new zztw[length];
        int i = 0;
        while (true) {
            zztw zztwVar = null;
            if (i >= zztwVarArr.length) {
                break;
            }
            la7[] la7VarArr = this.x;
            la7 la7Var = (la7) zztwVarArr[i];
            la7VarArr[i] = la7Var;
            if (la7Var != null) {
                zztwVar = la7Var.a;
            }
            zztwVarArr2[i] = zztwVar;
            i++;
        }
        long jZzf = this.zza.zzf(zzvqVarArr, zArr, zztwVarArr2, zArr2, j);
        long j2 = (a() && j == 0) ? 0L : j;
        this.y = -9223372036854775807L;
        boolean z = true;
        if (jZzf != j2) {
            if (jZzf >= 0) {
                long j3 = this.z;
                if (j3 != Long.MIN_VALUE && jZzf > j3) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        zzdd.zzf(z);
        for (int i2 = 0; i2 < zztwVarArr.length; i2++) {
            zztw zztwVar2 = zztwVarArr2[i2];
            if (zztwVar2 == null) {
                this.x[i2] = null;
            } else {
                la7[] la7VarArr2 = this.x;
                la7 la7Var2 = la7VarArr2[i2];
                if (la7Var2 == null || la7Var2.a != zztwVar2) {
                    la7VarArr2[i2] = new la7(this, zztwVar2);
                }
            }
            zztwVarArr[i2] = this.x[i2];
        }
        return jZzf;
    }

    @Override // com.google.android.gms.internal.ads.zztx
    public final /* bridge */ /* synthetic */ void zzg(zzty zztyVar) {
        zzsd zzsdVar = this.w;
        zzsdVar.getClass();
        zzsdVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzue zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzi(zzse zzseVar) {
        zzsd zzsdVar = this.w;
        zzsdVar.getClass();
        zzsdVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzk() {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzl(zzsd zzsdVar, long j) {
        this.w = zzsdVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.z = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzo(long j) {
        return this.zza.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
