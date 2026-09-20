package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import com.google.ads.mediation.unity.eventadapters.UnityBannerEventAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class UnityBannerAd extends UnityMediationAdapter implements MediationBannerAdapter {
    private String bannerPlacementId;
    private BannerView bannerView;
    private UnityBannerEventAdapter eventAdapter;
    private String gameId;
    private BannerView.IListener mUnityBannerListener = new QnHx();
    private MediationBannerListener mediationBannerListener;

    public class CQf implements IUnityAdsInitializationListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ UnityBannerSize b;

        public CQf(Activity activity, UnityBannerSize unityBannerSize) {
            this.a = activity;
            this.b = unityBannerSize;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public final void onInitializationComplete() {
            UnityBannerAd unityBannerAd = UnityBannerAd.this;
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load banner ad with placement ID: %s", unityBannerAd.gameId, unityBannerAd.bannerPlacementId));
            if (unityBannerAd.bannerView == null) {
                unityBannerAd.bannerView = new BannerView(this.a, unityBannerAd.bannerPlacementId, this.b);
            }
            unityBannerAd.bannerView.setListener(unityBannerAd.mUnityBannerListener);
            unityBannerAd.bannerView.load();
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            UnityBannerAd unityBannerAd = UnityBannerAd.this;
            AdError adErrorB = UnityAdsAdapterUtils.b(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", unityBannerAd.gameId, str));
            Log.w(UnityMediationAdapter.TAG, adErrorB.toString());
            if (unityBannerAd.mediationBannerListener != null) {
                unityBannerAd.mediationBannerListener.onAdFailedToLoad(unityBannerAd, adErrorB);
            }
        }
    }

    public class QnHx extends BannerView.Listener {
        public QnHx() {
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public final void onBannerClick(BannerView bannerView) {
            UnityBannerAd unityBannerAd = UnityBannerAd.this;
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad was clicked for placement ID: %s", unityBannerAd.bannerView.getPlacementId()));
            unityBannerAd.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLICKED);
            unityBannerAd.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public final void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            int i;
            int i2 = UnityAdsAdapterUtils.QnHx.a[bannerErrorInfo.errorCode.ordinal()];
            if (i2 == 1) {
                i = RCHTTPStatusCodes.CREATED;
            } else if (i2 == 2) {
                i = 202;
            } else if (i2 != 3) {
                i = i2 != 4 ? RCHTTPStatusCodes.SUCCESS : 204;
            } else {
                i = 203;
            }
            UnityBannerAd.this.sendBannerFailedToLoad(i, bannerErrorInfo.errorMessage);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public final void onBannerLeftApplication(BannerView bannerView) {
            UnityBannerAd unityBannerAd = UnityBannerAd.this;
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad left application for placement ID: %s", unityBannerAd.bannerView.getPlacementId()));
            unityBannerAd.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public final void onBannerLoaded(BannerView bannerView) {
            UnityBannerAd unityBannerAd = UnityBannerAd.this;
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads finished loading banner ad for placement ID: %s", unityBannerAd.bannerView.getPlacementId()));
            unityBannerAd.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LOADED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBannerFailedToLoad(int i, String str) {
        AdError adErrorA = UnityAdsAdapterUtils.a(i, str);
        Log.w(UnityMediationAdapter.TAG, adErrorA.toString());
        MediationBannerListener mediationBannerListener = this.mediationBannerListener;
        if (mediationBannerListener != null) {
            mediationBannerListener.onAdFailedToLoad(this, adErrorA);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.bannerView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            bannerView.destroy();
        }
        this.bannerView = null;
        this.mediationBannerListener = null;
        this.mUnityBannerListener = null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        this.eventAdapter = new UnityBannerEventAdapter(mediationBannerListener, this);
        this.gameId = bundle.getString("gameId");
        String string = bundle.getString("zoneId");
        this.bannerPlacementId = string;
        if (!UnityAdapter.areValidIds(this.gameId, string)) {
            sendBannerFailedToLoad(101, "Missing or invalid server parameters.");
            return;
        }
        if (!(context instanceof Activity)) {
            sendBannerFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
            return;
        }
        Activity activity = (Activity) context;
        UnityBannerSize unityBannerSize = UnityAdsAdapterUtils.getUnityBannerSize(context, adSize);
        if (unityBannerSize == null) {
            sendBannerFailedToLoad(110, String.format("There is no matching Unity Ads ad size for Google ad size: %s", adSize));
        } else {
            UnityInitializer.a().initializeUnityAds(context, this.gameId, new CQf(activity, unityBannerSize));
        }
    }
}
