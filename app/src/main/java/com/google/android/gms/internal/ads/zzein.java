package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.jh6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzein implements zzegk {
    public final Context a;
    public final zzduw b;
    public final zzdmf c;
    public final zzfdn d;
    public final Executor e;
    public final zzcgt f;
    public final zzbpt g;
    public final boolean h = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhy)).booleanValue();

    public zzein(Context context, zzcgt zzcgtVar, zzfdn zzfdnVar, Executor executor, zzdmf zzdmfVar, zzduw zzduwVar, zzbpt zzbptVar) {
        this.a = context;
        this.d = zzfdnVar;
        this.c = zzdmfVar;
        this.e = executor;
        this.f = zzcgtVar;
        this.b = zzduwVar;
        this.g = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar) {
        final zzdva zzdvaVar = new zzdva();
        zzfyx zzfyxVarZzi = zzfyo.zzi(null);
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzeii
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                final zzein zzeinVar = this.zza;
                final zzfcs zzfcsVar2 = zzfcsVar;
                zzfde zzfdeVar2 = zzfdeVar;
                zzdva zzdvaVar2 = zzdvaVar;
                final zzcmn zzcmnVarZza = zzeinVar.b.zza(zzeinVar.d.zze, zzfcsVar2, zzfdeVar2.zzb.zzb);
                zzcmnVarZza.zzab(zzfcsVar2.zzX);
                zzdvaVar2.zza(zzeinVar.a, (View) zzcmnVarZza);
                zzchf zzchfVar = new zzchf();
                final zzdlf zzdlfVarZze = zzeinVar.c.zze(new zzczr(zzfdeVar2, zzfcsVar2, null), new zzdli(new jh6(zzeinVar.a, zzeinVar.f, zzchfVar, zzfcsVar2, zzcmnVarZza, zzeinVar.d, zzeinVar.h, zzeinVar.g), zzcmnVarZza));
                zzchfVar.zzd(zzdlfVarZze);
                zzdlfVarZze.zzc().zzj(new zzdds() { // from class: com.google.android.gms.internal.ads.zzeik
                    @Override // com.google.android.gms.internal.ads.zzdds
                    public final void zzl() {
                        zzcmn zzcmnVar = zzcmnVarZza;
                        if (zzcmnVar.zzP() != null) {
                            zzcmnVar.zzP().zzp();
                        }
                    }
                }, zzcha.zzf);
                zzdlfVarZze.zzk().zzi(zzcmnVarZza, true, zzeinVar.h ? zzeinVar.g : null);
                zzdlfVarZze.zzk();
                zzfcx zzfcxVar = zzfcsVar2.zzt;
                return zzfyo.zzm(zzduv.zzj(zzcmnVarZza, zzfcxVar.zzb, zzfcxVar.zza), new zzfru() { // from class: com.google.android.gms.internal.ads.zzeil
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj2) {
                        zzcmn zzcmnVar = zzcmnVarZza;
                        zzfcs zzfcsVar3 = zzfcsVar2;
                        zzdlf zzdlfVar = zzdlfVarZze;
                        if (zzfcsVar3.zzN) {
                            zzcmnVar.zzag();
                        }
                        zzcmnVar.zzaa();
                        zzcmnVar.onPause();
                        return zzdlfVar.zzg();
                    }
                }, zzeinVar.e);
            }
        };
        Executor executor = this.e;
        zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyxVarZzi, zzfxvVar, executor);
        zzfyxVarZzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeij
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
