package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehv implements zzegs {
    public final Context a;
    public final zzcxx b;
    public View c;
    public zzbvo d;

    public zzehv(Context context, zzcxx zzcxxVar) {
        this.a = context;
        this.b = zzcxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, final zzfcs zzfcsVar, final zzegn zzegnVar) throws zzfds {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgF)).booleanValue() && zzfcsVar.zzai) {
            try {
                view = (View) ObjectWrapper.M0(this.d.zze());
                boolean zZzf = this.d.zzf();
                if (view == null) {
                    throw new zzfds(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzfyo.zzn(zzfyo.zzi(null), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzehr
                            @Override // com.google.android.gms.internal.ads.zzfxv
                            public final zzfyx zza(Object obj) {
                                zzehv zzehvVar = this.zza;
                                return zzfyo.zzi(zzcyo.zza(zzehvVar.a, view, zzfcsVar));
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
            view = this.c;
        }
        zzcxb zzcxbVarZza = this.b.zza(new zzczr(zzfdeVar, zzfcsVar, zzegnVar.zza), new zzcxh(view, null, new zzcza() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzcza
            public final com.google.android.gms.ads.internal.client.zzdk zza() throws zzfds {
                try {
                    return ((zzbwy) zzegnVar.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfds(e3);
                }
            }
        }, (zzfct) zzfcsVar.zzv.get(0)));
        zzcxbVarZza.zzg().zza(view);
        ((zzeig) zzegnVar.zzc).zzc(zzcxbVarZza.zzh());
        return zzcxbVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    public final void zzb(zzfde zzfdeVar, zzfcs zzfcsVar, zzegn zzegnVar) throws zzfds {
        try {
            ((zzbwy) zzegnVar.zzb).zzp(zzfcsVar.zzaa);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgF)).booleanValue();
            Context context = this.a;
            if (zBooleanValue && zzfcsVar.zzai) {
                ((zzbwy) zzegnVar.zzb).zzj(zzfcsVar.zzV, zzfcsVar.zzw.toString(), zzfdeVar.zza.zza.zzd, new ObjectWrapper(context), new zzehu(this, zzegnVar), (zzbvl) zzegnVar.zzc, zzfdeVar.zza.zza.zze);
            } else {
                ((zzbwy) zzegnVar.zzb).zzi(zzfcsVar.zzV, zzfcsVar.zzw.toString(), zzfdeVar.zza.zza.zzd, new ObjectWrapper(context), new zzehu(this, zzegnVar), (zzbvl) zzegnVar.zzc, zzfdeVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfds(e);
        }
    }
}
