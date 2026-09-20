package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeir implements zzegs {
    public final Context a;
    public final zzdmf b;
    public final zzcgt c;
    public final Executor d;

    public zzeir(Context context, zzcgt zzcgtVar, zzdmf zzdmfVar, Executor executor) {
        this.a = context;
        this.c = zzcgtVar;
        this.b = zzdmfVar;
        this.d = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcs zzfcsVar, final zzegn zzegnVar) {
        zzdlf zzdlfVarZze = this.b.zze(new zzczr(zzfdeVar, zzfcsVar, zzegnVar.zza), new zzdli(new zzdmn() { // from class: com.google.android.gms.internal.ads.zzeiq
            @Override // com.google.android.gms.internal.ads.zzdmn
            public final void zza(boolean z, Context context, zzddl zzddlVar) throws zzdmm {
                zzeir zzeirVar = this.zza;
                zzegn zzegnVar2 = zzegnVar;
                zzeirVar.getClass();
                try {
                    ((zzfei) zzegnVar2.zzb).zzu(z);
                    if (zzeirVar.c.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaB)).intValue()) {
                        ((zzfei) zzegnVar2.zzb).zzv();
                    } else {
                        ((zzfei) zzegnVar2.zzb).zzw(context);
                    }
                } catch (zzfds e) {
                    zzcgn.zzi("Cannot show interstitial.");
                    throw new zzdmm(e.getCause());
                }
            }
        }, null));
        zzdlfVarZze.zzd().zzj(new zzcuo((zzfei) zzegnVar.zzb), this.d);
        ((zzeig) zzegnVar.zzc).zzc(zzdlfVarZze.zzi());
        return zzdlfVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final void zzb(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) throws zzfds {
        ((zzfei) zzegnVar.zzb).zzn(this.a, zzfdeVar.zza.zza.zzd, zzfcsVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfcsVar.zzt), (zzbvl) zzegnVar.zzc);
    }
}
