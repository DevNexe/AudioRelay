package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends zzcgn {
    public static void zza(String str) {
        if (zzc()) {
            if (str == null || str.length() <= 4000) {
                Log.v(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zzcgn.a.zzd(str)) {
                if (z) {
                    Log.v(AdRequest.LOGTAG, str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean zzc() {
        return zzcgn.zzm(2) && ((Boolean) zzbkr.zza.zze()).booleanValue();
    }
}
