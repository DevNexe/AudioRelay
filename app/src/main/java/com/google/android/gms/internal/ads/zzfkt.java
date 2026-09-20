package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import defpackage.ta7;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkt {
    public static final zzfkt a = new zzfkt();

    public static void a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            String strConcat = "The WebView is null for ".concat(str);
            if (!zzfjw.zza.booleanValue() || TextUtils.isEmpty(strConcat)) {
                return;
            }
            Log.i("OMIDLIB", strConcat);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("\"\"");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(string2);
        } else {
            handler.post(new ta7(webView, string2));
        }
    }

    public static final zzfkt zza() {
        return a;
    }

    public final void zzc(WebView webView) {
        a(webView, "finishSession", new Object[0]);
    }

    public final void zzd(WebView webView, JSONObject jSONObject) {
        a(webView, "init", jSONObject);
    }

    public final void zze(WebView webView, float f) {
        a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    public final void zzf(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }

    public final void zzg(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
