package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import defpackage.t91;

/* JADX INFO: loaded from: classes3.dex */
public class SignalsHandler {
    public void onSignalsCollected(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, t91.SIGNALS, str);
    }

    public void onSignalsCollectionFailed(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, t91.SIGNALS_ERROR, str);
    }
}
