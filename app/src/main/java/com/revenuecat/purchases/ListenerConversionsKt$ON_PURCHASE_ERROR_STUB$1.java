package com.revenuecat.purchases;

import defpackage.cx1;
import defpackage.sd5;
import defpackage.x81;

/* JADX INFO: loaded from: classes3.dex */
public final class ListenerConversionsKt$ON_PURCHASE_ERROR_STUB$1 extends cx1 implements x81<PurchasesError, Boolean, sd5> {
    public static final ListenerConversionsKt$ON_PURCHASE_ERROR_STUB$1 INSTANCE = new ListenerConversionsKt$ON_PURCHASE_ERROR_STUB$1();

    public ListenerConversionsKt$ON_PURCHASE_ERROR_STUB$1() {
        super(2);
    }

    @Override // defpackage.x81
    public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError, Boolean bool) {
        invoke(purchasesError, bool.booleanValue());
        return sd5.a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z) {
    }
}
