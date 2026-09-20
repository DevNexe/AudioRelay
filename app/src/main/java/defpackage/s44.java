package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class s44 extends x34<RewardedAd> {
    public s44(Context context, ih3 ih3Var, z34 z34Var, eh1 eh1Var, ScarRewardedAdHandler scarRewardedAdHandler) {
        super(context, z34Var, ih3Var, eh1Var);
        this.e = new w44(scarRewardedAdHandler, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hh1
    public final void a(Activity activity) {
        T t = this.a;
        if (t != 0) {
            ((RewardedAd) t).show(activity, ((w44) this.e).B);
        } else {
            this.f.handleError(s91.a(this.c));
        }
    }

    @Override // defpackage.x34
    public final void c(AdRequest adRequest) {
        RewardedAd.load(this.b, this.c.c, adRequest, ((w44) this.e).A);
    }
}
