package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: classes.dex */
public class UnityBannerEventAdapter implements IUnityEventAdapter {
    public final MediationBannerListener a;
    public final MediationBannerAdapter b;

    public static /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            a = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public UnityBannerEventAdapter(MediationBannerListener mediationBannerListener, MediationBannerAdapter mediationBannerAdapter) {
        this.a = mediationBannerListener;
        this.b = mediationBannerAdapter;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        MediationBannerListener mediationBannerListener = this.a;
        if (mediationBannerListener == null) {
            return;
        }
        int i = QnHx.a[adEvent.ordinal()];
        MediationBannerAdapter mediationBannerAdapter = this.b;
        if (i == 1) {
            mediationBannerListener.onAdLoaded(mediationBannerAdapter);
            return;
        }
        if (i == 2) {
            mediationBannerListener.onAdOpened(mediationBannerAdapter);
            return;
        }
        if (i == 3) {
            mediationBannerListener.onAdClicked(mediationBannerAdapter);
        } else if (i == 4) {
            mediationBannerListener.onAdClosed(mediationBannerAdapter);
        } else {
            if (i != 5) {
                return;
            }
            mediationBannerListener.onAdLeftApplication(mediationBannerAdapter);
        }
    }
}
