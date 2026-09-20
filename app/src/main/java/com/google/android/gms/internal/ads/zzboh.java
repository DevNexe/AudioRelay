package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.y46;

/* JADX INFO: loaded from: classes3.dex */
public final class zzboh extends zzbnk {
    public final OnAdManagerAdViewLoadedListener w;

    public zzboh(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.w = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zze(zzbs zzbsVar, IObjectWrapper iObjectWrapper) {
        if (zzbsVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.M0(iObjectWrapper));
        try {
            if (zzbsVar.zzi() instanceof zzg) {
                zzg zzgVar = (zzg) zzbsVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
        try {
            if (zzbsVar.zzj() instanceof zzbca) {
                zzbca zzbcaVar = (zzbca) zzbsVar.zzj();
                adManagerAdView.setAppEventListener(zzbcaVar != null ? zzbcaVar.zzb() : null);
            }
        } catch (RemoteException e2) {
            zzcgn.zzh("", e2);
        }
        zzcgg.zza.post(new y46(this, adManagerAdView, zzbsVar));
    }
}
