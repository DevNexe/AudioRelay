package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FacebookRtbNativeAd extends UnifiedNativeAdMapper {
    public final MediationNativeAdConfiguration s;
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> t;
    public NativeAdBase u;
    public MediationNativeAdCallback v;
    public MediaView w;

    public class CQf extends NativeAd.Image {
        public final Drawable a;
        public final Uri b;

        public CQf() {
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

        public CQf(Uri uri) {
            this.b = uri;
        }

        public CQf(Drawable drawable) {
            this.a = drawable;
        }
    }

    public interface F1 {
    }

    public class LPt8Fixed implements AdListener, NativeAdListener {
        public final WeakReference<Context> a;
        public final NativeAdBase b;

        public class QnHx implements F1 {
            public QnHx() {
            }
        }

        public LPt8Fixed(Context context, NativeAdBase nativeAdBase) {
            this.b = nativeAdBase;
            this.a = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            FacebookRtbNativeAd facebookRtbNativeAd = FacebookRtbNativeAd.this;
            facebookRtbNativeAd.v.reportAdClicked();
            facebookRtbNativeAd.v.onAdOpened();
            facebookRtbNativeAd.v.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            NativeAdBase nativeAdBase = this.b;
            FacebookRtbNativeAd facebookRtbNativeAd = FacebookRtbNativeAd.this;
            if (ad != nativeAdBase) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", "com.google.ads.mediation.facebook");
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                facebookRtbNativeAd.t.onFailure(adError);
                return;
            }
            Context context = this.a.get();
            if (context != null) {
                facebookRtbNativeAd.mapNativeAd(context, new QnHx());
                return;
            }
            AdError adError2 = new AdError(107, "Context is null.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            facebookRtbNativeAd.t.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookRtbNativeAd.this.t.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public final void onMediaDownloaded(Ad ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    public class QnHx implements MediaViewListener {
        public QnHx() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public final void onComplete(MediaView mediaView) {
            MediationNativeAdCallback mediationNativeAdCallback = FacebookRtbNativeAd.this.v;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onVideoComplete();
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

    public FacebookRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.t = mediationAdLoadCallback;
        this.s = mediationNativeAdConfiguration;
    }

    public void mapNativeAd(Context context, F1 f1) {
        NativeAdBase nativeAdBase = this.u;
        boolean z = false;
        boolean z2 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        if (!(nativeAdBase instanceof NativeBannerAd)) {
            if (z2 && nativeAdBase.getAdCoverImage() != null && this.w != null) {
                z = true;
            }
            z2 = z;
        }
        if (!z2) {
            AdError adError = new AdError(108, "Ad from Facebook doesn't have all required assets.", "com.google.ads.mediation.facebook");
            String str = FacebookMediationAdapter.TAG;
            Log.w(str, adError.getMessage());
            LPt8Fixed.QnHx qnHx = (LPt8Fixed.QnHx) f1;
            qnHx.getClass();
            Log.w(str, adError.getMessage());
            FacebookRtbNativeAd.this.t.onFailure(adError);
            return;
        }
        setHeadline(this.u.getAdHeadline());
        if (this.u.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CQf(Uri.parse(this.u.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.u.getAdBodyText());
        if (this.u.getPreloadedIconViewDrawable() != null) {
            setIcon(new CQf(this.u.getPreloadedIconViewDrawable()));
        } else if (this.u.getAdIcon() == null) {
            setIcon(new CQf());
        } else {
            setIcon(new CQf(Uri.parse(this.u.getAdIcon().getUrl())));
        }
        setCallToAction(this.u.getAdCallToAction());
        setAdvertiser(this.u.getAdvertiserName());
        this.w.setListener(new QnHx());
        setHasVideoContent(true);
        setMediaView(this.w);
        setStarRating(null);
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookAdapter.KEY_ID, this.u.getId());
        bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.u.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.u, null));
        FacebookRtbNativeAd facebookRtbNativeAd = FacebookRtbNativeAd.this;
        facebookRtbNativeAd.v = facebookRtbNativeAd.t.onSuccess(facebookRtbNativeAd);
    }

    public void render() {
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.s;
        String placementID = FacebookMediationAdapter.getPlacementID(mediationNativeAdConfiguration.getServerParameters());
        boolean zIsEmpty = TextUtils.isEmpty(placementID);
        MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback = this.t;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationNativeAdConfiguration);
        this.w = new MediaView(mediationNativeAdConfiguration.getContext());
        try {
            this.u = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.getContext(), placementID, mediationNativeAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration.getWatermark())) {
                this.u.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.u;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new LPt8Fixed(mediationNativeAdConfiguration.getContext(), this.u)).withBid(mediationNativeAdConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e.getMessage(), "com.google.ads.mediation.facebook");
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.u;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Facebook impression recording might be impacted for this ad.");
                return;
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Facebook impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
                return;
            }
        }
        if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Facebook Adapter. Facebook impression recording might be impacted for this ad.");
            return;
        }
        com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
        if (view2 instanceof ImageView) {
            nativeAd.registerViewForInteraction(view, this.w, (ImageView) view2, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.w, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.u;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }
}
