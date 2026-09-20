package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejg implements zzegs {
    public final Context a;
    public final zzdnb b;
    public final Executor c;

    public zzejg(Context context, zzdnb zzdnbVar, Executor executor) {
        this.a = context;
        this.b = zzdnbVar;
        this.c = executor;
    }

    public static final boolean a(zzfde zzfdeVar, int i) {
        return zzfdeVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) throws zzfds, zzeka {
        zzdoo zzdooVarZzac;
        zzbvq zzbvqVarZzB = ((zzfei) zzegnVar.zzb).zzB();
        zzbvr zzbvrVarZzC = ((zzfei) zzegnVar.zzb).zzC();
        zzbvu zzbvuVarZzd = ((zzfei) zzegnVar.zzb).zzd();
        if (zzbvuVarZzd != null && a(zzfdeVar, 6)) {
            zzdooVarZzac = zzdoo.zzs(zzbvuVarZzd);
        } else if (zzbvqVarZzB != null && a(zzfdeVar, 6)) {
            zzdooVarZzac = zzdoo.zzad(zzbvqVarZzB);
        } else if (zzbvqVarZzB != null && a(zzfdeVar, 2)) {
            zzdooVarZzac = zzdoo.zzab(zzbvqVarZzB);
        } else if (zzbvrVarZzC != null && a(zzfdeVar, 6)) {
            zzdooVarZzac = zzdoo.zzae(zzbvrVarZzC);
        } else {
            if (zzbvrVarZzC == null || !a(zzfdeVar, 1)) {
                throw new zzeka(1, "No native ad mappers");
            }
            zzdooVarZzac = zzdoo.zzac(zzbvrVarZzC);
        }
        if (!zzfdeVar.zza.zza.zzg.contains(Integer.toString(zzdooVarZzac.zzc()))) {
            throw new zzeka(1, "No corresponding native ad listener");
        }
        zzdoq zzdoqVarZze = this.b.zze(new zzczr(zzfdeVar, zzfcsVar, zzegnVar.zza), new zzdpa(zzdooVarZzac), new zzdqo(zzbvrVarZzC, zzbvqVarZzB, zzbvuVarZzd, null));
        ((zzeig) zzegnVar.zzc).zzc(zzdoqVarZze.zzi());
        zzdoqVarZze.zzd().zzj(new zzcuo((zzfei) zzegnVar.zzb), this.c);
        return zzdoqVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final void zzb(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) throws zzfds {
        zzfei zzfeiVar = (zzfei) zzegnVar.zzb;
        Context context = this.a;
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfdeVar.zza.zza.zzd;
        String string = zzfcsVar.zzw.toString();
        String strZzl = com.google.android.gms.ads.internal.util.zzbu.zzl(zzfcsVar.zzt);
        zzbvl zzbvlVar = (zzbvl) zzegnVar.zzc;
        zzfdn zzfdnVar = zzfdeVar.zza.zza;
        zzfeiVar.zzo(context, zzlVar, string, strZzl, zzbvlVar, zzfdnVar.zzi, zzfdnVar.zzg);
    }
}
