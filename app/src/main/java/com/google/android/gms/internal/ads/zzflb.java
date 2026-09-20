package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflb extends zzfla {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzflb(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.a = new zzfly(webView);
    }
}
