package defpackage;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.Offerings;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kr3 extends cx1 implements j81<Offerings, sd5> {
    public final /* synthetic */ CustomerInfo w;
    public final /* synthetic */ dl4<List<zg3>> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr3(CustomerInfo customerInfo, dl4<List<zg3>> dl4Var) {
        super(1);
        this.w = customerInfo;
        this.x = dl4Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Offerings offerings) {
        Offerings offerings2 = offerings;
        Collection<EntitlementInfo> collectionValues = this.w.getEntitlements().getActive().values();
        int iA = C0239D.A(mu.w0(collectionValues, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : collectionValues) {
            linkedHashMap.put(((EntitlementInfo) obj).getProductIdentifier(), obj);
        }
        ((yk4.QnHx) this.x).b(na4.L0(new q95(new jx0(new q95(na4.I0(new py0(new uu(offerings2.getAll().values()), gr3.w, ka4.F), new hr3(linkedHashMap)), ir3.w), false, ja4.w), new jr3(linkedHashMap))));
        return sd5.a;
    }
}
