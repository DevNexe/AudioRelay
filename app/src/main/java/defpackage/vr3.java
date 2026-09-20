package defpackage;

import com.revenuecat.purchases.PurchasesError;

/* JADX INFO: loaded from: classes.dex */
public final class vr3 extends cx1 implements x81<PurchasesError, Boolean, sd5> {
    public final /* synthetic */ yr3 w;
    public final /* synthetic */ dl4<qa> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr3(yr3 yr3Var, yk4.QnHx qnHx) {
        super(2);
        this.w = yr3Var;
        this.x = qnHx;
    }

    @Override // defpackage.x81
    public final sd5 invoke(PurchasesError purchasesError, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        dl4<qa> dl4Var = this.x;
        yr3.a(this.w, dl4Var, purchasesError, zBooleanValue);
        return sd5.a;
    }
}
