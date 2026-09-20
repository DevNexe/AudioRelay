package defpackage;

import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzsd;
import com.google.android.gms.internal.ads.zzse;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzty;
import com.google.android.gms.internal.ads.zzue;
import com.google.android.gms.internal.ads.zzvq;

/* JADX INFO: loaded from: classes3.dex */
public final class wa7 implements zzse, zzsd {
    public final zzse w;
    public final long x;
    public zzsd y;

    public wa7(zzse zzseVar, long j) {
        this.w = zzseVar;
        this.x = j;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zza(long j, zzkb zzkbVar) {
        long j2 = this.x;
        return this.w.zza(j - j2, zzkbVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzb() {
        long jZzb = this.w.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzc() {
        long jZzc = this.w.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzd() {
        long jZzd = this.w.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zze(long j) {
        long j2 = this.x;
        return this.w.zze(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzf(zzvq[] zzvqVarArr, boolean[] zArr, zztw[] zztwVarArr, boolean[] zArr2, long j) {
        zztw[] zztwVarArr2 = new zztw[zztwVarArr.length];
        int i = 0;
        while (true) {
            zztw zztwVar = null;
            if (i >= zztwVarArr.length) {
                break;
            }
            xa7 xa7Var = (xa7) zztwVarArr[i];
            if (xa7Var != null) {
                zztwVar = xa7Var.a;
            }
            zztwVarArr2[i] = zztwVar;
            i++;
        }
        zzse zzseVar = this.w;
        long j2 = this.x;
        long jZzf = zzseVar.zzf(zzvqVarArr, zArr, zztwVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zztwVarArr.length; i2++) {
            zztw zztwVar2 = zztwVarArr2[i2];
            if (zztwVar2 == null) {
                zztwVarArr[i2] = null;
            } else {
                zztw zztwVar3 = zztwVarArr[i2];
                if (zztwVar3 == null || ((xa7) zztwVar3).a != zztwVar2) {
                    zztwVarArr[i2] = new xa7(zztwVar2, j2);
                }
            }
        }
        return jZzf + j2;
    }

    @Override // com.google.android.gms.internal.ads.zztx
    public final /* bridge */ /* synthetic */ void zzg(zzty zztyVar) {
        zzsd zzsdVar = this.y;
        zzsdVar.getClass();
        zzsdVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzue zzh() {
        return this.w.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzi(zzse zzseVar) {
        zzsd zzsdVar = this.y;
        zzsdVar.getClass();
        zzsdVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzj(long j, boolean z) {
        this.w.zzj(j - this.x, false);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzk() {
        this.w.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzl(zzsd zzsdVar, long j) {
        this.y = zzsdVar;
        this.w.zzl(this, j - this.x);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final void zzm(long j) {
        this.w.zzm(j - this.x);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzo(long j) {
        return this.w.zzo(j - this.x);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzp() {
        return this.w.zzp();
    }
}
