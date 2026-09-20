package com.google.ads.mediation.facebook;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FacebookAdapter extends FacebookMediationAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    private static final int MAX_STAR_RATING = 5;
    private boolean isNativeBanner;
    private AdView mAdView;
    private MediationBannerListener mBannerListener;
    private InterstitialAd mInterstitialAd;
    private MediationInterstitialListener mInterstitialListener;
    private boolean mIsImpressionRecorded;
    private MediaView mMediaView;
    private NativeAd mNativeAd;
    private NativeBannerAd mNativeBannerAd;
    private MediationNativeListener mNativeListener;
    private FrameLayout mWrappedAdView;
    private final AtomicBoolean showInterstitialCalled = new AtomicBoolean();
    private final AtomicBoolean didInterstitialAdClose = new AtomicBoolean();

    public class CQf implements com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ MediationAdRequest c;

        public CQf(Context context, String str, MediationAdRequest mediationAdRequest) {
            this.a = context;
            this.b = str;
            this.c = mediationAdRequest;
        }

        @Override // com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx
        public final void a(AdError adError) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            if (facebookAdapter.mInterstitialListener != null) {
                facebookAdapter.mInterstitialListener.onAdFailedToLoad(facebookAdapter, adError);
            }
        }

        @Override // com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx
        public final void b() {
            FacebookAdapter.this.createAndLoadInterstitial(this.a, this.b, this.c);
        }
    }

    public class F1 implements com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ NativeMediationAdRequest c;
        public final /* synthetic */ Bundle d;

        public F1(Context context, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle) {
            this.a = context;
            this.b = str;
            this.c = nativeMediationAdRequest;
            this.d = bundle;
        }

        @Override // com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx
        public final void a(AdError adError) {
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            if (facebookAdapter.mNativeListener != null) {
                facebookAdapter.mNativeListener.onAdFailedToLoad(facebookAdapter, adError);
            }
        }

        @Override // com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx
        public final void b() {
            FacebookAdapter.this.createAndLoadNativeAd(this.a, this.b, this.c, this.d);
        }
    }

    public class LPt8Fixed implements AdListener {
        public LPt8Fixed() {
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mBannerListener.onAdClicked(facebookAdapter);
            facebookAdapter.mBannerListener.onAdOpened(facebookAdapter);
            facebookAdapter.mBannerListener.onAdLeftApplication(facebookAdapter);
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mBannerListener.onAdLoaded(facebookAdapter);
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mBannerListener.onAdFailedToLoad(facebookAdapter, adError2);
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
        }
    }

    public class NUlFixed extends com.google.android.gms.ads.formats.NativeAd.Image {
        public final Drawable a;
        public final Uri b;

        public NUlFixed() {
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public final Drawable getDrawable() {
            return this.a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public final double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public final Uri getUri() {
            return this.b;
        }

        public NUlFixed(Uri uri) {
            this.b = uri;
        }

        public NUlFixed(Drawable drawable) {
            this.a = drawable;
        }
    }

    public class QnHx implements com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ AdSize c;
        public final /* synthetic */ MediationAdRequest d;
        public final /* synthetic */ com.google.android.gms.ads.AdSize e;

        public QnHx(Context context, String str, AdSize adSize, MediationAdRequest mediationAdRequest, com.google.android.gms.ads.AdSize adSize2) {
            this.a = context;
            this.b = str;
            this.c = adSize;
            this.d = mediationAdRequest;
            this.e = adSize2;
        }

        @Override // com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx
        public final void a(AdError adError) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            if (facebookAdapter.mBannerListener != null) {
                facebookAdapter.mBannerListener.onAdFailedToLoad(facebookAdapter, adError);
            }
        }

        @Override // com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx
        public final void b() {
            Context context = this.a;
            AdView adView = new AdView(context, this.b, this.c);
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mAdView = adView;
            facebookAdapter.buildAdRequest(this.d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.e.getWidthInPixels(context), -2);
            facebookAdapter.mWrappedAdView = new FrameLayout(context);
            facebookAdapter.mAdView.setLayoutParams(layoutParams);
            facebookAdapter.mWrappedAdView.addView(facebookAdapter.mAdView);
            facebookAdapter.mAdView.loadAd(facebookAdapter.mAdView.buildLoadAdConfig().withAdListener(facebookAdapter.new LPt8Fixed()).build());
        }
    }

    public class T23 implements AdListener, NativeAdListener {
        public final WeakReference<Context> a;
        public final NativeBannerAd b;

        public class QnHx implements auxFixed {
            public final /* synthetic */ EQ a;

            public QnHx(EQ eq) {
                this.a = eq;
            }

            @Override // com.google.ads.mediation.facebook.FacebookAdapter.auxFixed
            public final void a(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                T23 t23 = T23.this;
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
            }

            @Override // com.google.ads.mediation.facebook.FacebookAdapter.auxFixed
            public final void b() {
                T23 t23 = T23.this;
                FacebookAdapter.this.mNativeListener.onAdLoaded(FacebookAdapter.this, this.a);
            }
        }

        public T23(Context context, NativeBannerAd nativeBannerAd) {
            this.a = new WeakReference<>(context);
            this.b = nativeBannerAd;
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mNativeListener.onAdClicked(facebookAdapter);
            facebookAdapter.mNativeListener.onAdOpened(facebookAdapter);
            facebookAdapter.mNativeListener.onAdLeftApplication(facebookAdapter);
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            NativeBannerAd nativeBannerAd = this.b;
            if (ad != nativeBannerAd) {
                facebookAdapter.mNativeListener.onAdFailedToLoad(facebookAdapter, new AdError(106, "Ad loaded is not a native banner ad.", "com.google.ads.mediation.facebook"));
                return;
            }
            Context context = this.a.get();
            if (context == null) {
                facebookAdapter.mNativeListener.onAdFailedToLoad(facebookAdapter, new AdError(107, "Failed to create ad options view. Context is null.", "com.google.ads.mediation.facebook"));
            } else {
                EQ eq = facebookAdapter.new EQ(nativeBannerAd);
                eq.a(context, new QnHx(eq));
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mNativeListener.onAdFailedToLoad(facebookAdapter, adError2);
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            if (facebookAdapter.mIsImpressionRecorded) {
                Log.d(FacebookMediationAdapter.TAG, "Received onLoggingImpression callback for a native whose impression is already recorded. Ignoring the duplicate callback.");
            } else {
                facebookAdapter.mNativeListener.onAdImpression(facebookAdapter);
                facebookAdapter.mIsImpressionRecorded = true;
            }
        }

        @Override // com.facebook.ads.NativeAdListener
        public final void onMediaDownloaded(Ad ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    public class YKK implements InterstitialAdExtendedListener {
        public YKK() {
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mInterstitialListener.onAdClicked(facebookAdapter);
            facebookAdapter.mInterstitialListener.onAdLeftApplication(facebookAdapter);
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mInterstitialListener.onAdLoaded(facebookAdapter);
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, com.facebook.ads.AdError adError) {
            Log.w(FacebookMediationAdapter.TAG, FacebookMediationAdapter.getAdError(adError).getMessage());
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            if (!facebookAdapter.showInterstitialCalled.get()) {
                facebookAdapter.mInterstitialListener.onAdFailedToLoad(facebookAdapter, adError.getErrorCode());
            } else {
                facebookAdapter.mInterstitialListener.onAdOpened(facebookAdapter);
                facebookAdapter.mInterstitialListener.onAdClosed(facebookAdapter);
            }
        }

        @Override // com.facebook.ads.InterstitialAdExtendedListener
        public final void onInterstitialActivityDestroyed() {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            if (facebookAdapter.didInterstitialAdClose.getAndSet(true)) {
                return;
            }
            facebookAdapter.mInterstitialListener.onAdClosed(facebookAdapter);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public final void onInterstitialDismissed(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            if (facebookAdapter.didInterstitialAdClose.getAndSet(true)) {
                return;
            }
            facebookAdapter.mInterstitialListener.onAdClosed(facebookAdapter);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public final void onInterstitialDisplayed(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mInterstitialListener.onAdOpened(facebookAdapter);
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public final void onRewardedAdCompleted() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public final void onRewardedAdServerFailed() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public final void onRewardedAdServerSucceeded() {
        }
    }

    public interface auxFixed {
        void a(AdError adError);

        void b();
    }

    public class byN implements AdListener, NativeAdListener {
        public final WeakReference<Context> a;
        public final NativeAd b;

        public class QnHx implements auxFixed {
            public final /* synthetic */ EQ a;

            public QnHx(EQ eq) {
                this.a = eq;
            }

            @Override // com.google.ads.mediation.facebook.FacebookAdapter.auxFixed
            public final void a(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                byN byn = byN.this;
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
            }

            @Override // com.google.ads.mediation.facebook.FacebookAdapter.auxFixed
            public final void b() {
                byN byn = byN.this;
                FacebookAdapter.this.mNativeListener.onAdLoaded(FacebookAdapter.this, this.a);
            }
        }

        public byN(Context context, NativeAd nativeAd) {
            this.a = new WeakReference<>(context);
            this.b = nativeAd;
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mNativeListener.onAdClicked(facebookAdapter);
            facebookAdapter.mNativeListener.onAdOpened(facebookAdapter);
            facebookAdapter.mNativeListener.onAdLeftApplication(facebookAdapter);
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            NativeAd nativeAd = this.b;
            if (ad != nativeAd) {
                AdError adError = new AdError(106, "Ad loaded is not a native ad.", "com.google.ads.mediation.facebook");
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                facebookAdapter.mNativeListener.onAdFailedToLoad(facebookAdapter, adError);
                return;
            }
            Context context = this.a.get();
            if (context != null) {
                EQ eq = facebookAdapter.new EQ(nativeAd);
                eq.a(context, new QnHx(eq));
            } else {
                AdError adError2 = new AdError(107, "Failed to create ad options view. Context is null", "com.google.ads.mediation.facebook");
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                facebookAdapter.mNativeListener.onAdFailedToLoad(facebookAdapter, adError2);
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            if (!TextUtils.isEmpty(adError.getErrorMessage())) {
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            }
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            facebookAdapter.mNativeListener.onAdFailedToLoad(facebookAdapter, adError.getErrorCode());
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            if (facebookAdapter.mIsImpressionRecorded) {
                Log.d(FacebookMediationAdapter.TAG, "Received onLoggingImpression callback for a native whose impression is already recorded. Ignoring the duplicate callback.");
            } else {
                facebookAdapter.mNativeListener.onAdImpression(facebookAdapter);
                facebookAdapter.mIsImpressionRecorded = true;
            }
        }

        @Override // com.facebook.ads.NativeAdListener
        public final void onMediaDownloaded(Ad ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void buildAdRequest(MediationAdRequest mediationAdRequest) {
        if (mediationAdRequest != null) {
            if (mediationAdRequest.taggedForChildDirectedTreatment() == 1) {
                AdSettings.setMixedAudience(true);
            } else if (mediationAdRequest.taggedForChildDirectedTreatment() == 0) {
                AdSettings.setMixedAudience(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadInterstitial(Context context, String str, MediationAdRequest mediationAdRequest) {
        this.mInterstitialAd = new InterstitialAd(context, str);
        buildAdRequest(mediationAdRequest);
        InterstitialAd interstitialAd = this.mInterstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new YKK()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadNativeAd(Context context, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle) {
        if (bundle != null) {
            this.isNativeBanner = bundle.getBoolean(FacebookExtras.NATIVE_BANNER);
        }
        if (this.isNativeBanner) {
            this.mNativeBannerAd = new NativeBannerAd(context, str);
            buildAdRequest(nativeMediationAdRequest);
            NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new T23(context, this.mNativeBannerAd)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
            return;
        }
        this.mMediaView = new MediaView(context);
        this.mNativeAd = new NativeAd(context, str);
        buildAdRequest(nativeMediationAdRequest);
        NativeAd nativeAd = this.mNativeAd;
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new byN(context, this.mNativeAd)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
    }

    private AdSize getAdSize(Context context, com.google.android.gms.ads.AdSize adSize) {
        int width = adSize.getWidth();
        if (width < 0) {
            width = Math.round(adSize.getWidthInPixels(context) / context.getResources().getDisplayMetrics().density);
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(0, new com.google.android.gms.ads.AdSize(width, 50));
        arrayList.add(1, new com.google.android.gms.ads.AdSize(width, 90));
        arrayList.add(2, new com.google.android.gms.ads.AdSize(width, 250));
        String str = FacebookMediationAdapter.TAG;
        Log.i(str, "Potential ad sizes: " + arrayList);
        com.google.android.gms.ads.AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            return null;
        }
        Log.i(str, "Found closest ad size: " + adSizeFindClosestSize);
        int height = adSizeFindClosestSize.getHeight();
        AdSize adSize2 = AdSize.BANNER_HEIGHT_50;
        if (height == adSize2.getHeight()) {
            return adSize2;
        }
        AdSize adSize3 = AdSize.BANNER_HEIGHT_90;
        if (height == adSize3.getHeight()) {
            return adSize3;
        }
        AdSize adSize4 = AdSize.RECTANGLE_HEIGHT_250;
        if (height == adSize4.getHeight()) {
            return adSize4;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mWrappedAdView;
    }

    @Override // com.google.ads.mediation.facebook.FacebookMediationAdapter, com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.w(FacebookMediationAdapter.TAG, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        super.loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
        }
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.mNativeAd.destroy();
        }
        MediaView mediaView = this.mMediaView;
        if (mediaView != null) {
            mediaView.destroy();
        }
        NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.mNativeBannerAd.destroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, com.google.android.gms.ads.AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        String str = FacebookMediationAdapter.TAG;
        Log.w(str, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        this.mBannerListener = mediationBannerListener;
        String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.w(str, adError.getMessage());
            this.mBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        AdSize adSize2 = getAdSize(context, adSize);
        if (adSize2 == null) {
            AdError adError2 = new AdError(102, "There is no matching Facebook ad size for Google ad size.", "com.google.ads.mediation.facebook");
            Log.w(str, adError2.getMessage());
            this.mBannerListener.onAdFailedToLoad(this, adError2);
        } else {
            com.google.ads.mediation.facebook.QnHx qnHxA = com.google.ads.mediation.facebook.QnHx.a();
            QnHx qnHx = new QnHx(context, placementID, adSize2, mediationAdRequest, adSize);
            qnHxA.getClass();
            com.google.ads.mediation.facebook.QnHx.b(context, placementID, qnHx);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Log.w(FacebookMediationAdapter.TAG, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        this.mInterstitialListener = mediationInterstitialListener;
        String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            this.mInterstitialListener.onAdFailedToLoad(this, new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook"));
        } else {
            com.google.ads.mediation.facebook.QnHx qnHxA = com.google.ads.mediation.facebook.QnHx.a();
            CQf cQf = new CQf(context, placementID, mediationAdRequest);
            qnHxA.getClass();
            com.google.ads.mediation.facebook.QnHx.b(context, placementID, cQf);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        String str = FacebookMediationAdapter.TAG;
        Log.w(str, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        this.mNativeListener = mediationNativeListener;
        String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.w(str, adError.getMessage());
            this.mNativeListener.onAdFailedToLoad(this, adError);
        } else if (!nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            AdError adError2 = new AdError(105, "Unified Native Ads should be requested.", "com.google.ads.mediation.facebook");
            Log.w(str, adError2.getMessage());
            this.mNativeListener.onAdFailedToLoad(this, adError2);
        } else {
            com.google.ads.mediation.facebook.QnHx qnHxA = com.google.ads.mediation.facebook.QnHx.a();
            F1 f1 = new F1(context, placementID, nativeMediationAdRequest, bundle2);
            qnHxA.getClass();
            com.google.ads.mediation.facebook.QnHx.b(context, placementID, f1);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.showInterstitialCalled.set(true);
        if (this.mInterstitialAd.show()) {
            return;
        }
        Log.w(FacebookMediationAdapter.TAG, new AdError(110, "Failed to present interstitial ad.", "com.google.ads.mediation.facebook").getMessage());
        MediationInterstitialListener mediationInterstitialListener = this.mInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdOpened(this);
            this.mInterstitialListener.onAdClosed(this);
        }
    }

    public class EQ extends UnifiedNativeAdMapper {
        public final NativeAd s;
        public final NativeBannerAd t;

        public class QnHx implements MediaViewListener {
            public QnHx() {
            }

            @Override // com.facebook.ads.MediaViewListener
            public final void onComplete(MediaView mediaView) {
                EQ eq = EQ.this;
                if (FacebookAdapter.this.mNativeListener != null) {
                    FacebookAdapter.this.mNativeListener.onVideoEnd(FacebookAdapter.this);
                }
            }

            @Override // com.facebook.ads.MediaViewListener
            public final void onEnterFullscreen(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public final void onExitFullscreen(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public final void onFullscreenBackground(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public final void onFullscreenForeground(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public final void onPause(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public final void onPlay(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public final void onVolumeChange(MediaView mediaView, float f) {
            }
        }

        public EQ(NativeAd nativeAd) {
            this.s = nativeAd;
        }

        public final void a(Context context, auxFixed auxVar) {
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            boolean z = facebookAdapter.isNativeBanner;
            boolean z2 = false;
            NativeBannerAd nativeBannerAd = this.t;
            NativeAd nativeAd = this.s;
            if (z) {
                if (nativeBannerAd.getAdHeadline() != null && nativeBannerAd.getAdBodyText() != null && nativeBannerAd.getAdIcon() != null && nativeBannerAd.getAdCallToAction() != null) {
                    z2 = true;
                }
                if (!z2) {
                    AdError adError = new AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", "com.google.ads.mediation.facebook");
                    Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                    auxVar.a(adError);
                    return;
                }
                setHeadline(nativeBannerAd.getAdHeadline());
                setBody(nativeBannerAd.getAdBodyText());
                if (nativeBannerAd.getPreloadedIconViewDrawable() != null) {
                    setIcon(new NUlFixed(nativeBannerAd.getPreloadedIconViewDrawable()));
                } else if (nativeBannerAd.getAdIcon() == null) {
                    setIcon(new NUlFixed());
                } else {
                    setIcon(new NUlFixed(Uri.parse(nativeBannerAd.getAdIcon().getUrl())));
                }
                setCallToAction(nativeBannerAd.getAdCallToAction());
                setAdvertiser(nativeBannerAd.getAdvertiserName());
                Bundle bundle = new Bundle();
                bundle.putCharSequence(FacebookAdapter.KEY_ID, nativeBannerAd.getId());
                bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, nativeBannerAd.getAdSocialContext());
                setExtras(bundle);
            } else {
                if (nativeAd.getAdHeadline() != null && nativeAd.getAdCoverImage() != null && nativeAd.getAdBodyText() != null && nativeAd.getAdIcon() != null && nativeAd.getAdCallToAction() != null && facebookAdapter.mMediaView != null) {
                    z2 = true;
                }
                if (!z2) {
                    AdError adError2 = new AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", "com.google.ads.mediation.facebook");
                    Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                    auxVar.a(adError2);
                    return;
                }
                setHeadline(nativeAd.getAdHeadline());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new NUlFixed(Uri.parse(nativeAd.getAdCoverImage().getUrl())));
                setImages(arrayList);
                setBody(nativeAd.getAdBodyText());
                if (nativeAd.getPreloadedIconViewDrawable() != null) {
                    setIcon(new NUlFixed(nativeAd.getPreloadedIconViewDrawable()));
                } else if (nativeAd.getAdIcon() == null) {
                    setIcon(new NUlFixed());
                } else {
                    setIcon(new NUlFixed(Uri.parse(nativeAd.getAdIcon().getUrl())));
                }
                setCallToAction(nativeAd.getAdCallToAction());
                setAdvertiser(nativeAd.getAdvertiserName());
                facebookAdapter.mMediaView.setListener(new QnHx());
                setMediaView(facebookAdapter.mMediaView);
                setHasVideoContent(true);
                NativeAdBase.Rating adStarRating = nativeAd.getAdStarRating();
                Double dValueOf = adStarRating == null ? null : Double.valueOf((adStarRating.getValue() * 5.0d) / adStarRating.getScale());
                if (dValueOf != null) {
                    setStarRating(dValueOf);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putCharSequence(FacebookAdapter.KEY_ID, nativeAd.getId());
                bundle2.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, nativeAd.getAdSocialContext());
                setExtras(bundle2);
            }
            NativeAdLayout nativeAdLayout = new NativeAdLayout(context);
            setAdChoicesContent(facebookAdapter.isNativeBanner ? new AdOptionsView(context, nativeBannerAd, nativeAdLayout) : new AdOptionsView(context, nativeAd, nativeAdLayout));
            auxVar.b();
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            ArrayList arrayList = new ArrayList();
            View value = null;
            for (Map.Entry<String, View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    value = entry.getValue();
                }
            }
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            if (facebookAdapter.isNativeBanner) {
                if (value == null) {
                    Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Facebook impression recording might be impacted for this ad.");
                    return;
                } else if (value instanceof ImageView) {
                    this.t.registerViewForInteraction(view, (ImageView) value);
                    return;
                } else {
                    Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Facebook impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", value.getClass()));
                    return;
                }
            }
            boolean z = value instanceof ImageView;
            NativeAd nativeAd = this.s;
            if (z) {
                nativeAd.registerViewForInteraction(view, facebookAdapter.mMediaView, (ImageView) value, arrayList);
            } else {
                Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView.Calling registerViewForInteraction() without a reference to the icon view.");
                nativeAd.registerViewForInteraction(view, facebookAdapter.mMediaView, arrayList);
            }
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public final void untrackView(View view) {
            NativeBannerAd nativeBannerAd;
            if (!FacebookAdapter.this.isNativeBanner || (nativeBannerAd = this.t) == null) {
                NativeAd nativeAd = this.s;
                if (nativeAd != null) {
                    nativeAd.unregisterView();
                }
            } else {
                nativeBannerAd.unregisterView();
            }
            super.untrackView(view);
        }

        public EQ(NativeBannerAd nativeBannerAd) {
            this.t = nativeBannerAd;
        }
    }
}
