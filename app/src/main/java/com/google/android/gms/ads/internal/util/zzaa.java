package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzcmu;
import com.google.android.gms.internal.ads.zzcnp;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zzaa {
    public zzaa() {
    }

    public /* synthetic */ zzaa(int i) {
    }

    public static zzaa zzm(int i) {
        if (i >= 30) {
            return new zzy();
        }
        if (i >= 28) {
            return new zzx();
        }
        if (i >= 26) {
            return new zzv();
        }
        if (i >= 24) {
            return new zzu();
        }
        return i >= 21 ? new zzt() : new zzaa();
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzq();
        if (zzs.zzB()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcgn.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzcmu zzd(zzcmn zzcmnVar, zzbel zzbelVar, boolean z) {
        return new zzcnp(zzcmnVar, zzbelVar, z);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzg(Context context) {
    }

    public int zzh(Context context, TelephonyManager telephonyManager) {
        return AdError.NO_FILL_ERROR_CODE;
    }

    public int zzi(AudioManager audioManager) {
        return 0;
    }

    public void zzj(Activity activity) {
    }

    public int zzl(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
