package defpackage;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.BindException;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r23 implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ r23(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Object qnHx;
        Map mapUnmodifiableMap;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        switch (this.w) {
            case 0:
                return Integer.valueOf(((s23) this.x).a.checkSelfPermission("android.permission.READ_PHONE_STATE"));
            case 1:
                lKy3 lky3 = ((ezLc) this.x).c;
                if (!lky3.o()) {
                    a62.a.e("force_initialize_audio_output");
                    lky3.s(A$Y4.OpenSL);
                }
                return lky3.k();
            case 2:
                h81 h81Var = (h81) this.x;
                int i = lKy3.w;
                return h81Var.invoke();
            case 3:
                ss3 ss3Var = (ss3) this.x;
                uz4 uz4Var = (uz4) ss3Var.y;
                uz4Var.a("CLIENT_LISTENER", vz4.CQf.a);
                try {
                    ServerSocket serverSocket = new ServerSocket();
                    serverSocket.setReuseAddress(true);
                    serverSocket.bind(new InetSocketAddress(((cd4) ss3Var.x).a));
                    qnHx = serverSocket;
                    break;
                } catch (Throwable th) {
                    qnHx = new fq3.QnHx(th);
                }
                if (true ^ (qnHx instanceof fq3.QnHx)) {
                    uz4Var.a("CLIENT_LISTENER", vz4.LPt8Fixed.a);
                }
                Throwable thA = fq3.a(qnHx);
                if (thA != null) {
                    uz4Var.a("CLIENT_LISTENER", new vz4.QnHx(XTd3.q(thA, nl3.a(BindException.class)) ? new hf4.QnHx(((cd4) ss3Var.x).a) : new hf4.CQf(((cd4) ss3Var.x).a), thA.getMessage()));
                }
                C0239D.H(qnHx);
                return (ServerSocket) qnHx;
            case 4:
                return new DatagramSocket();
            case 5:
                jx2 jx2Var = (jx2) this.x;
                return jx2Var.a.getPackageManager().getPackageInfo(jx2Var.a.getPackageName(), 0);
            case 6:
                gf5.QnHx qnHx2 = (gf5.QnHx) this.x;
                qnHx2.b.set(null);
                synchronized (qnHx2) {
                    try {
                        if (qnHx2.a.isMarked()) {
                            sw1 reference = qnHx2.a.getReference();
                            synchronized (reference) {
                                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
                            }
                            AtomicMarkableReference<sw1> atomicMarkableReference = qnHx2.a;
                            atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                        } else {
                            mapUnmodifiableMap = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (mapUnmodifiableMap != null) {
                    gf5 gf5Var = gf5.this;
                    zd2 zd2Var = gf5Var.a;
                    String str = gf5Var.c;
                    File fileC = qnHx2.c ? zd2Var.a.c(str, "internal-keys") : zd2Var.a.c(str, "keys");
                    try {
                        String string = new JSONObject(mapUnmodifiableMap).toString();
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), zd2.b));
                        try {
                            bufferedWriter.write(string);
                            bufferedWriter.flush();
                        } catch (Exception e) {
                            e = e;
                            try {
                                Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                                zd2.d(fileC);
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedWriter2 = bufferedWriter;
                                bufferedWriter = bufferedWriter2;
                                kw.a(bufferedWriter, "Failed to close key/value metadata file.");
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            kw.a(bufferedWriter, "Failed to close key/value metadata file.");
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedWriter = null;
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedWriter = bufferedWriter2;
                        kw.a(bufferedWriter, "Failed to close key/value metadata file.");
                        throw th;
                    }
                    kw.a(bufferedWriter, "Failed to close key/value metadata file.");
                    break;
                }
                return null;
            case 7:
                ah0 ah0Var = (ah0) this.x;
                synchronized (ah0Var) {
                    ah0Var.a.get().e(ah0Var.c.get().a(), System.currentTimeMillis());
                    break;
                }
                return null;
            default:
                return ((lm3) this.x).c();
        }
    }
}
