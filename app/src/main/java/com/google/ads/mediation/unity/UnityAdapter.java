package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import java.lang.ref.WeakReference;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class UnityAdapter extends UnityMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private WeakReference<Activity> activityWeakReference;
    private UnityBannerAd bannerAd;
    private UnityInterstitialEventAdapter eventAdapter;
    private final IUnityAdsLoadListener mUnityLoadListener = new QnHx();
    private final IUnityAdsShowListener mUnityShowListener = new F1();
    private MediationInterstitialListener mediationInterstitialListener;
    private String placementId;

    public class CQf implements IUnityAdsInitializationListener {
        public final /* synthetic */ String a;

        public CQf(String str) {
            this.a = str;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public final void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", this.a, UnityAdapter.this.placementId));
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorB = UnityAdsAdapterUtils.b(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.a, str));
            Log.w(UnityMediationAdapter.TAG, adErrorB.toString());
            UnityAdapter unityAdapter = UnityAdapter.this;
            if (unityAdapter.mediationInterstitialListener != null) {
                unityAdapter.mediationInterstitialListener.onAdFailedToLoad(unityAdapter, adErrorB);
            }
        }
    }

    public class F1 implements IUnityAdsShowListener {
        public F1() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowClick(String str) {
            UnityAdapter unityAdapter = UnityAdapter.this;
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad was clicked for placement ID: %s", unityAdapter.placementId));
            unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLICKED);
            unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            UnityAdapter unityAdapter = UnityAdapter.this;
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad finished playing for placement ID: %s", unityAdapter.placementId));
            unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            Log.w(UnityMediationAdapter.TAG, UnityAdsAdapterUtils.d(unityAdsShowError, str2).toString());
            UnityAdapter unityAdapter = UnityAdapter.this;
            unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
            unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowStart(String str) {
            UnityAdapter unityAdapter = UnityAdapter.this;
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad started for placement ID: %s", unityAdapter.placementId));
            unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
        }
    }

    public class QnHx implements IUnityAdsLoadListener {
        public QnHx() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public final void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", str));
            UnityAdapter unityAdapter = UnityAdapter.this;
            unityAdapter.placementId = str;
            unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LOADED);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            UnityAdapter unityAdapter = UnityAdapter.this;
            unityAdapter.placementId = str;
            AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsLoadError, str2);
            Log.w(UnityMediationAdapter.TAG, adErrorC.toString());
            if (unityAdapter.mediationInterstitialListener != null) {
                unityAdapter.mediationInterstitialListener.onAdFailedToLoad(unityAdapter, adErrorC);
            }
        }
    }

    public static boolean areValidIds(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    private void sendAdFailedToLoad(int i, String str) {
        AdError adErrorA = UnityAdsAdapterUtils.a(i, str);
        Log.w(UnityMediationAdapter.TAG, adErrorA.toString());
        MediationInterstitialListener mediationInterstitialListener = this.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdFailedToLoad(this, adErrorA);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.bannerAd.getBannerView();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        this.mediationInterstitialListener = null;
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        UnityBannerAd unityBannerAd = new UnityBannerAd();
        this.bannerAd = unityBannerAd;
        unityBannerAd.requestBannerAd(context, mediationBannerListener, bundle, adSize, mediationAdRequest, bundle2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) throws JSONException {
        this.mediationInterstitialListener = mediationInterstitialListener;
        this.eventAdapter = new UnityInterstitialEventAdapter(mediationInterstitialListener, this);
        String string = bundle.getString("gameId");
        String string2 = bundle.getString("zoneId");
        this.placementId = string2;
        if (!areValidIds(string, string2)) {
            sendAdFailedToLoad(101, "Missing or invalid server parameters.");
        } else {
            if (!(context instanceof Activity)) {
                sendAdFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
                return;
            }
            this.activityWeakReference = new WeakReference<>((Activity) context);
            UnityInitializer.a().initializeUnityAds(context, string, new CQf(string));
            UnityAds.load(this.placementId, this.mUnityLoadListener);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        WeakReference<Activity> weakReference = this.activityWeakReference;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity != null) {
            if (this.placementId == null) {
                Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
            }
            UnityAds.show(activity, this.placementId, this.mUnityShowListener);
        } else {
            Log.w(UnityMediationAdapter.TAG, "Failed to show interstitial ad for placement ID '" + this.placementId + "' from Unity Ads: Activity context is null.");
            this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }
    }
}
