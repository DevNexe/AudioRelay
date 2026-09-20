package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqv extends zzbqi {
    public static final /* synthetic */ int zza = 0;
    public WebViewClient a;
    public final H5AdsRequestHandler b;
    public final WebView c;

    public zzbqv(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzfsf.zzf(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.c = webView;
        this.b = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbqu
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                WebView webView2 = webView;
                int i = zzbqv.zza;
                webView2.evaluateJavascript(str, null);
            }
        });
    }

    public final boolean a(WebView webView) {
        if (this.c.equals(webView)) {
            return true;
        }
        zzcgn.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final WebViewClient getDelegate() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzbqi, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (a(webView) && !this.b.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqi, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!a(this.c)) {
            return false;
        }
        if (this.b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.b.clearAdObjects();
    }

    public final void zzb(WebViewClient webViewClient) {
        zzfsf.zzf(webViewClient != this, "Delegate cannot be itself.");
        this.a = webViewClient;
    }

    @Override // com.google.android.gms.internal.ads.zzbqi, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!a(webView)) {
            return false;
        }
        if (this.b.handleH5AdsRequest(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
