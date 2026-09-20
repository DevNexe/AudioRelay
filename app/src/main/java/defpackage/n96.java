package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzazr;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcke;
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
public final class n96 implements zzazr {
    public static final Pattern r = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int a;
    public final int b;
    public final String c;
    public final zzazq d;
    public final zzazx e;
    public zzazk f;
    public HttpURLConnection g;
    public final ArrayDeque h;
    public InputStream i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final long p;
    public final long q;

    public n96(String str, zzcke zzckeVar, int i, int i2, long j, long j2) {
        zzazy.zzb(str);
        this.c = str;
        this.e = zzckeVar;
        this.d = new zzazq();
        this.a = i;
        this.b = i2;
        this.h = new ArrayDeque();
        this.p = j;
        this.q = j2;
    }

    public final HttpURLConnection a(int i, long j, long j2) throws zzazo {
        String string = this.f.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.a);
            httpURLConnection.setReadTimeout(this.b);
            for (Map.Entry entry : this.d.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.c);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.h.add(httpURLConnection);
            String string2 = this.f.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    b();
                    throw new m96(responseCode, headerFields, this.f, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.i != null) {
                        inputStream = new SequenceInputStream(this.i, inputStream);
                    }
                    this.i = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    b();
                    throw new zzazo(e, this.f, i);
                }
            } catch (IOException e2) {
                b();
                throw new zzazo("Unable to connect to ".concat(String.valueOf(string2)), e2, this.f, i);
            }
        } catch (IOException e3) {
            throw new zzazo("Unable to connect to ".concat(String.valueOf(string)), e3, this.f, i);
        }
    }

    public final void b() {
        while (true) {
            ArrayDeque arrayDeque = this.h;
            if (arrayDeque.isEmpty()) {
                this.g = null;
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

    @Override // com.google.android.gms.internal.ads.zzazi
    public final int zza(byte[] bArr, int i, int i2) throws zzazo {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.k;
            long j2 = this.l;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = i2;
            long j4 = this.m + j2 + j3;
            long j5 = this.q;
            long j6 = j4 + j5;
            long j7 = this.o;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.n;
                if (j7 < j9) {
                    long jMin = Math.min(j9, Math.max(((this.p + j8) - j5) - 1, (-1) + j8 + j3));
                    a(2, j8, jMin);
                    this.o = jMin;
                    j7 = jMin;
                }
            }
            int i3 = this.i.read(bArr, i, (int) Math.min(j3, ((j7 + 1) - this.m) - this.l));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.l += (long) i3;
            zzazx zzazxVar = this.e;
            if (zzazxVar == null) {
                return i3;
            }
            ((zzcke) zzazxVar).zzW(this, i3);
            return i3;
        } catch (IOException e) {
            throw new zzazo(e, this.f, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final long zzb(zzazk zzazkVar) throws zzazo {
        this.f = zzazkVar;
        this.l = 0L;
        long j = zzazkVar.zzc;
        long j2 = zzazkVar.zzd;
        long jMin = this.p;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.m = j;
        HttpURLConnection httpURLConnectionA = a(1, j, (jMin + j) - 1);
        this.g = httpURLConnectionA;
        String headerField = httpURLConnectionA.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = r.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    long j5 = zzazkVar.zzd;
                    if (j5 != -1) {
                        this.k = j5;
                        this.n = Math.max(j3, (this.m + j5) - 1);
                    } else {
                        this.k = j4 - this.m;
                        this.n = j4 - 1;
                    }
                    this.o = j3;
                    this.j = true;
                    zzazx zzazxVar = this.e;
                    if (zzazxVar != null) {
                        ((zzcke) zzazxVar).zzk(this, zzazkVar);
                    }
                    return this.k;
                } catch (NumberFormatException unused) {
                    zzcgn.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new l96(headerField, zzazkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void zzd() {
        try {
            InputStream inputStream = this.i;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzazo(e, this.f, 3);
                }
            }
            this.i = null;
            b();
            if (this.j) {
                this.j = false;
            }
        } catch (Throwable th) {
            this.i = null;
            b();
            if (this.j) {
                this.j = false;
            }
            throw th;
        }
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
