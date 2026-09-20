package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import defpackage.CSv;
import defpackage.f50;
import defpackage.g50;
import defpackage.pg3;
import defpackage.yx0;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx {
    public static final long i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};
    public final yx0 a;
    public final pg3<CSv> b;
    public final Executor c;
    public final Random d;
    public final f50 e;
    public final ConfigFetchHttpClient f;
    public final CQf g;
    public final Map<String, String> h;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.QnHx$QnHx, reason: collision with other inner class name */
    public static class C0088QnHx {
        public final int a;
        public final g50 b;
        public final String c;

        public C0088QnHx(int i, g50 g50Var, String str) {
            this.a = i;
            this.b = g50Var;
            this.c = str;
        }
    }

    public QnHx(yx0 yx0Var, pg3 pg3Var, ExecutorService executorService, Random random, f50 f50Var, ConfigFetchHttpClient configFetchHttpClient, CQf cQf, HashMap map) {
        this.a = yx0Var;
        this.b = pg3Var;
        this.c = executorService;
        this.d = random;
        this.e = f50Var;
        this.f = configFetchHttpClient;
        this.g = cQf;
        this.h = map;
    }

    public final C0088QnHx a(String str, String str2, Date date) throws FirebaseRemoteConfigFetchThrottledException, FirebaseRemoteConfigClientException, FirebaseRemoteConfigServerException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f;
            HashMap mapB = b();
            String string = this.g.a.getString("last_fetch_etag", null);
            Map<String, String> map = this.h;
            CSv cSv = this.b.get();
            C0088QnHx c0088QnHxFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapB, string, map, cSv == null ? null : (Long) cSv.a(true).get("_fot"), date);
            String str4 = c0088QnHxFetch.c;
            if (str4 != null) {
                CQf cQf = this.g;
                synchronized (cQf.b) {
                    cQf.a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.g.b(0, CQf.e);
            return c0088QnHxFetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int i2 = e.w;
            boolean z = i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
            CQf cQf2 = this.g;
            if (z) {
                int i3 = cQf2.a().a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                long millis = timeUnit.toMillis(iArr[Math.min(i3, iArr.length) - 1]);
                cQf2.b(i3, new Date(date.getTime() + (millis / 2) + ((long) this.d.nextInt((int) millis))));
            }
            CQf.QnHx qnHxA = cQf2.a();
            int i4 = e.w;
            if (qnHxA.a > 1 || i4 == 429) {
                qnHxA.b.getTime();
                throw new FirebaseRemoteConfigFetchThrottledException();
            }
            if (i4 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i4 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i4 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i4 != 500) {
                    switch (i4) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e.w, "Fetch failed: ".concat(str3), e);
        }
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        CSv cSv = this.b.get();
        if (cSv == null) {
            return map;
        }
        for (Map.Entry<String, Object> entry : cSv.a(false).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }
}
