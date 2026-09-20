package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class tz6<TResult> implements q97<TResult> {
    public final Executor w;
    public final Object x = new Object();

    @GuardedBy("mLock")
    @Nullable
    public final ku2<TResult> y;

    public tz6(Executor executor, ku2<TResult> ku2Var) {
        this.w = executor;
        this.y = ku2Var;
    }

    @Override // defpackage.q97
    public final void a(w05<TResult> w05Var) {
        synchronized (this.x) {
            if (this.y == null) {
                return;
            }
            this.w.execute(new iq5(14, this, w05Var));
        }
    }
}
