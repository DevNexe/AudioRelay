package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbqi;
import com.google.android.gms.internal.ads.zzbqv;

/* JADX INFO: loaded from: classes.dex */
public final class H5AdsWebViewClient extends zzbqi {
    public final zzbqv a;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.a = new zzbqv(context, webView);
    }

    public void clearAdObjects() {
        this.a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final WebViewClient getDelegate() {
        return this.a;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.a.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.a.zzb(webViewClient);
    }
}
