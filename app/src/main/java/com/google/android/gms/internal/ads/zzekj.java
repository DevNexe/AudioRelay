package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.kh6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzekj implements zzegs {
    public final Context a;
    public final zzduf b;

    public zzekj(Context context, zzduf zzdufVar) {
        this.a = context;
        this.b = zzdufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final Object zza(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) {
        kh6 kh6Var = new kh6(zzfcsVar, (zzbwy) zzegnVar.zzb, true);
        zzdub zzdubVarZze = this.b.zze(new zzczr(zzfdeVar, zzfcsVar, zzegnVar.zza), new zzduc(kh6Var));
        kh6Var.d = zzdubVarZze.zzc();
        ((zzeig) zzegnVar.zzc).zzc(zzdubVarZze.zzn());
        return zzdubVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final void zzb(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) {
        try {
            ((zzbwy) zzegnVar.zzb).zzp(zzfcsVar.zzaa);
            int i = zzfdeVar.zza.zza.zzo.zza;
            Context context = this.a;
            if (i == 3) {
                ((zzbwy) zzegnVar.zzb).zzn(zzfcsVar.zzV, zzfcsVar.zzw.toString(), zzfdeVar.zza.zza.zzd, new ObjectWrapper(context), new zzeki(zzegnVar), (zzbvl) zzegnVar.zzc);
            } else {
                ((zzbwy) zzegnVar.zzb).zzo(zzfcsVar.zzV, zzfcsVar.zzw.toString(), zzfdeVar.zza.zza.zzd, new ObjectWrapper(context), new zzeki(zzegnVar), (zzbvl) zzegnVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
