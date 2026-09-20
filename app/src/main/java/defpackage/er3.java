package defpackage;

import com.revenuecat.purchases.PurchasesError;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class er3 extends cx1 implements j81<PurchasesError, sd5> {
    public final /* synthetic */ dl4<List<zg3>> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er3(yk4.QnHx qnHx) {
        super(1);
        this.w = qnHx;
    }

    @Override // defpackage.j81
    public final sd5 invoke(PurchasesError purchasesError) {
        ((yk4.QnHx) this.w).c(new RuntimeException(purchasesError.getMessage()));
        return sd5.a;
    }
}
