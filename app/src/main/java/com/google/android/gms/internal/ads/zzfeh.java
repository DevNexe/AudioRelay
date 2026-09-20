package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfeh {
    public static void zza(Context context, boolean z) {
        if (z) {
            zzcgn.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        zzcgn.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzcgg.zzx(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        zzcgn.zzi("Ad failed to load : " + i);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp().zzs(th, str);
    }
}
