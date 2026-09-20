package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevx implements zzeum {
    public final String a;

    public zzevx(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        String str = this.a;
        try {
            JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            jSONObjectZzf.put("attok", str);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting attestation token.", e);
        }
    }
}
