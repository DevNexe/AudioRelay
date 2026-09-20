package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzazj;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazp;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzazr;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcke;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class j96 implements zzazr {
    public static final Pattern q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference r = new AtomicReference();
    public final int b;
    public final int c;
    public final String d;
    public final zzazq e;
    public final zzazx f;
    public zzazk g;
    public HttpURLConnection h;
    public InputStream i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public int o;
    public final i96 a = new i96(this);
    public final HashSet p = new HashSet();

    public j96(String str, zzcke zzckeVar, int i, int i2, int i3) {
        zzazy.zzb(str);
        this.d = str;
        this.f = zzckeVar;
        this.e = new zzazq();
        this.b = i;
        this.c = i2;
        this.o = i3;
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzcgn.zzh("Unexpected error while disconnecting", e);
            }
            this.h = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: IOException -> 0x0097, TryCatch #0 {IOException -> 0x0097, blocks: (B:2:0x0000, B:7:0x0010, B:9:0x0018, B:10:0x001c, B:12:0x0024, B:15:0x003a, B:17:0x0042, B:18:0x0049, B:19:0x004e, B:20:0x004f, B:21:0x0054, B:22:0x0055, B:25:0x005b, B:27:0x0063, B:30:0x006e, B:31:0x0074, B:33:0x007c, B:36:0x0083, B:37:0x0088, B:38:0x0089, B:40:0x0091), top: B:45:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[Catch: IOException -> 0x0097, TryCatch #0 {IOException -> 0x0097, blocks: (B:2:0x0000, B:7:0x0010, B:9:0x0018, B:10:0x001c, B:12:0x0024, B:15:0x003a, B:17:0x0042, B:18:0x0049, B:19:0x004e, B:20:0x004f, B:21:0x0054, B:22:0x0055, B:25:0x005b, B:27:0x0063, B:30:0x006e, B:31:0x0074, B:33:0x007c, B:36:0x0083, B:37:0x0088, B:38:0x0089, B:40:0x0091), top: B:45:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0089 A[Catch: IOException -> 0x0097, TryCatch #0 {IOException -> 0x0097, blocks: (B:2:0x0000, B:7:0x0010, B:9:0x0018, B:10:0x001c, B:12:0x0024, B:15:0x003a, B:17:0x0042, B:18:0x0049, B:19:0x004e, B:20:0x004f, B:21:0x0054, B:22:0x0055, B:25:0x005b, B:27:0x0063, B:30:0x006e, B:31:0x0074, B:33:0x007c, B:36:0x0083, B:37:0x0088, B:38:0x0089, B:40:0x0091), top: B:45:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091 A[Catch: IOException -> 0x0097, TRY_LEAVE, TryCatch #0 {IOException -> 0x0097, blocks: (B:2:0x0000, B:7:0x0010, B:9:0x0018, B:10:0x001c, B:12:0x0024, B:15:0x003a, B:17:0x0042, B:18:0x0049, B:19:0x004e, B:20:0x004f, B:21:0x0054, B:22:0x0055, B:25:0x005b, B:27:0x0063, B:30:0x006e, B:31:0x0074, B:33:0x007c, B:36:0x0083, B:37:0x0088, B:38:0x0089, B:40:0x0091), top: B:45:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzazi
    public final int zza(byte[] bArr, int i, int i2) throws zzazo {
        int i3;
        try {
            long j = this.m;
            long j2 = this.k;
            zzazx zzazxVar = this.f;
            if (j != j2) {
                AtomicReference atomicReference = r;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j3 = this.m;
                    long j4 = this.k;
                    if (j3 == j4) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i4 = this.i.read(bArr2, 0, (int) Math.min(j4 - j3, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.m += (long) i4;
                    if (zzazxVar != null) {
                        ((zzcke) zzazxVar).zzW(this, i4);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j5 = this.l;
            if (j5 != -1) {
                long j6 = j5 - this.n;
                if (j6 != 0) {
                    i2 = (int) Math.min(i2, j6);
                    i3 = this.i.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.n += (long) i3;
                        if (zzazxVar != null) {
                            return i3;
                        }
                        ((zzcke) zzazxVar).zzW(this, i3);
                        return i3;
                    }
                    if (this.l == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.i.read(bArr, i, i2);
                if (i3 == -1) {
                    this.n += (long) i3;
                    if (zzazxVar != null) {
                        return i3;
                    }
                    ((zzcke) zzazxVar).zzW(this, i3);
                    return i3;
                }
                if (this.l == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzazo(e, this.g, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:93:0x0213 A[Catch: IOException -> 0x0262, TryCatch #1 {IOException -> 0x0262, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:8:0x002e, B:9:0x0036, B:10:0x004e, B:12:0x0054, B:19:0x0078, B:21:0x0092, B:22:0x00a3, B:23:0x00a8, B:36:0x00de, B:91:0x0208, B:93:0x0213, B:95:0x0224, B:98:0x022d, B:99:0x023c, B:101:0x0243, B:102:0x024a, B:103:0x024b, B:104:0x0261), top: B:110:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzazi
    public final long zzb(zzazk zzazkVar) throws zzazo {
        int responseCode;
        String headerField;
        String protocol;
        int responseCode2;
        zzazp zzazpVar;
        long j;
        long jMax;
        this.g = zzazkVar;
        long j2 = 0;
        this.n = 0L;
        this.m = 0L;
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
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.a);
                }
                httpURLConnection.setConnectTimeout(this.b);
                httpURLConnection.setReadTimeout(this.c);
                for (Map.Entry entry : this.e.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.d);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.h = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.h.getHeaderFields();
                                a();
                                zzazpVar = new zzazp(responseCode2, headerFields, zzazkVar);
                                if (responseCode2 == 416) {
                                    throw zzazpVar;
                                }
                                zzazpVar.initCause(new zzazj(0));
                                throw zzazpVar;
                            }
                            if (responseCode2 == 200) {
                                j = zzazkVar.zzc;
                                if (j == 0) {
                                    j = 0;
                                }
                            } else {
                                j = 0;
                            }
                            this.k = j;
                            long j5 = zzazkVar.zzd;
                            if (j5 != -1) {
                                this.l = j5;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.h;
                                String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField2);
                                    } catch (NumberFormatException unused) {
                                        zzcgn.zzg("Unexpected Content-Length [" + headerField2 + "]");
                                        jMax = -1;
                                    }
                                }
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    Matcher matcher = q.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j6 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < 0) {
                                                jMax = j6;
                                            } else if (jMax != j6) {
                                                zzcgn.zzj("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                                jMax = Math.max(jMax, j6);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            zzcgn.zzg("Unexpected Content-Range [" + headerField3 + "]");
                                        }
                                    }
                                }
                                this.l = jMax != -1 ? jMax - this.k : -1L;
                            }
                            try {
                                this.i = this.h.getInputStream();
                                this.j = true;
                                zzazx zzazxVar = this.f;
                                if (zzazxVar != null) {
                                    ((zzcke) zzazxVar).zzk(this, zzazkVar);
                                }
                                return this.l;
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
                httpURLConnection.setRequestProperty("User-Agent", this.d);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.h = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.h.getHeaderFields();
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
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[Catch: Exception -> 0x0069, all -> 0x0088, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:15:0x0021, B:17:0x0029, B:23:0x0038, B:25:0x0048, B:27:0x0050), top: B:45:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    @Override // com.google.android.gms.internal.ads.zzazi
    public final void zzd() {
        String name;
        HashSet hashSet = this.p;
        try {
            if (this.i != null) {
                HttpURLConnection httpURLConnection = this.h;
                long j = this.l;
                if (j != -1) {
                    j -= this.n;
                }
                int i = zzban.zza;
                if (i == 19 || i == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                                name = inputStream.getClass().getName();
                                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream, new Object[0]);
                                }
                            }
                            this.i = null;
                            a();
                            if (this.j) {
                                this.j = false;
                            }
                            hashSet.clear();
                            throw th;
                        }
                        if (j > 2048) {
                            name = inputStream.getClass().getName();
                            if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream")) {
                                Method declaredMethod2 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(inputStream, new Object[0]);
                            } else {
                                Method declaredMethod3 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(inputStream, new Object[0]);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.i.close();
                } catch (IOException e) {
                    throw new zzazo(e, this.g, 3);
                }
            }
            this.i = null;
            a();
            if (this.j) {
                this.j = false;
            }
            hashSet.clear();
        } catch (Throwable th) {
            this.i = null;
            a();
            if (this.j) {
                this.j = false;
            }
            hashSet.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
