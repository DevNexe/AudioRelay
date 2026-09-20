package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzck {
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcj
    };
    public zzd a = zzd.zza;
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzck.class.equals(obj.getClass())) {
            zzck zzckVar = (zzck) obj;
            if (zzel.zzT(this.zzb, zzckVar.zzb) && zzel.zzT(this.zzc, zzckVar.zzc) && this.zzd == zzckVar.zzd && this.zze == zzckVar.zze && this.zzg == zzckVar.zzg && zzel.zzT(this.a, zzckVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zzb;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.zzc;
        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = this.zzd;
        long j = this.zze;
        return this.a.hashCode() + ((((((((iHashCode + iHashCode2) * 31) + i) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.zzg ? 1 : 0)) * 31);
    }

    public final int zza(int i) {
        return this.a.zza(i).zzc;
    }

    public final int zzb() {
        int i = this.a.zzc;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        return -1;
    }

    public final int zze(int i) {
        return this.a.zza(i).zza(-1);
    }

    public final int zzf(int i, int i2) {
        return this.a.zza(i).zza(i2);
    }

    public final long zzg(int i, int i2) {
        zzc zzcVarZza = this.a.zza(i);
        if (zzcVarZza.zzc != -1) {
            return zzcVarZza.zzf[i2];
        }
        return -9223372036854775807L;
    }

    public final long zzh(int i) {
        long j = this.a.zza(i).zzb;
        return 0L;
    }

    public final long zzi() {
        long j = this.a.zzd;
        return 0L;
    }

    public final long zzj(int i) {
        long j = this.a.zza(i).zzg;
        return 0L;
    }

    public final zzck zzk(Object obj, Object obj2, int i, long j, long j2, zzd zzdVar, boolean z) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = 0;
        this.zze = j;
        this.zzf = 0L;
        this.a = zzdVar;
        this.zzg = z;
        return this;
    }

    public final boolean zzl(int i) {
        boolean z = this.a.zza(i).zzh;
        return false;
    }
}
