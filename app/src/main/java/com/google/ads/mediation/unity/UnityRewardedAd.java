package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.unity.eventadapters.UnityRewardedEventAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes.dex */
public class UnityRewardedAd implements MediationRewardedAd {
    public MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> a;
    public MediationRewardedAdCallback b;
    public String c;
    public UnityRewardedEventAdapter d;
    public final QnHx e = new QnHx();
    public final F1 f = new F1();

    public class CQf implements IUnityAdsInitializationListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public CQf(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public final void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", this.a, this.b));
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            UnityRewardedAd.this.a(UnityAdsAdapterUtils.b(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.a, str)));
        }
    }

    public class F1 implements IUnityAdsShowListener {
        public F1() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowClick(String str) {
            UnityRewardedAd.this.d.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLICKED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState2 = UnityAds.UnityAdsShowCompletionState.COMPLETED;
            UnityRewardedAd unityRewardedAd = UnityRewardedAd.this;
            if (unityAdsShowCompletionState == unityAdsShowCompletionState2) {
                unityRewardedAd.d.sendAdEvent(UnityAdsAdapterUtils.AdEvent.VIDEO_COMPLETE);
                unityRewardedAd.d.sendAdEvent(UnityAdsAdapterUtils.AdEvent.REWARD);
            }
            unityRewardedAd.d.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            UnityRewardedAd unityRewardedAd = UnityRewardedAd.this;
            if (unityRewardedAd.b != null) {
                unityRewardedAd.b.onAdFailedToShow(UnityAdsAdapterUtils.d(unityAdsShowError, str2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowStart(String str) {
            UnityRewardedAd unityRewardedAd = UnityRewardedAd.this;
            unityRewardedAd.d.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
            unityRewardedAd.d.sendAdEvent(UnityAdsAdapterUtils.AdEvent.IMPRESSION);
            unityRewardedAd.d.sendAdEvent(UnityAdsAdapterUtils.AdEvent.VIDEO_START);
        }
    }

    public class QnHx implements IUnityAdsLoadListener {
        public QnHx() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public final void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", str));
            UnityRewardedAd unityRewardedAd = UnityRewardedAd.this;
            unityRewardedAd.c = str;
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = unityRewardedAd.a;
            if (mediationAdLoadCallback != null) {
                MediationRewardedAdCallback mediationRewardedAdCallbackOnSuccess = mediationAdLoadCallback.onSuccess(unityRewardedAd);
                unityRewardedAd.b = mediationRewardedAdCallbackOnSuccess;
                unityRewardedAd.d = new UnityRewardedEventAdapter(mediationRewardedAdCallbackOnSuccess);
            }
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            UnityRewardedAd unityRewardedAd = UnityRewardedAd.this;
            unityRewardedAd.c = str;
            unityRewardedAd.a(UnityAdsAdapterUtils.c(unityAdsLoadError, str2));
        }
    }

    public final void a(AdError adError) {
        Log.w(UnityMediationAdapter.TAG, adError.toString());
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.a;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    public void load(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.a = mediationAdLoadCallback;
        Context context = mediationRewardedAdConfiguration.getContext();
        if (!(context instanceof Activity)) {
            a(UnityAdsAdapterUtils.a(105, "Unity Ads requires an Activity context to load ads."));
            return;
        }
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("gameId");
        String string2 = serverParameters.getString("zoneId");
        if (!UnityAdapter.areValidIds(string, string2)) {
            a(UnityAdsAdapterUtils.a(101, "Missing or invalid server parameters."));
        } else {
            UnityInitializer.a().initializeUnityAds(context, string, new CQf(string, string2));
            UnityAds.load(string2, this.e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (this.c == null) {
                Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
            }
            UnityAds.show(activity, this.c, this.f);
            return;
        }
        AdError adErrorA = UnityAdsAdapterUtils.a(105, "Unity Ads requires an Activity context to show ads.");
        Log.e(UnityMediationAdapter.TAG, adErrorA.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorA);
        }
    }
}
