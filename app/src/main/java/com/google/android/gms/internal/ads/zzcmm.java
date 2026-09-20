package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ex0;
import defpackage.ha6;
import defpackage.ia6;
import defpackage.ja6;
import defpackage.ka6;
import defpackage.la6;
import defpackage.ma6;
import defpackage.na6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcmm extends WebChromeClient {
    public final zzcmn a;

    public zzcmm(zzcmn zzcmnVar) {
        this.a = zzcmnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof zzcmn)) {
            return webView.getContext();
        }
        zzcmn zzcmnVar = (zzcmn) webView;
        Activity activityZzk = zzcmnVar.zzk();
        return activityZzk != null ? activityZzk : zzcmnVar.getContext();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[Catch: BadTokenException -> 0x00c2, TryCatch #0 {BadTokenException -> 0x00c2, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x0017, B:10:0x0021, B:12:0x0027, B:14:0x0045, B:16:0x0056, B:17:0x009b), top: B:22:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x009b A[Catch: BadTokenException -> 0x00c2, TRY_LEAVE, TryCatch #0 {BadTokenException -> 0x00c2, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x0017, B:10:0x0021, B:12:0x0027, B:14:0x0045, B:16:0x0056, B:17:0x009b), top: B:22:0x0007 }] */
    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        com.google.android.gms.ads.internal.zzb zzbVarZzd;
        AlertDialog.Builder builderZzG;
        zzcmn zzcmnVar = this.a;
        if (zzcmnVar != null) {
            try {
                if (zzcmnVar.zzP() != null && zzcmnVar.zzP().zzd() != null && (zzbVarZzd = zzcmnVar.zzP().zzd()) != null && !zzbVarZzd.zzc()) {
                    zzbVarZzd.zzb("window." + str + "('" + str3 + "')");
                    return false;
                }
                com.google.android.gms.ads.internal.zzt.zzq();
                builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(context);
                builderZzG.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builderZzG.setView(linearLayout).setPositiveButton(R.string.ok, new ma6(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new la6(jsPromptResult)).setOnCancelListener(new ka6(jsPromptResult)).create().show();
                } else {
                    builderZzG.setMessage(str3).setPositiveButton(R.string.ok, new ja6(jsResult)).setNegativeButton(R.string.cancel, new ia6(jsResult)).setOnCancelListener(new ha6(jsResult)).create().show();
                }
            } catch (WindowManager.BadTokenException e) {
                zzcgn.zzk("Fail to display Dialog.", e);
            }
        } else {
            com.google.android.gms.ads.internal.zzt.zzq();
            builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(context);
            builderZzG.setTitle(str2);
            if (z) {
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                TextView textView2 = new TextView(context);
                textView2.setText(str3);
                EditText editText2 = new EditText(context);
                editText2.setText(str4);
                linearLayout2.addView(textView2);
                linearLayout2.addView(editText2);
                builderZzG.setView(linearLayout2).setPositiveButton(R.string.ok, new ma6(jsPromptResult, editText2)).setNegativeButton(R.string.cancel, new la6(jsPromptResult)).setOnCancelListener(new ka6(jsPromptResult)).create().show();
            } else {
                builderZzG.setMessage(str3).setPositiveButton(R.string.ok, new ja6(jsResult)).setNegativeButton(R.string.cancel, new ia6(jsResult)).setOnCancelListener(new ha6(jsResult)).create().show();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcmn)) {
            zzcgn.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzN = ((zzcmn) webView).zzN();
        if (zzlVarZzN == null) {
            zzcgn.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzlVarZzN.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder("JS: ");
        sb.append(strMessage);
        sb.append(" (");
        sb.append(strSourceId);
        sb.append(":");
        String strC = ex0.c(sb, iLineNumber, ")");
        if (strC.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = na6.a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzcgn.zzg(strC);
        } else if (i == 2) {
            zzcgn.zzj(strC);
        } else if (i == 3 || i == 4 || i != 5) {
            zzcgn.zzi(strC);
        } else {
            zzcgn.zze(strC);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzcmn zzcmnVar = this.a;
        if (zzcmnVar.zzJ() != null) {
            webView2.setWebViewClient(zzcmnVar.zzJ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072L, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            com.google.android.gms.ads.internal.zzt.zzq();
            zzcmn zzcmnVar = this.a;
            if (com.google.android.gms.ads.internal.util.zzs.zzx(zzcmnVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z = true;
            } else {
                com.google.android.gms.ads.internal.zzt.zzq();
                if (com.google.android.gms.ads.internal.util.zzs.zzx(zzcmnVar.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = true;
                } else {
                    z = false;
                }
            }
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzN = this.a.zzN();
        if (zzlVarZzN == null) {
            zzcgn.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzlVarZzN.zzf();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzN = this.a.zzN();
        if (zzlVarZzN == null) {
            zzcgn.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzlVarZzN.zzA(view, customViewCallback);
            zzlVarZzN.zzy(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
