package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import defpackage.GoO;
import defpackage.g50;
import defpackage.hx2;
import defpackage.zc1;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j2) {
        this.a = context;
        this.b = str;
        this.c = str2;
        Matcher matcher = h.matcher(str);
        this.d = matcher.matches() ? matcher.group(1) : null;
        this.e = "firebase";
        this.f = j;
        this.g = j2;
    }

    public static JSONObject c(URLConnection uRLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map<String, String> map, Long l) throws FirebaseRemoteConfigClientException {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.b);
        Context context = this.a;
        Locale locale = context.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(i));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(i >= 28 ? hx2.b(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", context.getPackageName());
        map2.put("sdkVersion", "21.1.2");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l != null) {
            long jLongValue = l.longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map2.put("firstOpenTime", simpleDateFormat.format(Long.valueOf(jLongValue)));
        }
        return new JSONObject(map2);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.d, this.e)).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    @Keep
    public QnHx.C0088QnHx fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) {
        String strB;
        boolean z;
        JSONObject jSONObject;
        JSONArray jSONArray;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        Context context = this.a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        JSONObject jSONObject2 = null;
        try {
            byte[] bArrA = GoO.a(context, context.getPackageName());
            if (bArrA == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strB = null;
            } else {
                strB = zc1.b(bArrA);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strB);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            try {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        try {
            d(httpURLConnection, a(str, str2, map, l).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            }
            String headerField = httpURLConnection.getHeaderField("ETag");
            JSONObject jSONObjectC = c(httpURLConnection);
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            try {
                z = !jSONObjectC.get(AdOperationMetric.INIT_STATE).equals("NO_CHANGE");
            } catch (JSONException unused3) {
                z = true;
            }
            if (!z) {
                return new QnHx.C0088QnHx(1, null, null);
            }
            try {
                int i = g50.f;
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject = jSONObjectC.getJSONObject("entries");
                } catch (JSONException unused4) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    try {
                        jSONObject3 = new JSONObject(jSONObject.toString());
                    } catch (JSONException unused5) {
                    }
                }
                try {
                    jSONArray = jSONObjectC.getJSONArray("experimentDescriptions");
                } catch (JSONException unused6) {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    try {
                        jSONArray2 = new JSONArray(jSONArray.toString());
                    } catch (JSONException unused7) {
                    }
                }
                try {
                    jSONObject2 = jSONObjectC.getJSONObject("personalizationMetadata");
                } catch (JSONException unused8) {
                }
                if (jSONObject2 != null) {
                    try {
                        jSONObject4 = new JSONObject(jSONObject2.toString());
                    } catch (JSONException unused9) {
                    }
                }
                return new QnHx.C0088QnHx(0, new g50(jSONObject3, date, jSONArray2, jSONObject4), headerField);
            } catch (JSONException e2) {
                throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e2);
            }
        } catch (IOException | JSONException e3) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e3);
        }
    }
}
