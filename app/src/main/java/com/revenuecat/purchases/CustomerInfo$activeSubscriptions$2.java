package com.revenuecat.purchases;

import defpackage.cx1;
import defpackage.h81;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerInfo$activeSubscriptions$2 extends cx1 implements h81<Set<? extends String>> {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$activeSubscriptions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // defpackage.h81
    public final Set<? extends String> invoke() {
        CustomerInfo customerInfo = this.this$0;
        return customerInfo.activeIdentifiers(customerInfo.getAllExpirationDatesByProduct());
    }
}
