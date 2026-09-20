package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class ib0 implements uw4<qg4, Void> {
    public final /* synthetic */ Executor w;
    public final /* synthetic */ String x;
    public final /* synthetic */ jb0 y;

    public ib0(jb0 jb0Var, Executor executor, String str) {
        this.y = jb0Var;
        this.w = executor;
        this.x = str;
    }

    @Override // defpackage.uw4
    public final w05<Void> e(qg4 qg4Var) {
        if (qg4Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return k15.e(null);
        }
        w05[] w05VarArr = new w05[2];
        jb0 jb0Var = this.y;
        w05VarArr[0] = rb0.b(jb0Var.B);
        w05VarArr[1] = jb0Var.B.l.e(jb0Var.A ? this.x : null, this.w);
        return k15.f(Arrays.asList(w05VarArr));
    }
}
