package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.fh6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegx implements zzegk {
    public final zzcwo a;
    public final Context b;
    public final zzduw c;
    public final zzfdn d;
    public final Executor e;
    public final zzcgt f;
    public final zzbpt g;
    public final boolean h = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhy)).booleanValue();

    public zzegx(zzcwo zzcwoVar, Context context, Executor executor, zzduw zzduwVar, zzfdn zzfdnVar, zzcgt zzcgtVar, zzbpt zzbptVar) {
        this.b = context;
        this.a = zzcwoVar;
        this.e = executor;
        this.c = zzduwVar;
        this.d = zzfdnVar;
        this.f = zzcgtVar;
        this.g = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar) {
        final zzdva zzdvaVar = new zzdva();
        zzfyx zzfyxVarZzi = zzfyo.zzi(null);
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzegv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                final zzegx zzegxVar = this.zza;
                final zzfcs zzfcsVar2 = zzfcsVar;
                zzfde zzfdeVar2 = zzfdeVar;
                zzdva zzdvaVar2 = zzdvaVar;
                final zzcmn zzcmnVarZza = zzegxVar.c.zza(zzegxVar.d.zze, zzfcsVar2, zzfdeVar2.zzb.zzb);
                zzcmnVarZza.zzab(zzfcsVar2.zzX);
                zzdvaVar2.zza(zzegxVar.b, (View) zzcmnVarZza);
                zzchf zzchfVar = new zzchf();
                final zzcwl zzcwlVarZza = zzegxVar.a.zza(new zzczr(zzfdeVar2, zzfcsVar2, null), new zzdli(new fh6(zzegxVar.f, zzchfVar, zzfcsVar2, zzcmnVarZza, zzegxVar.d, zzegxVar.h, zzegxVar.g), zzcmnVarZza), new zzcwm(zzfcsVar2.zzab));
                zzcwlVarZza.zzj().zzi(zzcmnVarZza, false, zzegxVar.h ? zzegxVar.g : null);
                zzchfVar.zzd(zzcwlVarZza);
                zzcwlVarZza.zzc().zzj(new zzdds() { // from class: com.google.android.gms.internal.ads.zzegt
                    @Override // com.google.android.gms.internal.ads.zzdds
                    public final void zzl() {
                        zzcmn zzcmnVar = zzcmnVarZza;
                        if (zzcmnVar.zzP() != null) {
                            zzcmnVar.zzP().zzp();
                        }
                    }
                }, zzcha.zzf);
                zzcwlVarZza.zzj();
                zzfcx zzfcxVar = zzfcsVar2.zzt;
                return zzfyo.zzm(zzduv.zzj(zzcmnVarZza, zzfcxVar.zzb, zzfcxVar.zza), new zzfru() { // from class: com.google.android.gms.internal.ads.zzegu
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj2) {
                        zzcmn zzcmnVar = zzcmnVarZza;
                        zzfcs zzfcsVar3 = zzfcsVar2;
                        zzcwl zzcwlVar = zzcwlVarZza;
                        if (zzfcsVar3.zzN) {
                            zzcmnVar.zzag();
                        }
                        zzcmnVar.zzaa();
                        zzcmnVar.onPause();
                        return zzcwlVar.zza();
                    }
                }, zzegxVar.e);
            }
        };
        Executor executor = this.e;
        zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyxVarZzi, zzfxvVar, executor);
        zzfyxVarZzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegw
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
