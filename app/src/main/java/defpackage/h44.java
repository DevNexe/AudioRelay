package defpackage;

import android.content.Context;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class h44 extends k44 {
    public final fe2 e;

    public h44(eh1 eh1Var) {
        super(eh1Var);
        fe2 fe2Var = new fe2(1);
        this.e = fe2Var;
        this.a = new mk4(fe2Var);
    }

    @Override // defpackage.jh1
    public final void a(Context context, z34 z34Var, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        X.C(new b44(this, new m44(context, (ih3) this.e.a.get(z34Var.a), z34Var, this.d, scarInterstitialAdHandler), z34Var));
    }

    @Override // defpackage.jh1
    public final void b(Context context, z34 z34Var, ScarRewardedAdHandler scarRewardedAdHandler) {
        X.C(new e44(this, new s44(context, (ih3) this.e.a.get(z34Var.a), z34Var, this.d, scarRewardedAdHandler), z34Var));
    }
}
