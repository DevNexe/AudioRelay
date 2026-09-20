package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehl implements zzegk {
    public final zzcxx a;
    public final Context b;
    public final zzduw c;
    public final zzfdn d;
    public final Executor e;
    public final zzfru f;

    public zzehl(zzcxx zzcxxVar, Context context, Executor executor, zzduw zzduwVar, zzfdn zzfdnVar, zzfru zzfruVar) {
        this.b = context;
        this.a = zzcxxVar;
        this.e = executor;
        this.c = zzduwVar;
        this.d = zzfdnVar;
        this.f = zzfruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar) {
        return zzfyo.zzn(zzfyo.zzi(null), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzehf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                View zzduzVar;
                final zzehl zzehlVar = this.zza;
                zzfde zzfdeVar2 = zzfdeVar;
                zzfcs zzfcsVar2 = zzfcsVar;
                zzehlVar.getClass();
                List list = zzfcsVar2.zzv;
                Context context = zzehlVar.b;
                com.google.android.gms.ads.internal.client.zzq zzqVarZza = zzfdr.zza(context, list);
                final zzcmn zzcmnVarZza = zzehlVar.c.zza(zzqVarZza, zzfcsVar2, zzfdeVar2.zzb.zzb);
                zzcmnVarZza.zzab(zzfcsVar2.zzX);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgF)).booleanValue() && zzfcsVar2.zzai) {
                    zzduzVar = zzcyo.zza(context, (View) zzcmnVarZza, zzfcsVar2);
                } else {
                    zzduzVar = new zzduz(context, (View) zzcmnVarZza, (com.google.android.gms.ads.internal.util.zzas) zzehlVar.f.apply(zzfcsVar2));
                }
                final zzcxb zzcxbVarZza = zzehlVar.a.zza(new zzczr(zzfdeVar2, zzfcsVar2, null), new zzcxh(zzduzVar, zzcmnVarZza, new zzcza() { // from class: com.google.android.gms.internal.ads.zzehg
                    @Override // com.google.android.gms.internal.ads.zzcza
                    public final com.google.android.gms.ads.internal.client.zzdk zza() {
                        return zzcmnVarZza.zzs();
                    }
                }, zzfdr.zzc(zzqVarZza)));
                zzcxbVarZza.zzj().zzi(zzcmnVarZza, false, null);
                zzddq zzddqVarZzc = zzcxbVarZza.zzc();
                zzdds zzddsVar = new zzdds() { // from class: com.google.android.gms.internal.ads.zzehh
                    @Override // com.google.android.gms.internal.ads.zzdds
                    public final void zzl() {
                        zzcmn zzcmnVar = zzcmnVarZza;
                        if (zzcmnVar.zzP() != null) {
                            zzcmnVar.zzP().zzp();
                        }
                    }
                };
                zzfyy zzfyyVar = zzcha.zzf;
                zzddqVarZzc.zzj(zzddsVar, zzfyyVar);
                zzcxbVarZza.zzj();
                zzfcx zzfcxVar = zzfcsVar2.zzt;
                zzfyx zzfyxVarZzj = zzduv.zzj(zzcmnVarZza, zzfcxVar.zzb, zzfcxVar.zza);
                boolean z = zzfcsVar2.zzN;
                Executor executor = zzehlVar.e;
                if (z) {
                    zzfyxVarZzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcmnVarZza.zzag();
                        }
                    }, executor);
                }
                zzfyxVarZzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzehl zzehlVar2 = zzehlVar;
                        zzcmn zzcmnVar = zzcmnVarZza;
                        zzehlVar2.getClass();
                        zzcmnVar.zzaa();
                        zzcnj zzcnjVarZzs = zzcmnVar.zzs();
                        com.google.android.gms.ads.internal.client.zzff zzffVar = zzehlVar2.d.zza;
                        if (zzffVar == null || zzcnjVarZzs == null) {
                            return;
                        }
                        zzcnjVarZzs.zzs(zzffVar);
                    }
                }, executor);
                return zzfyo.zzm(zzfyxVarZzj, new zzfru() { // from class: com.google.android.gms.internal.ads.zzehk
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj2) {
                        return zzcxbVarZza.zza();
                    }
                }, zzfyyVar);
            }
        }, this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        zzfcx zzfcxVar = zzfcsVar.zzt;
        return (zzfcxVar == null || zzfcxVar.zza == null) ? false : true;
    }
}
