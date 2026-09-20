package defpackage;

import android.content.Context;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i44 extends k44 {
    public final ta2 e;

    public i44(eh1 eh1Var) {
        super(eh1Var);
        ta2 ta2Var = new ta2(18);
        this.e = ta2Var;
        this.a = new kk4(ta2Var);
    }

    @Override // defpackage.jh1
    public final void a(Context context, z34 z34Var, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        ta2 ta2Var = this.e;
        X.C(new c44(this, new n44(context, (jh3) ((Map) ta2Var.x).get(z34Var.a), z34Var, this.d, scarInterstitialAdHandler), z34Var));
    }

    @Override // defpackage.jh1
    public final void b(Context context, z34 z34Var, ScarRewardedAdHandler scarRewardedAdHandler) {
        ta2 ta2Var = this.e;
        X.C(new f44(this, new t44(context, (jh3) ((Map) ta2Var.x).get(z34Var.a), z34Var, this.d), z34Var));
    }
}
