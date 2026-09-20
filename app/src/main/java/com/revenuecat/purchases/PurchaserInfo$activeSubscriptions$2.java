package com.revenuecat.purchases;

import defpackage.cx1;
import defpackage.h81;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaserInfo$activeSubscriptions$2 extends cx1 implements h81<Set<? extends String>> {
    final /* synthetic */ PurchaserInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaserInfo$activeSubscriptions$2(PurchaserInfo purchaserInfo) {
        super(0);
        this.this$0 = purchaserInfo;
    }

    @Override // defpackage.h81
    public final Set<? extends String> invoke() {
        PurchaserInfo purchaserInfo = this.this$0;
        return purchaserInfo.activeIdentifiers(purchaserInfo.getAllExpirationDatesByProduct());
    }
}
