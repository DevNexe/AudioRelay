package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes3.dex */
public final class RCHTTPStatusCodes {
    public static final int CREATED = 201;
    public static final int ERROR = 500;
    public static final RCHTTPStatusCodes INSTANCE = new RCHTTPStatusCodes();
    public static final int NOT_FOUND = 404;
    public static final int NOT_MODIFIED = 304;
    public static final int SUCCESS = 200;
    public static final int UNSUCCESSFUL = 300;

    private RCHTTPStatusCodes() {
    }
}
