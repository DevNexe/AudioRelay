package defpackage;

import com.azefsw.audioconnect.R;
import com.azefsw.audioconnect.player.audio.output.jni.NativeAudioOutputException;
import com.facebook.ads.AdError;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rq1 implements m70 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ rq1(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) throws oo5 {
        switch (this.w) {
            case 0:
                sq1 sq1Var = (sq1) this.x;
                sq1.QnHx qnHx = (sq1.QnHx) obj;
                synchronized (sq1Var) {
                    sq1Var.c = qnHx;
                    sd5 sd5Var = sd5.a;
                }
                return;
            case 1:
                lKy3 lky3 = (lKy3) ((ss3) this.x).y;
                lky3.e().edit().putLong(lky3.d(R.string.pref_retry_duration_on_connection_loss), gq0.g(((gq0) obj).w)).apply();
                return;
            case 2:
                ((tl3) ((rn2) this.x).f.getValue()).accept(new g83(0));
                return;
            case 3:
                ak2 ak2Var = (ak2) this.x;
                Throwable th = (Throwable) obj;
                ak2Var.y.a(th instanceof NativeAudioOutputException ? new a1.QnHx(((NativeAudioOutputException) th).w) : a1.CQf.b, th.getMessage());
                return;
            case 4:
                m15 m15Var = (m15) this.x;
                ad2 ad2Var = (ad2) obj;
                m15Var.getClass();
                try {
                    ad2Var.A(m15Var.e);
                    return;
                } catch (Throwable th2) {
                    hq4.a(m15Var, th2);
                    throw null;
                }
            case 5:
                a62.a.h("stats", "running_session", (String) obj);
                return;
            case 6:
                Throwable th3 = (Throwable) obj;
                ((h1) this.x).k.a(new g1(th3));
                a62.a.b("Audio output failed", th3);
                return;
            case 7:
                a62 a62Var = a62.a;
                return;
            case 8:
                ((ln2) ((ny1) this.x).w).b(new zt4.T23());
                return;
            case 9:
                yc3 yc3Var = (yc3) this.x;
                if (((qa) obj) instanceof qa.F1) {
                    yc3Var.b();
                    return;
                }
                return;
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    a62.a.e("found_a_pending_purchase");
                    return;
                }
                return;
            case 11:
                rIw9 riw9 = (rIw9) this.x;
                long jC = zs.QnHx.a.c();
                long j = riw9.b;
                riw9.b = jC;
                if (j == 0) {
                    return;
                }
                riw9.d.add(Long.valueOf(jC - j));
                if (jC > riw9.c + ((long) AdError.NETWORK_ERROR_CODE)) {
                    riw9.a = new ey1(wu.C0(riw9.d), ((Number) wu.P0(riw9.d)).longValue());
                    riw9.d.clear();
                    riw9.c = jC;
                    return;
                }
                return;
            case 12:
                ((rg3) this.x).g(sd5.a);
                return;
            case 13:
                v1 v1Var = (v1) this.x;
                List list = (List) obj;
                boolean zIsEmpty = list.isEmpty();
                v04 v04Var = v1Var.d;
                if (zIsEmpty) {
                    ((ic4) v04Var).a(jc4.QnHx.a);
                    return;
                } else {
                    ((ic4) v04Var).a(new jc4.CQf(list));
                    return;
                }
            case 14:
                Throwable th4 = (Throwable) obj;
                a62 a62Var2 = a62.a;
                a62.a.d(th4, true);
                String message = th4.getMessage();
                if (message == null) {
                    message = "";
                }
                a62Var2.e(message);
                return;
            case 15:
                ((se4) this.x).a.e((c60) obj);
                return;
            case 16:
                ((il3) this.x).w = zs.QnHx.a.c();
                return;
            case 17:
                ((re4) this.x).f.a.put(((ps) obj).d, Long.valueOf(zs.QnHx.a.c()));
                return;
            default:
                yg4 yg4Var = (yg4) this.x;
                yg4Var.b.a(yg4Var.d.getString(R.string.error_no_message_client));
                a62.a.h("drawer", "share_app_failed", ((Throwable) obj).getMessage());
                return;
        }
    }
}
