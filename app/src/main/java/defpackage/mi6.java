package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mi6 implements Runnable {
    public final Map A;
    public final /* synthetic */ oi6 B;
    public final URL w;
    public final byte[] x;
    public final hi6 y;
    public final String z;

    public mi6(oi6 oi6Var, String str, URL url, byte[] bArr, Bt7j bt7j, hi6 hi6Var) {
        this.B = oi6Var;
        oa3.e(str);
        this.w = url;
        this.x = bArr;
        this.y = hi6Var;
        this.z = str;
        this.A = bt7j;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ec: MOVE (r10 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:237), block:B:41:0x00eb */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        Map map;
        int i;
        li6 li6Var;
        ro6 ro6Var;
        Map map2;
        IOException iOException;
        int i2;
        Map map3;
        InputStream inputStream;
        String str = this.z;
        oi6 oi6Var = this.B;
        ro6 ro6Var2 = oi6Var.a.j;
        dq6.h(ro6Var2);
        ro6Var2.i();
        dq6 dq6Var = oi6Var.a;
        OutputStream outputStream2 = null;
        try {
            URLConnection uRLConnectionOpenConnection = this.w.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            dq6Var.getClass();
            httpURLConnection.setConnectTimeout(60000);
            dq6Var.getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map4 = this.A;
                if (map4 != null) {
                    for (Map.Entry entry : map4.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.x;
                if (bArr != null) {
                    b37 b37Var = oi6Var.b.g;
                    r27.E(b37Var);
                    byte[] bArrG = b37Var.G(bArr);
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    wh6 wh6Var = bi6Var.n;
                    int length = bArrG.length;
                    wh6Var.c(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArrG);
                        outputStream.close();
                    } catch (IOException e) {
                        e = e;
                        iOException = e;
                        map2 = null;
                        outputStream2 = outputStream;
                        i2 = 0;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e2) {
                                bi6 bi6Var2 = dq6Var.i;
                                dq6.h(bi6Var2);
                                bi6Var2.f.d(bi6.n(str), "Error closing HTTP compressed POST connection output stream. appId", e2);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        ro6Var = dq6Var.j;
                        dq6.h(ro6Var);
                        li6Var = new li6(this.z, this.y, i2, iOException, null, map2);
                        ro6Var.m(li6Var);
                    } catch (Throwable th) {
                        th = th;
                        map = null;
                        outputStream2 = outputStream;
                        i = 0;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e3) {
                                bi6 bi6Var3 = dq6Var.i;
                                dq6.h(bi6Var3);
                                bi6Var3.f.d(bi6.n(str), "Error closing HTTP compressed POST connection output stream. appId", e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        ro6 ro6Var3 = dq6Var.j;
                        dq6.h(ro6Var3);
                        ro6Var3.m(new li6(this.z, this.y, i, null, null, map));
                        throw th;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i3 = inputStream.read(bArr2);
                                    if (i3 <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, i3);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                ro6Var = dq6Var.j;
                                dq6.h(ro6Var);
                                li6Var = new li6(this.z, this.y, responseCode, null, byteArray, headerFields);
                                ro6Var.m(li6Var);
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        iOException = e;
                        i2 = responseCode;
                        map2 = null;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        ro6Var = dq6Var.j;
                        dq6.h(ro6Var);
                        li6Var = new li6(this.z, this.y, i2, iOException, null, map2);
                    } catch (Throwable th4) {
                        th = th4;
                        i = responseCode;
                        map = map3;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        ro6 ro6Var4 = dq6Var.j;
                        dq6.h(ro6Var4);
                        ro6Var4.m(new li6(this.z, this.y, i, null, null, map));
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    iOException = e;
                    i2 = responseCode;
                    map2 = null;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    ro6Var = dq6Var.j;
                    dq6.h(ro6Var);
                    li6Var = new li6(this.z, this.y, i2, iOException, null, map2);
                } catch (Throwable th5) {
                    th = th5;
                    i = responseCode;
                    map = null;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    ro6 ro6Var5 = dq6Var.j;
                    dq6.h(ro6Var5);
                    ro6Var5.m(new li6(this.z, this.y, i, null, null, map));
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                outputStream = null;
            } catch (Throwable th6) {
                th = th6;
                outputStream = null;
            }
        } catch (IOException e7) {
            e = e7;
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
