package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzekf implements zzegs {
    public final Context a;
    public final Executor b;
    public final zzduf c;

    public zzekf(Context context, Executor executor, zzduf zzdufVar) {
        this.a = context;
        this.b = executor;
        this.c = zzdufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcs zzfcsVar, final zzegn zzegnVar) {
        zzdub zzdubVarZze = this.c.zze(new zzczr(zzfdeVar, zzfcsVar, zzegnVar.zza), new zzduc(new zzdmn() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzdmn
            public final void zza(boolean z, Context context, zzddl zzddlVar) throws zzdmm {
                zzegn zzegnVar2 = zzegnVar;
                try {
                    ((zzfei) zzegnVar2.zzb).zzu(z);
                    ((zzfei) zzegnVar2.zzb).zzx(context);
                } catch (zzfds e) {
                    throw new zzdmm(e.getCause());
                }
            }
        }));
        zzdubVarZze.zzd().zzj(new zzcuo((zzfei) zzegnVar.zzb), this.b);
        ((zzeig) zzegnVar.zzc).zzc(zzdubVarZze.zzm());
        return zzdubVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final void zzb(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) {
        try {
            zzfdn zzfdnVar = zzfdeVar.zza.zza;
            int i = zzfdnVar.zzo.zza;
            Context context = this.a;
            if (i == 3) {
                ((zzfei) zzegnVar.zzb).zzq(context, zzfdnVar.zzd, zzfcsVar.zzw.toString(), (zzbvl) zzegnVar.zzc);
            } else {
                ((zzfei) zzegnVar.zzb).zzp(context, zzfdnVar.zzd, zzfcsVar.zzw.toString(), (zzbvl) zzegnVar.zzc);
            }
        } catch (Exception e) {
            zzcgn.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzegnVar.zza)), e);
        }
    }
}
