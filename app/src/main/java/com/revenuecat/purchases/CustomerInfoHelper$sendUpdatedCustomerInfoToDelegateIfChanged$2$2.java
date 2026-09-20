package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import defpackage.cx1;
import defpackage.h81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerInfoHelper$sendUpdatedCustomerInfoToDelegateIfChanged$2$2 extends cx1 implements h81<sd5> {
    final /* synthetic */ CustomerInfo $info;
    final /* synthetic */ UpdatedCustomerInfoListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoHelper$sendUpdatedCustomerInfoToDelegateIfChanged$2$2(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$info = customerInfo;
    }

    @Override // defpackage.h81
    public /* bridge */ /* synthetic */ sd5 invoke() {
        invoke2();
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$listener.onReceived(this.$info);
    }
}
