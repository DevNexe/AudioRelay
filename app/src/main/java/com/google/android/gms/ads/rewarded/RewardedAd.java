package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzccs;
import com.google.android.gms.internal.ads.zzcgc;
import com.google.android.gms.internal.ads.zzcgn;
import defpackage.oa3;

/* JADX INFO: loaded from: classes.dex */
public abstract class RewardedAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        if (adRequest == null) {
            throw new NullPointerException("AdRequest cannot be null.");
        }
        if (rewardedAdLoadCallback == null) {
            throw new NullPointerException("LoadCallback cannot be null.");
        }
        oa3.d("#008 Must be called on the main UI thread.");
        zzbiy.zzc(context);
        if (((Boolean) zzbkm.zzl.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzccs(context2, str2).zza(adRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzcad.zza(context2).zzd(e, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        zzcgn.zze("Loading on UI thread");
        new zzccs(context, str).zza(adRequest.zza(), rewardedAdLoadCallback);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        if (adManagerAdRequest == null) {
            throw new NullPointerException("AdManagerAdRequest cannot be null.");
        }
        if (rewardedAdLoadCallback != null) {
            oa3.d("#008 Must be called on the main UI thread.");
            zzbiy.zzc(context);
            if (((Boolean) zzbkm.zzl.zze()).booleanValue()) {
                if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                    zzcgn.zze("Loading on background thread");
                    zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            String str2 = str;
                            AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                            try {
                                new zzccs(context2, str2).zza(adManagerAdRequest2.zza(), rewardedAdLoadCallback);
                            } catch (IllegalStateException e) {
                                zzcad.zza(context2).zzd(e, "RewardedAd.loadAdManager");
                            }
                        }
                    });
                    return;
                }
            }
            zzcgn.zze("Loading on UI thread");
            new zzccs(context, str).zza(adManagerAdRequest.zza(), rewardedAdLoadCallback);
            return;
        }
        throw new NullPointerException("LoadCallback cannot be null.");
    }
}
