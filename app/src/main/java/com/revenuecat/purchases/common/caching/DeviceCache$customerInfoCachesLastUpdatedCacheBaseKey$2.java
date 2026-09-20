package com.revenuecat.purchases.common.caching;

import defpackage.cx1;
import defpackage.h81;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2 extends cx1 implements h81<String> {
    final /* synthetic */ DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(DeviceCache deviceCache) {
        super(0);
        this.this$0 = deviceCache;
    }

    @Override // defpackage.h81
    public final String invoke() {
        return "com.revenuecat.purchases." + this.this$0.apiKey + ".purchaserInfoLastUpdated";
    }
}
