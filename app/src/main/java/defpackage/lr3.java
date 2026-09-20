package defpackage;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Purchases;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lr3 extends cx1 implements j81<CustomerInfo, sd5> {
    public final /* synthetic */ dl4<List<zg3>> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr3(yk4.QnHx qnHx) {
        super(1);
        this.w = qnHx;
    }

    @Override // defpackage.j81
    public final sd5 invoke(CustomerInfo customerInfo) {
        CustomerInfo customerInfo2 = customerInfo;
        boolean z = !customerInfo2.getEntitlements().getActive().isEmpty();
        dl4<List<zg3>> dl4Var = this.w;
        if (z) {
            ListenerConversionsKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new fr3(dl4Var), new kr3(customerInfo2, dl4Var));
        } else {
            ((yk4.QnHx) dl4Var).b(cs0.w);
        }
        return sd5.a;
    }
}
