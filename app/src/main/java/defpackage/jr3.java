package defpackage;

import com.revenuecat.purchases.EntitlementInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jr3 extends cx1 implements j81<n43, zg3> {
    public final /* synthetic */ Map<String, EntitlementInfo> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr3(LinkedHashMap linkedHashMap) {
        super(1);
        this.w = linkedHashMap;
    }

    @Override // defpackage.j81
    public final zg3 invoke(n43 n43Var) {
        n43 n43Var2 = n43Var;
        return new zg3(n43Var2, !this.w.get(n43Var2.a.a).getWillRenew());
    }
}
