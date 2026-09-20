package com.google.android.gms.internal.ads;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import android.util.JsonWriter;
import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.o86;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcgm {
    public static boolean c = false;
    public static boolean d = false;
    public static final /* synthetic */ int zza = 0;
    public final List a;
    public static final Object b = new Object();
    public static final HashSet e = new HashSet(Arrays.asList(new String[0]));

    public zzcgm() {
        this(null);
    }

    public static void b(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzcgn.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public static void zzi() {
        synchronized (b) {
            c = false;
            d = false;
            zzcgn.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized (b) {
            c = true;
            d = z;
        }
    }

    public static boolean zzk(Context context) {
        if (!((Boolean) zzbkk.zza.zze()).booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e2) {
            zzcgn.zzk("Fail to determine debug setting.", e2);
            return false;
        }
    }

    public static boolean zzl() {
        boolean z;
        synchronized (b) {
            z = false;
            if (c && d) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzm() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    public final void a(String str, o86 o86Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            o86Var.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            zzcgn.zzh("unable to log", e2);
        }
        String string = stringWriter.toString();
        synchronized (zzcgm.class) {
            zzcgn.zzi("GMA Debug BEGIN");
            int i = 0;
            while (i < string.length()) {
                int i2 = i + 4000;
                zzcgn.zzi("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i, Math.min(i2, string.length())))));
                i = i2;
            }
            zzcgn.zzi("GMA Debug FINISH");
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzl()) {
            a("onNetworkRequest", new zzcgj(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) {
        if (zzl()) {
            a("onNetworkRequest", new zzcgj(str, "GET", map, bArr));
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i) {
        if (zzl()) {
            String responseMessage = null;
            a("onNetworkResponse", new zzcgh(i, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    zzcgn.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
                }
                a("onNetworkRequestError", new zzcgi(responseMessage));
            }
        }
    }

    public final void zzf(Map map, int i) {
        if (zzl()) {
            a("onNetworkResponse", new zzcgh(i, map));
            if (i < 200 || i >= 300) {
                a("onNetworkRequestError", new zzcgi(null));
            }
        }
    }

    public final void zzg(String str) {
        if (zzl() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        a("onNetworkResponseBody", new o86() { // from class: com.google.android.gms.internal.ads.zzcgk
            @Override // defpackage.o86
            public final void zza(JsonWriter jsonWriter) throws IOException {
                byte[] bArr2 = bArr;
                Object obj = zzcgm.b;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String strEncodeToString = Base64.encodeToString(bArr2, 0);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncodeToString);
                } else {
                    String strZze = zzcgg.zze(strEncodeToString);
                    if (strZze != null) {
                        jsonWriter.name("bodydigest").value(strZze);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzcgm(String str) {
        this.a = !zzl() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }
}
