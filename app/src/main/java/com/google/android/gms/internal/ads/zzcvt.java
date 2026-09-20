package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvt implements zzgur {
    public final zzgve a;

    public zzcvt(zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzczs) this.a).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
