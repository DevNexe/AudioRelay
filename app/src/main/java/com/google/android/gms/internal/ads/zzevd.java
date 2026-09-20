package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevd implements zzeum {
    public final AdvertisingIdClient.Info a;
    public final String b;

    public zzevd(AdvertisingIdClient.Info info, String str) {
        this.a = info;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                jSONObjectZzf.put("pdid", this.b);
                jSONObjectZzf.put("pdidtype", "ssaid");
            } else {
                jSONObjectZzf.put("rdid", info.getId());
                jSONObjectZzf.put("is_lat", info.isLimitAdTrackingEnabled());
                jSONObjectZzf.put("idtype", "adid");
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
