package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdvo {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public JSONObject b;
    public final Executor c;
    public boolean d;
    public JSONObject e;

    public zzdvo(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a() {
        Map map;
        this.d = true;
        zzcfq zzcfqVarZzh = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh();
        if (zzcfqVarZzh == null) {
            return;
        }
        JSONObject jSONObjectZzf = zzcfqVarZzh.zzf();
        if (jSONObjectZzf == null) {
            return;
        }
        this.b = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdd)).booleanValue() ? jSONObjectZzf.optJSONObject("common_settings") : null;
        this.e = jSONObjectZzf.optJSONObject("ad_unit_patterns");
        JSONArray jSONArrayOptJSONArray = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                    String strOptString2 = jSONObjectOptJSONObject.optString("format");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                    if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                        if (this.a.containsKey(strOptString2)) {
                            map = (Map) this.a.get(strOptString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.a.put(strOptString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(strOptString, jSONObjectOptJSONObject2);
                    }
                }
            }
        }
    }

    @CheckForNull
    public final JSONObject zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdd)).booleanValue()) {
            return this.b;
        }
        return null;
    }

    @CheckForNull
    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdc)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.d) {
            a();
        }
        Map map = (Map) this.a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strZza = zzdvq.zza(this.e, str, str2);
        if (strZza == null) {
            return null;
        }
        return (JSONObject) map.get(strZza);
    }

    public final void zzc() {
        com.google.android.gms.ads.internal.zzt.zzp().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvl
            @Override // java.lang.Runnable
            public final void run() {
                final zzdvo zzdvoVar = this.zza;
                zzdvoVar.getClass();
                zzdvoVar.c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdvoVar.a();
                    }
                });
            }
        });
        this.c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.a();
            }
        });
    }
}
