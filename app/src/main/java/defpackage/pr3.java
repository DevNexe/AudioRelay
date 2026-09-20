package defpackage;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.models.StoreTransaction;

/* JADX INFO: loaded from: classes.dex */
public final class pr3 extends cx1 implements x81<StoreTransaction, CustomerInfo, sd5> {
    public final /* synthetic */ yr3 w;
    public final /* synthetic */ dl4<qa> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr3(yr3 yr3Var, yk4.QnHx qnHx) {
        super(2);
        this.w = yr3Var;
        this.x = qnHx;
    }

    @Override // defpackage.x81
    public final sd5 invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        a62 a62Var = a62.a;
        a62.a.g("purchase_completed", null);
        yr3 yr3Var = this.w;
        yr3Var.getClass();
        a62.a.g("purchase_successful", null);
        yr3Var.b(customerInfo);
        ((yk4.QnHx) this.x).b(qa.F1.a);
        return sd5.a;
    }
}
