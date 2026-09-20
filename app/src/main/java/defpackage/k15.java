package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class k15 {
    public static <TResult> TResult a(w05<TResult> w05Var) throws InterruptedException {
        oa3.g("Must not be called on the main application thread");
        if (w05Var == null) {
            throw new NullPointerException("Task must not be null");
        }
        if (w05Var.m()) {
            return (TResult) h(w05Var);
        }
        ny1 ny1Var = new ny1();
        cb7 cb7Var = d15.b;
        w05Var.e(cb7Var, ny1Var);
        w05Var.d(cb7Var, ny1Var);
        w05Var.a(cb7Var, ny1Var);
        ((CountDownLatch) ny1Var.w).await();
        return (TResult) h(w05Var);
    }

    public static Object b(kc7 kc7Var, TimeUnit timeUnit) throws TimeoutException {
        oa3.g("Must not be called on the main application thread");
        if (kc7Var == null) {
            throw new NullPointerException("Task must not be null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("TimeUnit must not be null");
        }
        if (kc7Var.m()) {
            return h(kc7Var);
        }
        ny1 ny1Var = new ny1();
        Executor executor = d15.b;
        kc7Var.e(executor, ny1Var);
        kc7Var.d(executor, ny1Var);
        kc7Var.a(executor, ny1Var);
        if (((CountDownLatch) ny1Var.w).await(30000L, timeUnit)) {
            return h(kc7Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static kc7 c(Callable callable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        }
        kc7 kc7Var = new kc7();
        executor.execute(new tb7(17, kc7Var, callable));
        return kc7Var;
    }

    public static kc7 d(Exception exc) {
        kc7 kc7Var = new kc7();
        kc7Var.r(exc);
        return kc7Var;
    }

    public static kc7 e(Object obj) {
        kc7 kc7Var = new kc7();
        kc7Var.s(obj);
        return kc7Var;
    }

    public static kc7 f(List list) {
        if (list == null || list.isEmpty()) {
            return e(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((w05) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        kc7 kc7Var = new kc7();
        dv5 dv5Var = new dv5(list.size(), kc7Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            w05 w05Var = (w05) it2.next();
            cb7 cb7Var = d15.b;
            w05Var.e(cb7Var, dv5Var);
            w05Var.d(cb7Var, dv5Var);
            w05Var.a(cb7Var, dv5Var);
        }
        return kc7Var;
    }

    public static w05<List<w05<?>>> g(w05<?>... w05VarArr) {
        if (w05VarArr.length == 0) {
            return e(Collections.emptyList());
        }
        List listAsList = Arrays.asList(w05VarArr);
        if (listAsList == null || listAsList.isEmpty()) {
            return e(Collections.emptyList());
        }
        return f(listAsList).i(d15.a, new ta2(listAsList, 15));
    }

    public static <TResult> TResult h(w05<TResult> w05Var) throws ExecutionException {
        if (w05Var.n()) {
            return w05Var.k();
        }
        if (w05Var.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(w05Var.j());
    }
}
