package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import defpackage.mk6;
import defpackage.qc0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfi extends zzep implements zzfs {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final zzfr i;
    public final zzfr j;
    public zzfa k;
    public HttpURLConnection l;
    public InputStream m;
    public boolean n;
    public int o;
    public long p;
    public long q;

    @Deprecated
    public zzfi() {
        this(null, 8000, 8000, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    public final HttpURLConnection d(URL url, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        StringBuilder sbB;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        HashMap map2 = new HashMap();
        map2.putAll(this.i.zza());
        map2.putAll(this.j.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0) {
            sbB = qc0.b("bytes=", j, "-");
            if (j2 != -1) {
                sbB.append((j + j2) - 1);
            }
            string = sbB.toString();
        } else if (j2 == -1) {
            string = null;
        } else {
            j = 0;
            sbB = qc0.b("bytes=", j, "-");
            if (j2 != -1) {
                sbB.append((j + j2) - 1);
            }
            string = sbB.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(zzfa.zza(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL e(URL url, String str, zzfa zzfaVar) throws zzfo {
        if (str == null) {
            throw new zzfo("Null location redirect", zzfaVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzfo("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzfaVar, AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzfo("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzfaVar, AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e) {
            throw new zzfo(e, zzfaVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzdu.zza("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfo {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.p;
            if (j != -1) {
                long j2 = j - this.q;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.m;
                    int i4 = zzel.zza;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.q += (long) i3;
                        zzg(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.m;
                int i5 = zzel.zza;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                    this.q += (long) i3;
                    zzg(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            zzfa zzfaVar = this.k;
            int i6 = zzel.zza;
            throw zzfo.zza(e, zzfaVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzfo {
        HttpURLConnection httpURLConnectionD;
        byte[] bArrZzab;
        long j;
        this.k = zzfaVar;
        this.q = 0L;
        this.p = 0L;
        b(zzfaVar);
        try {
            URL url = new URL(zzfaVar.zza.toString());
            long j2 = zzfaVar.zzf;
            long j3 = zzfaVar.zzg;
            boolean zZzb = zzfaVar.zzb(1);
            if (this.e) {
                URL urlE = url;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i > 20) {
                        throw new zzfo(new NoRouteToHostException("Too many redirects: " + i2), zzfaVar, AdError.INTERNAL_ERROR_CODE, 1);
                    }
                    long j4 = j3;
                    URL url2 = urlE;
                    long j5 = j2;
                    HttpURLConnection httpURLConnectionD2 = d(urlE, j2, j3, zZzb, false, zzfaVar.zzd);
                    int responseCode = httpURLConnectionD2.getResponseCode();
                    String headerField = httpURLConnectionD2.getHeaderField("Location");
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        httpURLConnectionD = httpURLConnectionD2;
                        break;
                    }
                    httpURLConnectionD2.disconnect();
                    urlE = e(url2, headerField, zzfaVar);
                    i = i2;
                    j3 = j4;
                    j2 = j5;
                }
            } else {
                httpURLConnectionD = d(url, j2, j3, zZzb, true, zzfaVar.zzd);
            }
            this.l = httpURLConnectionD;
            this.o = httpURLConnectionD.getResponseCode();
            String responseMessage = httpURLConnectionD.getResponseMessage();
            int i3 = this.o;
            if (i3 < 200 || i3 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionD.getHeaderFields();
                if (this.o == 416) {
                    if (zzfaVar.zzf == zzft.zzb(httpURLConnectionD.getHeaderField("Content-Range"))) {
                        this.n = true;
                        c(zzfaVar);
                        long j6 = zzfaVar.zzg;
                        if (j6 != -1) {
                            return j6;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionD.getErrorStream();
                try {
                    bArrZzab = errorStream != null ? zzel.zzab(errorStream) : zzel.zzf;
                } catch (IOException unused) {
                    bArrZzab = zzel.zzf;
                }
                byte[] bArr = bArrZzab;
                f();
                throw new zzfq(this.o, responseMessage, this.o == 416 ? new zzew(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, zzfaVar, bArr);
            }
            httpURLConnectionD.getContentType();
            if (this.o == 200) {
                j = zzfaVar.zzf;
                if (j == 0) {
                    j = 0;
                }
            } else {
                j = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionD.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                this.p = zzfaVar.zzg;
            } else {
                long j7 = zzfaVar.zzg;
                if (j7 != -1) {
                    this.p = j7;
                } else {
                    long jZza = zzft.zza(httpURLConnectionD.getHeaderField("Content-Length"), httpURLConnectionD.getHeaderField("Content-Range"));
                    this.p = jZza != -1 ? jZza - j : -1L;
                }
            }
            try {
                this.m = httpURLConnectionD.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.m = new GZIPInputStream(this.m);
                }
                this.n = true;
                c(zzfaVar);
                if (j != 0) {
                    try {
                        byte[] bArr2 = new byte[4096];
                        while (j > 0) {
                            int iMin = (int) Math.min(j, 4096L);
                            InputStream inputStream = this.m;
                            int i4 = zzel.zza;
                            int i5 = inputStream.read(bArr2, 0, iMin);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new zzfo(new InterruptedIOException(), zzfaVar, AdError.SERVER_ERROR_CODE, 1);
                            }
                            if (i5 == -1) {
                                throw new zzfo(zzfaVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                            }
                            j -= (long) i5;
                            zzg(i5);
                        }
                    } catch (IOException e) {
                        f();
                        if (e instanceof zzfo) {
                            throw ((zzfo) e);
                        }
                        throw new zzfo(e, zzfaVar, AdError.SERVER_ERROR_CODE, 1);
                    }
                }
                return this.p;
            } catch (IOException e2) {
                f();
                throw new zzfo(e2, zzfaVar, AdError.SERVER_ERROR_CODE, 1);
            }
        } catch (IOException e3) {
            f();
            throw zzfo.zza(e3, zzfaVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d A[Catch: Exception -> 0x0069, all -> 0x008a, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:15:0x001e, B:17:0x0026, B:23:0x0035, B:25:0x0045, B:27:0x004d, B:29:0x0058), top: B:45:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        String name;
        try {
            InputStream inputStream = this.m;
            if (inputStream != null) {
                long j = this.p;
                long j2 = j == -1 ? -1L : j - this.q;
                HttpURLConnection httpURLConnection = this.l;
                if (httpURLConnection != null && zzel.zza <= 20) {
                    try {
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        if (j2 == -1) {
                            if (inputStream2.read() != -1) {
                                name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    superclass.getClass();
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, new Object[0]);
                                }
                            }
                            this.m = null;
                            f();
                            if (this.n) {
                                this.n = false;
                                a();
                            }
                            throw th;
                        }
                        if (j2 > 2048) {
                            name = inputStream2.getClass().getName();
                            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name)) {
                                Class<? super Object> superclass2 = inputStream2.getClass().getSuperclass();
                                superclass2.getClass();
                                Method declaredMethod2 = superclass2.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(inputStream2, new Object[0]);
                            } else {
                                Class<? super Object> superclass3 = inputStream2.getClass().getSuperclass();
                                superclass3.getClass();
                                Method declaredMethod3 = superclass3.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(inputStream2, new Object[0]);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzfa zzfaVar = this.k;
                    int i = zzel.zza;
                    throw new zzfo(e, zzfaVar, AdError.SERVER_ERROR_CODE, 3);
                }
            }
            this.m = null;
            f();
            if (this.n) {
                this.n = false;
                a();
            }
        } catch (Throwable th) {
            this.m = null;
            f();
            if (this.n) {
                this.n = false;
                a();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzep, com.google.android.gms.internal.ads.zzev, com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.l;
        return httpURLConnection == null ? zzfuy.zzd() : new mk6(httpURLConnection.getHeaderFields());
    }

    public zzfi(String str, int i, int i2, boolean z, zzfr zzfrVar) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = zzfrVar;
        this.j = new zzfr();
    }
}
