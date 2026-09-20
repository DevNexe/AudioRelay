package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcts {
    public final Map a;
    public final Map b;

    public zzcts(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final void zza(zzfde zzfdeVar) {
        for (zzfdc zzfdcVar : zzfdeVar.zzb.zzc) {
            String str = zzfdcVar.zza;
            Map map = this.a;
            if (map.containsKey(str)) {
                ((zzctv) map.get(zzfdcVar.zza)).zza(zzfdcVar.zzb);
            } else {
                String str2 = zzfdcVar.zza;
                Map map2 = this.b;
                if (map2.containsKey(str2)) {
                    zzctu zzctuVar = (zzctu) map2.get(zzfdcVar.zza);
                    JSONObject jSONObject = zzfdcVar.zzb;
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzctuVar.zza(map3);
                }
            }
        }
    }
}
