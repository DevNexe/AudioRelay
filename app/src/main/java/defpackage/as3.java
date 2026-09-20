package defpackage;

import com.google.ads.mediation.facebook.FacebookAdapter;
import com.revenuecat.purchases.Package;

/* JADX INFO: loaded from: classes.dex */
public final class as3 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ Package w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as3(Package r1) {
        super(1);
        this.w = r1;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52Var.b(FacebookAdapter.KEY_ID, this.w.getIdentifier());
        return sd5.a;
    }
}
