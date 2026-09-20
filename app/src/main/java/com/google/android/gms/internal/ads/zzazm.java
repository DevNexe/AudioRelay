package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazm implements zzazr {
    public static final Pattern n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference o = new AtomicReference();
    public final int a;
    public final int b;
    public final String c;
    public final zzazq d;
    public final zzazx e;
    public zzazk f;
    public HttpURLConnection g;
    public InputStream h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public long m;

    public zzazm(String str, zzbai zzbaiVar, zzazx zzazxVar, int i, int i2, boolean z, zzazq zzazqVar) {
        zzazy.zzb(str);
        this.c = str;
        this.e = zzazxVar;
        this.d = new zzazq();
        this.a = i;
        this.b = i2;
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.g = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[Catch: IOException -> 0x0092, TryCatch #0 {IOException -> 0x0092, blocks: (B:2:0x0000, B:7:0x0010, B:9:0x0018, B:10:0x001c, B:12:0x0024, B:15:0x003a, B:17:0x0042, B:18:0x0046, B:19:0x004b, B:20:0x004c, B:21:0x0051, B:22:0x0052, B:25:0x0058, B:27:0x0060, B:30:0x006b, B:31:0x0071, B:33:0x0079, B:36:0x0080, B:37:0x0085, B:38:0x0086, B:40:0x008e), top: B:45:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080 A[Catch: IOException -> 0x0092, TryCatch #0 {IOException -> 0x0092, blocks: (B:2:0x0000, B:7:0x0010, B:9:0x0018, B:10:0x001c, B:12:0x0024, B:15:0x003a, B:17:0x0042, B:18:0x0046, B:19:0x004b, B:20:0x004c, B:21:0x0051, B:22:0x0052, B:25:0x0058, B:27:0x0060, B:30:0x006b, B:31:0x0071, B:33:0x0079, B:36:0x0080, B:37:0x0085, B:38:0x0086, B:40:0x008e), top: B:45:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0086 A[Catch: IOException -> 0x0092, TryCatch #0 {IOException -> 0x0092, blocks: (B:2:0x0000, B:7:0x0010, B:9:0x0018, B:10:0x001c, B:12:0x0024, B:15:0x003a, B:17:0x0042, B:18:0x0046, B:19:0x004b, B:20:0x004c, B:21:0x0051, B:22:0x0052, B:25:0x0058, B:27:0x0060, B:30:0x006b, B:31:0x0071, B:33:0x0079, B:36:0x0080, B:37:0x0085, B:38:0x0086, B:40:0x008e), top: B:45:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008e A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #0 {IOException -> 0x0092, blocks: (B:2:0x0000, B:7:0x0010, B:9:0x0018, B:10:0x001c, B:12:0x0024, B:15:0x003a, B:17:0x0042, B:18:0x0046, B:19:0x004b, B:20:0x004c, B:21:0x0051, B:22:0x0052, B:25:0x0058, B:27:0x0060, B:30:0x006b, B:31:0x0071, B:33:0x0079, B:36:0x0080, B:37:0x0085, B:38:0x0086, B:40:0x008e), top: B:45:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzazi
    public final int zza(byte[] bArr, int i, int i2) throws zzazo {
        int i3;
        try {
            long j = this.l;
            long j2 = this.j;
            zzazx zzazxVar = this.e;
            if (j != j2) {
                AtomicReference atomicReference = o;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j3 = this.l;
                    long j4 = this.j;
                    if (j3 == j4) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i4 = this.h.read(bArr2, 0, (int) Math.min(j4 - j3, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.l += (long) i4;
                    if (zzazxVar != null) {
                        zzazxVar.zzj(this, i4);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j5 = this.k;
            if (j5 != -1) {
                long j6 = j5 - this.m;
                if (j6 != 0) {
                    i2 = (int) Math.min(i2, j6);
                    i3 = this.h.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.m += (long) i3;
                        if (zzazxVar != null) {
                            return i3;
                        }
                        zzazxVar.zzj(this, i3);
                        return i3;
                    }
                    if (this.k == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.h.read(bArr, i, i2);
                if (i3 == -1) {
                    this.m += (long) i3;
                    if (zzazxVar != null) {
                        return i3;
                    }
                    zzazxVar.zzj(this, i3);
                    return i3;
                }
                if (this.k == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzazo(e, this.f, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01db  */
    /* JADX WARN: Code duplicated, block: B:91:0x020d A[Catch: IOException -> 0x025c, TryCatch #4 {IOException -> 0x025c, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:7:0x0042, B:9:0x0048, B:16:0x006c, B:18:0x0086, B:19:0x0097, B:20:0x009c, B:33:0x00d2, B:89:0x0202, B:91:0x020d, B:93:0x021e, B:96:0x0227, B:97:0x0236, B:99:0x023d, B:100:0x0244, B:101:0x0245, B:102:0x025b), top: B:114:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzazi
    public final long zzb(zzazk zzazkVar) throws zzazo {
        int responseCode;
        String headerField;
        String protocol;
        int responseCode2;
        zzazp zzazpVar;
        long j;
        long jMax;
        this.f = zzazkVar;
        long j2 = 0;
        this.m = 0L;
        this.l = 0L;
        try {
            URL url = new URL(zzazkVar.zza.toString());
            long j3 = zzazkVar.zzc;
            long j4 = zzazkVar.zzd;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(this.a);
                httpURLConnection.setReadTimeout(this.b);
                for (Map.Entry entry : this.d.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.c);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.g = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.g.getHeaderFields();
                                a();
                                zzazpVar = new zzazp(responseCode2, headerFields, zzazkVar);
                                if (responseCode2 == 416) {
                                    throw zzazpVar;
                                }
                                zzazpVar.initCause(new zzazj(0));
                                throw zzazpVar;
                            }
                            this.g.getContentType();
                            if (responseCode2 == 200) {
                                j = zzazkVar.zzc;
                                if (j == 0) {
                                    j = 0;
                                }
                            } else {
                                j = 0;
                            }
                            this.j = j;
                            long j5 = zzazkVar.zzd;
                            if (j5 != -1) {
                                this.k = j5;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.g;
                                String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField2);
                                    } catch (NumberFormatException unused) {
                                        Log.e("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField2 + "]");
                                        jMax = -1;
                                    }
                                }
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    Matcher matcher = n.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j6 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < 0) {
                                                jMax = j6;
                                            } else if (jMax != j6) {
                                                Log.w("DefaultHttpDataSource", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                                jMax = Math.max(jMax, j6);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField3 + "]");
                                        }
                                    }
                                }
                                this.k = jMax != -1 ? jMax - this.j : -1L;
                            }
                            try {
                                this.h = this.g.getInputStream();
                                this.i = true;
                                zzazx zzazxVar = this.e;
                                if (zzazxVar != null) {
                                    zzazxVar.zzk(this, zzazkVar);
                                }
                                return this.k;
                            } catch (IOException e) {
                                a();
                                throw new zzazo(e, zzazkVar, 1);
                            }
                        } catch (IOException e2) {
                            a();
                            throw new zzazo("Unable to connect to ".concat(String.valueOf(zzazkVar.zza.toString())), e2, zzazkVar, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j2 = 0;
                } else {
                    j2 = j3;
                }
                String string = "bytes=" + j2 + "-";
                if (j4 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append((j2 + j4) - 1);
                    string = sb.toString();
                }
                httpURLConnection.setRequestProperty("Range", string);
                httpURLConnection.setRequestProperty("User-Agent", this.c);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.g = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.g.getHeaderFields();
                    a();
                    zzazpVar = new zzazp(responseCode2, headerFields2, zzazkVar);
                    if (responseCode2 == 416) {
                        throw zzazpVar;
                    }
                    zzazpVar.initCause(new zzazj(0));
                    throw zzazpVar;
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i = i2;
                j2 = 0;
            }
        } catch (IOException e3) {
            throw new zzazo("Unable to connect to ".concat(String.valueOf(zzazkVar.zza.toString())), e3, zzazkVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /* JADX WARN: Code duplicated, block: B:27:0x004e A[Catch: Exception -> 0x0067, all -> 0x0083, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0014, B:28:0x0067, B:31:0x006e, B:32:0x0076, B:15:0x001f, B:17:0x0027, B:23:0x0036, B:25:0x0046, B:27:0x004e, B:8:0x0011), top: B:43:0x0002, inners: #2 }] */
    @Override // com.google.android.gms.internal.ads.zzazi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.h     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L77
            java.net.HttpURLConnection r2 = r9.g     // Catch: java.lang.Throwable -> L83
            long r3 = r9.k     // Catch: java.lang.Throwable -> L83
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.m     // Catch: java.lang.Throwable -> L83
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.zzban.zza     // Catch: java.lang.Throwable -> L83
            r8 = 19
            if (r7 == r8) goto L1f
            r8 = 20
            if (r7 == r8) goto L1f
            goto L67
        L1f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2f
            int r3 = r2.read()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            r4 = -1
            if (r3 == r4) goto L67
            goto L36
        L2f:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L36
            goto L67
        L36:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            if (r4 != 0) goto L4e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            if (r3 == 0) goto L67
        L4e:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
        L67:
            java.io.InputStream r2 = r9.h     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L83
            r2.close()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L83
            goto L77
        L6d:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzazo r3 = new com.google.android.gms.internal.ads.zzazo     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.ads.zzazk r4 = r9.f     // Catch: java.lang.Throwable -> L83
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L83
            throw r3     // Catch: java.lang.Throwable -> L83
        L77:
            r9.h = r0
            r9.a()
            boolean r0 = r9.i
            if (r0 == 0) goto L82
            r9.i = r1
        L82:
            return
        L83:
            r2 = move-exception
            r9.h = r0
            r9.a()
            boolean r0 = r9.i
            if (r0 == 0) goto L8f
            r9.i = r1
        L8f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazm.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
