package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehp implements zzegs {
    public final Context a;
    public final zzcxx b;
    public final Executor c;

    public zzehp(Context context, zzcxx zzcxxVar, Executor executor) {
        this.a = context;
        this.b = zzcxxVar;
        this.c = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, final zzfcs zzfcsVar, zzegn zzegnVar) throws zzfds {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgF)).booleanValue() && zzfcsVar.zzai) {
            zzbvo zzbvoVarZzc = ((zzfei) zzegnVar.zzb).zzc();
            if (zzbvoVarZzc == null) {
                zzcgn.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfds(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.M0(zzbvoVarZzc.zze());
                boolean zZzf = zzbvoVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfds(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzfyo.zzn(zzfyo.zzi(null), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzeho
                            @Override // com.google.android.gms.internal.ads.zzfxv
                            public final zzfyx zza(Object obj) {
                                zzehp zzehpVar = this.zza;
                                return zzfyo.zzi(zzcyo.zza(zzehpVar.a, viewZza, zzfcsVar));
                            }
                        }, zzcha.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfds(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfds(e2);
            }
        } else {
            viewZza = ((zzfei) zzegnVar.zzb).zza();
        }
        zzczr zzczrVar = new zzczr(zzfdeVar, zzfcsVar, zzegnVar.zza);
        final zzfei zzfeiVar = (zzfei) zzegnVar.zzb;
        zzcxb zzcxbVarZza = this.b.zza(zzczrVar, new zzcxh(viewZza, null, new zzcza() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // com.google.android.gms.internal.ads.zzcza
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return zzfeiVar.zzb();
            }
        }, (zzfct) zzfcsVar.zzv.get(0)));
        zzcxbVarZza.zzg().zza(viewZza);
        zzcxbVarZza.zzd().zzj(new zzcuo((zzfei) zzegnVar.zzb), this.c);
        ((zzeig) zzegnVar.zzc).zzc(zzcxbVarZza.zzi());
        return zzcxbVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final void zzb(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) throws zzfds {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzfdeVar.zza.zza.zze;
        boolean z = zzqVar2.zzn;
        Context context = this.a;
        if (z) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgF)).booleanValue() && zzfcsVar.zzai) ? new com.google.android.gms.ads.internal.client.zzq(context, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzfdr.zza(context, zzfcsVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgF)).booleanValue() && zzfcsVar.zzai) {
            ((zzfei) zzegnVar.zzb).zzm(this.a, zzqVar3, zzfdeVar.zza.zza.zzd, zzfcsVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfcsVar.zzt), (zzbvl) zzegnVar.zzc);
        } else {
            ((zzfei) zzegnVar.zzb).zzl(this.a, zzqVar3, zzfdeVar.zza.zza.zzd, zzfcsVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfcsVar.zzt), (zzbvl) zzegnVar.zzc);
        }
    }
}
