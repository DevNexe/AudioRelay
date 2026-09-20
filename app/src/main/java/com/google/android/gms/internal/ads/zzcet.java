package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import defpackage.d86;
import defpackage.ft;
import defpackage.y76;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcet {
    public static y76 a;

    public static synchronized zzcet zzd(Context context) {
        try {
            y76 y76Var = a;
            if (y76Var != null) {
                return y76Var;
            }
            Context applicationContext = context.getApplicationContext();
            zzbiy.zzc(applicationContext);
            zzg zzgVarZzh = com.google.android.gms.ads.internal.zzt.zzp().zzh();
            zzgVarZzh.zzr(applicationContext);
            applicationContext.getClass();
            ft ftVarZzB = com.google.android.gms.ads.internal.zzt.zzB();
            ftVarZzB.getClass();
            zzces zzcesVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
            zzguz.zzc(applicationContext, Context.class);
            zzguz.zzc(ftVarZzB, ft.class);
            zzguz.zzc(zzgVarZzh, zzg.class);
            zzguz.zzc(zzcesVarZzo, zzces.class);
            y76 y76Var2 = new y76(applicationContext, ftVarZzB, zzgVarZzh, zzcesVarZzo);
            a = y76Var2;
            y76Var2.b().a();
            a.a().zzc();
            d86 d86VarC = a.c();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzao)).booleanValue()) {
                HashMap map = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaq));
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                        if (jSONArrayOptJSONArray != null) {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                String strOptString = jSONArrayOptJSONArray.optString(i);
                                if (strOptString != null) {
                                    hashSet.add(strOptString);
                                }
                            }
                            map.put(next, hashSet);
                        }
                    }
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        d86VarC.a((String) it.next());
                    }
                    zzcev zzcevVar = new zzcev(d86VarC, map);
                    synchronized (d86VarC) {
                        d86VarC.b.add(zzcevVar);
                    }
                } catch (JSONException e) {
                    zzcgn.zzf("Failed to parse listening list", e);
                }
            }
            return a;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract zzcdu a();
}
