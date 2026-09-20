package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeix implements zzegm {
    public final zzdvj a;

    public zzeix(zzdvj zzdvjVar) {
        this.a = zzdvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    public final zzegn zza(String str, JSONObject jSONObject) {
        return new zzegn(this.a.zzc(str, jSONObject), new zzeig(), str);
    }
}
