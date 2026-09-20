package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import defpackage.i56;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbqe implements zzbpq {
    public final Object a = new Object();

    @GuardedBy("lock")
    public final HashMap b = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(FacebookAdapter.KEY_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.a) {
            zzbqd zzbqdVar = (zzbqd) this.b.remove(str);
            if (zzbqdVar == null) {
                zzcgn.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbqdVar.zza(str3 + strConcat);
                return;
            }
            if (str5 == null) {
                zzbqdVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbqdVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzbqdVar.zza(e.getMessage());
            }
        }
    }

    public final zzfyx zzb(zzbsv zzbsvVar, String str, JSONObject jSONObject) {
        zzchf zzchfVar = new zzchf();
        com.google.android.gms.ads.internal.zzt.zzq();
        String string = UUID.randomUUID().toString();
        zzc(string, new i56(zzchfVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FacebookAdapter.KEY_ID, string);
            jSONObject2.put("args", jSONObject);
            zzbsvVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzchfVar.zze(e);
        }
        return zzchfVar;
    }

    public final void zzc(String str, zzbqd zzbqdVar) {
        synchronized (this.a) {
            this.b.put(str, zzbqdVar);
        }
    }
}
