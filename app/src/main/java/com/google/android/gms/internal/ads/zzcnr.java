package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(21)
public final class zzcnr extends zzcnq {
    public zzcnr(zzcmn zzcmnVar, zzbel zzbelVar, boolean z) {
        super(zzcmnVar, zzbelVar, z);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return g(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
