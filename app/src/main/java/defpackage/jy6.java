package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class jy6 implements Runnable {
    public final URL w;
    public final /* synthetic */ ly6 x;
    public final ta2 y;

    public jy6(ly6 ly6Var, String str, URL url, ta2 ta2Var) {
        this.x = ly6Var;
        oa3.e(str);
        this.w = url;
        this.y = ta2Var;
    }

    public final void a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        ro6 ro6Var = this.x.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new Runnable() { // from class: gy6
            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArr2;
                dq6 dq6Var = (dq6) this.w.y.x;
                m37 m37Var = dq6Var.l;
                int i2 = i;
                Exception exc = iOException;
                bi6 bi6Var = dq6Var.i;
                if (i2 == 200 || i2 == 204) {
                    if (exc == null) {
                        xj6 xj6Var = dq6Var.h;
                        dq6.f(xj6Var);
                        xj6Var.q.a(true);
                        bArr2 = bArr;
                        if (bArr2 != null || bArr2.length == 0) {
                            dq6.h(bi6Var);
                            bi6Var.m.b("Deferred Deep Link response empty.");
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr2));
                            String strOptString = jSONObject.optString("deeplink", "");
                            String strOptString2 = jSONObject.optString("gclid", "");
                            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                            if (TextUtils.isEmpty(strOptString)) {
                                dq6.h(bi6Var);
                                bi6Var.m.b("Deferred Deep Link is empty.");
                            } else {
                                dq6.f(m37Var);
                                dq6 dq6Var2 = m37Var.a;
                                if (!TextUtils.isEmpty(strOptString)) {
                                    Context context = dq6Var2.a;
                                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("gclid", strOptString2);
                                        bundle.putString("_cis", "ddp");
                                        dq6Var.p.l(bundle, "auto", "_cmp");
                                        if (!TextUtils.isEmpty(strOptString)) {
                                            try {
                                                SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                                editorEdit.putString("deeplink", strOptString);
                                                editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                                if (editorEdit.commit()) {
                                                    context.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                                }
                                            } catch (RuntimeException e) {
                                                bi6 bi6Var2 = dq6Var2.i;
                                                dq6.h(bi6Var2);
                                                bi6Var2.f.c(e, "Failed to persist Deferred Deep Link. exception");
                                            }
                                        }
                                    }
                                }
                                dq6.h(bi6Var);
                                bi6Var.i.d(strOptString2, "Deferred Deep Link validation failed. gclid, deep link", strOptString);
                            }
                            return;
                        } catch (JSONException e2) {
                            dq6.h(bi6Var);
                            bi6Var.f.c(e2, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                } else if (i2 == 304) {
                    i2 = RCHTTPStatusCodes.NOT_MODIFIED;
                    if (exc == null) {
                        xj6 xj6Var2 = dq6Var.h;
                        dq6.f(xj6Var2);
                        xj6Var2.q.a(true);
                        bArr2 = bArr;
                        if (bArr2 != null) {
                        }
                        dq6.h(bi6Var);
                        bi6Var.m.b("Deferred Deep Link response empty.");
                        return;
                    }
                }
                dq6.h(bi6Var);
                bi6Var.i.d(Integer.valueOf(i2), "Network Request for Deferred Deep Link failed. response, exception", exc);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [jy6] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r4;
        ?? r5;
        InputStream inputStream;
        ly6 ly6Var = this.x;
        ro6 ro6Var = ly6Var.a.j;
        dq6.h(ro6Var);
        ro6Var.i();
        dq6 dq6Var = ly6Var.a;
        int i = 0;
        try {
            URLConnection uRLConnectionOpenConnection = this.w.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            dq6Var.getClass();
            ?? r6 = 60000;
            ?? r7 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            dq6Var.getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i2 = inputStream.read(bArr);
                                    if (i2 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        a(responseCode, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = null;
                        }
                    } catch (IOException e) {
                        e = e;
                        IOException iOException = e;
                        i = responseCode;
                        e = iOException;
                        r5 = r7;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(i, e, null, r5);
                    } catch (Throwable th3) {
                        th = th3;
                        Throwable th4 = th;
                        i = responseCode;
                        th = th4;
                        r4 = r6;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(i, null, null, r4);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    r7 = 0;
                    IOException iOException2 = e;
                    i = responseCode;
                    e = iOException2;
                    r5 = r7;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    a(i, e, null, r5);
                } catch (Throwable th5) {
                    th = th5;
                    r6 = 0;
                    Throwable th6 = th;
                    i = responseCode;
                    th = th6;
                    r4 = r6;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    a(i, null, null, r4);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                r5 = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                a(i, e, null, r5);
            } catch (Throwable th7) {
                th = th7;
                r4 = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                a(i, null, null, r4);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            httpURLConnection = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
        }
    }
}
