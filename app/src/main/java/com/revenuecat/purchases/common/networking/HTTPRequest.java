package com.revenuecat.purchases.common.networking;

import defpackage.ur1;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class HTTPRequest {
    private final JSONObject body;
    private final URL fullURL;
    private final Map<String, String> headers;

    public HTTPRequest(URL url, Map<String, String> map, JSONObject jSONObject) {
        this.fullURL = url;
        this.headers = map;
        this.body = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HTTPRequest copy$default(HTTPRequest hTTPRequest, URL url, Map map, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            url = hTTPRequest.fullURL;
        }
        if ((i & 2) != 0) {
            map = hTTPRequest.headers;
        }
        if ((i & 4) != 0) {
            jSONObject = hTTPRequest.body;
        }
        return hTTPRequest.copy(url, map, jSONObject);
    }

    public final URL component1() {
        return this.fullURL;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final JSONObject component3() {
        return this.body;
    }

    public final HTTPRequest copy(URL url, Map<String, String> map, JSONObject jSONObject) {
        return new HTTPRequest(url, map, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPRequest)) {
            return false;
        }
        HTTPRequest hTTPRequest = (HTTPRequest) obj;
        return ur1.a(this.fullURL, hTTPRequest.fullURL) && ur1.a(this.headers, hTTPRequest.headers) && ur1.a(this.body, hTTPRequest.body);
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final URL getFullURL() {
        return this.fullURL;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        int iHashCode = (this.headers.hashCode() + (this.fullURL.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.body;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "HTTPRequest(fullURL=" + this.fullURL + ", headers=" + this.headers + ", body=" + this.body + ')';
    }
}
