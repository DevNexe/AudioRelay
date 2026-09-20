package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.azefsw.audioconnect.R;
import com.azefsw.audioconnect.server.audio.capture.exceptions.AudioRecordReadException;
import com.azefsw.audioconnect.server.audio.capture.exceptions.AudioRecordUninitializedException;
import com.azefsw.audioconnect.server.services.ServerService;
import com.unity3d.ads.metadata.MetaData;
import j$.util.Optional;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements m70 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ J(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) throws JSONException {
        uy4 cQf;
        switch (this.w) {
            case 0:
                EWe eWe = (EWe) this.x;
                if (((TW) obj).a) {
                    return;
                }
                MetaData metaData = new MetaData(eWe.b);
                Boolean bool = Boolean.FALSE;
                metaData.set("gdpr.consent", bool);
                metaData.commit();
                metaData.set("privacy.consent", bool);
                metaData.commit();
                return;
            case 1:
                hc hcVar = (hc) this.x;
                hc.LPt8Fixed lPt8 = hcVar.d;
                IntentFilter intentFilter = lPt8.a;
                Context context = hcVar.a;
                context.registerReceiver(lPt8, intentFilter);
                hc.F1 f1 = hcVar.e;
                context.registerReceiver(f1, f1.a);
                hc.QnHx qnHx = hcVar.f;
                context.registerReceiver(qnHx, qnHx.a);
                return;
            case 2:
                gl5 gl5Var = (gl5) this.x;
                if (((Boolean) obj).booleanValue()) {
                    hl5 hl5Var = gl5Var.a;
                    hl5Var.getClass();
                    synchronized (hl5.d) {
                        a62.a.c("Acquiring wakelocks...");
                        if (hl5Var.b == null) {
                            hl5Var.b = ((WifiManager) hl5Var.a.getApplicationContext().getSystemService("wifi")).createWifiLock(3, "audioconnect:AUDIO_STREAM_WIFI_LOCK");
                        }
                        hl5Var.b.acquire();
                        if (hl5Var.c == null) {
                            hl5Var.c = ((PowerManager) hl5Var.a.getSystemService("power")).newWakeLock(1, "audioconnect:AUDIO_STREAM_CPU_LOCK");
                        }
                        hl5Var.c.acquire();
                        sd5 sd5Var = sd5.a;
                    }
                    return;
                }
                hl5 hl5Var2 = gl5Var.a;
                hl5Var2.getClass();
                synchronized (hl5.d) {
                    a62.a.c("Releasing wakelocks...");
                    WifiManager.WifiLock wifiLock = hl5Var2.b;
                    if (wifiLock != null) {
                        wifiLock.release();
                    }
                    PowerManager.WakeLock wakeLock = hl5Var2.c;
                    if (wakeLock != null) {
                        wakeLock.release();
                    }
                    hl5Var2.b = null;
                    hl5Var2.c = null;
                    sd5 sd5Var2 = sd5.a;
                }
                return;
            case 3:
                ((p8) this.x).a.a((hn2) obj);
                return;
            case 4:
                ih0 ih0Var = (ih0) this.x;
                if (((s50) obj).a.b.f) {
                    return;
                }
                a62.a.c("serverAudioConfig not enabled, using default config");
                ih0Var.b.a(new b63.CQf(Sb1.d));
                return;
            case 5:
                ((ec4) this.x).b.a(Optional.of((yb4) obj));
                return;
            case 6:
                n60 n60Var = (n60) this.x;
                gq4 gq4Var = n60Var.e;
                synchronized (gq4Var.a) {
                    gq4Var.b = -1L;
                    gq4Var.f = 0L;
                    gq4Var.e = 0L;
                    gq4Var.c = 0L;
                    gq4Var.d = 0L;
                    gq4Var.k.a = 0L;
                    gq4Var.h.clear();
                    gq4Var.i.clear();
                    sd5 sd5Var3 = sd5.a;
                }
                qx2 qx2Var = n60Var.f;
                synchronized (qx2Var) {
                    qx2Var.c = new ip2(0L, 0L);
                }
                a62 a62Var = a62.a;
                a62Var.e("successfully_reconnected");
                a62Var.c("Retry succeeded, playback resumed");
                return;
            case 7:
                return;
            case 8:
                ((af0) this.x).e.b = true;
                return;
            case 9:
                lfe lfeVar = (lfe) this.x;
                Throwable th = (Throwable) obj;
                a62.a.b("AudioCapture failed", th);
                if (th instanceof AudioRecordReadException) {
                    AudioRecordReadException audioRecordReadException = (AudioRecordReadException) th;
                    cQf = new FTp0.CQf(audioRecordReadException.w, audioRecordReadException.x);
                } else {
                    cQf = th instanceof AudioRecordUninitializedException ? FTp0.QnHx.b : FTp0.F1.b;
                }
                lfeVar.b.a(cQf, th.getMessage());
                return;
            case 10:
                ((fP) this.x).b.a((oMl) obj);
                return;
            case 11:
                ad4 ad4Var = ((md4) this.x).a;
                ad4Var.getClass();
                ad4Var.a(new ITx((ad2) obj));
                return;
            case 12:
                ((se4) this.x).a.e(c60.CQf.a);
                return;
            case 13:
                ServerService serverService = (ServerService) this.x;
                kf4 kf4Var = (kf4) obj;
                int i = ServerService.z;
                boolean z = kf4Var.b;
                df4 df4Var = kf4Var.a;
                if (z) {
                    boolean z2 = df4Var instanceof df4.LPt8Fixed;
                }
                Notification notificationA = serverService.a(kf4Var);
                if (df4Var instanceof df4.F1 ? true : df4Var instanceof df4.CQf) {
                    serverService.startForeground(43, notificationA);
                    return;
                }
                if (df4Var instanceof df4.LPt8Fixed) {
                    ((NotificationManager) serverService.x.getValue()).notify(43, notificationA);
                    serverService.stopForeground(false);
                    return;
                } else {
                    if (ur1.a(df4Var, df4.QnHx.a)) {
                        ((NotificationManager) serverService.x.getValue()).notify(43, notificationA);
                        return;
                    }
                    return;
                }
            case 14:
                re4 re4Var = (re4) this.x;
                Throwable th2 = (Throwable) obj;
                re4Var.g.a(new ne4(th2));
                re4Var.h.a(new oe4(th2));
                return;
            case 15:
                ve4 ve4Var = (ve4) this.x;
                Throwable th3 = (Throwable) obj;
                we4.a.a(new te4(th3));
                if (!ve4Var.g) {
                    a62.a.b("Stopping the session due to an error", th3);
                    return;
                }
                a62.a.c("Ignoring the error: " + th3.getMessage());
                return;
            case 16:
                yg4 yg4Var = (yg4) this.x;
                yg4Var.b.a(yg4Var.d.getString(R.string.error_no_email_client));
                a62.a.h("drawer", "contact_failed", ((Throwable) obj).getMessage());
                return;
            default:
                sAn san = (sAn) this.x;
                rz4 rz4Var = san.b;
                uz4 uz4Var = san.a;
                uz4Var.getClass();
                uz4Var.a(rz4Var.a, rz4Var.b);
                return;
        }
    }
}
