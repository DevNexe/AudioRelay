package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O3 extends WebViewClient {
    public static byte[] A04;
    public WeakReference<O1> A00 = new WeakReference<>(null);
    public final WeakReference<C1075Xy> A01;
    public final WeakReference<O0> A02;
    public final WeakReference<C0818Nx> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{54, 55, 68, 74, 73, 15, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, 27, 23, 41, 9, 22, 12, 26, 23, 17, 12, -42, 17, 22, 28, 13, 22, 28, -42, 11, 9, 28, 13, 15, 23, 26, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, 23, 20, 28, 24, 10, 23, 4, 11, 6, 17, 17, 7, 6, 8, 16, 4, 26, 23, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public O3(WeakReference<C1075Xy> weakReference, WeakReference<O0> weakReference2, WeakReference<C0818Nx> weakReference3) {
        this.A01 = weakReference;
        this.A02 = weakReference2;
        this.A03 = weakReference3;
    }

    private void A02(String str, C1075Xy c1075Xy) {
        c1075Xy.A06().A8y(A00(11, 11, 101), C04578z.A09, new AnonymousClass90(A00(111, 5, 6) + str));
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(116, 8, 10);
        C1075Xy c1075Xy = this.A01.get();
        if (c1075Xy == null) {
            return false;
        }
        if (TE.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 116).equals(str))) {
            return true;
        }
        try {
            Uri uriA00 = C0745La.A00(str);
            String scheme = uriA00.getScheme();
            try {
                boolean zA0t = JR.A0t(c1075Xy);
                String strA01 = A00(48, 33, 71);
                String strA02 = A00(22, 26, 113);
                String strA03 = A00(105, 6, 103);
                if (zA0t) {
                    if (!TE.A0D.contains(scheme)) {
                        String scheme2 = A00(101, 4, 5);
                        if (!scheme2.equals(scheme)) {
                            if (strA03.equalsIgnoreCase(scheme)) {
                                intent = Intent.parseUri(str, 1);
                                intent.setComponent(null);
                                intent.setSelector(null);
                            } else {
                                intent = new Intent(strA02, uriA00);
                            }
                            intent.addCategory(strA01);
                            if (Build.VERSION.SDK_INT >= 30) {
                                intent.setFlags(268436480);
                            } else {
                                intent.setFlags(268435456);
                            }
                            try {
                                boolean canOpen = LN.A0B(c1075Xy, intent);
                                if (!canOpen) {
                                    A02(str, c1075Xy);
                                }
                                return true;
                            } catch (LL unused) {
                                boolean canOpen2 = strA03.equals(scheme);
                                if (canOpen2) {
                                    String stringExtra = intent.getStringExtra(A00(81, 20, 68));
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        if (!LN.A0B(c1075Xy, new Intent(strA02, C0745La.A00(stringExtra)))) {
                                            A02(str, c1075Xy);
                                        }
                                        return true;
                                    }
                                }
                                AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00(111, 5, 6) + str);
                                anonymousClass90.A03(1);
                                c1075Xy.A06().A8z(A00(11, 11, 101), C04578z.A06, anonymousClass90);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (TE.A0A && strA03.equalsIgnoreCase(scheme)) {
                    Intent uri = Intent.parseUri(str, 1);
                    uri.addCategory(strA01);
                    uri.setComponent(null);
                    uri.setSelector(null);
                    if (c1075Xy.getPackageManager().resolveActivity(uri, 65536) != null && LN.A0B(c1075Xy, uri)) {
                        webView.goBack();
                        return true;
                    }
                } else if ((TE.A0A && C0764Lv.A04(str)) || !TE.A0D.contains(scheme)) {
                    return LN.A0B(c1075Xy, new Intent(strA02, uriA00));
                }
            } catch (Exception e) {
                c1075Xy.A06().A8z(strA00, C04578z.A2a, new AnonymousClass90(e));
                c1075Xy.A0D().A8E(e.toString());
            }
            return false;
        } catch (SecurityException e2) {
            c1075Xy.A06().A8z(strA00, C04578z.A2a, new AnonymousClass90(e2));
            return true;
        }
    }

    public final void A04(WeakReference<O1> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C0818Nx c0818Nx = this.A03.get();
        if (c0818Nx != null) {
            c0818Nx.A03();
        }
        O0 o0 = this.A02.get();
        if (o0 != null) {
            o0.ABg(str);
        }
        O1 o1 = this.A00.get();
        if (o1 != null) {
            o1.AAA(webView.canGoBack());
            o1.AAp(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        O0 o0 = this.A02.get();
        if (o0 != null) {
            o0.ABi(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C1075Xy c1075Xy = this.A01.get();
        if (c1075Xy != null) {
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            sb.append(strA00);
            sb.append(str);
            c1075Xy.A0D().A8B(C0764Lv.A01(i, sb.toString(), strA00 + str2));
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1075Xy c1075Xy = this.A01.get();
        if (c1075Xy != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            sb.append(strA00);
            sb.append((Object) webResourceError.getDescription());
            c1075Xy.A0D().A8B(C0764Lv.A01(errorCode, sb.toString(), strA00 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1075Xy c1075Xy = this.A01.get();
        if (c1075Xy != null) {
            c1075Xy.A0D().A8C();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1075Xy c1075Xy = this.A01.get();
        if (c1075Xy != null) {
            c1075Xy.A0D().A8D();
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        O6.A02(C04578z.A2b);
        O0 o0 = this.A02.get();
        if (o0 != null) {
            o0.AC6();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
