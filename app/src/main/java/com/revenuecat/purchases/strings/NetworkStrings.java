package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkStrings {
    public static final String API_REQUEST_COMPLETED = "API request completed with status: %s %s %s";
    public static final String API_REQUEST_STARTED = "API request started: %s %s";
    public static final String ETAG_CALL_ALREADY_RETRIED = "We can't find the cached response, but call has already been retried. Returning result from backend: %s";
    public static final String ETAG_RETRYING_CALL = "We were expecting to be able to return a cached response, but we can't find it. Retrying call with a new ETag";
    public static final String HTTP_RESPONSE_PAYLOAD_NULL = "HTTP Response payload is null";
    public static final NetworkStrings INSTANCE = new NetworkStrings();
    public static final String PROBLEM_CONNECTING = "Unable to start a network connection due to a network configuration issue: %s";
    public static final String SAME_CALL_ALREADY_IN_PROGRESS = "Same call already in progress, adding to callbacks map with key: %s";

    private NetworkStrings() {
    }
}
