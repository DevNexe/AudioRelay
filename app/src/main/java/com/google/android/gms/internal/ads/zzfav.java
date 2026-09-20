package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.qj6;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfav implements zzeoe {
    public final Context a;
    public final Executor b;
    public final zzcok c;
    public final zzeno d;
    public final zzfbv e;
    public zzbjt f;
    public final zzfje g;

    @GuardedBy("this")
    public final zzfdl h;

    @GuardedBy("this")
    public zzfyx i;

    public zzfav(Context context, Executor executor, zzcok zzcokVar, zzeno zzenoVar, zzfbv zzfbvVar, zzfdl zzfdlVar) {
        this.a = context;
        this.b = executor;
        this.c = zzcokVar;
        this.d = zzenoVar;
        this.h = zzfdlVar;
        this.e = zzfbvVar;
        this.g = zzcokVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzeoe
    public final boolean zza() {
        zzfyx zzfyxVar = this.i;
        return (zzfyxVar == null || zzfyxVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeoe
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoc zzeocVar, zzeod zzeodVar) {
        zzdmf zzdmfVarZzh;
        zzfjc zzfjcVar;
        Executor executor = this.b;
        if (str == null) {
            zzcgn.zzg("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfap
                @Override // java.lang.Runnable
                public final void run() {
                    zzfav zzfavVar = this.zza;
                    zzfavVar.getClass();
                    zzfavVar.d.zza(zzfem.zzd(6, null, null));
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue();
        zzcok zzcokVar = this.c;
        if (zBooleanValue && zzlVar.zzf) {
            zzcokVar.zzk().zzl(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfao) zzeocVar).zza;
        zzfdl zzfdlVar = this.h;
        zzfdlVar.zzs(str);
        zzfdlVar.zzr(zzqVar);
        zzfdlVar.zzE(zzlVar);
        zzfdn zzfdnVarZzG = zzfdlVar.zzG();
        int iZzf = zzfjb.zzf(zzfdnVarZzG);
        Context context = this.a;
        zzfir zzfirVarZzb = zzfiq.zzb(context, iZzf, 4, zzlVar);
        boolean zBooleanValue2 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgV)).booleanValue();
        zzeno zzenoVar = this.d;
        if (zBooleanValue2) {
            zzdme zzdmeVarZzg = zzcokVar.zzg();
            zzdci zzdciVar = new zzdci();
            zzdciVar.zzc(context);
            zzdciVar.zzf(zzfdnVarZzG);
            zzdmeVarZzg.zze(zzdciVar.zzg());
            zzdii zzdiiVar = new zzdii();
            zzdiiVar.zzj(zzenoVar, executor);
            zzdiiVar.zzk(zzenoVar, executor);
            zzdmeVarZzg.zzd(zzdiiVar.zzn());
            zzdmeVarZzg.zzc(new zzely(this.f));
            zzdmfVarZzh = zzdmeVarZzg.zzh();
        } else {
            zzdii zzdiiVar2 = new zzdii();
            zzfbv zzfbvVar = this.e;
            if (zzfbvVar != null) {
                zzdiiVar2.zze(zzfbvVar, executor);
                zzdiiVar2.zzf(zzfbvVar, executor);
                zzdiiVar2.zzb(zzfbvVar, executor);
            }
            zzdme zzdmeVarZzg2 = zzcokVar.zzg();
            zzdci zzdciVar2 = new zzdci();
            zzdciVar2.zzc(context);
            zzdciVar2.zzf(zzfdnVarZzG);
            zzdmeVarZzg2.zze(zzdciVar2.zzg());
            zzdiiVar2.zzj(zzenoVar, executor);
            zzdiiVar2.zze(zzenoVar, executor);
            zzdiiVar2.zzf(zzenoVar, executor);
            zzdiiVar2.zzb(zzenoVar, executor);
            zzdiiVar2.zza(zzenoVar, executor);
            zzdiiVar2.zzl(zzenoVar, executor);
            zzdiiVar2.zzk(zzenoVar, executor);
            zzdiiVar2.zzi(zzenoVar, executor);
            zzdiiVar2.zzc(zzenoVar, executor);
            zzdmeVarZzg2.zzd(zzdiiVar2.zzn());
            zzdmeVarZzg2.zzc(new zzely(this.f));
            zzdmfVarZzh = zzdmeVarZzg2.zzh();
        }
        zzdmf zzdmfVar = zzdmfVarZzh;
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            zzfjc zzfjcVarZzf = zzdmfVar.zzf();
            zzfjcVarZzf.zzh(4);
            zzfjcVarZzf.zzb(zzlVar.zzp);
            zzfjcVar = zzfjcVarZzf;
        } else {
            zzfjcVar = null;
        }
        zzdaf zzdafVarZza = zzdmfVar.zza();
        zzfyx zzfyxVarZzh = zzdafVarZza.zzh(zzdafVarZza.zzi());
        this.i = zzfyxVarZzh;
        zzfyo.zzr(zzfyxVarZzh, new qj6(this, zzeodVar, zzfjcVar, zzfirVarZzb, zzdmfVar), executor);
        return true;
    }

    public final void zzi(zzbjt zzbjtVar) {
        this.f = zzbjtVar;
    }
}
