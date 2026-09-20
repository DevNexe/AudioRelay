package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.oa3;
import defpackage.xi6;
import defpackage.yi6;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzexy implements zzeoe {
    public final Context a;
    public final Executor b;
    public final zzcok c;
    public final zzeyo d;
    public final zzfah e;
    public final zzcgt f;
    public final FrameLayout g;
    public final zzfje h;

    @GuardedBy("this")
    public final zzfdl i;

    @GuardedBy("this")
    @Nullable
    public zzfyx j;

    public zzexy(Context context, Executor executor, zzcok zzcokVar, zzfah zzfahVar, zzeyo zzeyoVar, zzfdl zzfdlVar, zzcgt zzcgtVar) {
        this.a = context;
        this.b = executor;
        this.c = zzcokVar;
        this.e = zzfahVar;
        this.d = zzeyoVar;
        this.i = zzfdlVar;
        this.f = zzcgtVar;
        this.g = new FrameLayout(context);
        this.h = zzcokVar.zzy();
    }

    public abstract zzdcg a(zzdck zzdckVar, zzdik zzdikVar);

    public final synchronized zzdcg b(zzfaf zzfafVar) {
        yi6 yi6Var = (yi6) zzfafVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgU)).booleanValue()) {
            new zzcwx(this.g);
            zzdci zzdciVar = new zzdci();
            zzdciVar.zzc(this.a);
            zzdciVar.zzf(yi6Var.a);
            zzdck zzdckVarZzg = zzdciVar.zzg();
            zzdii zzdiiVar = new zzdii();
            zzdiiVar.zzc(this.d, this.b);
            zzdiiVar.zzl(this.d, this.b);
            return a(zzdckVarZzg, zzdiiVar.zzn());
        }
        zzeyo zzeyoVarZzi = zzeyo.zzi(this.d);
        zzdii zzdiiVar2 = new zzdii();
        zzdiiVar2.zzb(zzeyoVarZzi, this.b);
        zzdiiVar2.zzg(zzeyoVarZzi, this.b);
        zzdiiVar2.zzh(zzeyoVarZzi, this.b);
        zzdiiVar2.zzi(zzeyoVarZzi, this.b);
        zzdiiVar2.zzc(zzeyoVarZzi, this.b);
        zzdiiVar2.zzl(zzeyoVarZzi, this.b);
        zzdiiVar2.zzm(zzeyoVarZzi);
        new zzcwx(this.g);
        zzdci zzdciVar2 = new zzdci();
        zzdciVar2.zzc(this.a);
        zzdciVar2.zzf(yi6Var.a);
        return a(zzdciVar2.zzg(), zzdiiVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeoe
    public final boolean zza() {
        zzfyx zzfyxVar = this.j;
        return (zzfyxVar == null || zzfyxVar.isDone()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    @Override // com.google.android.gms.internal.ads.zzeoe
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoc zzeocVar, zzeod zzeodVar) {
        boolean z;
        zzfjc zzfjcVar;
        if (((Boolean) zzbkm.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.f.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziH)).intValue() || !z) {
            oa3.d("loadAd must be called on the main UI thread.");
        }
        if (str == null) {
            zzcgn.zzg("Ad unit ID should not be null for app open ad.");
            this.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexs
                @Override // java.lang.Runnable
                public final void run() {
                    zzexy zzexyVar = this.zza;
                    zzexyVar.getClass();
                    zzexyVar.d.zza(zzfem.zzd(6, null, null));
                }
            });
            return false;
        }
        if (this.j != null) {
            return false;
        }
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            zzfah zzfahVar = this.e;
            if (zzfahVar.zzd() != null) {
                zzfjc zzfjcVarZzh = ((zzcwi) zzfahVar.zzd()).zzh();
                zzfjcVarZzh.zzh(7);
                zzfjcVarZzh.zzb(zzlVar.zzp);
                zzfjcVar = zzfjcVarZzh;
            } else {
                zzfjcVar = null;
            }
        } else {
            zzfjcVar = null;
        }
        zzfeh.zza(this.a, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue() && zzlVar.zzf) {
            this.c.zzk().zzl(true);
        }
        zzfdl zzfdlVar = this.i;
        zzfdlVar.zzs(str);
        zzfdlVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
        zzfdlVar.zzE(zzlVar);
        zzfdn zzfdnVarZzG = zzfdlVar.zzG();
        zzfir zzfirVarZzb = zzfiq.zzb(this.a, zzfjb.zzf(zzfdnVarZzG), 7, zzlVar);
        yi6 yi6Var = new yi6(0);
        yi6Var.a = zzfdnVarZzG;
        zzfyx zzfyxVarZzc = this.e.zzc(new zzfai(yi6Var, null), new zzfag() { // from class: com.google.android.gms.internal.ads.zzext
            @Override // com.google.android.gms.internal.ads.zzfag
            public final zzdcg zza(zzfaf zzfafVar) {
                return this.zza.b(zzfafVar);
            }
        }, null);
        this.j = zzfyxVarZzc;
        zzfyo.zzr(zzfyxVarZzc, new xi6(this, zzeodVar, zzfjcVar, zzfirVarZzb, yi6Var), this.b);
        return true;
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.i.zzt(zzwVar);
    }
}
