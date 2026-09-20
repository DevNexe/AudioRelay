package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcnp extends zzcnq {
    public zzcnp(zzcmn zzcmnVar, zzbel zzbelVar, boolean z) {
        super(zzcmnVar, zzbelVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmu, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return g(webView, str, null);
    }
}
