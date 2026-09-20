package defpackage;

import android.os.Build;
import com.android.billingclient.api.Purchase;
import com.azefsw.audioconnect.AudioConnectApp;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Acr€, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Acr implements i91 {
    public final /* synthetic */ int w;

    public /* synthetic */ Acr(int i) {
        this.w = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i91
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.w) {
            case 0:
                int i = AudioConnectApp.x;
                fh0 fh0Var = rl0.c;
                return fh0Var instanceof h54 ? ((h54) fh0Var).y : new ol0(fh0Var);
            case 1:
                dd3 dd3Var = (dd3) obj;
                if (!dd3Var.a() && dd3Var.b == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                return sd5.a;
            case 3:
                return Boolean.valueOf(((dd3) obj).a());
            case 4:
                return Boolean.TRUE;
            case 5:
                return l72.a(((Integer) obj).intValue());
            case 6:
                return new p23(!((Boolean) obj).booleanValue());
            case 7:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    return new ex(th);
                }
                throw new NullPointerException("error is null");
            case 8:
                return ((s50) ((Optional) obj).get()).a.a;
            case 9:
                return sd5.a;
            case 10:
                return new g63.CQf((i63) obj);
            case 11:
                return Boolean.valueOf(((p23) obj).a);
            case 12:
                return new sy3.NUlFixed((List) obj);
            case 13:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if ((((Purchase) obj2).c.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2) == 1) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    su.x0(((Purchase) it.next()).b(), arrayList2);
                }
                return arrayList2;
            case 14:
                return new za3.CQf(((Boolean) obj).booleanValue());
            case 15:
                return vk4.f(new xq0.QnHx((Throwable) obj));
            case 16:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 17:
                ib5 ib5Var = (ib5) obj;
                return new yb4(((gd) ib5Var.x).c, mv2.ANDROID, GM.a("Android API ", Build.VERSION.SDK_INT), new h04((String) ib5Var.w, ((dd3) ib5Var.y).a()));
            case 18:
                return ((yb4) obj).z;
            case 19:
                return Boolean.valueOf(((List) obj).size() > 1);
            case 20:
                if (((Boolean) obj).booleanValue()) {
                    a62.a.c("No data emitted by pipeline, sending empty values...");
                    return new cs2(vq2.r(500L, 500L, TimeUnit.MILLISECONDS, j54.c), new Acr(21));
                }
                a62.a.c("Audio pipeline is emitting values");
                return or2.w;
            case 21:
                return q33.a;
            case 22:
                return Boolean.valueOf(((dd3) obj).a());
            case 23:
                return xv2.a(((Integer) obj).intValue());
            default:
                return sd5.a;
        }
    }
}
