package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzexc implements zzeum {
    public final String a;

    public zzexc(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        String str = this.a;
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii").put("adsid", str);
        } catch (JSONException e) {
            zzcgn.zzk("Failed putting trustless token.", e);
        }
    }
}
