package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbok implements zzbpq {
    public final zzbol a;

    public zzbok(zzbol zzbolVar) {
        this.a = zzbolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        zzbol zzbolVar = this.a;
        if (zzbolVar == null) {
            return;
        }
        String str = (String) map.get(MediationMetaData.KEY_NAME);
        if (str == null) {
            zzcgn.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleZza = null;
        if (map.containsKey("info")) {
            try {
                bundleZza = com.google.android.gms.ads.internal.util.zzbu.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                zzcgn.zzh("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleZza == null) {
            zzcgn.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            zzbolVar.zza(str, bundleZza);
        }
    }
}
