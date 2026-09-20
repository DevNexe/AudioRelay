package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import defpackage.iq5;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfld extends zzfla {
    public WebView d;
    public Long e = null;
    public final Map f;

    public zzfld(Map map, String str) {
        this.f = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfla
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new iq5(this), Math.max(4000 - (this.e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfla
    public final void zzf(zzfkd zzfkdVar, zzfkb zzfkbVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapZzi = zzfkbVar.zzi();
        for (String str : mapZzi.keySet()) {
            zzfle.zzh(jSONObject, str, (zzfkj) mapZzi.get(str));
        }
        a(zzfkdVar, zzfkbVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfla
    public final void zzj() {
        WebView webView = new WebView(zzfkr.zzb().zza());
        this.d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.a = new zzfly(this.d);
        WebView webView2 = this.d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Map map = this.f;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.e = Long.valueOf(System.nanoTime());
    }
}
