package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcla implements zzbpq {
    public static final Integer a(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzcgn.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        zzckr zzckrVar;
        zzckz zzclcVar;
        zzckr zzckrVar2;
        zzckr zzckrVar3;
        zzciw zzciwVar = (zzciw) obj;
        if (zzcgn.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcgn.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcks zzcksVarZzz = com.google.android.gms.ads.internal.zzt.zzz();
        if (map.containsKey("abort")) {
            if (zzcksVarZzz.zzd(zzciwVar)) {
                return;
            }
            zzcgn.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numA = a("periodicReportIntervalMs", map);
        Integer numA2 = a("exoPlayerRenderingIntervalMs", map);
        Integer numA3 = a("exoPlayerIdleIntervalMs", map);
        zzciv zzcivVar = new zzciv((String) map.get("flags"));
        boolean z = zzcivVar.zzn;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzcgn.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzcksVarZzz.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzckrVar2 = (zzckr) it.next();
                        if (zzckrVar2.b == zzciwVar && str.equals(zzckrVar2.zze())) {
                            zzckrVar3 = zzckrVar2;
                        }
                    } else {
                        zzckrVar3 = null;
                    }
                }
            } else {
                Iterator it2 = zzcksVarZzz.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zzckrVar2 = (zzckr) it2.next();
                        if (zzckrVar2.b == zzciwVar) {
                            zzckrVar3 = zzckrVar2;
                        }
                    } else {
                        zzckrVar3 = null;
                    }
                }
            }
            if (zzckrVar3 != null) {
                zzcgn.zzj("Precache task is already running.");
                return;
            }
            if (zzciwVar.zzm() == null) {
                zzcgn.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer numA4 = a("player", map);
            if (numA4 == null) {
                numA4 = 0;
            }
            if (numA != null) {
                zzciwVar.zzC(numA.intValue());
            }
            if (numA2 != null) {
                zzciwVar.zzA(numA2.intValue());
            }
            if (numA3 != null) {
                zzciwVar.zzz(numA3.intValue());
            }
            int iIntValue = numA4.intValue();
            zzckl zzcklVar = zzciwVar.zzm().zzb;
            if (iIntValue > 0) {
                int iZzu = zzcin.zzu();
                zzclcVar = iZzu < zzcivVar.zzh ? new zzcli(zzciwVar, zzcivVar) : iZzu < zzcivVar.zzb ? new zzclf(zzciwVar, zzcivVar) : new zzcld(zzciwVar);
            } else {
                zzclcVar = new zzclc(zzciwVar);
            }
            new zzckr(zzciwVar, zzclcVar, str, strArr).zzb();
        } else {
            Iterator it3 = zzcksVarZzz.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    zzckrVar = null;
                    break;
                }
                zzckr zzckrVar4 = (zzckr) it3.next();
                if (zzckrVar4.b == zzciwVar) {
                    zzckrVar = zzckrVar4;
                    break;
                }
            }
            if (zzckrVar == null) {
                zzcgn.zzj("Precache must specify a source.");
                return;
            }
            zzclcVar = zzckrVar.c;
        }
        Integer numA5 = a("minBufferMs", map);
        if (numA5 != null) {
            zzclcVar.zzp(numA5.intValue());
        }
        Integer numA6 = a("maxBufferMs", map);
        if (numA6 != null) {
            zzclcVar.zzo(numA6.intValue());
        }
        Integer numA7 = a("bufferForPlaybackMs", map);
        if (numA7 != null) {
            zzclcVar.zzh(numA7.intValue());
        }
        Integer numA8 = a("bufferForPlaybackAfterRebufferMs", map);
        if (numA8 != null) {
            zzclcVar.zzn(numA8.intValue());
        }
    }
}
