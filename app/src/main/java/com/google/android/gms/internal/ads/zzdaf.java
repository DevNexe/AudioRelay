package com.google.android.gms.internal.ads;

import defpackage.od6;
import defpackage.pd6;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdaf {
    public final zzeca a;
    public final zzfdn b;
    public final zzfhp c;
    public final zzcts d;
    public final zzekc e;
    public final zzdic f;
    public zzfde g;
    public final zzede h;
    public final zzdce i;
    public final Executor j;
    public final zzecr k;
    public final zzegp l;

    public zzdaf(zzeca zzecaVar, zzfdn zzfdnVar, zzfhp zzfhpVar, zzcts zzctsVar, zzekc zzekcVar, zzdic zzdicVar, zzfde zzfdeVar, zzede zzedeVar, zzdce zzdceVar, zzfyy zzfyyVar, zzecr zzecrVar, zzegp zzegpVar) {
        this.a = zzecaVar;
        this.b = zzfdnVar;
        this.c = zzfhpVar;
        this.d = zzctsVar;
        this.e = zzekcVar;
        this.f = zzdicVar;
        this.g = zzfdeVar;
        this.h = zzedeVar;
        this.i = zzdceVar;
        this.j = zzfyyVar;
        this.k = zzecrVar;
        this.l = zzegpVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfem.zzb(th, this.l);
    }

    public final zzdic zzc() {
        return this.f;
    }

    public final zzfyx zze(final zzfff zzfffVar) {
        zzfgu zzfguVarZza = this.c.zzb(zzfhj.GET_CACHE_KEY, this.i.zzc()).zzf(new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdac
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzdaf zzdafVar = this.zza;
                zzfff zzfffVar2 = zzfffVar;
                zzcba zzcbaVar = (zzcba) obj;
                zzdafVar.getClass();
                zzcbaVar.zzi = zzfffVar2;
                return zzdafVar.h.zza(zzcbaVar);
            }
        }).zza();
        zzfyo.zzr(zzfguVarZza, new od6(this, 0), this.j);
        return zzfguVarZza;
    }

    public final zzfyx zzg(zzcba zzcbaVar) {
        zzfgu zzfguVarZza = this.c.zzb(zzfhj.NOTIFY_CACHE_HIT, this.h.zzf(zzcbaVar)).zza();
        zzfyo.zzr(zzfguVarZza, new pd6(this, 0), this.j);
        return zzfguVarZza;
    }

    public final zzfyx zzh(zzfyx zzfyxVar) {
        zzfhg zzfhgVarZzf = this.c.zzb(zzfhj.RENDERER, zzfyxVar).zze(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzdab
            @Override // com.google.android.gms.internal.ads.zzfgs
            public final Object zza(Object obj) {
                zzfde zzfdeVar = (zzfde) obj;
                this.zza.d.zza(zzfdeVar);
                return zzfdeVar;
            }
        }).zzf(this.e);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeA)).booleanValue()) {
            zzfhgVarZzf = zzfhgVarZzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeB)).intValue(), TimeUnit.SECONDS);
        }
        return zzfhgVarZzf.zza();
    }

    public final zzfyx zzi() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.b.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzj(this.i.zzc());
        }
        return zzfgz.zzc(this.a.zza(), zzfhj.PRELOADED_LOADER, this.c).zza();
    }

    public final zzfyx zzj(zzfyx zzfyxVar) {
        zzfde zzfdeVar = this.g;
        zzfhp zzfhpVar = this.c;
        if (zzfdeVar != null) {
            return zzfgz.zzc(zzfyo.zzi(zzfdeVar), zzfhj.SERVER_TRANSACTION, zzfhpVar).zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzj();
        zzfhg zzfhgVarZzb = zzfhpVar.zzb(zzfhj.SERVER_TRANSACTION, zzfyxVar);
        final zzecr zzecrVar = this.k;
        return zzfhgVarZzb.zzf(new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdaa
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzecrVar.zzb((zzcba) obj);
            }
        }).zza();
    }

    public final void zzk(zzfde zzfdeVar) {
        this.g = zzfdeVar;
    }
}
