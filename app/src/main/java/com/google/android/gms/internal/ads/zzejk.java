package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejk implements zzegs {
    public final Context a;
    public final zzdnb b;
    public zzbvu c;
    public final zzcgt d;

    public zzejk(Context context, zzdnb zzdnbVar, zzcgt zzcgtVar) {
        this.a = context;
        this.b = zzdnbVar;
        this.d = zzcgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) throws zzeka {
        if (!zzfdeVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzeka(2, "Unified must be used for RTB.");
        }
        zzdoo zzdooVarZzs = zzdoo.zzs(this.c);
        if (!zzfdeVar.zza.zza.zzg.contains(Integer.toString(zzdooVarZzs.zzc()))) {
            throw new zzeka(1, "No corresponding native ad listener");
        }
        zzdoq zzdoqVarZze = this.b.zze(new zzczr(zzfdeVar, zzfcsVar, zzegnVar.zza), new zzdpa(zzdooVarZzs), new zzdqo(null, null, this.c, null));
        ((zzeig) zzegnVar.zzc).zzc(zzdoqVarZze.zzh());
        return zzdoqVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final void zzb(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) throws zzfds {
        try {
            ((zzbwy) zzegnVar.zzb).zzp(zzfcsVar.zzaa);
            int i = this.d.zzc;
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbt)).intValue();
            Context context = this.a;
            if (i < iIntValue) {
                ((zzbwy) zzegnVar.zzb).zzl(zzfcsVar.zzV, zzfcsVar.zzw.toString(), zzfdeVar.zza.zza.zzd, new ObjectWrapper(context), new zzejj(this, zzegnVar), (zzbvl) zzegnVar.zzc);
            } else {
                ((zzbwy) zzegnVar.zzb).zzm(zzfcsVar.zzV, zzfcsVar.zzw.toString(), zzfdeVar.zza.zza.zzd, new ObjectWrapper(context), new zzejj(this, zzegnVar), (zzbvl) zzegnVar.zzc, zzfdeVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfds(e);
        }
    }
}
