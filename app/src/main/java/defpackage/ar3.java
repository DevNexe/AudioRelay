package defpackage;

import android.app.Activity;
import android.database.Cursor;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.Purchases;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar3 implements ol4, y14.QnHx, a90 {
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ar3(Object obj, Object obj2, Object obj3) {
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) {
        y14 y14Var = (y14) this.w;
        List list = (List) this.x;
        ua5 ua5Var = (ua5) this.y;
        Cursor cursor = (Cursor) obj;
        os0 os0Var = y14.B;
        y14Var.getClass();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            o3.QnHx qnHx = new o3.QnHx();
            qnHx.f = new HashMap();
            qnHx.d(cursor.getString(1));
            qnHx.d = Long.valueOf(cursor.getLong(2));
            qnHx.e = Long.valueOf(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                qnHx.c(new ks0(string == null ? y14.B : new os0(string), cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                qnHx.c(new ks0(string2 == null ? y14.B : new os0(string2), (byte[]) y14.m(y14Var.g().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new n8V_(7))));
            }
            if (!cursor.isNull(6)) {
                qnHx.b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new y3(j, ua5Var, qnHx.b()));
        }
        return null;
    }

    @Override // defpackage.ol4
    public final void c(yk4.QnHx qnHx) {
        n43 n43Var = (n43) this.w;
        Activity activity = (Activity) this.x;
        yr3 yr3Var = (yr3) this.y;
        Purchases sharedInstance = Purchases.Companion.getSharedInstance();
        Package r0 = n43Var.d;
        if (r0 == null) {
            throw new IllegalStateException("The package should be null only during tests.".toString());
        }
        ListenerConversionsKt.purchasePackageWith(sharedInstance, activity, r0, new or3(yr3Var, qnHx), new pr3(yr3Var, qnHx));
    }

    @Override // defpackage.a90
    public final Object then(w05 w05Var) {
        cy0 cy0Var = (cy0) this.w;
        w05 w05Var2 = (w05) this.x;
        w05 w05Var3 = (w05) this.y;
        cy0Var.getClass();
        if (!w05Var2.n() || w05Var2.k() == null) {
            return k15.e(Boolean.FALSE);
        }
        g50 g50Var = (g50) w05Var2.k();
        if (w05Var3.n()) {
            g50 g50Var2 = (g50) w05Var3.k();
            if (!(g50Var2 == null || !g50Var.c.equals(g50Var2.c))) {
                return k15.e(Boolean.FALSE);
            }
        }
        f50 f50Var = cy0Var.d;
        f50Var.getClass();
        sc4 sc4Var = new sc4(4, f50Var, g50Var);
        ExecutorService executorService = f50Var.a;
        return k15.c(sc4Var, executorService).p(executorService, new e50(f50Var, g50Var)).f(cy0Var.b, new by0(cy0Var));
    }
}
