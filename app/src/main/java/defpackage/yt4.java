package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class yt4 implements Runnable {
    public static final String z = s52.e("StopWorkRunnable");
    public final nn5 w;
    public final String x;
    public final boolean y;

    public yt4(nn5 nn5Var, String str, boolean z2) {
        this.w = nn5Var;
        this.x = str;
        this.y = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zI;
        nn5 nn5Var = this.w;
        WorkDatabase workDatabase = nn5Var.y;
        oe3 oe3Var = nn5Var.B;
        QnHx qnHxN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.x;
            synchronized (oe3Var.G) {
                zContainsKey = oe3Var.B.containsKey(str);
            }
            if (this.y) {
                zI = this.w.B.h(this.x);
            } else {
                if (!zContainsKey) {
                    CQf cQf = (CQf) qnHxN;
                    if (cQf.f(this.x) == kn5.RUNNING) {
                        cQf.n(kn5.ENQUEUED, this.x);
                    }
                }
                zI = this.w.B.i(this.x);
            }
            s52.c().a(z, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.x, Boolean.valueOf(zI)), new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
