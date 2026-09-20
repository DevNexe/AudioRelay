package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejq extends zzejp {
    public final zzcok a;
    public final zzdci b;
    public final zzely c;
    public final zzdik d;
    public final zzdmw e;
    public final zzdfn f;
    public final ViewGroup g;
    public final zzdht h;

    public zzejq(zzcok zzcokVar, zzdci zzdciVar, zzely zzelyVar, zzdik zzdikVar, zzdmw zzdmwVar, zzdfn zzdfnVar, ViewGroup viewGroup, zzdht zzdhtVar) {
        this.a = zzcokVar;
        this.b = zzdciVar;
        this.c = zzelyVar;
        this.d = zzdikVar;
        this.e = zzdmwVar;
        this.f = zzdfnVar;
        this.g = viewGroup;
        this.h = zzdhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejp
    public final zzfyx a(zzfdn zzfdnVar, Bundle bundle) {
        zzcxw zzcxwVarZze = this.a.zze();
        zzdci zzdciVar = this.b;
        zzdciVar.zzf(zzfdnVar);
        zzdciVar.zzd(bundle);
        zzcxwVarZze.zzi(zzdciVar.zzg());
        zzcxwVarZze.zzf(this.d);
        zzcxwVarZze.zze(this.c);
        zzcxwVarZze.zzd(this.e);
        zzcxwVarZze.zzg(new zzcyu(this.f, this.h));
        zzcxwVarZze.zzc(new zzcwx(this.g));
        zzdaf zzdafVarZzd = zzcxwVarZze.zzj().zzd();
        return zzdafVarZzd.zzh(zzdafVarZzd.zzi());
    }
}
