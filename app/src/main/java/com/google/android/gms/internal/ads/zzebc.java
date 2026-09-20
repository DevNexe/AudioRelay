package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebc implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzebc(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfhp zzfhpVar = (zzfhp) this.a.zzb();
        final CookieManager cookieManagerZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb((Context) this.b.zzb());
        zzfhg zzfhgVarZzi = zzfgz.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerZzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaH));
            }
        }, zzfhj.WEBVIEW_COOKIE, zzfhpVar).zzi(1L, TimeUnit.SECONDS);
        final zzeba zzebaVar = new zzfgs() { // from class: com.google.android.gms.internal.ads.zzeba
            @Override // com.google.android.gms.internal.ads.zzfgs
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzfhgVarZzi.zzc(Exception.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzfhc
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyo.zzi("");
            }
        }).zza();
    }
}
