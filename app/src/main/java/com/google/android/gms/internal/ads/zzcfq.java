package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcfq {
    public final String d;
    public final String e;
    public long f;
    public final JSONObject g;
    public final boolean h;
    public final boolean j;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final ArrayList i = new ArrayList();

    public zzcfq(String str, long j) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.h = false;
        this.j = false;
        this.e = str;
        this.f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.h = false;
                zzcgn.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.h = true;
            this.d = jSONObject.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject2.optString("format");
                    String strOptString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.c.put(strOptString2, new zzbva(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    this.a.add(jSONArrayOptJSONArray3.optString(i2));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfU)).booleanValue() && (jSONObjectOptJSONObject2 = this.g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    this.i.add(jSONArrayOptJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfp)).booleanValue() || (jSONObjectOptJSONObject = this.g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            zzcgn.zzk("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long zza() {
        return this.f;
    }

    public final String zzb() {
        return this.d;
    }

    public final String zzc() {
        return this.e;
    }

    public final List zzd() {
        return this.i;
    }

    public final Map zze() {
        return this.c;
    }

    public final JSONObject zzf() {
        return this.g;
    }

    public final void zzg(long j) {
        this.f = j;
    }

    public final boolean zzh() {
        return this.j;
    }

    public final boolean zzi() {
        return this.h;
    }
}
