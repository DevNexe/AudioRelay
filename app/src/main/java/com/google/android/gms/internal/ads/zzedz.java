package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import defpackage.gh1;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedz implements zzfgs {
    public final Context a;
    public final String b;

    public zzedz(Context context, String str, zzcbm zzcbmVar, int i, byte[] bArr) {
        this.a = context;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfgs
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzedy zza(zzedx zzedxVar) throws Throwable {
        int i;
        HttpURLConnection httpURLConnection;
        zzedy zzedyVar;
        zzedz zzedzVar = this;
        String str = zzedxVar.zza;
        int i2 = zzedxVar.zzb;
        Map map = zzedxVar.zzc;
        byte[] bArr = zzedxVar.zzd;
        String str2 = zzedxVar.zze;
        long jC = com.google.android.gms.ads.internal.zzt.zzB().c();
        try {
            zzedy zzedyVar2 = new zzedy();
            zzcgn.zzi("SDK version: " + zzedzVar.b);
            zzcgn.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i3 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    com.google.android.gms.ads.internal.util.zzs zzsVarZzq = com.google.android.gms.ads.internal.zzt.zzq();
                    Context context = zzedzVar.a;
                    String str3 = zzedzVar.b;
                    zzedyVar = zzedyVar2;
                    i = 1;
                    try {
                        try {
                            zzsVarZzq.zze(context, str3, false, httpURLConnection, false, i2);
                            for (Map.Entry entry : map.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                httpURLConnection.setRequestProperty("Content-Type", str2);
                            }
                            int length = bArr.length;
                            Closeable closeable = null;
                            if (length > 0) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                try {
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                    try {
                                        bufferedOutputStream.write(bArr);
                                        gh1.a(bufferedOutputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        closeable = bufferedOutputStream;
                                        gh1.a(closeable);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            zzcgm zzcgmVar = new zzcgm(null);
                            zzcgmVar.zzc(httpURLConnection, bArr);
                            int responseCode = httpURLConnection.getResponseCode();
                            for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                String key = entry2.getKey();
                                List<String> value = entry2.getValue();
                                if (map2.containsKey(key)) {
                                    ((List) map2.get(key)).addAll(value);
                                } else {
                                    map2.put(key, new ArrayList(value));
                                }
                            }
                            zzcgmVar.zze(httpURLConnection, responseCode);
                            zzedyVar.zza = responseCode;
                            zzedyVar.zzb = map2;
                            zzedyVar.zzc = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                                    try {
                                        com.google.android.gms.ads.internal.zzt.zzq();
                                        StringBuilder sb = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int i4 = inputStreamReader.read(cArr);
                                            if (i4 == -1) {
                                                break;
                                            }
                                            sb.append(cArr, 0, i4);
                                        }
                                        String string = sb.toString();
                                        gh1.a(inputStreamReader);
                                        zzcgmVar.zzg(string);
                                        zzedyVar.zzc = string;
                                        if (TextUtils.isEmpty(string)) {
                                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzez)).booleanValue()) {
                                                throw new zzeas(3);
                                            }
                                        }
                                        zzedyVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().c() - jC;
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        closeable = inputStreamReader;
                                        gh1.a(closeable);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } else {
                                if (responseCode < 300 || responseCode >= 400) {
                                    zzcgn.zzj("Received error HTTP response code: " + responseCode);
                                    throw new zzeas(1, "Received error HTTP response code: " + responseCode);
                                }
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    zzcgn.zzj("No location header to follow redirect.");
                                    throw new zzeas(1, "No location header to follow redirect");
                                }
                                URL url2 = new URL(headerField);
                                int i5 = i3 + 1;
                                if (i5 > ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzec)).intValue()) {
                                    zzcgn.zzj("Too many redirects.");
                                    throw new zzeas(1, "Too many redirects");
                                }
                                try {
                                    httpURLConnection.disconnect();
                                    zzedzVar = this;
                                    zzedyVar2 = zzedyVar;
                                    i3 = i5;
                                    url = url2;
                                } catch (IOException e) {
                                    e = e;
                                    String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                    zzcgn.zzj(strConcat);
                                    throw new zzeas(i, strConcat, e);
                                }
                            }
                        } catch (zzeas e2) {
                            e = e2;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhb)).booleanValue()) {
                                throw e;
                            }
                            zzedyVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().c() - jC;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (zzeas e3) {
                    e = e3;
                    zzedyVar = zzedyVar2;
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            httpURLConnection.disconnect();
            return zzedyVar;
        } catch (IOException e4) {
            e = e4;
            i = 1;
        }
    }
}
