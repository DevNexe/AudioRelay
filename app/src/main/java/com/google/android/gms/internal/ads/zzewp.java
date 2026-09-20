package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewp implements zzeum {
    public final Bundle a;

    public zzewp(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.a;
        if (bundle != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbu.zzf(com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzaw.zzb().zzh(bundle));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
