package com.revenuecat.purchases;

import defpackage.cx1;
import defpackage.h81;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$lifecycleHandler$2 extends cx1 implements h81<AppLifecycleHandler> {
    final /* synthetic */ Purchases this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$lifecycleHandler$2(Purchases purchases) {
        super(0);
        this.this$0 = purchases;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.h81
    public final AppLifecycleHandler invoke() {
        return new AppLifecycleHandler(this.this$0);
    }
}
