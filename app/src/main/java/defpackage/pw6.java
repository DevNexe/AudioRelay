package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class pw6<TResult> implements q97<TResult> {
    public final Executor w;
    public final Object x = new Object();

    @GuardedBy("mLock")
    @Nullable
    public final ju2 y;

    public pw6(Executor executor, ju2 ju2Var) {
        this.w = executor;
        this.y = ju2Var;
    }

    @Override // defpackage.q97
    public final void a(w05<TResult> w05Var) {
        if (w05Var.l()) {
            synchronized (this.x) {
                if (this.y == null) {
                    return;
                }
                this.w.execute(new o17(this, 9));
            }
        }
    }
}
