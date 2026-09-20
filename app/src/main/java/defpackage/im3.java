package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import com.azefsw.audioconnect.network.exceptions.MessageException;
import com.facebook.ads.AdError;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.remoteconfig.internal.QnHx;
import com.google.protobuf.lPt3Fixed;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class im3 implements yu2, px, fs2, ol4, y14.QnHx, b2J, mi0.QnHx, a90, uw4 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ im3(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.fs2
    public final void a(dr2.QnHx qnHx) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 4:
                tk5.QnHx qnHx2 = new tk5.QnHx();
                ContentResolver contentResolver = ((tk5) obj).a.getContentResolver();
                contentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, qnHx2);
                bm0.m(qnHx, new av3(new sk5(0, contentResolver, qnHx2)));
                qnHx.b(qnHx2);
                return;
            default:
                InputStream inputStreamJ = ((se4) obj).a.j();
                while (!qnHx.e()) {
                    try {
                        try {
                            ad2 ad2Var = (ad2) lPt3Fixed.P(ad2.S, inputStreamJ);
                            if (ad2Var == null) {
                                int i2 = MessageException.x;
                                throw MessageException.QnHx.b();
                            }
                            qnHx.b(ad2Var);
                        } catch (Throwable th) {
                            int i3 = MessageException.x;
                            throw MessageException.QnHx.a(th);
                        }
                    } catch (Throwable th2) {
                        qnHx.c(th2);
                        return;
                    }
                }
                return;
        }
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) throws IOException {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case 7:
                vn vnVar = (vn) obj2;
                vn.QnHx qnHx = (vn.QnHx) obj;
                vnVar.getClass();
                URL url = qnHx.a;
                String strC = y52.c("CctTransportBackend");
                if (Log.isLoggable(strC, 4)) {
                    Log.i(strC, String.format("Making request to: %s", url));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) qnHx.a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(vnVar.g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.7"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = qnHx.c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            vnVar.a.a(qnHx.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer numValueOf = Integer.valueOf(responseCode);
                            String strC2 = y52.c("CctTransportBackend");
                            if (Log.isLoggable(strC2, 4)) {
                                Log.i(strC2, String.format("Status Code: %d", numValueOf));
                            }
                            y52.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                            y52.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                return new vn.CQf(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            }
                            if (responseCode != 200) {
                                return new vn.CQf(responseCode, null, 0L);
                            }
                            InputStream inputStream = httpURLConnection.getInputStream();
                            try {
                                InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                try {
                                    vn.CQf cQf = new vn.CQf(responseCode, null, p52.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                                    if (gZIPInputStream != null) {
                                        gZIPInputStream.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    return cQf;
                                } catch (Throwable th) {
                                    if (gZIPInputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        gZIPInputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                if (inputStream == null) {
                                    throw th3;
                                }
                                try {
                                    inputStream.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                gZIPOutputStream.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        if (outputStream == null) {
                            throw th7;
                        }
                        try {
                            outputStream.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                } catch (EncodingException e) {
                    e = e;
                    y52.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new vn.CQf(400, null, 0L);
                } catch (ConnectException e2) {
                    e = e2;
                    y52.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new vn.CQf(RCHTTPStatusCodes.ERROR, null, 0L);
                } catch (UnknownHostException e3) {
                    e = e3;
                    y52.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new vn.CQf(RCHTTPStatusCodes.ERROR, null, 0L);
                } catch (IOException e4) {
                    e = e4;
                    y52.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new vn.CQf(400, null, 0L);
                }
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                os0 os0Var = y14.B;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    Set hashSet = (Set) map.get(Long.valueOf(j));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j), hashSet);
                    }
                    hashSet.add(new y14.CQf(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    @Override // defpackage.b2J
    public final void b(Bundle bundle) {
        ((sm) this.x).a.b(bundle);
    }

    @Override // defpackage.ol4
    public final void c(yk4.QnHx qnHx) {
        ListenerConversionsKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new cr3(qnHx), new dr3((bs3) this.x, qnHx));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.px
    public final void d(uw.QnHx qnHx) {
        Object qnHx2;
        w9<mc4.QnHx> w9Var;
        mc4.QnHx.CQf cQf;
        w9<mc4.QnHx> w9Var2;
        mc4.QnHx.C0168QnHx c0168QnHx;
        switch (this.w) {
            case 2:
                qc4 qc4Var = (qc4) this.x;
                qc4Var.c.g(mc4.F1.Searching);
                try {
                    DatagramSocket datagramSocket = qc4Var.b;
                    qnHx2 = datagramSocket;
                    if (datagramSocket == null) {
                        DatagramSocket datagramSocket2 = new DatagramSocket((SocketAddress) null);
                        datagramSocket2.setReuseAddress(true);
                        datagramSocket2.setSoTimeout(AdError.NETWORK_ERROR_CODE);
                        datagramSocket2.bind(new InetSocketAddress(59200));
                        qc4Var.b = datagramSocket2;
                        qnHx2 = datagramSocket2;
                    }
                    break;
                } catch (Throwable th) {
                    qnHx2 = new fq3.QnHx(th);
                }
                Throwable thA = fq3.a(qnHx2);
                if (thA != null) {
                    a62.a.b("Creating the search socket failed", thA);
                    qc4Var.e.a(new oc4(thA));
                }
                Throwable thA2 = fq3.a(qnHx2);
                if (thA2 != null) {
                    new mc4.QnHx.C0168QnHx(thA2);
                }
                if (true ^ (qnHx2 instanceof fq3.QnHx)) {
                    DatagramSocket datagramSocket3 = (DatagramSocket) qnHx2;
                    cs0 cs0Var = cs0.w;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    jl3 jl3Var = new jl3();
                    try {
                        long jC = zs.QnHx.a.c();
                        while (!qnHx.e() && zs.QnHx.a.c() - jC < 10000) {
                            mc4.CQf cQfC = qc4.c(datagramSocket3);
                            if (cQfC != null) {
                                linkedHashMap.put(cQfC.a, cQfC);
                                qc4Var.d.g(new mc4.QnHx.CQf(wu.e1(linkedHashMap.values())));
                            }
                        }
                        if (!qnHx.e()) {
                            T t = jl3Var.w;
                            if (t != 0) {
                                a62.a.b("The server search failed", (Throwable) t);
                                qc4Var.e.a(new pc4(jl3Var));
                            }
                            if (jl3Var.w != 0 && linkedHashMap.isEmpty()) {
                                w9Var2 = qc4Var.d;
                                c0168QnHx = new mc4.QnHx.C0168QnHx((Throwable) jl3Var.w);
                                w9Var2.g(c0168QnHx);
                            } else if (linkedHashMap.isEmpty()) {
                                w9Var = qc4Var.d;
                                cQf = new mc4.QnHx.CQf(cs0Var);
                                w9Var.g(cQf);
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            jl3Var.w = th2;
                            if (!qnHx.e()) {
                                T t2 = jl3Var.w;
                                if (t2 != 0) {
                                    a62.a.b("The server search failed", (Throwable) t2);
                                    qc4Var.e.a(new pc4(jl3Var));
                                }
                                if (jl3Var.w != 0 && linkedHashMap.isEmpty()) {
                                    w9Var2 = qc4Var.d;
                                    c0168QnHx = new mc4.QnHx.C0168QnHx((Throwable) jl3Var.w);
                                } else if (linkedHashMap.isEmpty()) {
                                    w9Var = qc4Var.d;
                                    cQf = new mc4.QnHx.CQf(cs0Var);
                                    w9Var.g(cQf);
                                }
                            }
                        } catch (Throwable th3) {
                            if (!qnHx.e()) {
                                T t3 = jl3Var.w;
                                if (t3 != 0) {
                                    a62.a.b("The server search failed", (Throwable) t3);
                                    qc4Var.e.a(new pc4(jl3Var));
                                }
                                if (jl3Var.w != 0 && linkedHashMap.isEmpty()) {
                                    qc4Var.d.g(new mc4.QnHx.C0168QnHx((Throwable) jl3Var.w));
                                } else if (linkedHashMap.isEmpty()) {
                                    qc4Var.d.g(new mc4.QnHx.CQf(cs0Var));
                                }
                            }
                            throw th3;
                        }
                    }
                }
                qc4Var.c.g(mc4.F1.Paused);
                qnHx.b();
                return;
            default:
                ap2 ap2Var = (ap2) this.x;
                ap2Var.a.registerReceiver((ex1) ap2Var.d.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                bm0.m(qnHx, new av3(new yo2(ap2Var, 0)));
                return;
        }
    }

    @Override // defpackage.uw4
    public final w05 e(Object obj) {
        QnHx.C0088QnHx c0088QnHx = (QnHx.C0088QnHx) this.x;
        int[] iArr = QnHx.j;
        return k15.e(c0088QnHx);
    }

    @Override // mi0.QnHx
    public final void f(pg3 pg3Var) {
        ac0 ac0Var = (ac0) this.x;
        ac0Var.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        ac0Var.b.set((yb0) pg3Var.get());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void g(ya2.QnHx qnHx) {
        vl0 andSet;
        vl0 andSet2;
        hc hcVar = (hc) this.x;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        bm0 bm0Var = bm0.DISPOSED;
        gb2<? super T> gb2Var = qnHx.w;
        if (defaultAdapter != null) {
            if (qnHx.get() == bm0Var || (andSet = qnHx.getAndSet(bm0Var)) == bm0Var) {
                return;
            }
            try {
                gb2Var.onSuccess(defaultAdapter);
                if (andSet != null) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (andSet != null) {
                    andSet.a();
                }
            }
        }
        a62.a.e("bluetooth_unsupported");
        hcVar.b.a(jc.auxFixed.a);
        if (qnHx.get() == bm0Var || (andSet2 = qnHx.getAndSet(bm0Var)) == bm0Var) {
            return;
        }
        try {
            gb2Var.b();
        } finally {
            if (andSet2 != null) {
                andSet2.a();
            }
        }
    }

    @Override // defpackage.yu2
    public final void onSuccess(Object obj) {
        ((yk4.QnHx) ((dl4) this.x)).b((cp1) obj);
    }

    @Override // defpackage.a90
    public final Object then(w05 w05Var) {
        boolean z;
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 11:
                ((dg4) obj).getClass();
                if (w05Var.n()) {
                    gc0 gc0Var = (gc0) w05Var.k();
                    kK kKVar = kK.x;
                    kKVar.c("Crashlytics report successfully enqueued to DataTransport: " + gc0Var.c());
                    File fileB = gc0Var.b();
                    if (fileB.delete()) {
                        kKVar.c("Deleted report file: " + fileB.getPath());
                    } else {
                        kKVar.i("Crashlytics could not delete report file: " + fileB.getPath(), null);
                    }
                    z = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", w05Var.j());
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                z05 z05Var = (z05) obj;
                ExecutorService executorService = tf5.a;
                if (w05Var.n()) {
                    z05Var.c(w05Var.k());
                } else {
                    Exception excJ = w05Var.j();
                    Objects.requireNonNull(excJ);
                    z05Var.b(excJ);
                }
                return null;
        }
    }
}
