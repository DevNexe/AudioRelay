package defpackage;

import android.content.Context;
import android.provider.Settings;
import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.QnHx;
import com.azefsw.audioconnect.opus.jni.OpusJni;
import com.azefsw.audioconnect.opus.jni.OpusStartResult;
import com.azefsw.audioconnect.player.decoders.OpusAudioDecoderException;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.revenuecat.purchases.google.BillingWrapper;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v9L implements px, ol4, om4, xg3 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ v9L(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    @Override // defpackage.om4
    public final void a(NUlFixed nUl, List list) {
        BillingWrapper.m19querySkuDetailsAsyncEnsuringOneResponse$lambda32((BillingWrapper) this.x, (om4) this.y, (fl3) this.z, nUl, list);
    }

    @Override // defpackage.ol4
    public final void c(yk4.QnHx qnHx) {
        String str;
        Object qnHx2;
        int i = this.w;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 1:
                try {
                    qnHx2 = ((n60) obj3).f(((mn2) obj2).b, (bs) obj);
                } catch (Throwable th) {
                    qnHx2 = new fq3.QnHx(th);
                }
                Throwable thA = fq3.a(qnHx2);
                if (thA == null) {
                    qnHx.b((s50) qnHx2);
                    return;
                } else {
                    qnHx.c(thA);
                    return;
                }
            default:
                QnHx qnHx3 = (QnHx) obj3;
                pa paVar = (pa) obj2;
                paVar.b.getClass();
                int iOrdinal = ((yg3) obj).ordinal();
                if (iOrdinal == 0) {
                    str = "inapp";
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "subs";
                }
                qnHx3.h(str, new Z7O(4, qnHx, paVar));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.px
    public final void d(final uw.QnHx qnHx) throws Throwable {
        xq0 qnHx2;
        xq0 qnHx3;
        xq0 cQf;
        int i = this.w;
        Throwable th = null;
        Object obj = this.x;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                final EWe eWe = (EWe) obj;
                final Double d = (Double) obj3;
                final Boolean bool = (Boolean) obj2;
                MobileAds.initialize(eWe.b, new OnInitializationCompleteListener() { // from class: oB9
                    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                    public final void onInitializationComplete(InitializationStatus initializationStatus) {
                        Context context = eWe.b;
                        if (ur1.a(Settings.System.getString(context.getContentResolver(), "firebase.test.lab"), "true")) {
                            RequestConfiguration.Builder builder = new RequestConfiguration.Builder();
                            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(Settings.Secure.getString(context.getContentResolver(), "android_id").getBytes(Charset.forName("UTF-8")));
                            StringBuffer stringBuffer = new StringBuffer();
                            for (byte b : bArrDigest) {
                                stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                            }
                            MobileAds.setRequestConfiguration(builder.setTestDeviceIds(Collections.singletonList(stringBuffer.toString().toUpperCase(Locale.US))).build());
                        }
                        MobileAds.setAppVolume((float) d.doubleValue());
                        MobileAds.setAppMuted(bool.booleanValue());
                        ((uw.QnHx) qnHx).b();
                    }
                });
                return;
            case 1:
            case 3:
            default:
                EQ x04Var = new x04(ma0.b((ua0) obj, (la0) obj3), qnHx);
                bm0.m(qnHx, new av3(new w04(x04Var)));
                x04Var.W0(1, x04Var, (x81) obj2);
                return;
            case 2:
                tf0 tf0Var = (tf0) obj;
                Sb1 sb1 = (Sb1) obj3;
                e61 e61Var = (e61) obj2;
                vz4.CQf cQf2 = vz4.CQf.a;
                uz4 uz4Var = tf0Var.d;
                uz4Var.a("OPUS_DECODER", cQf2);
                ta2 ta2Var = tf0Var.b;
                ta2Var.getClass();
                a62 a62Var = a62.a;
                try {
                    ((zv2) ta2Var.x).a();
                    qnHx2 = new xq0.CQf(sd5.a);
                    break;
                } catch (Throwable th2) {
                    FWT.E(th2);
                    qnHx2 = new xq0.QnHx(th2);
                }
                if (qnHx2 instanceof xq0.CQf) {
                    qnHx3 = new xq0.CQf(((xq0.CQf) qnHx2).a);
                } else {
                    if (!(qnHx2 instanceof xq0.QnHx)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Throwable th3 = (Throwable) ((xq0.QnHx) qnHx2).a;
                    a62 a62Var2 = a62.a;
                    a62.a.d(th3, true);
                    qnHx3 = new xq0.QnHx(rj4.QnHx.b);
                }
                if (qnHx3 instanceof xq0.CQf) {
                    OpusJni opusJni = new OpusJni();
                    int i2 = sb1.a;
                    OpusStartResult opusStartResultStartDecoder = opusJni.startDecoder(i2, sb1.c, 64000);
                    String[] strArr = opusStartResultStartDecoder.nativeError;
                    bk2 bk2Var = strArr == null ? null : new bk2(strArr[0], strArr[1]);
                    if (bk2Var != null) {
                        OW8.s(bk2Var);
                        opusJni.destroyDecoder(opusStartResultStartDecoder.opusPointerRef);
                        cQf = new xq0.QnHx(new rj4.CQf(bk2Var.b));
                    } else {
                        cQf = new xq0.CQf(Long.valueOf(opusStartResultStartDecoder.opusPointerRef));
                    }
                    if (cQf instanceof xq0.CQf) {
                        long jLongValue = ((Number) ((xq0.CQf) cQf).a).longValue();
                        int i3 = (i2 / AdError.NETWORK_ERROR_CODE) * 20;
                        a62 a62Var3 = a62.a;
                        qnHx3 = new xq0.CQf(new uv2(opusJni, jLongValue, i3));
                    } else {
                        if (!(cQf instanceof xq0.QnHx)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qnHx3 = cQf;
                    }
                } else if (!(qnHx3 instanceof xq0.QnHx)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(qnHx3 instanceof xq0.CQf)) {
                    if (!(qnHx3 instanceof xq0.QnHx)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rj4 rj4Var = (rj4) ((xq0.QnHx) qnHx3).a;
                    uz4Var.a("OPUS_DECODER", new vz4.QnHx(rj4Var, null));
                    qnHx.c(new IOException("Failed to decode the audio (" + rj4Var.a + ")"));
                    return;
                }
                VFV$ vfv$ = (VFV$) ((xq0.CQf) qnHx3).a;
                uz4Var.a("OPUS_DECODER", vz4.LPt8Fixed.a);
                vf0 vf0Var = new vf0(new e8(((mn2) e61Var.a).c.c), new uf0(tf0Var));
                while (!qnHx.e()) {
                    try {
                        try {
                            List list = (List) ((BlockingQueue) e61Var.b).poll(100L, TimeUnit.MILLISECONDS);
                            if (list != null) {
                                int size = list.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    vfv$.a((byte[]) list.get(i4), vf0Var);
                                }
                            }
                        } catch (OpusAudioDecoderException e) {
                            qnHx.c(e);
                        } catch (InterruptedException unused) {
                            a62 a62Var4 = a62.a;
                            qnHx.b();
                        }
                    } catch (Throwable th4) {
                        vfv$.close();
                        throw th4;
                    }
                }
                qnHx.b();
                vfv$.close();
                return;
            case 4:
                DatagramSocket datagramSocket = (DatagramSocket) obj3;
                List list2 = (List) obj2;
                try {
                    int size2 = list2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        try {
                            datagramSocket.send((DatagramPacket) list2.get(i5));
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    qnHx.b();
                    return;
                } catch (Throwable th6) {
                    qnHx.c(th6);
                    return;
                }
        }
    }

    @Override // defpackage.xg3
    public final void e(NUlFixed nUl, List list) {
        BillingWrapper.m18queryPurchaseHistoryAsyncEnsuringOneResponse$lambda34((BillingWrapper) this.x, (xg3) this.y, (fl3) this.z, nUl, list);
    }
}
