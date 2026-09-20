package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import defpackage.ik0;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjb {
    public final String a = (String) zzbki.zzb.zze();
    public final LinkedHashMap b;
    public final Context c;
    public final String d;

    public zzbjb(Context context, String str) {
        this.c = context;
        this.d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzq();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzq());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzq();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzA(context) ? "0" : "1");
        Future futureZzb = com.google.android.gms.ads.internal.zzt.zzn().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzcbf) futureZzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzcbf) futureZzb.get()).zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziJ)).booleanValue()) {
            this.b.put("is_bstar", true == ik0.a(context) ? "1" : "0");
        }
    }
}
