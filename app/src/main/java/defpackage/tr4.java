package defpackage;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public final class tr4 implements Runnable {
    public final nn5 w;
    public final String x;
    public final WorkerParameters.QnHx y;

    public tr4(nn5 nn5Var, String str, WorkerParameters.QnHx qnHx) {
        this.w = nn5Var;
        this.x = str;
        this.y = qnHx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.B.f(this.x, this.y);
    }
}
