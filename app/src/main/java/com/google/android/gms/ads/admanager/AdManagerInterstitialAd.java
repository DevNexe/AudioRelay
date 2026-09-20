package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgc;
import defpackage.oa3;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        if (adManagerAdRequest == null) {
            throw new NullPointerException("AdManagerAdRequest cannot be null.");
        }
        if (adManagerInterstitialAdLoadCallback == null) {
            throw new NullPointerException("LoadCallback cannot be null.");
        }
        oa3.d("#008 Must be called on the main UI thread.");
        zzbiy.zzc(context);
        if (((Boolean) zzbkm.zzi.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbsh(context2, str2).zza(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzcad.zza(context2).zzd(e, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbsh(context, str).zza(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
