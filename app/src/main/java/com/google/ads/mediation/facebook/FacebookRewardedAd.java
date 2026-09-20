package com.google.ads.mediation.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class FacebookRewardedAd implements MediationRewardedAd, RewardedVideoAdExtendedListener {
    public final MediationRewardedAdConfiguration a;
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> b;
    public RewardedVideoAd c;
    public MediationRewardedAdCallback e;
    public final AtomicBoolean d = new AtomicBoolean();
    public boolean f = false;
    public final AtomicBoolean g = new AtomicBoolean();

    public class QnHx implements com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public QnHx(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx
        public final void a(AdError adError) {
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = FacebookRewardedAd.this.b;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.facebook.QnHx.InterfaceC0071QnHx
        public final void b() {
            FacebookRewardedAd facebookRewardedAd = FacebookRewardedAd.this;
            facebookRewardedAd.getClass();
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(this.a, this.b);
            facebookRewardedAd.c = rewardedVideoAd;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(facebookRewardedAd).withAdExperience(facebookRewardedAd.a()).build());
        }
    }

    public FacebookRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.a = mediationRewardedAdConfiguration;
        this.b = mediationAdLoadCallback;
    }

    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.b;
        if (mediationAdLoadCallback != null) {
            this.e = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.d.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.b;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.c.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.g.getAndSet(true) && (mediationRewardedAdCallback = this.e) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.g.getAndSet(true) && (mediationRewardedAdCallback = this.e) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.e.onVideoComplete();
        this.e.onUserEarnedReward(new FacebookReward());
    }

    public void render() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.a;
        Context context = mediationRewardedAdConfiguration.getContext();
        String placementID = FacebookMediationAdapter.getPlacementID(mediationRewardedAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.b.onFailure(adError);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.f = true;
        }
        FacebookMediationAdapter.setMixedAudience(mediationRewardedAdConfiguration);
        if (!this.f) {
            com.google.ads.mediation.facebook.QnHx qnHxA = com.google.ads.mediation.facebook.QnHx.a();
            QnHx qnHx = new QnHx(context, placementID);
            qnHxA.getClass();
            com.google.ads.mediation.facebook.QnHx.b(context, placementID, qnHx);
            return;
        }
        this.c = new RewardedVideoAd(context, placementID);
        if (!TextUtils.isEmpty(mediationRewardedAdConfiguration.getWatermark())) {
            this.c.setExtraHints(new ExtraHints.Builder().mediationData(mediationRewardedAdConfiguration.getWatermark()).build());
        }
        RewardedVideoAd rewardedVideoAd = this.c;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(bidResponse).withAdExperience(a()).build());
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.d.set(true);
        if (this.c.show()) {
            MediationRewardedAdCallback mediationRewardedAdCallback = this.e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onVideoStart();
                this.e.onAdOpened();
                return;
            }
            return;
        }
        AdError adError = new AdError(110, "Failed to present rewarded ad.", "com.google.ads.mediation.facebook");
        Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.e;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onAdFailedToShow(adError);
        }
        this.c.destroy();
    }
}
