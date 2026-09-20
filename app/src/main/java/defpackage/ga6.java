package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzep;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfo;
import com.google.android.gms.internal.ads.zzfr;
import com.google.android.gms.internal.ads.zzfs;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ga6 extends zzep implements zzfs {
    public static final Pattern v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int e;
    public final int f;
    public final String g;
    public final zzfr h;
    public zzfa i;
    public HttpURLConnection j;
    public final ArrayDeque k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final long t;
    public final long u;

    public ga6(String str, zzcma zzcmaVar, int i, int i2, long j, long j2) {
        super(true);
        zzdd.zzc(str);
        this.g = str;
        this.h = new zzfr();
        this.e = i;
        this.f = i2;
        this.k = new ArrayDeque();
        this.t = j;
        this.u = j2;
        if (zzcmaVar != null) {
            zzf(zzcmaVar);
        }
    }

    public final HttpURLConnection d(int i, long j, long j2) throws zzfo {
        String string = this.i.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.e);
            httpURLConnection.setReadTimeout(this.f);
            for (Map.Entry entry : this.h.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.k.add(httpURLConnection);
            String string2 = this.i.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    e();
                    throw new fa6(this.n, headerFields, this.i, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.l != null) {
                        inputStream = new SequenceInputStream(this.l, inputStream);
                    }
                    this.l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    e();
                    throw new zzfo(e, this.i, AdError.SERVER_ERROR_CODE, i);
                }
            } catch (IOException e2) {
                e();
                throw new zzfo("Unable to connect to ".concat(String.valueOf(string2)), e2, this.i, AdError.SERVER_ERROR_CODE, i);
            }
        } catch (IOException e3) {
            throw new zzfo("Unable to connect to ".concat(String.valueOf(string)), e3, this.i, AdError.SERVER_ERROR_CODE, i);
        }
    }

    public final void e() {
        while (true) {
            ArrayDeque arrayDeque = this.k;
            if (arrayDeque.isEmpty()) {
                this.j = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e) {
                    zzcgn.zzh("Unexpected error while disconnecting", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfo {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            long j2 = this.p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = i2;
            long j4 = this.q + j2 + j3;
            long j5 = this.u;
            long j6 = j4 + j5;
            long j7 = this.s;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.r;
                if (j7 < j9) {
                    long jMin = Math.min(j9, Math.max(((this.t + j8) - j5) - 1, (-1) + j8 + j3));
                    d(2, j8, jMin);
                    this.s = jMin;
                    j7 = jMin;
                }
            }
            int i3 = this.l.read(bArr, i, (int) Math.min(j3, ((j7 + 1) - this.q) - this.p));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.p += (long) i3;
            zzg(i3);
            return i3;
        } catch (IOException e) {
            throw new zzfo(e, this.i, AdError.SERVER_ERROR_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzfo {
        this.i = zzfaVar;
        this.p = 0L;
        long j = zzfaVar.zzf;
        long j2 = zzfaVar.zzg;
        long jMin = this.t;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.q = j;
        HttpURLConnection httpURLConnectionD = d(1, j, (jMin + j) - 1);
        this.j = httpURLConnectionD;
        String headerField = httpURLConnectionD.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    long j5 = zzfaVar.zzg;
                    if (j5 != -1) {
                        this.o = j5;
                        this.r = Math.max(j3, (this.q + j5) - 1);
                    } else {
                        this.o = j4 - this.q;
                        this.r = j4 - 1;
                    }
                    this.s = j3;
                    this.m = true;
                    c(zzfaVar);
                    return this.o;
                } catch (NumberFormatException unused) {
                    zzcgn.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new ea6(headerField, zzfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzfo(e, this.i, AdError.SERVER_ERROR_CODE, 3);
                }
            }
            this.l = null;
            e();
            if (this.m) {
                this.m = false;
                a();
            }
        } catch (Throwable th) {
            this.l = null;
            e();
            if (this.m) {
                this.m = false;
                a();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzep, com.google.android.gms.internal.ads.zzev, com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
