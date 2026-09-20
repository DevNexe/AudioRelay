package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdos extends zzdot {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final JSONObject h;

    public zzdos(zzfcs zzfcsVar, JSONObject jSONObject) {
        super(zzfcsVar);
        this.b = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "tracking_urls_and_actions", "active_view");
        this.c = com.google.android.gms.ads.internal.util.zzbu.zzk(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = com.google.android.gms.ads.internal.util.zzbu.zzk(false, jSONObject, "attribution", "allow_pub_rendering");
        this.e = com.google.android.gms.ads.internal.util.zzbu.zzk(false, jSONObject, "enable_omid");
        this.g = com.google.android.gms.ads.internal.util.zzbu.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeh)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final zzfdq zza() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new zzfdq(jSONObject) : this.a.zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final String zzb() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final JSONObject zzc() {
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.a.zzA);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzd() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zze() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzf() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzg() {
        return this.f;
    }
}
