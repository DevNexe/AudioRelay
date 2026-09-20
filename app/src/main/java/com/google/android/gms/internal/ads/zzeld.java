package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeld implements zzegm {
    public final zzemh a;

    public zzeld(zzemh zzemhVar) {
        this.a = zzemhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    public final zzegn zza(String str, JSONObject jSONObject) {
        zzbwy zzbwyVarZza = this.a.zza(str);
        if (zzbwyVarZza == null) {
            return null;
        }
        return new zzegn(zzbwyVarZza, new zzeig(), str);
    }
}
