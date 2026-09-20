package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.uj6;
import defpackage.vj6;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfcf implements zzeoe {
    public final Context a;
    public final Executor b;
    public final zzcok c;
    public final zzfbv d;
    public final zzfah e;
    public final zzfdf f;
    public final zzfje g;

    @GuardedBy("this")
    public final zzfdl h;

    @GuardedBy("this")
    public zzfyx i;

    public zzfcf(Context context, Executor executor, zzcok zzcokVar, zzfah zzfahVar, zzfbv zzfbvVar, zzfdl zzfdlVar, zzfdf zzfdfVar) {
        this.a = context;
        this.b = executor;
        this.c = zzcokVar;
        this.e = zzfahVar;
        this.d = zzfbvVar;
        this.h = zzfdlVar;
        this.f = zzfdfVar;
        this.g = zzcokVar.zzy();
    }

    public final zzdue a(zzfaf zzfafVar) {
        zzdue zzdueVarZzi = this.c.zzi();
        zzdci zzdciVar = new zzdci();
        zzdciVar.zzc(this.a);
        zzdciVar.zzf(((vj6) zzfafVar).a);
        zzdciVar.zze(this.f);
        zzdueVarZzi.zzd(zzdciVar.zzg());
        zzdueVarZzi.zzc(new zzdii().zzn());
        return zzdueVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeoe
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeoe
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoc zzeocVar, zzeod zzeodVar) {
        zzfjc zzfjcVar;
        zzcbx zzcbxVar = new zzcbx(zzlVar, str);
        String str2 = zzcbxVar.zzb;
        Executor executor = this.b;
        if (str2 == null) {
            zzcgn.zzg("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfby
                @Override // java.lang.Runnable
                public final void run() {
                    zzfcf zzfcfVar = this.zza;
                    zzfcfVar.getClass();
                    zzfcfVar.d.zza(zzfem.zzd(6, null, null));
                }
            });
            return false;
        }
        zzfyx zzfyxVar = this.i;
        if (zzfyxVar != null && !zzfyxVar.isDone()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) zzbkh.zzc.zze()).booleanValue();
        zzfah zzfahVar = this.e;
        if (!zBooleanValue || zzfahVar.zzd() == null) {
            zzfjcVar = null;
        } else {
            zzfjc zzfjcVarZzh = ((zzduf) zzfahVar.zzd()).zzh();
            zzfjcVarZzh.zzh(5);
            zzfjcVarZzh.zzb(zzcbxVar.zza.zzp);
            zzfjcVar = zzfjcVarZzh;
        }
        boolean z = zzcbxVar.zza.zzf;
        Context context = this.a;
        zzfeh.zza(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue() && zzcbxVar.zza.zzf) {
            this.c.zzk().zzl(true);
        }
        String str3 = zzcbxVar.zzb;
        zzfdl zzfdlVar = this.h;
        zzfdlVar.zzs(str3);
        zzfdlVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
        zzfdlVar.zzE(zzcbxVar.zza);
        zzfdn zzfdnVarZzG = zzfdlVar.zzG();
        zzfir zzfirVarZzb = zzfiq.zzb(context, zzfjb.zzf(zzfdnVarZzG), 5, zzcbxVar.zza);
        vj6 vj6Var = new vj6(0);
        vj6Var.a = zzfdnVarZzG;
        zzfyx zzfyxVarZzc = zzfahVar.zzc(new zzfai(vj6Var, null), new zzfag() { // from class: com.google.android.gms.internal.ads.zzfbz
            @Override // com.google.android.gms.internal.ads.zzfag
            public final zzdcg zza(zzfaf zzfafVar) {
                return this.zza.a(zzfafVar);
            }
        }, null);
        this.i = zzfyxVarZzc;
        zzfyo.zzr(zzfyxVarZzc, new uj6(this, zzeodVar, zzfjcVar, zzfirVarZzb, vj6Var), executor);
        return true;
    }
}
