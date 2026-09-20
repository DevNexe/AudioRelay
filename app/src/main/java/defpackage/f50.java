package defpackage;

import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class f50 {
    public static final HashMap d = new HashMap();
    public static final ve3 e = new ve3(2);
    public final ExecutorService a;
    public final k50 b;
    public kc7 c = null;

    public static class QnHx<TResult> implements yu2<TResult>, nu2, ju2 {
        public final CountDownLatch w = new CountDownLatch(1);

        @Override // defpackage.ju2
        public final void c() {
            this.w.countDown();
        }

        @Override // defpackage.nu2
        public final void onFailure(Exception exc) {
            this.w.countDown();
        }

        @Override // defpackage.yu2
        public final void onSuccess(TResult tresult) {
            this.w.countDown();
        }
    }

    public f50(ExecutorService executorService, k50 k50Var) {
        this.a = executorService;
        this.b = k50Var;
    }

    public static Object a(w05 w05Var, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        QnHx qnHx = new QnHx();
        Executor executor = e;
        w05Var.e(executor, qnHx);
        w05Var.d(executor, qnHx);
        w05Var.a(executor, qnHx);
        if (!qnHx.w.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (w05Var.n()) {
            return w05Var.k();
        }
        throw new ExecutionException(w05Var.j());
    }

    public final synchronized w05<g50> b() {
        kc7 kc7Var = this.c;
        if (kc7Var == null || (kc7Var.m() && !this.c.n())) {
            ExecutorService executorService = this.a;
            k50 k50Var = this.b;
            Objects.requireNonNull(k50Var);
            this.c = k15.c(new QE(k50Var, 4), executorService);
        }
        return this.c;
    }
}
