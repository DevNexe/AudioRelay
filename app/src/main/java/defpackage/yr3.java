package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;

/* JADX INFO: loaded from: classes.dex */
public final class yr3 {
    public final Context a;
    public final fm3 b;
    public final lKy3 c;
    public final v9<xq0<String, CustomerInfo>> d = new v9<>();

    public yr3(Context context, fm3 fm3Var, lKy3 lky3) {
        this.a = context;
        this.b = fm3Var;
        this.c = lky3;
    }

    public static final void a(yr3 yr3Var, dl4 dl4Var, PurchasesError purchasesError, boolean z) {
        qa cQf;
        yr3Var.getClass();
        if (z) {
            a62 a62Var = a62.a;
            a62.a.g("purchase_canceled", null);
            cQf = qa.QnHx.a;
        } else if (purchasesError.getCode() == PurchasesErrorCode.PaymentPendingError) {
            a62 a62Var2 = a62.a;
            a62.a.g("purchase_pending", null);
            cQf = qa.F1.a;
        } else {
            PurchasesErrorCode code = purchasesError.getCode();
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.ProductAlreadyPurchasedError;
            Context context = yr3Var.a;
            if (code == purchasesErrorCode) {
                a62.a.f("purchase_failed", new mr3(purchasesError));
                cQf = new qa.CQf(context.getString(R.string.billing_already_owned));
            } else {
                a62.a.f("purchase_failed", new nr3(purchasesError));
                cQf = new qa.CQf(context.getString(R.string.billing_purchase_failed, purchasesError.getCode().getDescription()));
            }
        }
        ((yk4.QnHx) dl4Var).b(cQf);
    }

    public final void b(CustomerInfo customerInfo) {
        EntitlementInfo entitlementInfo = customerInfo.getEntitlements().get("premium");
        a62.a.j("is_premium", String.valueOf(entitlementInfo != null ? entitlementInfo.isActive() : false));
        this.d.accept(new xq0.CQf(customerInfo));
    }
}
