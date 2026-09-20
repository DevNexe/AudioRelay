package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzvx {
    public final int zza;
    public final zzka[] zzb;
    public final zzvq[] zzc;
    public final zzcy zzd;
    public final Object zze;

    public zzvx(zzka[] zzkaVarArr, zzvq[] zzvqVarArr, zzcy zzcyVar, Object obj) {
        this.zzb = zzkaVarArr;
        this.zzc = (zzvq[]) zzvqVarArr.clone();
        this.zzd = zzcyVar;
        this.zze = obj;
        this.zza = zzkaVarArr.length;
    }

    public final boolean zza(zzvx zzvxVar, int i) {
        return zzvxVar != null && zzel.zzT(this.zzb[i], zzvxVar.zzb[i]) && zzel.zzT(this.zzc[i], zzvxVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
