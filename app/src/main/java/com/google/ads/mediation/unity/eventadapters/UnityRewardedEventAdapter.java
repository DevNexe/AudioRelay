package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityReward;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* JADX INFO: loaded from: classes.dex */
public class UnityRewardedEventAdapter implements IUnityEventAdapter {
    public final MediationRewardedAdCallback a;

    public static /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            a = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.IMPRESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.VIDEO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.REWARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.VIDEO_COMPLETE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public UnityRewardedEventAdapter(MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.a = mediationRewardedAdCallback;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback == null) {
        }
        switch (QnHx.a[adEvent.ordinal()]) {
            case 1:
                mediationRewardedAdCallback.onAdOpened();
                break;
            case 2:
                mediationRewardedAdCallback.reportAdClicked();
                break;
            case 3:
                mediationRewardedAdCallback.onAdClosed();
                break;
            case 4:
                mediationRewardedAdCallback.reportAdImpression();
                break;
            case 5:
                mediationRewardedAdCallback.onVideoStart();
                break;
            case 6:
                mediationRewardedAdCallback.onUserEarnedReward(new UnityReward());
                break;
            case 7:
                mediationRewardedAdCallback.onVideoComplete();
                break;
        }
    }
}
