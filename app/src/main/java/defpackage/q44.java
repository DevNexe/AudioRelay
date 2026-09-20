package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class q44 extends ta2 {
    public final QnHx A;
    public final CQf B;
    public final m44 y;
    public final ScarInterstitialAdHandler z;

    public class CQf extends FullScreenContentCallback {
        public CQf() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            q44.this.z.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            q44.this.z.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdImpression() {
            super.onAdImpression();
            q44.this.z.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            q44.this.z.onAdOpened();
        }
    }

    public class QnHx extends InterstitialAdLoadCallback {
        public QnHx() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            q44.this.z.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, com.google.android.gms.ads.interstitial.InterstitialAd, java.lang.Object] */
        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(InterstitialAd interstitialAd) {
            InterstitialAd interstitialAd2 = interstitialAd;
            super.onAdLoaded(interstitialAd2);
            q44 q44Var = q44.this;
            q44Var.z.onAdLoaded();
            interstitialAd2.setFullScreenContentCallback(q44Var.B);
            q44Var.y.a = interstitialAd2;
            kh1 kh1Var = (kh1) q44Var.x;
            if (kh1Var != null) {
                kh1Var.onAdLoaded();
            }
        }
    }

    public q44(ScarInterstitialAdHandler scarInterstitialAdHandler, m44 m44Var) {
        super(19);
        this.A = new QnHx();
        this.B = new CQf();
        this.z = scarInterstitialAdHandler;
        this.y = m44Var;
    }
}
