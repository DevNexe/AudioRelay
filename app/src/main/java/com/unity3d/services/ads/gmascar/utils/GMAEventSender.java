package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import defpackage.t91;

/* JADX INFO: loaded from: classes3.dex */
public class GMAEventSender {
    public void send(t91 t91Var, Object... objArr) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, t91Var, objArr);
    }
}
