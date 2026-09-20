package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.QnHx;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes.dex */
public final class vp5 implements Runnable {
    public final /* synthetic */ z50 w;
    public final /* synthetic */ wp5 x;

    public vp5(wp5 wp5Var, z50 z50Var) {
        this.x = wp5Var;
        this.w = z50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        wp5 wp5Var = this.x;
        tp5 tp5Var = (tp5) wp5Var.f.F.get(wp5Var.b);
        if (tp5Var == null) {
            return;
        }
        z50 z50Var = this.w;
        if (!(z50Var.x == 0)) {
            tp5Var.m(z50Var, null);
            return;
        }
        wp5Var.e = true;
        QnHx.NUlFixed nUl = wp5Var.a;
        if (nUl.requiresSignIn()) {
            if (!wp5Var.e || (iAccountAccessor = wp5Var.c) == null) {
                return;
            }
            nUl.getRemoteService(iAccountAccessor, wp5Var.d);
            return;
        }
        try {
            nUl.getRemoteService(null, nUl.a());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            nUl.disconnect("Failed to get service from broker.");
            tp5Var.m(new z50(10), null);
        }
    }
}
