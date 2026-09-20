package defpackage;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
public final class d70 implements Runnable {
    public final /* synthetic */ j42 w;
    public final /* synthetic */ ConstraintTrackingWorker x;

    public d70(ConstraintTrackingWorker constraintTrackingWorker, j42 j42Var) {
        this.x = constraintTrackingWorker;
        this.w = j42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.x.C) {
            if (this.x.D) {
                ConstraintTrackingWorker constraintTrackingWorker = this.x;
                constraintTrackingWorker.getClass();
                constraintTrackingWorker.E.i(new ListenableWorker.QnHx.CQf());
            } else {
                this.x.E.k(this.w);
            }
        }
    }
}
