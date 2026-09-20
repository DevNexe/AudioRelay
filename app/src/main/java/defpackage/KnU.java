package defpackage;

import com.azefsw.audioconnect.AudioConnectApp;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KnU implements i91 {
    public final /* synthetic */ int w;

    public /* synthetic */ KnU(int i) {
        this.w = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i91
    public final Object apply(Object obj) {
        switch (this.w) {
            case 0:
                int i = AudioConnectApp.x;
                qh0 qh0Var = rl0.a;
                return qh0Var instanceof h54 ? ((h54) qh0Var).y : new ol0(qh0Var);
            case 1:
                return ((TW) obj).b;
            case 2:
                return ((z61) obj).a;
            case 3:
                return (y73.NUlFixed) ((y73) obj);
            case 4:
                a62 a62Var = a62.a;
                return vq2.D(gq0.g(((x61) obj).b), TimeUnit.MILLISECONDS);
            case 5:
                return Boolean.TRUE;
            case 6:
                return new sq1.QnHx((eq1) obj);
            case 7:
                return or2.w;
            case 8:
                return Boolean.valueOf(((Integer) obj).intValue() == 0);
            case 9:
                return ((bs) obj).z;
            case 10:
                gq0.QnHx qnHx = gq0.x;
                return new gq0(ps0.p0(((g83) obj).a, kq0.MILLISECONDS));
            case 11:
                y73 y73Var = (y73) obj;
                if (ur1.a(y73Var, y73.CQf.b)) {
                    return i63.QnHx.b;
                }
                if (y73Var instanceof y73.QnHx ? true : y73Var instanceof y73.F1 ? true : y73Var instanceof y73.LPt8Fixed ? true : y73Var instanceof y73.NUlFixed) {
                    return i63.CQf.b;
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                return new sy3.auxFixed(((Boolean) obj).booleanValue());
            case 13:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 14:
                int i2 = ek0.a;
                return new cs2(vq2.D(3000L, TimeUnit.MILLISECONDS), new Ot0r((dd3) obj, 13));
            case 15:
                return Boolean.valueOf(wu.B0((List) obj));
            case 16:
                xq0 xq0Var = (xq0) obj;
                if (xq0Var instanceof xq0.CQf) {
                    EntitlementInfo entitlementInfo = ((CustomerInfo) ((xq0.CQf) xq0Var).a).getEntitlements().get("premium");
                    return new dd3(Boolean.valueOf(entitlementInfo != null ? entitlementInfo.isActive() : false), null, 2);
                }
                if (xq0Var instanceof xq0.QnHx) {
                    return new dd3(null, (String) ((xq0.QnHx) xq0Var).a, 1);
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                return new yk4(new im3((bs3) obj, 5));
            case 18:
                return new za3.FJCM(false);
            case 19:
                return new xq0.CQf(obj);
            case 20:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 21:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 22:
                return ((hn2) obj).a;
            case 23:
                return new b33(zs.QnHx.a.c());
            case 24:
                return Boolean.valueOf(((Long) obj).longValue() > 500);
            case 25:
                return new ev3.PRnFixed(((dd3) obj).a());
            case 26:
                return ((Boolean) obj).booleanValue() ? bLBI.Compressed : bLBI.Uncompressed;
            case 27:
                return Boolean.valueOf(((dd3) obj).a());
            default:
                return new mq4((Boolean) obj);
        }
    }
}
