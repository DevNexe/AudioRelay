package com.revenuecat.purchases;

import defpackage.OW8;
import defpackage.cx1;
import defpackage.h81;
import defpackage.wu;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerInfo$latestExpirationDate$2 extends cx1 implements h81<Date> {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // defpackage.h81
    public final Date invoke() {
        List listZ0 = wu.Z0(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return OW8.m((Date) t, (Date) t2);
            }
        });
        if (listZ0.isEmpty()) {
            listZ0 = null;
        }
        if (listZ0 != null) {
            return (Date) wu.N0(listZ0);
        }
        return null;
    }
}
