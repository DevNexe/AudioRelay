package defpackage;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Purchases;

/* JADX INFO: loaded from: classes.dex */
public final class sr3 extends cx1 implements j81<CustomerInfo, sd5> {
    public final /* synthetic */ yr3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr3(yr3 yr3Var) {
        super(1);
        this.w = yr3Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(CustomerInfo customerInfo) {
        a62 a62Var = a62.a;
        yr3 yr3Var = this.w;
        yr3Var.b(customerInfo);
        Purchases.Companion.getSharedInstance().setUpdatedCustomerInfoListener(new br3(yr3Var, 0));
        return sd5.a;
    }
}
