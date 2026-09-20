package com.revenuecat.purchases;

import defpackage.kg0;

/* JADX INFO: loaded from: classes3.dex */
public enum CacheFetchPolicy {
    CACHE_ONLY,
    FETCH_CURRENT,
    NOT_STALE_CACHED_OR_CURRENT,
    CACHED_OR_FETCHED;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kg0 kg0Var) {
            this();
        }

        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final CacheFetchPolicy m2default() {
            return CacheFetchPolicy.CACHED_OR_FETCHED;
        }
    }
}
