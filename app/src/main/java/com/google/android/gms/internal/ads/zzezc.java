package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.cj6;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzezc implements zzeoe {
    public final Context a;
    public final Executor b;
    public final zzcok c;
    public final zzeno d;
    public final zzens e;
    public final FrameLayout f;
    public zzbjt g;
    public final zzdfn h;
    public final zzfje i;
    public final zzdht j;

    @GuardedBy("this")
    public final zzfdl k;

    @GuardedBy("this")
    public zzfyx l;

    public zzezc(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcok zzcokVar, zzeno zzenoVar, zzens zzensVar, zzfdl zzfdlVar, zzdht zzdhtVar) {
        this.a = context;
        this.b = executor;
        this.c = zzcokVar;
        this.d = zzenoVar;
        this.e = zzensVar;
        this.k = zzfdlVar;
        this.h = zzcokVar.zzf();
        this.i = zzcokVar.zzy();
        this.f = new FrameLayout(context);
        this.j = zzdhtVar;
        zzfdlVar.zzr(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeoe
    public final boolean zza() {
        zzfyx zzfyxVar = this.l;
        return (zzfyxVar == null || zzfyxVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeoe
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoc zzeocVar, zzeod zzeodVar) {
        zzcxx zzcxxVarZzj;
        zzfjc zzfjcVar;
        Executor executor = this.b;
        if (str == null) {
            zzcgn.zzg("Ad unit ID should not be null for banner ad.");
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyy
                @Override // java.lang.Runnable
                public final void run() {
                    zzezc zzezcVar = this.zza;
                    zzezcVar.getClass();
                    zzezcVar.d.zza(zzfem.zzd(6, null, null));
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
        zzfdl zzfdlVar = this.k;
        zzfdlVar.zzs(str);
        zzfdlVar.zzE(zzlVar);
        zzfdn zzfdnVarZzG = zzfdlVar.zzG();
        int iZzf = zzfjb.zzf(zzfdnVarZzG);
        Context context = this.a;
        zzfir zzfirVarZzb = zzfiq.zzb(context, iZzf, 3, zzlVar);
        boolean zBooleanValue2 = ((Boolean) zzbkt.zzc.zze()).booleanValue();
        zzeno zzenoVar = this.d;
        if (zBooleanValue2 && zzfdlVar.zzg().zzk) {
            if (zzenoVar != null) {
                zzenoVar.zza(zzfem.zzd(7, null, null));
            }
            return false;
        }
        boolean zBooleanValue3 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgT)).booleanValue();
        FrameLayout frameLayout = this.f;
        zzdht zzdhtVar = this.j;
        zzdfn zzdfnVar = this.h;
        if (zBooleanValue3) {
            zzcxw zzcxwVarZze = zzcokVar.zze();
            zzdci zzdciVar = new zzdci();
            zzdciVar.zzc(context);
            zzdciVar.zzf(zzfdnVarZzG);
            zzcxwVarZze.zzi(zzdciVar.zzg());
            zzdii zzdiiVar = new zzdii();
            zzdiiVar.zzj(zzenoVar, executor);
            zzdiiVar.zzk(zzenoVar, executor);
            zzcxwVarZze.zzf(zzdiiVar.zzn());
            zzcxwVarZze.zze(new zzely(this.g));
            zzcxwVarZze.zzd(new zzdmw(zzdoz.zza, null));
            zzcxwVarZze.zzg(new zzcyu(zzdfnVar, zzdhtVar));
            zzcxwVarZze.zzc(new zzcwx(frameLayout));
            zzcxxVarZzj = zzcxwVarZze.zzh();
        } else {
            zzcxw zzcxwVarZze2 = zzcokVar.zze();
            zzdci zzdciVar2 = new zzdci();
            zzdciVar2.zzc(context);
            zzdciVar2.zzf(zzfdnVarZzG);
            zzcxwVarZze2.zzi(zzdciVar2.zzg());
            zzdii zzdiiVar2 = new zzdii();
            zzdiiVar2.zzj(zzenoVar, executor);
            zzdiiVar2.zza(zzenoVar, executor);
            zzdiiVar2.zza(this.e, executor);
            zzdiiVar2.zzl(zzenoVar, executor);
            zzdiiVar2.zzd(zzenoVar, executor);
            zzdiiVar2.zze(zzenoVar, executor);
            zzdiiVar2.zzf(zzenoVar, executor);
            zzdiiVar2.zzb(zzenoVar, executor);
            zzdiiVar2.zzk(zzenoVar, executor);
            zzdiiVar2.zzi(zzenoVar, executor);
            zzcxwVarZze2.zzf(zzdiiVar2.zzn());
            zzcxwVarZze2.zze(new zzely(this.g));
            zzcxwVarZze2.zzd(new zzdmw(zzdoz.zza, null));
            zzcxwVarZze2.zzg(new zzcyu(zzdfnVar, zzdhtVar));
            zzcxwVarZze2.zzc(new zzcwx(frameLayout));
            zzcxxVarZzj = zzcxwVarZze2.zzh();
        }
        zzcxx zzcxxVar = zzcxxVarZzj;
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            zzfjc zzfjcVarZzj = zzcxxVar.zzj();
            zzfjcVarZzj.zzh(3);
            zzfjcVarZzj.zzb(zzlVar.zzp);
            zzfjcVar = zzfjcVarZzj;
        } else {
            zzfjcVar = null;
        }
        zzdaf zzdafVarZzd = zzcxxVar.zzd();
        zzfyx zzfyxVarZzh = zzdafVarZzd.zzh(zzdafVarZzd.zzi());
        this.l = zzfyxVarZzh;
        zzfyo.zzr(zzfyxVarZzh, new cj6(this, zzeodVar, zzfjcVar, zzfirVarZzb, zzcxxVar), executor);
        return true;
    }

    public final ViewGroup zzd() {
        return this.f;
    }

    public final zzfdl zzi() {
        return this.k;
    }

    public final void zzn() {
        this.h.zzd(this.j.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        this.e.zza(zzbcVar);
    }

    public final void zzp(zzdfo zzdfoVar) {
        this.h.zzj(zzdfoVar, this.b);
    }

    public final void zzq(zzbjt zzbjtVar) {
        this.g = zzbjtVar;
    }

    public final boolean zzr() {
        Object parent = this.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzq();
        return com.google.android.gms.ads.internal.util.zzs.zzS(view, view.getContext());
    }
}
