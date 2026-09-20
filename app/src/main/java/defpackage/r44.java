package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes3.dex */
public final class r44 extends w34 {
    public final RewardedAd d;
    public final v44 e;

    public r44(Context context, hh3 hh3Var, z34 z34Var, eh1 eh1Var) {
        super(context, z34Var, hh3Var, eh1Var);
        this.d = new RewardedAd(context, z34Var.c);
        this.e = new v44();
    }

    @Override // defpackage.hh1
    public final void a(Activity activity) {
        RewardedAd rewardedAd = this.d;
        if (rewardedAd.isLoaded()) {
            rewardedAd.show(activity, this.e.b);
        } else {
            this.c.handleError(s91.a(this.a));
        }
    }

    @Override // defpackage.w34
    public final void c(AdRequest adRequest, kh1 kh1Var) {
        v44 v44Var = this.e;
        v44Var.getClass();
        this.d.loadAd(adRequest, v44Var.a);
    }
}
