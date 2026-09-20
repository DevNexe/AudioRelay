package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzdxj {
    public final ConcurrentHashMap a;
    public final zzcga b;

    public zzdxj(zzdxt zzdxtVar, zzcga zzcgaVar, zzfdn zzfdnVar, String str, String str2) {
        ConcurrentHashMap concurrentHashMapZzc = zzdxtVar.zzc();
        this.a = concurrentHashMapZzc;
        this.b = zzcgaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzga)).booleanValue()) {
            int iZzd = zzf.zzd(zzfdnVar);
            int i = iZzd - 1;
            if (i == 0) {
                concurrentHashMapZzc.put("scar", "false");
                return;
            }
            if (i == 1) {
                concurrentHashMapZzc.put("se", "query_g");
            } else if (i == 2) {
                concurrentHashMapZzc.put("se", "r_adinfo");
            } else if (i != 3) {
                concurrentHashMapZzc.put("se", "r_both");
            } else {
                concurrentHashMapZzc.put("se", "r_adstring");
            }
            concurrentHashMapZzc.put("scar", "true");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgA)).booleanValue()) {
                concurrentHashMapZzc.put("ad_format", str2);
            }
            if (iZzd == 2) {
                concurrentHashMapZzc.put("rid", str);
            }
            String str3 = zzfdnVar.zzd.zzp;
            if (!TextUtils.isEmpty(str3)) {
                concurrentHashMapZzc.put("ragent", str3);
            }
            String strZza = zzf.zza(zzf.zzb(zzfdnVar.zzd));
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            concurrentHashMapZzc.put("rtype", strZza);
        }
    }

    public final Map zza() {
        return this.a;
    }

    public final void zzb(zzfde zzfdeVar) {
        int size = zzfdeVar.zzb.zza.size();
        ConcurrentHashMap concurrentHashMap = this.a;
        if (size > 0) {
            switch (((zzfcs) zzfdeVar.zzb.zza.get(0)).zzb) {
                case 1:
                    concurrentHashMap.put("ad_format", "banner");
                    break;
                case 2:
                    concurrentHashMap.put("ad_format", "interstitial");
                    break;
                case 3:
                    concurrentHashMap.put("ad_format", "native_express");
                    break;
                case 4:
                    concurrentHashMap.put("ad_format", "native_advanced");
                    break;
                case 5:
                    concurrentHashMap.put("ad_format", "rewarded");
                    break;
                case 6:
                    concurrentHashMap.put("ad_format", "app_open_ad");
                    concurrentHashMap.put("as", true != this.b.zzj() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap.put("ad_format", "unknown");
                    break;
            }
        }
        String str = zzfdeVar.zzb.zzb.zzb;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        concurrentHashMap.put("gqi", str);
    }

    public final void zzc(Bundle bundle) {
        boolean zContainsKey = bundle.containsKey("cnt");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (zContainsKey) {
            concurrentHashMap.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            concurrentHashMap.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
