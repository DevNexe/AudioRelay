package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import defpackage.ay5;
import defpackage.d7G;
import j$.util.DesugarTimeZone;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public class zzakp implements zzajt {
    public final zzakr a = new zzakr(4096);

    public zzakp(zzako zzakoVar) {
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x0307  */
    /* JADX WARN: Code duplicated, block: B:151:0x031d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0343  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0395 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzajt
    public zzajw zza(zzaka zzakaVar) throws Throwable {
        zzaky zzakyVar;
        byte[] bArr;
        int iZzb;
        d7G d7g;
        zzajw zzajwVar;
        d7G d7g2;
        int iZzb2;
        Map mapEmptyMap;
        byte[] bArr2;
        byte[] bArrZzb;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                zzajj zzajjVarZzd = zzakaVar.zzd();
                if (zzajjVarZzd == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str = zzajjVarZzd.zzb;
                    if (str != null) {
                        map.put("If-None-Match", str);
                    }
                    long j = zzajjVarZzd.zzd;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                        map.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    mapEmptyMap = map;
                }
                String strZzk = zzakaVar.zzk();
                HashMap map2 = new HashMap();
                map2.putAll(mapEmptyMap);
                map2.putAll(zzakaVar.zzl());
                URL url = new URL(strZzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int iZzb3 = zzakaVar.zzb();
                httpURLConnection.setConnectTimeout(iZzb3);
                httpURLConnection.setReadTimeout(iZzb3);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str2 : map2.keySet()) {
                        httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
                    }
                    if (zzakaVar.zza() != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] bArrZzx = zzakaVar.zzx();
                        if (bArrZzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(bArrZzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != -1) {
                        zzakaVar.zza();
                        if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                            zzakyVar = new zzaky(responseCode, zzalb.a(httpURLConnection.getHeaderFields()), -1, null);
                            httpURLConnection.disconnect();
                        } else {
                            try {
                                zzakyVar = new zzaky(responseCode, zzalb.a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new ay5(httpURLConnection));
                            } catch (Throwable th) {
                                th = th;
                                if (!z) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (IOException e) {
                                        e = e;
                                        zzakyVar = null;
                                        bArr = null;
                                        if (e instanceof SocketTimeoutException) {
                                            d7g = new d7G("socket", new zzaki());
                                        } else {
                                            if (e instanceof MalformedURLException) {
                                                throw new RuntimeException("Bad URL ".concat(String.valueOf(zzakaVar.zzk())), e);
                                            }
                                            if (zzakyVar == null) {
                                                throw new zzajx(e);
                                            }
                                            iZzb = zzakyVar.zzb();
                                            zzakm.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb), zzakaVar.zzk());
                                            if (bArr != null) {
                                                zzajwVar = new zzajw(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzakyVar.zzd());
                                                if (iZzb == 401) {
                                                }
                                                d7g = new d7G("auth", new zzaji(zzajwVar));
                                            } else {
                                                d7g = new d7G("network", new zzajv());
                                            }
                                        }
                                        d7g2 = d7g;
                                        zzajo zzajoVarZzy = zzakaVar.zzy();
                                        iZzb2 = zzakaVar.zzb();
                                        try {
                                            zzajoVarZzy.zzc((zzakj) d7g2.y);
                                            zzakaVar.zzm(String.format("%s-retry [timeout=%s]", (String) d7g2.x, Integer.valueOf(iZzb2)));
                                        } catch (zzakj e2) {
                                            zzakaVar.zzm(String.format("%s-timeout-giveup [timeout=%s]", (String) d7g2.x, Integer.valueOf(iZzb2)));
                                            throw e2;
                                        }
                                    }
                                }
                                throw th;
                            }
                        }
                        try {
                            int iZzb4 = zzakyVar.zzb();
                            List listZzd = zzakyVar.zzd();
                            if (iZzb4 == 304) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                zzajj zzajjVarZzd2 = zzakaVar.zzd();
                                if (zzajjVarZzd2 == null) {
                                    return new zzajw(RCHTTPStatusCodes.NOT_MODIFIED, (byte[]) null, true, jElapsedRealtime2, listZzd);
                                }
                                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                                if (!listZzd.isEmpty()) {
                                    Iterator it = listZzd.iterator();
                                    while (it.hasNext()) {
                                        treeSet.add(((zzajs) it.next()).zza());
                                    }
                                }
                                ArrayList arrayList = new ArrayList(listZzd);
                                List list = zzajjVarZzd2.zzh;
                                if (list != null) {
                                    if (!list.isEmpty()) {
                                        for (zzajs zzajsVar : zzajjVarZzd2.zzh) {
                                            if (!treeSet.contains(zzajsVar.zza())) {
                                                arrayList.add(zzajsVar);
                                            }
                                        }
                                    }
                                } else if (!zzajjVarZzd2.zzg.isEmpty()) {
                                    for (Map.Entry entry : zzajjVarZzd2.zzg.entrySet()) {
                                        if (!treeSet.contains(entry.getKey())) {
                                            arrayList.add(new zzajs((String) entry.getKey(), (String) entry.getValue()));
                                        }
                                    }
                                }
                                return new zzajw(RCHTTPStatusCodes.NOT_MODIFIED, zzajjVarZzd2.zza, true, jElapsedRealtime2, (List) arrayList);
                            }
                            InputStream inputStreamZzc = zzakyVar.zzc();
                            if (inputStreamZzc != null) {
                                int iZza = zzakyVar.zza();
                                zzakr zzakrVar = this.a;
                                zzale zzaleVar = new zzale(zzakrVar, iZza);
                                try {
                                    bArrZzb = zzakrVar.zzb(1024);
                                    while (true) {
                                        try {
                                            int i = inputStreamZzc.read(bArrZzb);
                                            if (i == -1) {
                                                break;
                                            }
                                            zzaleVar.write(bArrZzb, 0, i);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            try {
                                                try {
                                                    inputStreamZzc.close();
                                                } catch (IOException e3) {
                                                    e = e3;
                                                    bArr = null;
                                                    if (e instanceof SocketTimeoutException) {
                                                        d7g = new d7G("socket", new zzaki());
                                                    } else {
                                                        if (e instanceof MalformedURLException) {
                                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzakaVar.zzk())), e);
                                                        }
                                                        if (zzakyVar == null) {
                                                            throw new zzajx(e);
                                                        }
                                                        iZzb = zzakyVar.zzb();
                                                        zzakm.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb), zzakaVar.zzk());
                                                        if (bArr != null) {
                                                            zzajwVar = new zzajw(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzakyVar.zzd());
                                                            if (iZzb == 401 && iZzb != 403) {
                                                                if (iZzb < 400 || iZzb > 499) {
                                                                    throw new zzakh(zzajwVar);
                                                                }
                                                                throw new zzajn(zzajwVar);
                                                            }
                                                            d7g = new d7G("auth", new zzaji(zzajwVar));
                                                        } else {
                                                            d7g = new d7G("network", new zzajv());
                                                        }
                                                    }
                                                    d7g2 = d7g;
                                                    zzajo zzajoVarZzy2 = zzakaVar.zzy();
                                                    iZzb2 = zzakaVar.zzb();
                                                    zzajoVarZzy2.zzc((zzakj) d7g2.y);
                                                    zzakaVar.zzm(String.format("%s-retry [timeout=%s]", (String) d7g2.x, Integer.valueOf(iZzb2)));
                                                }
                                            } catch (IOException unused) {
                                                zzakm.zzd("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            zzakrVar.zza(bArrZzb);
                                            zzaleVar.close();
                                            throw th;
                                        }
                                    }
                                    byte[] byteArray = zzaleVar.toByteArray();
                                    try {
                                        inputStreamZzc.close();
                                    } catch (IOException unused2) {
                                        zzakm.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzakrVar.zza(bArrZzb);
                                    zzaleVar.close();
                                    bArr2 = byteArray;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bArrZzb = null;
                                }
                            } else {
                                bArr2 = new byte[0];
                            }
                            try {
                                long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                if (zzakm.zzb || jElapsedRealtime3 > 3000) {
                                    Object[] objArr = new Object[5];
                                    objArr[0] = zzakaVar;
                                    objArr[1] = Long.valueOf(jElapsedRealtime3);
                                    objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                                    objArr[3] = Integer.valueOf(iZzb4);
                                    objArr[4] = Integer.valueOf(zzakaVar.zzy().zza());
                                    zzakm.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                                }
                                if (iZzb4 < 200 || iZzb4 > 299) {
                                    throw new IOException();
                                }
                                return new zzajw(iZzb4, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzd);
                            } catch (IOException e4) {
                                e = e4;
                                bArr = bArr2;
                                if (e instanceof SocketTimeoutException) {
                                    d7g = new d7G("socket", new zzaki());
                                } else {
                                    if (e instanceof MalformedURLException) {
                                        throw new RuntimeException("Bad URL ".concat(String.valueOf(zzakaVar.zzk())), e);
                                    }
                                    if (zzakyVar == null) {
                                        throw new zzajx(e);
                                    }
                                    iZzb = zzakyVar.zzb();
                                    zzakm.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb), zzakaVar.zzk());
                                    if (bArr != null) {
                                        zzajwVar = new zzajw(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzakyVar.zzd());
                                        if (iZzb == 401) {
                                        }
                                        d7g = new d7G("auth", new zzaji(zzajwVar));
                                    } else {
                                        d7g = new d7G("network", new zzajv());
                                    }
                                }
                                d7g2 = d7g;
                                zzajo zzajoVarZzy3 = zzakaVar.zzy();
                                iZzb2 = zzakaVar.zzb();
                                zzajoVarZzy3.zzc((zzakj) d7g2.y);
                                zzakaVar.zzm(String.format("%s-retry [timeout=%s]", (String) d7g2.x, Integer.valueOf(iZzb2)));
                            }
                        } catch (IOException e5) {
                            e = e5;
                        }
                    } else {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                z = false;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            } catch (IOException e6) {
                e = e6;
            }
            zzakaVar.zzm(String.format("%s-retry [timeout=%s]", (String) d7g2.x, Integer.valueOf(iZzb2)));
        }
    }
}
