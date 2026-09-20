package defpackage;

import com.revenuecat.purchases.PurchasesError;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fr3 extends cx1 implements j81<PurchasesError, sd5> {
    public final /* synthetic */ dl4<List<zg3>> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr3(dl4<List<zg3>> dl4Var) {
        super(1);
        this.w = dl4Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(PurchasesError purchasesError) {
        ((yk4.QnHx) this.w).c(new RuntimeException(purchasesError.getMessage()));
        return sd5.a;
    }
}
