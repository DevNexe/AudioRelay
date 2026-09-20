package defpackage;

import android.content.Context;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g44 extends k44 {
    public final ny1 e;

    public g44(eh1 eh1Var) {
        super(eh1Var);
        ny1 ny1Var = new ny1(12);
        this.e = ny1Var;
        this.a = new lk4(ny1Var);
    }

    @Override // defpackage.jh1
    public final void a(Context context, z34 z34Var, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        X.C(new a44(this, new l44(context, (hh3) ((Map) this.e.w).get(z34Var.a), z34Var, this.d, scarInterstitialAdHandler), z34Var));
    }

    @Override // defpackage.jh1
    public final void b(Context context, z34 z34Var, ScarRewardedAdHandler scarRewardedAdHandler) {
        X.C(new d44(this, new r44(context, (hh3) ((Map) this.e.w).get(z34Var.a), z34Var, this.d), z34Var));
    }
}
