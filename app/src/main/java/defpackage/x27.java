package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class x27<TResult> implements q97<TResult> {
    public final Executor w;
    public final Object x = new Object();

    @GuardedBy("mLock")
    @Nullable
    public final nu2 y;

    public x27(Executor executor, nu2 nu2Var) {
        this.w = executor;
        this.y = nu2Var;
    }

    @Override // defpackage.q97
    public final void a(w05<TResult> w05Var) {
        if (w05Var.n() || w05Var.l()) {
            return;
        }
        synchronized (this.x) {
            if (this.y == null) {
                return;
            }
            this.w.execute(new tb7(this, w05Var, 16));
        }
    }
}
