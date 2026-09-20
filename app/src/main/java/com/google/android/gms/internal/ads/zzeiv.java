package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.kh6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeiv implements zzegs {
    public final Context a;
    public final zzdmf b;

    public zzeiv(Context context, zzdmf zzdmfVar) {
        this.a = context;
        this.b = zzdmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final Object zza(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) {
        kh6 kh6Var = new kh6(zzfcsVar, (zzbwy) zzegnVar.zzb, false);
        zzdlf zzdlfVarZze = this.b.zze(new zzczr(zzfdeVar, zzfcsVar, zzegnVar.zza), new zzdli(kh6Var, null));
        kh6Var.d = zzdlfVarZze.zzc();
        ((zzeig) zzegnVar.zzc).zzc(zzdlfVarZze.zzh());
        return zzdlfVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final void zzb(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) throws zzfds {
        try {
            ((zzbwy) zzegnVar.zzb).zzp(zzfcsVar.zzaa);
            ((zzbwy) zzegnVar.zzb).zzk(zzfcsVar.zzV, zzfcsVar.zzw.toString(), zzfdeVar.zza.zza.zzd, new ObjectWrapper(this.a), new zzeiu(zzegnVar), (zzbvl) zzegnVar.zzc);
        } catch (RemoteException e) {
            throw new zzfds(e);
        }
    }
}
