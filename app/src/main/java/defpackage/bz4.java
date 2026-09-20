package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.QnHx;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class bz4 implements Runnable {
    public final /* synthetic */ WorkDatabase w;
    public final /* synthetic */ String x;
    public final /* synthetic */ QnHx y;

    public bz4(QnHx qnHx, WorkDatabase workDatabase, String str) {
        this.y = qnHx;
        this.w = workDatabase;
        this.x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WorkSpec workSpecI = ((CQf) this.w.n()).i(this.x);
        if (workSpecI == null || !workSpecI.b()) {
            return;
        }
        synchronized (this.y.y) {
            this.y.B.put(this.x, workSpecI);
            this.y.C.add(workSpecI);
            QnHx qnHx = this.y;
            qnHx.D.b(qnHx.C);
        }
    }
}
