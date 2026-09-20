package com.revenuecat.purchases.common.networking;

import defpackage.kg0;
import defpackage.ur1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class HTTPResultWithETag {
    public static final Companion Companion = new Companion(null);
    private final String eTag;
    private final HTTPResult httpResult;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kg0 kg0Var) {
            this();
        }

        public final HTTPResultWithETag deserialize(String str) throws JSONException {
            JSONObject jSONObject = new JSONObject(str);
            return new HTTPResultWithETag(jSONObject.getString("eTag"), HTTPResult.Companion.deserialize(jSONObject.getString("httpResult")));
        }
    }

    public HTTPResultWithETag(String str, HTTPResult hTTPResult) {
        this.eTag = str;
        this.httpResult = hTTPResult;
    }

    public static /* synthetic */ HTTPResultWithETag copy$default(HTTPResultWithETag hTTPResultWithETag, String str, HTTPResult hTTPResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hTTPResultWithETag.eTag;
        }
        if ((i & 2) != 0) {
            hTTPResult = hTTPResultWithETag.httpResult;
        }
        return hTTPResultWithETag.copy(str, hTTPResult);
    }

    public final String component1() {
        return this.eTag;
    }

    public final HTTPResult component2() {
        return this.httpResult;
    }

    public final HTTPResultWithETag copy(String str, HTTPResult hTTPResult) {
        return new HTTPResultWithETag(str, hTTPResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResultWithETag)) {
            return false;
        }
        HTTPResultWithETag hTTPResultWithETag = (HTTPResultWithETag) obj;
        return ur1.a(this.eTag, hTTPResultWithETag.eTag) && ur1.a(this.httpResult, hTTPResultWithETag.httpResult);
    }

    public final String getETag() {
        return this.eTag;
    }

    public final HTTPResult getHttpResult() {
        return this.httpResult;
    }

    public int hashCode() {
        return this.httpResult.hashCode() + (this.eTag.hashCode() * 31);
    }

    public final String serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eTag", this.eTag);
        jSONObject.put("httpResult", this.httpResult.serialize());
        return jSONObject.toString();
    }

    public String toString() {
        return "HTTPResultWithETag(eTag=" + this.eTag + ", httpResult=" + this.httpResult + ')';
    }
}
