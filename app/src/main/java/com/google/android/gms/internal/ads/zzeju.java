package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeju extends zzejp {
    public final zzcok a;
    public final zzdci b;
    public final zzdik c;

    public zzeju(zzcok zzcokVar, zzdci zzdciVar, zzdik zzdikVar) {
        this.a = zzcokVar;
        this.b = zzdciVar;
        this.c = zzdikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejp
    public final zzfyx a(zzfdn zzfdnVar, Bundle bundle) {
        zzdue zzdueVarZzi = this.a.zzi();
        zzdci zzdciVar = this.b;
        zzdciVar.zzf(zzfdnVar);
        zzdciVar.zzd(bundle);
        zzdueVarZzi.zzd(zzdciVar.zzg());
        zzdueVarZzi.zzc(this.c);
        zzdaf zzdafVarZzb = zzdueVarZzi.zzh().zzb();
        return zzdafVarZzb.zzh(zzdafVarZzb.zzi());
    }
}
