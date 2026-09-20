package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class kb0 implements uw4<qg4, Void> {
    public final /* synthetic */ Executor w;
    public final /* synthetic */ lb0 x;

    public kb0(lb0 lb0Var, Executor executor) {
        this.x = lb0Var;
        this.w = executor;
    }

    @Override // defpackage.uw4
    public final w05<Void> e(qg4 qg4Var) {
        if (qg4Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return k15.e(null);
        }
        lb0 lb0Var = this.x;
        rb0.b(lb0Var.x.x);
        mb0 mb0Var = lb0Var.x;
        mb0Var.x.l.e(null, this.w);
        mb0Var.x.p.c(null);
        return k15.e(null);
    }
}
