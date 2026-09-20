package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeml {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Executor d;
    public JSONObject e;

    public zzeml(zzfyy zzfyyVar) {
        this.d = zzfyyVar;
    }

    public static final Bundle e(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public static void zzc(zzeml zzemlVar) {
        synchronized (zzemlVar) {
            zzemlVar.b.clear();
            zzemlVar.a.clear();
            zzemlVar.c();
            zzemlVar.d();
        }
    }

    public final synchronized ArrayList a(String str, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle bundleE = e(jSONObject.optJSONObject("data"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i, "");
            if (!TextUtils.isEmpty(strOptString)) {
                arrayList2.add(strOptString);
            }
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList2.get(i2);
            zzf(str2);
            if (((zzemn) this.a.get(str2)) != null) {
                arrayList.add(new zzemn(str2, str, bundleE));
            }
        }
        return arrayList;
    }

    public final synchronized void b(String str, String str2, ArrayList arrayList) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.c.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.c.put(str, map);
        List arrayList2 = (List) map.get(str2);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        arrayList2.addAll(arrayList);
        map.put(str2, arrayList2);
    }

    public final synchronized void c() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh().zzf();
        if (jSONObjectZzf != null) {
            try {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                this.e = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzit)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        String strOptString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                arrayList.addAll(a(strOptString, jSONArrayOptJSONArray.getJSONObject(i2)));
                            }
                        }
                        b(strOptString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    public final synchronized void d() {
        if (!((Boolean) zzbkt.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbx)).booleanValue()) {
                JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh().zzf();
                if (jSONObjectZzf == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObjectZzf.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle bundleE = e(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.b.put(strOptString, new zzemp(strOptString, zOptBoolean2, zOptBoolean, bundleE));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    public final synchronized Map zza(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map map = (Map) this.c.get(str);
            if (map == null) {
                return zzfuy.zzd();
            }
            List<zzemn> list = (List) map.get(str2);
            if (list == null) {
                String strZza = zzdvq.zza(this.e, str2, str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzit)).booleanValue()) {
                    strZza = strZza.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(strZza);
            }
            if (list == null) {
                return zzfuy.zzd();
            }
            HashMap map2 = new HashMap();
            for (zzemn zzemnVar : list) {
                String str3 = zzemnVar.zza;
                if (!map2.containsKey(str3)) {
                    map2.put(str3, new ArrayList());
                }
                ((List) map2.get(str3)).add(zzemnVar.zzc);
            }
            return zzfuy.zzc(map2);
        }
        return zzfuy.zzd();
    }

    public final synchronized Map zzb() {
        return zzfuy.zzc(this.b);
    }

    public final void zzd() {
        com.google.android.gms.ads.internal.zzt.zzp().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // java.lang.Runnable
            public final void run() {
                zzeml zzemlVar = this.zza;
                zzemlVar.getClass();
                zzemlVar.d.execute(new zzemk(zzemlVar));
            }
        });
        this.d.execute(new zzemk(this));
    }

    public final synchronized void zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.a.containsKey(str)) {
            return;
        }
        this.a.put(str, new zzemn(str, "", new Bundle()));
    }
}
