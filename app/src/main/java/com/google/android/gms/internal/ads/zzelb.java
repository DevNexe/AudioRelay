package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.qh6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelb implements zzegs {
    public final Context a;
    public final Executor b;
    public final zzduf c;

    public zzelb(Context context, Executor executor, zzduf zzdufVar) {
        this.a = context;
        this.b = executor;
        this.c = zzdufVar;
    }

    public static final void a(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) {
        try {
            ((zzfei) zzegnVar.zzb).zzk(zzfdeVar.zza.zza.zzd, zzfcsVar.zzw.toString());
        } catch (Exception e) {
            zzcgn.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzegnVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcs zzfcsVar, final zzegn zzegnVar) {
        zzdub zzdubVarZze = this.c.zze(new zzczr(zzfdeVar, zzfcsVar, zzegnVar.zza), new zzduc(new zzdmn() { // from class: com.google.android.gms.internal.ads.zzekx
            @Override // com.google.android.gms.internal.ads.zzdmn
            public final void zza(boolean z, Context context, zzddl zzddlVar) throws zzdmm {
                zzegn zzegnVar2 = zzegnVar;
                try {
                    ((zzfei) zzegnVar2.zzb).zzu(z);
                    ((zzfei) zzegnVar2.zzb).zzy();
                } catch (zzfds e) {
                    zzcgn.zzk("Cannot show rewarded video.", e);
                    throw new zzdmm(e.getCause());
                }
            }
        }));
        zzdubVarZze.zzd().zzj(new zzcuo((zzfei) zzegnVar.zzb), this.b);
        zzdef zzdefVarZze = zzdubVarZze.zze();
        zzdcw zzdcwVarZzb = zzdubVarZze.zzb();
        ((zzeih) zzegnVar.zzc).zzc(new zzela(zzdubVarZze.zza(), zzdcwVarZzb, zzdefVarZze, zzdubVarZze.zzg()));
        return zzdubVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final void zzb(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) throws zzfds {
        if (((zzfei) zzegnVar.zzb).zzA()) {
            a(zzfdeVar, zzfcsVar, zzegnVar);
            return;
        }
        ((zzeih) zzegnVar.zzc).zzd(new qh6(this, zzfdeVar, zzfcsVar, zzegnVar));
        ((zzfei) zzegnVar.zzb).zzh(this.a, zzfdeVar.zza.zza.zzd, null, (zzccb) zzegnVar.zzc, zzfcsVar.zzw.toString());
    }
}
