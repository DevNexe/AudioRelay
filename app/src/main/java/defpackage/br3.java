package defpackage;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.interfaces.UpdatedPurchaserInfoListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class br3 implements UpdatedCustomerInfoListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ br3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener
    public final void onReceived(CustomerInfo customerInfo) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a62 a62Var = a62.a;
                ((yr3) obj).b(customerInfo);
                break;
            default:
                Purchases.m4_set_updatedPurchaserInfoListener_$lambda33$lambda32((UpdatedPurchaserInfoListener) obj, customerInfo);
                break;
        }
    }
}
