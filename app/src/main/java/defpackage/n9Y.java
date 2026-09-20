package defpackage;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final class n9Y extends InterstitialAdLoadCallback {
    public final /* synthetic */ IHFx.QnHx a;
    public final /* synthetic */ h81<sd5> b;

    public n9Y(IHFx.QnHx qnHx, uq1 uq1Var) {
        this.a = qnHx;
        this.b = uq1Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        super.onAdLoaded(interstitialAd2);
        a62.a.e("loaded_admob_interstitial");
        this.a.b = interstitialAd2;
        interstitialAd2.setOnPaidEventListener(new n8V_(0));
        interstitialAd2.setFullScreenContentCallback(new RqKo(this.b));
    }
}
