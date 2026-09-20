package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class m44 extends x34<InterstitialAd> {
    public m44(Context context, ih3 ih3Var, z34 z34Var, eh1 eh1Var, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        super(context, z34Var, ih3Var, eh1Var);
        this.e = new q44(scarInterstitialAdHandler, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hh1
    public final void a(Activity activity) {
        T t = this.a;
        if (t != 0) {
            ((InterstitialAd) t).show(activity);
        } else {
            this.f.handleError(s91.a(this.c));
        }
    }

    @Override // defpackage.x34
    public final void c(AdRequest adRequest) {
        InterstitialAd.load(this.b, this.c.c, adRequest, ((q44) this.e).A);
    }
}
