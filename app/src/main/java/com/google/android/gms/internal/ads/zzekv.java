package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.ph6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzekv implements zzegk {
    public final Context a;
    public final zzduw b;
    public final zzduf c;
    public final zzfdn d;
    public final Executor e;
    public final zzcgt f;
    public final zzbpt g;
    public final boolean h = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhy)).booleanValue();

    public zzekv(Context context, zzcgt zzcgtVar, zzfdn zzfdnVar, Executor executor, zzduf zzdufVar, zzduw zzduwVar, zzbpt zzbptVar) {
        this.a = context;
        this.d = zzfdnVar;
        this.c = zzdufVar;
        this.e = executor;
        this.f = zzcgtVar;
        this.b = zzduwVar;
        this.g = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar) {
        final zzdva zzdvaVar = new zzdva();
        zzfyx zzfyxVarZzi = zzfyo.zzi(null);
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzeko
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                final zzekv zzekvVar = this.zza;
                final zzfcs zzfcsVar2 = zzfcsVar;
                zzfde zzfdeVar2 = zzfdeVar;
                zzdva zzdvaVar2 = zzdvaVar;
                final zzcmn zzcmnVarZza = zzekvVar.b.zza(zzekvVar.d.zze, zzfcsVar2, zzfdeVar2.zzb.zzb);
                zzcmnVarZza.zzab(zzfcsVar2.zzX);
                zzdvaVar2.zza(zzekvVar.a, (View) zzcmnVarZza);
                zzchf zzchfVar = new zzchf();
                final zzdub zzdubVarZze = zzekvVar.c.zze(new zzczr(zzfdeVar2, zzfcsVar2, null), new zzduc(new ph6(zzekvVar.a, zzekvVar.b, zzekvVar.d, zzekvVar.f, zzfcsVar2, zzchfVar, zzcmnVarZza, zzekvVar.g, zzekvVar.h), zzcmnVarZza));
                zzchfVar.zzd(zzdubVarZze);
                zzbqg.zzb(zzcmnVarZza, zzdubVarZze.zzg());
                zzdubVarZze.zzc().zzj(new zzdds() { // from class: com.google.android.gms.internal.ads.zzekq
                    @Override // com.google.android.gms.internal.ads.zzdds
                    public final void zzl() {
                        zzcmn zzcmnVar = zzcmnVarZza;
                        if (zzcmnVar.zzP() != null) {
                            zzcmnVar.zzP().zzp();
                        }
                    }
                }, zzcha.zzf);
                zzdubVarZze.zzl().zzi(zzcmnVarZza, true, zzekvVar.h ? zzekvVar.g : null);
                zzdubVarZze.zzl();
                zzfcx zzfcxVar = zzfcsVar2.zzt;
                return zzfyo.zzm(zzduv.zzj(zzcmnVarZza, zzfcxVar.zzb, zzfcxVar.zza), new zzfru() { // from class: com.google.android.gms.internal.ads.zzekr
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj2) {
                        zzcmn zzcmnVar = zzcmnVarZza;
                        zzfcs zzfcsVar3 = zzfcsVar2;
                        zzdub zzdubVar = zzdubVarZze;
                        if (zzfcsVar3.zzN) {
                            zzcmnVar.zzag();
                        }
                        zzcmnVar.zzaa();
                        zzcmnVar.onPause();
                        return zzdubVar.zzk();
                    }
                }, zzekvVar.e);
            }
        };
        Executor executor = this.e;
        zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyxVarZzi, zzfxvVar, executor);
        zzfyxVarZzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // java.lang.Runnable
            public final void run() {
                zzdvaVar.zzb();
            }
        }, executor);
        return zzfyxVarZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        zzfcx zzfcxVar = zzfcsVar.zzt;
        return (zzfcxVar == null || zzfcxVar.zza == null) ? false : true;
    }
}
