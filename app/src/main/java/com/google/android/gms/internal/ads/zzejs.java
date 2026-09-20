package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejs extends zzejp {
    public final zzcok a;
    public final zzdci b;
    public final zzely c;
    public final zzdik d;

    public zzejs(zzcok zzcokVar, zzdci zzdciVar, zzely zzelyVar, zzdik zzdikVar) {
        this.a = zzcokVar;
        this.b = zzdciVar;
        this.c = zzelyVar;
        this.d = zzdikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejp
    public final zzfyx a(zzfdn zzfdnVar, Bundle bundle) {
        zzdme zzdmeVarZzg = this.a.zzg();
        zzdci zzdciVar = this.b;
        zzdciVar.zzf(zzfdnVar);
        zzdciVar.zzd(bundle);
        zzdmeVarZzg.zze(zzdciVar.zzg());
        zzdmeVarZzg.zzd(this.d);
        zzdmeVarZzg.zzc(this.c);
        zzdaf zzdafVarZza = zzdmeVarZzg.zzh().zza();
        return zzdafVarZza.zzh(zzdafVarZza.zzi());
    }
}
