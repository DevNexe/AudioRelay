package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import defpackage.Md5A;
import defpackage.al6;
import defpackage.bl6;
import defpackage.ft;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfhy {
    public final HashMap a;
    public final bl6 b;

    public zzfhy() {
        HashMap map = new HashMap();
        this.a = map;
        this.b = new bl6(com.google.android.gms.ads.internal.zzt.zzB());
        map.put("new_csi", "1");
    }

    public static zzfhy zzb(String str) {
        zzfhy zzfhyVar = new zzfhy();
        zzfhyVar.a.put("action", str);
        return zzfhyVar;
    }

    public static zzfhy zzc(String str) {
        zzfhy zzfhyVar = new zzfhy();
        zzfhyVar.a.put("request_id", str);
        return zzfhyVar;
    }

    public final zzfhy zza(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final zzfhy zzd(String str) {
        bl6 bl6Var = this.b;
        HashMap map = bl6Var.c;
        boolean zContainsKey = map.containsKey(str);
        ft ftVar = bl6Var.a;
        if (zContainsKey) {
            long jC = ftVar.c();
            long jLongValue = ((Long) map.remove(str)).longValue();
            StringBuilder sb = new StringBuilder();
            sb.append(jC - jLongValue);
            bl6Var.a(str, sb.toString());
        } else {
            map.put(str, Long.valueOf(ftVar.c()));
        }
        return this;
    }

    public final zzfhy zze(String str, String str2) {
        bl6 bl6Var = this.b;
        HashMap map = bl6Var.c;
        boolean zContainsKey = map.containsKey(str);
        ft ftVar = bl6Var.a;
        if (zContainsKey) {
            long jC = ftVar.c();
            long jLongValue = ((Long) map.remove(str)).longValue();
            StringBuilder sbG = Md5A.g(str2);
            sbG.append(jC - jLongValue);
            bl6Var.a(str, sbG.toString());
        } else {
            map.put(str, Long.valueOf(ftVar.c()));
        }
        return this;
    }

    public final zzfhy zzf(zzfcs zzfcsVar) {
        this.a.put("aai", zzfcsVar.zzx);
        return this;
    }

    public final zzfhy zzg(zzfcv zzfcvVar) {
        if (!TextUtils.isEmpty(zzfcvVar.zzb)) {
            this.a.put("gqi", zzfcvVar.zzb);
        }
        return this;
    }

    public final zzfhy zzh(zzfde zzfdeVar, zzcga zzcgaVar) {
        zzfdd zzfddVar = zzfdeVar.zzb;
        zzg(zzfddVar.zzb);
        if (!zzfddVar.zza.isEmpty()) {
            int i = ((zzfcs) zzfddVar.zza.get(0)).zzb;
            HashMap map = this.a;
            switch (i) {
                case 1:
                    map.put("ad_format", "banner");
                    break;
                case 2:
                    map.put("ad_format", "interstitial");
                    break;
                case 3:
                    map.put("ad_format", "native_express");
                    break;
                case 4:
                    map.put("ad_format", "native_advanced");
                    break;
                case 5:
                    map.put("ad_format", "rewarded");
                    break;
                case 6:
                    map.put("ad_format", "app_open_ad");
                    if (zzcgaVar != null) {
                        map.put("as", true != zzcgaVar.zzj() ? "0" : "1");
                    }
                    break;
                default:
                    map.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfhy zzi(Bundle bundle) {
        boolean zContainsKey = bundle.containsKey("cnt");
        HashMap map = this.a;
        if (zContainsKey) {
            map.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            map.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap map = new HashMap(this.a);
        bl6 bl6Var = this.b;
        bl6Var.getClass();
        ArrayList<al6> arrayList = new ArrayList();
        for (Map.Entry entry : bl6Var.b.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i++;
                    arrayList.add(new al6(((String) entry.getKey()) + "." + i, (String) it.next()));
                }
            } else {
                arrayList.add(new al6((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        for (al6 al6Var : arrayList) {
            map.put(al6Var.a, al6Var.b);
        }
        return map;
    }
}
