package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfcx {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfcx(JsonReader jsonReader) {
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
        this.zzd = jSONObjectZzh;
        this.zza = jSONObjectZzh.optString("ad_html", null);
        this.zzb = jSONObjectZzh.optString("ad_base_url", null);
        this.zzc = jSONObjectZzh.optJSONObject("ad_json");
    }
}
