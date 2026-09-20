package com.revenuecat.purchases.subscriberattributes;

import defpackage.cx1;
import defpackage.h81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1 extends cx1 implements h81<sd5> {
    final /* synthetic */ h81<sd5> $completion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(h81<sd5> h81Var) {
        super(0);
        this.$completion = h81Var;
    }

    @Override // defpackage.h81
    public /* bridge */ /* synthetic */ sd5 invoke() {
        invoke2();
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$completion.invoke();
    }
}
