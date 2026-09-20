package com.revenuecat.purchases.common.caching;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import defpackage.kg0;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class InMemoryCachedObject<T> {
    private T cachedInstance;
    private final DateProvider dateProvider;
    private Date lastUpdatedAt;

    public InMemoryCachedObject() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public InMemoryCachedObject(Date date, DateProvider dateProvider) {
        this.lastUpdatedAt = date;
        this.dateProvider = dateProvider;
    }

    public final void cacheInstance(T t) {
        this.cachedInstance = t;
        this.lastUpdatedAt = this.dateProvider.getNow();
    }

    public final void clearCache() {
        clearCacheTimestamp();
        this.cachedInstance = null;
    }

    public final void clearCacheTimestamp() {
        this.lastUpdatedAt = null;
    }

    public final T getCachedInstance() {
        return this.cachedInstance;
    }

    public final Date getLastUpdatedAt$common_latestDependenciesRelease() {
        return this.lastUpdatedAt;
    }

    public final void setCachedInstance(T t) {
        this.cachedInstance = t;
    }

    public final void setLastUpdatedAt$common_latestDependenciesRelease(Date date) {
        this.lastUpdatedAt = date;
    }

    public final void updateCacheTimestamp(Date date) {
        this.lastUpdatedAt = date;
    }

    public /* synthetic */ InMemoryCachedObject(Date date, DateProvider dateProvider, int i, kg0 kg0Var) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
