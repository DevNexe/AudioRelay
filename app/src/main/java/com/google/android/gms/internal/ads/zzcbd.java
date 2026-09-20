package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbd {
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;
    public final JSONObject h;
    public final String i;

    public zzcbd(JSONObject jSONObject) {
        this.f = jSONObject.optString("url");
        this.b = jSONObject.optString("base_uri");
        this.c = jSONObject.optString("post_parameters");
        String strOptString = jSONObject.optString("drt_include");
        this.d = strOptString != null && (strOptString.equals("1") || strOptString.equals("true"));
        String strOptString2 = jSONObject.optString("cookies_include", "true");
        this.e = strOptString2 != null && (strOptString2.equals("1") || strOptString2.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString3 = jSONObject.optString("errors");
        this.a = strOptString3 == null ? null : Arrays.asList(strOptString3.split(","));
        this.g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
    }

    public final int zza() {
        return this.g;
    }

    public final String zzb() {
        return this.b;
    }

    public final String zzc() {
        return this.i;
    }

    public final String zzd() {
        return this.c;
    }

    public final String zze() {
        return this.f;
    }

    public final List zzf() {
        return this.a;
    }

    public final JSONObject zzg() {
        return this.h;
    }

    public final boolean zzh() {
        return this.e;
    }

    public final boolean zzi() {
        return this.d;
    }
}
