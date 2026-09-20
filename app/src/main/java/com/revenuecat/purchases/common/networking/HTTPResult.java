package com.revenuecat.purchases.common.networking;

import defpackage.bl2;
import defpackage.iv4;
import defpackage.kg0;
import defpackage.ur1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class HTTPResult {
    public static final Companion Companion = new Companion(null);
    private final JSONObject body;
    private final String payload;
    private final int responseCode;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kg0 kg0Var) {
            this();
        }

        public final HTTPResult deserialize(String str) {
            JSONObject jSONObject = new JSONObject(str);
            return new HTTPResult(jSONObject.getInt("responseCode"), jSONObject.getString("payload"));
        }
    }

    public HTTPResult(int i, String str) {
        this.responseCode = i;
        this.payload = str;
        str = iv4.s(str) ^ true ? str : null;
        this.body = str != null ? new JSONObject(str) : new JSONObject();
    }

    public static /* synthetic */ HTTPResult copy$default(HTTPResult hTTPResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hTTPResult.responseCode;
        }
        if ((i2 & 2) != 0) {
            str = hTTPResult.payload;
        }
        return hTTPResult.copy(i, str);
    }

    public final int component1() {
        return this.responseCode;
    }

    public final String component2() {
        return this.payload;
    }

    public final HTTPResult copy(int i, String str) {
        return new HTTPResult(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResult)) {
            return false;
        }
        HTTPResult hTTPResult = (HTTPResult) obj;
        return this.responseCode == hTTPResult.responseCode && ur1.a(this.payload, hTTPResult.payload);
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public int hashCode() {
        return this.payload.hashCode() + (this.responseCode * 31);
    }

    public final String serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("responseCode", this.responseCode);
        jSONObject.put("payload", this.payload);
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HTTPResult(responseCode=");
        sb.append(this.responseCode);
        sb.append(", payload=");
        return bl2.c(sb, this.payload, ')');
    }
}
