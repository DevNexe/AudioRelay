package defpackage;

import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.QnHx;
import com.revenuecat.purchases.Purchases$Companion$canMakePayments$2$1;
import com.revenuecat.purchases.interfaces.Callback;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ oh0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Object obj = this.A;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                rh0 rh0Var = (rh0) obj4;
                ua5 ua5Var = (ua5) obj3;
                Z7O z7o = (Z7O) obj2;
                eu0 eu0Var = (eu0) obj;
                rh0Var.getClass();
                Logger logger = rh0.f;
                try {
                    ta5 ta5Var = rh0Var.c.get(ua5Var.b());
                    int i2 = 0;
                    if (ta5Var == null) {
                        String str = String.format("Transport backend '%s' is not registered", ua5Var.b());
                        logger.warning(str);
                        z7o.f(new IllegalArgumentException(str));
                    } else {
                        rh0Var.e.e(new ph0(rh0Var, ua5Var, ta5Var.b(eu0Var), i2));
                        z7o.f(null);
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    z7o.f(e);
                    return;
                }
                break;
            default:
                Purchases$Companion$canMakePayments$2$1.m9onBillingSetupFinished$lambda1((NUlFixed) obj4, (Callback) obj3, (QnHx) obj2, (List) obj);
                break;
        }
    }
}
