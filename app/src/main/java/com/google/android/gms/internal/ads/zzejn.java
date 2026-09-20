package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejn extends zzejp {
    public final zzcok a;
    public final zzdmw b;
    public final zzdci c;
    public final zzdik d;

    public zzejn(zzcok zzcokVar, zzdmw zzdmwVar, zzdci zzdciVar, zzdik zzdikVar) {
        this.a = zzcokVar;
        this.b = zzdmwVar;
        this.c = zzdciVar;
        this.d = zzdikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejp
    public final zzfyx a(zzfdn zzfdnVar, Bundle bundle) {
        zzdna zzdnaVarZzh = this.a.zzh();
        zzdci zzdciVar = this.c;
        zzdciVar.zzf(zzfdnVar);
        zzdciVar.zzd(bundle);
        zzdnaVarZzh.zzf(zzdciVar.zzg());
        zzdnaVarZzh.zze(this.d);
        zzdnaVarZzh.zzd(this.b);
        zzdnaVarZzh.zzc(new zzcwx(null));
        zzdaf zzdafVarZza = zzdnaVarZzh.zzg().zza();
        return zzdafVarZza.zzh(zzdafVarZza.zzi());
    }
}
