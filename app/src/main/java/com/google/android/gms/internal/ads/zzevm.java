package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevm implements zzeum {
    public final JSONObject a;

    public zzevm(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.a;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectZzf.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting app indexing json.");
        }
    }
}
