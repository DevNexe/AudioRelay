package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehd implements zzegk {
    public final zzcwd a;
    public final Context b;
    public final zzduw c;
    public final Executor d;

    public zzehd(zzcwd zzcwdVar, Context context, Executor executor, zzduw zzduwVar) {
        this.b = context;
        this.a = zzcwdVar;
        this.d = executor;
        this.c = zzduwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar) {
        return zzfyo.zzn(zzfyo.zzi(null), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzeha
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzehd zzehdVar = this.zza;
                zzfde zzfdeVar2 = zzfdeVar;
                zzfcs zzfcsVar2 = zzfcsVar;
                zzehdVar.getClass();
                com.google.android.gms.ads.internal.client.zzq zzqVarZza = zzfdr.zza(zzehdVar.b, zzfcsVar2.zzv);
                final zzcmn zzcmnVarZza = zzehdVar.c.zza(zzqVarZza, zzfcsVar2, zzfdeVar2.zzb.zzb);
                final zzcvv zzcvvVarZza = zzehdVar.a.zza(new zzczr(zzfdeVar2, zzfcsVar2, null), new zzcvw((View) zzcmnVarZza, zzcmnVarZza, zzfdr.zzc(zzqVarZza), zzfcsVar2.zzab, zzfcsVar2.zzaf, zzfcsVar2.zzP));
                zzcvvVarZza.zzg().zzi(zzcmnVarZza, false, null);
                zzddq zzddqVarZzc = zzcvvVarZza.zzc();
                zzdds zzddsVar = new zzdds() { // from class: com.google.android.gms.internal.ads.zzehb
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
                zzcvvVarZza.zzg();
                zzfcx zzfcxVar = zzfcsVar2.zzt;
                return zzfyo.zzm(zzduv.zzj(zzcmnVarZza, zzfcxVar.zzb, zzfcxVar.zza), new zzfru() { // from class: com.google.android.gms.internal.ads.zzehc
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj2) {
                        return zzcvvVarZza.zza();
                    }
                }, zzfyyVar);
            }
        }, this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        zzfcx zzfcxVar = zzfcsVar.zzt;
        return (zzfcxVar == null || zzfcxVar.zza == null) ? false : true;
    }
}
