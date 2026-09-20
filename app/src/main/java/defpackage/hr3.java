package defpackage;

import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.Package;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hr3 extends cx1 implements j81<Package, Boolean> {
    public final /* synthetic */ Map<String, EntitlementInfo> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr3(LinkedHashMap linkedHashMap) {
        super(1);
        this.w = linkedHashMap;
    }

    @Override // defpackage.j81
    public final Boolean invoke(Package r2) {
        return Boolean.valueOf(this.w.containsKey(r2.getProduct().getSku()));
    }
}
