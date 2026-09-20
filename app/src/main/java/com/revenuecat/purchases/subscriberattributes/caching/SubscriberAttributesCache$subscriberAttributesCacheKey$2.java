package com.revenuecat.purchases.subscriberattributes.caching;

import defpackage.cx1;
import defpackage.h81;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributesCache$subscriberAttributesCacheKey$2 extends cx1 implements h81<String> {
    final /* synthetic */ SubscriberAttributesCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesCache$subscriberAttributesCacheKey$2(SubscriberAttributesCache subscriberAttributesCache) {
        super(0);
        this.this$0 = subscriberAttributesCache;
    }

    @Override // defpackage.h81
    public final String invoke() {
        return this.this$0.getDeviceCache$subscriber_attributes_latestDependenciesRelease().newKey("subscriberAttributes");
    }
}
