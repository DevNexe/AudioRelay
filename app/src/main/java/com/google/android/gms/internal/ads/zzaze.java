package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaze {
    public final zzayp zza;
    public final zzazb zzb;
    public final Object zzc;
    public final zzasz[] zzd;

    public zzaze(zzayp zzaypVar, zzazb zzazbVar, Object obj, zzasz[] zzaszVarArr) {
        this.zza = zzaypVar;
        this.zzb = zzazbVar;
        this.zzc = obj;
        this.zzd = zzaszVarArr;
    }

    public final boolean zza(zzaze zzazeVar, int i) {
        return zzazeVar != null && zzban.zzo(this.zzb.zza(i), zzazeVar.zzb.zza(i)) && zzban.zzo(this.zzd[i], zzazeVar.zzd[i]);
    }
}
