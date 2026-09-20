package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import defpackage.ex0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcuk implements zzctu {
    public final CookieManager a;

    public zzcuk(Context context) {
        this.a = com.google.android.gms.ads.internal.zzt.zzr().zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    public final void zza(Map map) {
        CookieManager cookieManager = this.a;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaH), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaH);
        String cookie = cookieManager.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List listZzf = zzfss.zzc(zzfrr.zzc(';')).zzf(cookie);
        for (int i = 0; i < listZzf.size(); i++) {
            Iterator it = zzfss.zzc(zzfrr.zzc('=')).zzd((String) listZzf.get(i)).iterator();
            it.getClass();
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException(ex0.b("position (0) must be less than the number of elements that remained (", 0, ")"));
            }
            cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzau))));
        }
    }
}
