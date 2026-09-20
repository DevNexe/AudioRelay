package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes.dex */
public class UnityInterstitialEventAdapter implements IUnityEventAdapter {
    public final MediationInterstitialListener a;
    public final MediationInterstitialAdapter b;

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

    public UnityInterstitialEventAdapter(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.a = mediationInterstitialListener;
        this.b = mediationInterstitialAdapter;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        MediationInterstitialListener mediationInterstitialListener = this.a;
        if (mediationInterstitialListener == null) {
            return;
        }
        int i = QnHx.a[adEvent.ordinal()];
        MediationInterstitialAdapter mediationInterstitialAdapter = this.b;
        if (i == 1) {
            mediationInterstitialListener.onAdLoaded(mediationInterstitialAdapter);
            return;
        }
        if (i == 2) {
            mediationInterstitialListener.onAdOpened(mediationInterstitialAdapter);
            return;
        }
        if (i == 3) {
            mediationInterstitialListener.onAdClicked(mediationInterstitialAdapter);
        } else if (i == 4) {
            mediationInterstitialListener.onAdClosed(mediationInterstitialAdapter);
        } else {
            if (i != 5) {
                return;
            }
            mediationInterstitialListener.onAdLeftApplication(mediationInterstitialAdapter);
        }
    }
}
