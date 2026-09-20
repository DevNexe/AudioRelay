package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class db0 {
    public final Executor a;
    public w05<Void> b = k15.e(null);
    public final Object c = new Object();
    public final ThreadLocal<Boolean> d = new ThreadLocal<>();

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            db0.this.d.set(Boolean.TRUE);
        }
    }

    public db0(Executor executor) {
        this.a = executor;
        executor.execute(new QnHx());
    }

    public final <T> w05<T> a(Callable<T> callable) {
        w05<T> w05Var;
        synchronized (this.c) {
            w05Var = (w05<T>) this.b.f(this.a, new fb0(callable));
            this.b = w05Var.f(this.a, new qe0());
        }
        return w05Var;
    }
}
