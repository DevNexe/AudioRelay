package com.revenuecat.purchases.common;

import android.os.Build;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import defpackage.C0239D;
import defpackage.Md5A;
import defpackage.j81;
import defpackage.t92;
import defpackage.uy2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class HTTPClient {
    private final AppConfig appConfig;
    private final ETagManager eTagManager;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            iArr[Store.AMAZON.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager) {
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final JSONObject convert(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0239D.A(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = convert((Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return new JSONObject(linkedHashMap);
    }

    private final HttpURLConnection getConnection(HTTPRequest hTTPRequest) throws IOException {
        URLConnection uRLConnectionOpenConnection = hTTPRequest.getFullURL().openConnection();
        if (uRLConnectionOpenConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        for (Map.Entry<String, String> entry : hTTPRequest.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject body = hTTPRequest.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            writeFully(buffer(httpURLConnection.getOutputStream()), body.toString());
        }
        return httpURLConnection;
    }

    private final Map<String, String> getHeaders(Map<String, String> map, String str, boolean z) {
        uy2[] uy2VarArr = new uy2[9];
        uy2VarArr[0] = new uy2("Content-Type", "application/json");
        uy2VarArr[1] = new uy2("X-Platform", getXPlatformHeader());
        uy2VarArr[2] = new uy2("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor());
        uy2VarArr[3] = new uy2("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion());
        uy2VarArr[4] = new uy2("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        uy2VarArr[5] = new uy2("X-Version", Config.frameworkVersion);
        uy2VarArr[6] = new uy2("X-Client-Locale", this.appConfig.getLanguageTag());
        uy2VarArr[7] = new uy2("X-Client-Version", this.appConfig.getVersionName());
        uy2VarArr[8] = new uy2("X-Observer-Mode-Enabled", this.appConfig.getFinishTransactions() ? "false" : "true");
        return MapExtensionsKt.filterNotNullValues(t92.S(t92.S(t92.Q(uy2VarArr), map), this.eTagManager.getETagHeader$common_latestDependenciesRelease(str, z)));
    }

    private final InputStream getInputStream(HttpURLConnection httpURLConnection) throws Exception {
        try {
            return httpURLConnection.getInputStream();
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException ? true : e instanceof IOException)) {
                throw e;
            }
            LogWrapperKt.log(LogIntent.WARNING, String.format(NetworkStrings.PROBLEM_CONNECTING, Arrays.copyOf(new Object[]{e.getMessage()}, 1)));
            return httpURLConnection.getErrorStream();
        }
    }

    private final String getXPlatformHeader() {
        return WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1 ? "amazon" : MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    public static /* synthetic */ HTTPResult performRequest$default(HTTPClient hTTPClient, String str, Map map, Map map2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return hTTPClient.performRequest(str, map, map2, z);
    }

    private final String readFully(InputStream inputStream) {
        return readFully(buffer(inputStream));
    }

    private final <T> Object tryCast(Object obj, j81<? super T, ? extends Object> j81Var) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    private final void writeFully(BufferedWriter bufferedWriter, String str) throws IOException {
        bufferedWriter.write(str);
        bufferedWriter.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$common_latestDependenciesRelease();
    }

    public final HTTPResult performRequest(String str, Map<String, ? extends Object> map, Map<String, String> map2, boolean z) throws Exception {
        JSONObject jSONObjectConvert = map != null ? convert(map) : null;
        String strConcat = "/v1".concat(str);
        try {
            HttpURLConnection connection = getConnection(new HTTPRequest(new URL(this.appConfig.getBaseURL(), strConcat), getHeaders(map2, strConcat, z), jSONObjectConvert));
            InputStream inputStream = getInputStream(connection);
            try {
                LogIntent logIntent = LogIntent.DEBUG;
                LogWrapperKt.log(logIntent, String.format(NetworkStrings.API_REQUEST_STARTED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), str}, 2)));
                int responseCode = connection.getResponseCode();
                String fully = inputStream != null ? readFully(inputStream) : null;
                if (inputStream != null) {
                    inputStream.close();
                }
                connection.disconnect();
                Md5A.h(new Object[]{connection.getRequestMethod(), str, Integer.valueOf(responseCode)}, 3, NetworkStrings.API_REQUEST_COMPLETED, logIntent);
                if (fully == null) {
                    throw new IOException(NetworkStrings.HTTP_RESPONSE_PAYLOAD_NULL);
                }
                HTTPResult hTTPResultFromCacheOrBackend$common_latestDependenciesRelease = this.eTagManager.getHTTPResultFromCacheOrBackend$common_latestDependenciesRelease(responseCode, fully, connection, strConcat, z);
                if (hTTPResultFromCacheOrBackend$common_latestDependenciesRelease != null) {
                    return hTTPResultFromCacheOrBackend$common_latestDependenciesRelease;
                }
                LogWrapperKt.log(LogIntent.WARNING, NetworkStrings.ETAG_RETRYING_CALL);
                return performRequest(str, map, map2, true);
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                connection.disconnect();
                throw th;
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    private final String readFully(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line = bufferedReader.readLine();
        while (line != null) {
            sb.append(line);
            line = bufferedReader.readLine();
        }
        return sb.toString();
    }
}
