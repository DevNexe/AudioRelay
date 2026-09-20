package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class l44 extends w34 {
    public final InterstitialAd d;
    public final p44 e;

    public l44(Context context, hh3 hh3Var, z34 z34Var, eh1 eh1Var, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        super(context, z34Var, hh3Var, eh1Var);
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.d = interstitialAd;
        interstitialAd.setAdUnitId(z34Var.a());
        this.e = new p44(scarInterstitialAdHandler);
    }

    @Override // defpackage.hh1
    public final void a(Activity activity) {
        InterstitialAd interstitialAd = this.d;
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
        } else {
            this.c.handleError(s91.a(this.a));
        }
    }

    @Override // defpackage.w34
    public final void c(AdRequest adRequest, kh1 kh1Var) {
        p44 p44Var = this.e;
        p44.QnHx qnHxA = p44Var.a();
        InterstitialAd interstitialAd = this.d;
        interstitialAd.setAdListener(qnHxA);
        p44Var.b(kh1Var);
        interstitialAd.loadAd(adRequest);
    }
}
