package com.google.android.gms.ads.query;

import com.google.android.gms.internal.ads.zzcgn;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AdInfo {
    public final QueryInfo a;
    public final String b;

    public AdInfo(QueryInfo queryInfo, String str) {
        this.a = queryInfo;
        this.b = str;
    }

    public static String getRequestId(String str) {
        if (str == null) {
            zzcgn.zzj("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            zzcgn.zzj("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    public String getAdString() {
        return this.b;
    }

    public QueryInfo getQueryInfo() {
        return this.a;
    }
}
