package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.QnHx;
import com.unity3d.services.core.webview.WebViewEventCategory;

/* JADX INFO: loaded from: classes3.dex */
public class StoreWebViewError extends QnHx {
    public StoreWebViewError(Enum<?> r1, String str, Object... objArr) {
        super(r1, str, objArr);
    }

    @Override // com.unity3d.scar.adapter.common.QnHx
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
