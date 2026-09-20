package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsh extends AdManagerInterstitialAd {
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzp b;
    public final zzbs c;
    public final String d;
    public AppEventListener e;
    public FullScreenContentCallback f;
    public OnPaidEventListener g;

    public zzbsh(Context context, String str) {
        zzbvc zzbvcVar = new zzbvc();
        this.a = context;
        this.d = str;
        this.b = com.google.android.gms.ads.internal.client.zzp.zza;
        this.c = com.google.android.gms.ads.internal.client.zzaw.zza().zze(context, new com.google.android.gms.ads.internal.client.zzq(), str, zzbvcVar);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVarZzk = null;
        try {
            zzbs zzbsVar = this.c;
            if (zzbsVar != null) {
                zzdhVarZzk = zzbsVar.zzk();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdhVarZzk);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.e = appEventListener;
            zzbs zzbsVar = this.c;
            if (zzbsVar != null) {
                zzbsVar.zzG(appEventListener != null ? new zzbca(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f = fullScreenContentCallback;
            zzbs zzbsVar = this.c;
            if (zzbsVar != null) {
                zzbsVar.zzJ(new com.google.android.gms.ads.internal.client.zzaz(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbs zzbsVar = this.c;
            if (zzbsVar != null) {
                zzbsVar.zzL(z);
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.g = onPaidEventListener;
            zzbs zzbsVar = this.c;
            if (zzbsVar != null) {
                zzbsVar.zzP(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            zzcgn.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbs zzbsVar = this.c;
            if (zzbsVar != null) {
                zzbsVar.zzW(new ObjectWrapper(activity));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar, AdLoadCallback adLoadCallback) {
        try {
            zzbs zzbsVar = this.c;
            if (zzbsVar != null) {
                zzbsVar.zzy(this.b.zza(this.a, zzdrVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }
}
