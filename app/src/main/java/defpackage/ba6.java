package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzep;
import com.google.android.gms.internal.ads.zzew;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfo;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzfr;
import com.google.android.gms.internal.ads.zzfs;
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
public final class ba6 extends zzep implements zzfs {
    public static final Pattern u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference v = new AtomicReference();
    public final aa6 e;
    public final int f;
    public final int g;
    public final String h;
    public final zzfr i;
    public zzfa j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public final HashSet t;

    public ba6(String str, zzcma zzcmaVar, int i, int i2, int i3) {
        super(true);
        this.e = new aa6(this);
        this.t = new HashSet();
        zzdd.zzc(str);
        this.h = str;
        this.i = new zzfr();
        this.f = i;
        this.g = i2;
        this.s = i3;
        if (zzcmaVar != null) {
            zzf(zzcmaVar);
        }
    }

    public final void d() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzcgn.zzh("Unexpected error while disconnecting", e);
            }
            this.k = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[Catch: IOException -> 0x008c, TryCatch #0 {IOException -> 0x008c, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0016, B:10:0x001a, B:12:0x0022, B:15:0x0038, B:16:0x0042, B:17:0x0047, B:18:0x0048, B:19:0x004d, B:20:0x004e, B:23:0x0054, B:25:0x005c, B:28:0x0067, B:29:0x006d, B:31:0x0075, B:34:0x007c, B:35:0x0081, B:36:0x0082), top: B:41:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c A[Catch: IOException -> 0x008c, TryCatch #0 {IOException -> 0x008c, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0016, B:10:0x001a, B:12:0x0022, B:15:0x0038, B:16:0x0042, B:17:0x0047, B:18:0x0048, B:19:0x004d, B:20:0x004e, B:23:0x0054, B:25:0x005c, B:28:0x0067, B:29:0x006d, B:31:0x0075, B:34:0x007c, B:35:0x0081, B:36:0x0082), top: B:41:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[Catch: IOException -> 0x008c, TRY_LEAVE, TryCatch #0 {IOException -> 0x008c, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0016, B:10:0x001a, B:12:0x0022, B:15:0x0038, B:16:0x0042, B:17:0x0047, B:18:0x0048, B:19:0x004d, B:20:0x004e, B:23:0x0054, B:25:0x005c, B:28:0x0067, B:29:0x006d, B:31:0x0075, B:34:0x007c, B:35:0x0081, B:36:0x0082), top: B:41:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfo {
        int i3;
        try {
            if (this.q != this.o) {
                AtomicReference atomicReference = v;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.q;
                    long j2 = this.o;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i4 = this.l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.q += (long) i4;
                    zzg(i4);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.p;
            if (j3 != -1) {
                long j4 = j3 - this.r;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                    i3 = this.l.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.r += (long) i3;
                        zzg(i3);
                        return i3;
                    }
                    if (this.p == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.l.read(bArr, i, i2);
                if (i3 == -1) {
                    this.r += (long) i3;
                    zzg(i3);
                    return i3;
                }
                if (this.p == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzfo(e, this.j, AdError.SERVER_ERROR_CODE, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7 A[Catch: IOException -> 0x028a, TryCatch #0 {IOException -> 0x028a, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x022f, B:96:0x023a, B:98:0x024b, B:101:0x0254, B:102:0x0263, B:104:0x026b, B:105:0x0272, B:106:0x0273, B:107:0x0289), top: B:111:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0201  */
    /* JADX WARN: Code duplicated, block: B:96:0x023a A[Catch: IOException -> 0x028a, TryCatch #0 {IOException -> 0x028a, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x022f, B:96:0x023a, B:98:0x024b, B:101:0x0254, B:102:0x0263, B:104:0x026b, B:105:0x0272, B:106:0x0273, B:107:0x0289), top: B:111:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzfo {
        int responseCode;
        String headerField;
        String protocol;
        int responseCode2;
        zzfq zzfqVar;
        long j;
        long jMax;
        this.j = zzfaVar;
        long j2 = 0;
        this.r = 0L;
        this.q = 0L;
        try {
            URL url = new URL(zzfaVar.zza.toString());
            long j3 = zzfaVar.zzf;
            long j4 = zzfaVar.zzg;
            boolean zZzb = zzfaVar.zzb(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.e);
                }
                httpURLConnection.setConnectTimeout(this.f);
                httpURLConnection.setReadTimeout(this.g);
                for (Map.Entry entry : this.i.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.h);
                    if (!zZzb) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.k = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.n = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.k.getHeaderFields();
                                d();
                                zzfqVar = new zzfq(this.n, null, null, headerFields, zzfaVar, zzel.zzf);
                                if (this.n == 416) {
                                    throw zzfqVar;
                                }
                                zzfqVar.initCause(new zzew(AdError.REMOTE_ADS_SERVICE_ERROR));
                                throw zzfqVar;
                            }
                            if (responseCode2 == 200) {
                                j = zzfaVar.zzf;
                                if (j == 0) {
                                    j = 0;
                                }
                            } else {
                                j = 0;
                            }
                            this.o = j;
                            if (zzfaVar.zzb(1)) {
                                this.p = zzfaVar.zzg;
                            } else {
                                long j5 = zzfaVar.zzg;
                                if (j5 != -1) {
                                    this.p = j5;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.k;
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
                                        Matcher matcher = u.matcher(headerField3);
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
                                    this.p = jMax != -1 ? jMax - this.o : -1L;
                                }
                            }
                            try {
                                this.l = this.k.getInputStream();
                                this.m = true;
                                c(zzfaVar);
                                return this.p;
                            } catch (IOException e) {
                                d();
                                throw new zzfo(e, zzfaVar, AdError.SERVER_ERROR_CODE, 1);
                            }
                        } catch (IOException e2) {
                            d();
                            throw new zzfo("Unable to connect to ".concat(String.valueOf(zzfaVar.zza.toString())), e2, zzfaVar, AdError.SERVER_ERROR_CODE, 1);
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
                httpURLConnection.setRequestProperty("User-Agent", this.h);
                if (!zZzb) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.k = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.n = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.k.getHeaderFields();
                    d();
                    zzfqVar = new zzfq(this.n, null, null, headerFields2, zzfaVar, zzel.zzf);
                    if (this.n == 416) {
                        throw zzfqVar;
                    }
                    zzfqVar.initCause(new zzew(AdError.REMOTE_ADS_SERVICE_ERROR));
                    throw zzfqVar;
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
            throw new zzfo("Unable to connect to ".concat(String.valueOf(zzfaVar.zza.toString())), e3, zzfaVar, AdError.SERVER_ERROR_CODE, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[Catch: Exception -> 0x0069, all -> 0x008d, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:15:0x0021, B:17:0x0029, B:23:0x0038, B:25:0x0048, B:27:0x0050), top: B:45:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        String name;
        HashSet hashSet = this.t;
        try {
            if (this.l != null) {
                HttpURLConnection httpURLConnection = this.k;
                long j = this.p;
                if (j != -1) {
                    j -= this.r;
                }
                int i = zzel.zza;
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
                            this.l = null;
                            d();
                            if (this.m) {
                                this.m = false;
                                a();
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
                    this.l.close();
                } catch (IOException e) {
                    throw new zzfo(e, this.j, AdError.SERVER_ERROR_CODE, 3);
                }
            }
            this.l = null;
            d();
            if (this.m) {
                this.m = false;
                a();
            }
            hashSet.clear();
        } catch (Throwable th) {
            this.l = null;
            d();
            if (this.m) {
                this.m = false;
                a();
            }
            hashSet.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzep, com.google.android.gms.internal.ads.zzev, com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
