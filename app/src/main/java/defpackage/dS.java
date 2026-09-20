package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dS extends B8C {
    public static volatile dS x;
    public static final QnHx y = new QnHx();
    public final zh0 w = new zh0();

    public static class QnHx implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            dS.V0().w.x.execute(runnable);
        }
    }

    public static dS V0() {
        if (x != null) {
            return x;
        }
        synchronized (dS.class) {
            if (x == null) {
                x = new dS();
            }
        }
        return x;
    }

    public final void W0(Runnable runnable) {
        zh0 zh0Var = this.w;
        if (zh0Var.y == null) {
            synchronized (zh0Var.w) {
                if (zh0Var.y == null) {
                    zh0Var.y = zh0.V0(Looper.getMainLooper());
                }
            }
        }
        zh0Var.y.post(runnable);
    }
}
