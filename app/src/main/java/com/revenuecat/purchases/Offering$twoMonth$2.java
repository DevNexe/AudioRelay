package com.revenuecat.purchases;

import defpackage.cx1;
import defpackage.h81;

/* JADX INFO: loaded from: classes3.dex */
public final class Offering$twoMonth$2 extends cx1 implements h81<Package> {
    final /* synthetic */ Offering this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Offering$twoMonth$2(Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.h81
    public final Package invoke() {
        return this.this$0.findPackage(PackageType.TWO_MONTH);
    }
}
