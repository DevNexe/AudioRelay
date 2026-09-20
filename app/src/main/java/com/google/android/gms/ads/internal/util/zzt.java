package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzcmu;
import com.google.android.gms.internal.ads.zzcnr;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public class zzt extends zzaa {
    public zzt() {
        super(0);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zza() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzq();
        if (zzs.zzB()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcgn.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final zzcmu zzd(zzcmn zzcmnVar, zzbel zzbelVar, boolean z) {
        return new zzcnr(zzcmnVar, zzbelVar, z);
    }
}
