package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class n57<TResult> implements q97<TResult> {
    public final Executor w;
    public final Object x = new Object();

    @GuardedBy("mLock")
    @Nullable
    public final yu2<? super TResult> y;

    public n57(Executor executor, yu2<? super TResult> yu2Var) {
        this.w = executor;
        this.y = yu2Var;
    }

    @Override // defpackage.q97
    public final void a(w05<TResult> w05Var) {
        if (w05Var.n()) {
            synchronized (this.x) {
                if (this.y == null) {
                    return;
                }
                this.w.execute(new ta7(this, w05Var, 16));
            }
        }
    }
}
