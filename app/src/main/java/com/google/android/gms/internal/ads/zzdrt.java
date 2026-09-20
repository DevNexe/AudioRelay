package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdrt {
    public final Executor a;
    public final zzdro b;

    public zzdrt(Executor executor, zzdro zzdroVar) {
        this.a = executor;
        this.b = zzdroVar;
    }

    public final zzfyx zza(JSONObject jSONObject, String str) {
        zzfyx zzfyxVarZzm;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzfyo.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        int i = 0;
        while (true) {
            Executor executor = this.a;
            if (i >= length) {
                return zzfyo.zzm(zzfyo.zze(arrayList), new zzfru() { // from class: com.google.android.gms.internal.ads.zzdrr
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj) {
                        ArrayList arrayList2 = new ArrayList();
                        for (zzdrs zzdrsVar : (List) obj) {
                            if (zzdrsVar != null) {
                                arrayList2.add(zzdrsVar);
                            }
                        }
                        return arrayList2;
                    }
                }, executor);
            }
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                zzfyxVarZzm = zzfyo.zzi(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(MediationMetaData.KEY_NAME);
                if (strOptString == null) {
                    zzfyxVarZzm = zzfyo.zzi(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    if ("string".equals(strOptString2)) {
                        zzfyxVarZzm = zzfyo.zzi(new zzdrs(strOptString, jSONObjectOptJSONObject.optString("string_value")));
                    } else {
                        zzfyxVarZzm = "image".equals(strOptString2) ? zzfyo.zzm(this.b.zze(jSONObjectOptJSONObject, "image_value"), new zzfru() { // from class: com.google.android.gms.internal.ads.zzdrq
                            @Override // com.google.android.gms.internal.ads.zzfru
                            public final Object apply(Object obj) {
                                return new zzdrs(strOptString, (zzblm) obj);
                            }
                        }, executor) : zzfyo.zzi(null);
                    }
                }
            }
            arrayList.add(zzfyxVarZzm);
            i++;
        }
    }
}
