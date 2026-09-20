package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.QnHx;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import defpackage.eh1;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewErrorHandler implements eh1<QnHx> {
    @Override // defpackage.eh1
    public void handleError(QnHx qnHx) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.valueOf(qnHx.getDomain()), qnHx.getErrorCategory(), qnHx.getErrorArguments());
    }
}
