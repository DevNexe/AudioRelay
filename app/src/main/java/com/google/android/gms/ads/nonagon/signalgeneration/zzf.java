package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzdxj;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzfdn;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzf {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return "3";
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return "7";
            default:
                return str;
        }
    }

    public static String zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle = zzlVar.zzc;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzc(final zzdxt zzdxtVar, final zzdxj zzdxjVar, final String str, final Pair... pairArr) {
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzga)).booleanValue()) {
            zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zze
                @Override // java.lang.Runnable
                public final void run() {
                    zzdxt zzdxtVar2 = zzdxtVar;
                    zzdxj zzdxjVar2 = zzdxjVar;
                    String str2 = str;
                    Pair[] pairArr2 = pairArr;
                    Map mapZzc = zzdxjVar2 == null ? zzdxtVar2.zzc() : zzdxjVar2.zza();
                    mapZzc.put("action", str2);
                    for (Pair pair : pairArr2) {
                        mapZzc.put((String) pair.first, (String) pair.second);
                    }
                    zzdxtVar2.zze(mapZzc);
                }
            });
        }
    }

    public static int zzd(zzfdn zzfdnVar) {
        if (zzfdnVar.zzq) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfdnVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }
}
