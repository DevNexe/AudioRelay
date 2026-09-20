package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzg {
    public final boolean zza;
    public final String zzb;

    public zzbzg(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static zzbzg zza(JSONObject jSONObject) {
        return new zzbzg(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
