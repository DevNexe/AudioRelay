package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import defpackage.ik0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfih {
    public final Context a;
    public final String b;
    public final String c;

    public zzfih(Context context, zzcgt zzcgtVar) {
        this.a = context;
        this.b = context.getPackageName();
        this.c = zzcgtVar.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzq();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzq());
        map.put("app", this.b);
        com.google.android.gms.ads.internal.zzt.zzq();
        Context context = this.a;
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzA(context) ? "0" : "1");
        List listZzb = zzbiy.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfU)).booleanValue()) {
            listZzb.addAll(com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", listZzb));
        map.put("sdkVersion", this.c);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziJ)).booleanValue()) {
            map.put("is_bstar", true == ik0.a(context) ? "1" : "0");
        }
    }
}
