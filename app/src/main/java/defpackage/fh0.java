package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class fh0 extends gv0 implements Executor {
    public static final fh0 y = new fh0();
    public static final j32 z;

    static {
        vd5 vd5Var = vd5.y;
        int i = qz4.a;
        if (64 >= i) {
            i = 64;
        }
        z = (j32) vd5Var.v(fp1.w0("kotlinx.coroutines.io.parallelism", i, 0, 0, 12));
    }

    @Override // defpackage.gv0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(xr0.w, runnable);
    }

    @Override // defpackage.oa0
    public final void g(la0 la0Var, Runnable runnable) {
        z.g(la0Var, runnable);
    }

    @Override // defpackage.oa0
    public final void n(la0 la0Var, Runnable runnable) {
        z.n(la0Var, runnable);
    }

    @Override // defpackage.oa0
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.oa0
    public final oa0 v(int i) {
        return vd5.y.v(i);
    }
}
