package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafs {
    public final zzaft[] a;
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzaf zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;

    public zzafs(int i, int i2, long j, long j2, long j3, zzaf zzafVar, int i3, zzaft[] zzaftVarArr, int i4, long[] jArr, long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = zzafVar;
        this.zzg = i3;
        this.a = zzaftVarArr;
        this.zzj = i4;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    public final zzaft zza(int i) {
        zzaft[] zzaftVarArr = this.a;
        if (zzaftVarArr == null) {
            return null;
        }
        return zzaftVarArr[i];
    }
}
