package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import defpackage.cx1;
import defpackage.j81;
import defpackage.k70;
import defpackage.sd5;
import defpackage.x81;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingWrapper$consumePurchase$1 extends cx1 implements j81<PurchasesError, sd5> {
    final /* synthetic */ x81<com.android.billingclient.api.NUlFixed, String, sd5> $onConsumed;
    final /* synthetic */ String $token;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumePurchase$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements j81<com.android.billingclient.api.QnHx, sd5> {
        final /* synthetic */ x81<com.android.billingclient.api.NUlFixed, String, sd5> $onConsumed;
        final /* synthetic */ String $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, x81<? super com.android.billingclient.api.NUlFixed, ? super String, sd5> x81Var) {
            super(1);
            this.$token = str;
            this.$onConsumed = x81Var;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(com.android.billingclient.api.QnHx qnHx) {
            invoke2(qnHx);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.QnHx qnHx) {
            String str = this.$token;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            k70 k70Var = new k70();
            k70Var.a = str;
            qnHx.b(k70Var, new CQf(this.$onConsumed));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingWrapper$consumePurchase$1(BillingWrapper billingWrapper, String str, x81<? super com.android.billingclient.api.NUlFixed, ? super String, sd5> x81Var) {
        super(1);
        this.this$0 = billingWrapper;
        this.$token = str;
        this.$onConsumed = x81Var;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        if (purchasesError == null) {
            this.this$0.withConnectedClient(new AnonymousClass1(this.$token, this.$onConsumed));
        }
    }
}
