package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class n44 extends y34 {
    public final InterstitialAd d;
    public final o44 e;

    public n44(Context context, jh3 jh3Var, z34 z34Var, eh1 eh1Var, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        super(context, z34Var, jh3Var, eh1Var);
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.d = interstitialAd;
        interstitialAd.setAdUnitId(z34Var.a());
        this.e = new o44(scarInterstitialAdHandler);
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

    @Override // defpackage.y34
    public final void c(AdRequest adRequest, kh1 kh1Var) {
        o44 o44Var = this.e;
        o44.QnHx qnHxA = o44Var.a();
        InterstitialAd interstitialAd = this.d;
        interstitialAd.setAdListener(qnHxA);
        o44Var.b(kh1Var);
        interstitialAd.loadAd(adRequest);
    }
}
