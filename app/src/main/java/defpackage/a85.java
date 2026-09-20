package defpackage;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class a85<U, T extends U> extends u54<T> implements Runnable {
    public final long z;

    public a85(long j, b90 b90Var) {
        super(b90Var, b90Var.getContext());
        this.z = j;
    }

    @Override // defpackage.EQ, defpackage.ss1
    public final String I0() {
        return super.I0() + "(timeMillis=" + this.z + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        V(new TimeoutCancellationException("Timed out waiting for " + this.z + " ms", this));
    }
}
