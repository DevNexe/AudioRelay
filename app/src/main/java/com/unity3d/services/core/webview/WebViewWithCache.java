package com.unity3d.services.core.webview;

import android.content.Context;
import android.webkit.WebSettings;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewWithCache extends WebView {
    public WebViewWithCache(Context context) {
        super(context);
        WebSettings settings = getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
    }
}
