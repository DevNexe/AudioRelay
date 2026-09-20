package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes3.dex */
public final class t44 extends y34 {
    public final RewardedAd d;
    public final u44 e;

    public t44(Context context, jh3 jh3Var, z34 z34Var, eh1 eh1Var) {
        super(context, z34Var, jh3Var, eh1Var);
        this.d = new RewardedAd(context, z34Var.c);
        this.e = new u44();
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

    @Override // defpackage.y34
    public final void c(AdRequest adRequest, kh1 kh1Var) {
        u44 u44Var = this.e;
        u44Var.getClass();
        this.d.loadAd(adRequest, u44Var.a);
    }
}
