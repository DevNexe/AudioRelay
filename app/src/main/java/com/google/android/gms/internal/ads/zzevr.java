package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevr implements zzeum {
    public final String a;
    public final int b;

    public zzevr(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        int i;
        JSONObject jSONObject = (JSONObject) obj;
        String str = this.a;
        if (TextUtils.isEmpty(str) || (i = this.b) == -1) {
            return;
        }
        try {
            JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii");
            jSONObjectZzf.put("pvid", str);
            jSONObjectZzf.put("pvid_s", i);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
