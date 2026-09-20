package defpackage;

import android.app.Activity;
import com.google.protobuf.F1;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.QnHx;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pq1 implements InterfaceC1443fH {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pq1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0323 A[LOOP:1: B:18:0x00a1->B:141:0x0323, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:218:0x031b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // defpackage.InterfaceC1443fH
    public final void run() throws IOException {
        af0 af0Var;
        boolean z;
        hu4 hu4Var;
        Object obj;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                sq1 sq1Var = (sq1) this.b;
                Activity activity = (Activity) this.c;
                a62.a.e("refresh_old_interstitial");
                sq1Var.stop();
                sq1Var.b(activity);
                return;
            case 1:
                rn2 rn2Var = (rn2) this.b;
                e61 e61Var = (e61) this.c;
                xn2 xn2Var = rn2Var.a;
                synchronized (xn2Var) {
                    xn2Var.d = 1;
                    sd5 sd5Var = sd5.a;
                }
                xn2 xn2Var2 = rn2Var.a;
                synchronized (xn2Var2) {
                    xn2Var2.c = 1;
                }
                xn2 xn2Var3 = rn2Var.a;
                synchronized (xn2Var3) {
                    xn2Var3.c(e61Var, null);
                }
                return;
            case 2:
                af0 af0Var2 = (af0) this.b;
                s50 s50Var = (s50) this.c;
                while (s50Var.d) {
                    hd5 hd5Var = s50Var.c;
                    ?? r8 = 0;
                    try {
                        byte[] bArr = af0.j;
                        DatagramPacket datagramPacket = hd5Var.e;
                        while (true) {
                            try {
                                datagramPacket.setData(bArr, r8, 1500);
                                hd5Var.c.receive(datagramPacket);
                                String hostAddress = datagramPacket.getAddress().getHostAddress();
                                if (ur1.a(hostAddress, hd5Var.d)) {
                                    int length = datagramPacket.getLength();
                                    xx2 xx2Var = af0Var2.e;
                                    if (xx2Var.b) {
                                        xx2Var.a.b("NO_AUDIO_DATA");
                                        xx2Var.a.b("AUDIO_DATA_TIMEOUT");
                                    }
                                    xx2Var.b = r8;
                                    xx2Var.c = z2;
                                    if (length == -1) {
                                        a62.a.a("End of stream reached");
                                        throw new IOException("End of stream reached");
                                    }
                                    if (length != 0) {
                                        long jC = zs.QnHx.a.c();
                                        try {
                                            hu4 hu4Var2 = (hu4) hu4.H.f(af0.j, length, F1.a);
                                            gq4 gq4Var = af0Var2.d;
                                            long j = hu4Var2.z;
                                            long j2 = hu4Var2.A;
                                            synchronized (gq4Var.a) {
                                                if (gq4Var.i.contains(Long.valueOf(j)) || j == gq4Var.b) {
                                                    hu4Var = hu4Var2;
                                                    obj = vt4.QnHx.a;
                                                    af0Var = af0Var2;
                                                } else {
                                                    gq4Var.i.add(Long.valueOf(j));
                                                    gq4Var.g += length;
                                                    af0Var = af0Var2;
                                                    long j3 = gq4Var.b;
                                                    if (j3 != -1) {
                                                        long j4 = j3 + 1;
                                                        if (j < j4) {
                                                            gq4.QnHx qnHx = gq4Var.k;
                                                            if (qnHx.a != 0) {
                                                                if (zs.QnHx.a.c() - qnHx.a >= 1500) {
                                                                    gq4Var.a(j);
                                                                    gq4.QnHx qnHx2 = gq4Var.k;
                                                                    qnHx2.getClass();
                                                                    a62.a.l("Too many out of order packets detected, applying fix...");
                                                                    qnHx2.b.a(fq4.w);
                                                                    gq4.this.b = j;
                                                                    gq4.QnHx qnHx3 = gq4Var.k;
                                                                    qnHx3.getClass();
                                                                    qnHx3.a = 0L;
                                                                    obj = vt4.F1.a;
                                                                }
                                                                hu4Var = hu4Var2;
                                                            } else {
                                                                a62 a62Var = a62.a;
                                                                qnHx.a = zs.QnHx.a.c();
                                                            }
                                                            gq4Var.a(j);
                                                            obj = vt4.CQf.a;
                                                            hu4Var = hu4Var2;
                                                        } else {
                                                            gq4.QnHx qnHx4 = gq4Var.k;
                                                            hu4Var = hu4Var2;
                                                            if (qnHx4.a != 0) {
                                                                a62 a62Var2 = a62.a;
                                                                qnHx4.a = 0L;
                                                            }
                                                            if (j > j4) {
                                                                a62 a62Var3 = a62.a;
                                                                long j5 = j - j3;
                                                                gq4Var.e = (j5 - 1) + gq4Var.e;
                                                                gq4Var.f = j5 + gq4Var.f;
                                                            } else {
                                                                gq4Var.f++;
                                                                ArrayList arrayList = gq4Var.h;
                                                                if (!(j3 != -1)) {
                                                                    throw new IllegalStateException("Check failed.".toString());
                                                                }
                                                                arrayList.add(Long.valueOf(Math.max(0L, (jC - gq4Var.d) - (j2 - gq4Var.c))));
                                                            }
                                                        }
                                                    } else {
                                                        hu4Var = hu4Var2;
                                                        gq4Var.f++;
                                                    }
                                                    gq4Var.c = j2;
                                                    gq4Var.d = jC;
                                                    gq4Var.b = j;
                                                    obj = vt4.CQf.a;
                                                }
                                            }
                                            if (ur1.a(obj, vt4.CQf.a)) {
                                                af0Var.c.a(hu4Var);
                                            } else {
                                                hu4 hu4Var3 = hu4Var;
                                                if (ur1.a(obj, vt4.QnHx.a)) {
                                                    a62.a.l("Ignoring duplicate packet [" + hu4Var3.z + "]");
                                                } else if (ur1.a(obj, vt4.F1.a)) {
                                                    qx2 qx2Var = af0Var.b;
                                                    synchronized (qx2Var) {
                                                        qx2Var.c = new ip2(0L, 0L);
                                                        sd5 sd5Var2 = sd5.a;
                                                    }
                                                }
                                            }
                                        } catch (InvalidProtocolBufferException e) {
                                            af0Var = af0Var2;
                                            a62.a.a("Ignoring malformed audio packet");
                                            af0Var.i.a(new ue0(e));
                                        }
                                    } else {
                                        af0Var = af0Var2;
                                    }
                                    z = true;
                                    if (!z) {
                                        a62.a.c("Stopped listening to audio packets");
                                        return;
                                    } else {
                                        af0Var2 = af0Var;
                                        z2 = true;
                                    }
                                } else {
                                    af0Var = af0Var2;
                                    try {
                                        hd5Var.f.a(new gd5(hostAddress, hd5Var));
                                        af0Var2 = af0Var;
                                        z2 = true;
                                        r8 = 0;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                af0Var = af0Var2;
                            }
                            try {
                                hq4.a(hd5Var, th);
                                throw null;
                            } catch (Throwable th3) {
                                th = th3;
                                if (th instanceof oo5) {
                                    z = false;
                                } else if (XTd3.q(th, nl3.a(SocketTimeoutException.class))) {
                                    a62.a.l("UDP socket timed out, the app is not receiving audio data packets");
                                    xx2 xx2Var2 = af0Var.e;
                                    xx2Var2.b = false;
                                    if (xx2Var2.c) {
                                        xx2Var2.a.a(xx2Var2.b());
                                    } else {
                                        xx2Var2.a.a(xx2Var2.a());
                                    }
                                    af0Var.i.a(ve0.w);
                                    z = true;
                                } else {
                                    z = false;
                                    a62.a.l("Failed to read UDP data: " + th.getMessage());
                                    af0Var.i.a(new we0(th));
                                    af0Var.h.a(new xe0(th));
                                }
                                if (!z) {
                                    a62.a.c("Stopped listening to audio packets");
                                    return;
                                } else {
                                    af0Var2 = af0Var;
                                    z2 = true;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        af0Var = af0Var2;
                    }
                }
                return;
            case 3:
                v1 v1Var = (v1) this.b;
                jg4 jg4Var = (jg4) this.c;
                a62.a.e("disconnecting_client_due_to_time_limit");
                cq4 cq4Var = (cq4) v1Var.b;
                List<je4> listSingletonList = Collections.singletonList(jg4Var.a);
                el0.F1 f1 = jg4Var.d;
                cq4Var.getClass();
                for (je4 je4Var : listSingletonList) {
                    if (je4Var.f()) {
                        ad4 ad4Var = (ad4) cq4Var.x;
                        ad2.CQf cQfW0 = ad2.w0();
                        el0.CQf cQfC = el0.B.c();
                        cQfC.A = f1.b();
                        cQfC.M();
                        el0 el0VarF = cQfC.f();
                        if (!el0VarF.isInitialized()) {
                            throw QnHx.AbstractC0099QnHx.C(el0VarF);
                        }
                        cQfW0.A = el0VarF;
                        cQfW0.M();
                        ad2 ad2VarBuild = cQfW0.build();
                        ad4Var.getClass();
                        ad4Var.a(new uf4(je4Var, ad2VarBuild));
                    } else {
                        ((as) cq4Var.y).a.put(je4Var.n(), Long.valueOf(zs.QnHx.a.c()));
                        je4Var.stop();
                    }
                }
                return;
            default:
                je4 je4Var2 = (je4) this.b;
                ad2 ad2Var = (ad2) this.c;
                try {
                    if (je4Var2.b()) {
                        ad2Var.A(je4Var2.g());
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    if (!je4Var2.l()) {
                        a62 a62Var4 = a62.a;
                        String message = th5.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        a62Var4.e(message);
                        a62Var4.b("Failed to send a message to " + je4Var2.n(), th5);
                        return;
                    }
                    return;
                }
        }
    }
}
