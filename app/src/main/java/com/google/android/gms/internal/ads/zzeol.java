package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.di6;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeol implements zzeoe {

    @GuardedBy("this")
    public final zzfdl a;
    public final zzcok b;
    public final Context c;
    public final zzeob d;
    public final zzfje e;

    @GuardedBy("this")
    public zzczq f;

    public zzeol(zzcok zzcokVar, Context context, zzeob zzeobVar, zzfdl zzfdlVar) {
        this.b = zzcokVar;
        this.c = context;
        this.d = zzeobVar;
        this.a = zzfdlVar;
        this.e = zzcokVar.zzy();
        zzfdlVar.zzu(zzeobVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeoe
    public final boolean zza() {
        zzczq zzczqVar = this.f;
        return zzczqVar != null && zzczqVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeoe
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoc zzeocVar, zzeod zzeodVar) {
        zzfjc zzfjcVar;
        com.google.android.gms.ads.internal.zzt.zzq();
        Context context = this.c;
        boolean zZzD = com.google.android.gms.ads.internal.util.zzs.zzD(context);
        zzcok zzcokVar = this.b;
        if (zZzD && zzlVar.zzs == null) {
            zzcgn.zzg("Failed to load the ad because app ID is missing.");
            zzcokVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeog
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.d.zza().zza(zzfem.zzd(4, null, null));
                }
            });
            return false;
        }
        if (str == null) {
            zzcgn.zzg("Ad unit ID should not be null for NativeAdLoader.");
            zzcokVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoh
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.d.zza().zza(zzfem.zzd(6, null, null));
                }
            });
            return false;
        }
        zzfeh.zza(context, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue() && zzlVar.zzf) {
            zzcokVar.zzk().zzl(true);
        }
        int i = ((zzeof) zzeocVar).zza;
        zzfdl zzfdlVar = this.a;
        zzfdlVar.zzE(zzlVar);
        zzfdlVar.zzz(i);
        zzfdn zzfdnVarZzG = zzfdlVar.zzG();
        zzfir zzfirVarZzb = zzfiq.zzb(context, zzfjb.zzf(zzfdnVarZzG), 8, zzlVar);
        com.google.android.gms.ads.internal.client.zzbz zzbzVar = zzfdnVarZzG.zzn;
        zzeob zzeobVar = this.d;
        if (zzbzVar != null) {
            zzeobVar.zzd().zzi(zzbzVar);
        }
        zzdna zzdnaVarZzh = zzcokVar.zzh();
        zzdci zzdciVar = new zzdci();
        zzdciVar.zzc(context);
        zzdciVar.zzf(zzfdnVarZzG);
        zzdnaVarZzh.zzf(zzdciVar.zzg());
        zzdii zzdiiVar = new zzdii();
        zzdiiVar.zzk(zzeobVar.zzd(), zzcokVar.zzA());
        zzdnaVarZzh.zze(zzdiiVar.zzn());
        zzdnaVarZzh.zzd(zzeobVar.zzc());
        zzdnaVarZzh.zzc(new zzcwx(null));
        zzdnb zzdnbVarZzh = zzdnaVarZzh.zzh();
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            zzfjc zzfjcVarZzf = zzdnbVarZzh.zzf();
            zzfjcVarZzf.zzh(8);
            zzfjcVarZzf.zzb(zzlVar.zzp);
            zzfjcVar = zzfjcVarZzf;
        } else {
            zzfjcVar = null;
        }
        zzcokVar.zzw().zzc(1);
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        ScheduledExecutorService scheduledExecutorServiceZzB = zzcokVar.zzB();
        zzdaf zzdafVarZza = zzdnbVarZzh.zza();
        zzczq zzczqVar = new zzczq(zzfyyVar, scheduledExecutorServiceZzB, zzdafVarZza.zzh(zzdafVarZza.zzi()));
        this.f = zzczqVar;
        zzczqVar.zze(new di6(this, zzeodVar, zzfjcVar, zzfirVarZzb, zzdnbVarZzh));
        return true;
    }
}
