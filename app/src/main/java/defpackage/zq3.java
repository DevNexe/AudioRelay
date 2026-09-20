package defpackage;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.QnHx;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.UpgradeInfo;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zq3 implements ol4, y14.QnHx, a90 {
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ zq3(Object obj, Object obj2, Object obj3, Object obj4) {
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.z = obj4;
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) {
        y14 y14Var = (y14) this.w;
        String str = (String) this.x;
        Map map = (Map) this.y;
        is.QnHx qnHx = (is.QnHx) this.z;
        os0 os0Var = y14.B;
        y14Var.getClass();
        return (is) y14.m(((SQLiteDatabase) obj).rawQuery(str, new String[0]), new ph0(y14Var, map, qnHx, 2));
    }

    @Override // defpackage.ol4
    public final void c(yk4.QnHx qnHx) {
        n43 n43Var = (n43) this.w;
        o43 o43Var = (o43) this.x;
        Activity activity = (Activity) this.y;
        yr3 yr3Var = (yr3) this.z;
        Purchases sharedInstance = Purchases.Companion.getSharedInstance();
        Package r5 = n43Var.d;
        if (r5 == null) {
            throw new IllegalStateException("The package should be null only during tests.".toString());
        }
        ListenerConversionsKt.purchasePackageWith(sharedInstance, activity, r5, new UpgradeInfo(o43Var.a, null, 2, null), new vr3(yr3Var, qnHx), new xr3(yr3Var, qnHx, o43Var, n43Var));
    }

    @Override // defpackage.a90
    public final Object then(w05 w05Var) {
        Object objP;
        QnHx qnHx = (QnHx) this.w;
        w05 w05Var2 = (w05) this.x;
        w05 w05Var3 = (w05) this.y;
        Date date = (Date) this.z;
        int[] iArr = QnHx.j;
        qnHx.getClass();
        if (!w05Var2.n()) {
            return k15.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", w05Var2.j()));
        }
        if (!w05Var3.n()) {
            return k15.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", w05Var3.j()));
        }
        try {
            QnHx.C0088QnHx c0088QnHxA = qnHx.a((String) w05Var2.k(), ((cp1) w05Var3.k()).a(), date);
            if (c0088QnHxA.a != 0) {
                objP = k15.e(c0088QnHxA);
            } else {
                f50 f50Var = qnHx.e;
                g50 g50Var = c0088QnHxA.b;
                f50Var.getClass();
                sc4 sc4Var = new sc4(4, f50Var, g50Var);
                ExecutorService executorService = f50Var.a;
                objP = k15.c(sc4Var, executorService).p(executorService, new e50(f50Var, g50Var)).p(qnHx.c, new im3(c0088QnHxA, 13));
            }
            return objP;
        } catch (FirebaseRemoteConfigException e) {
            return k15.d(e);
        }
    }
}
