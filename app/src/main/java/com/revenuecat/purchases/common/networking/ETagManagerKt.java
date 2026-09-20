package com.revenuecat.purchases.common.networking;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class ETagManagerKt {
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    private static final String SERIALIZATION_NAME_ETAG = "eTag";
    private static final String SERIALIZATION_NAME_HTTPRESULT = "httpResult";

    public static final String getETagHeader(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getHeaderField(ETAG_HEADER_NAME);
    }
}
