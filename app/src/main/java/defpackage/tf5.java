package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class tf5 {
    public static final ExecutorService a = kv0.a("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(w05<T> w05Var) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        w05Var.f(a, new sn1(countDownLatch, 9));
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (w05Var.n()) {
            return w05Var.k();
        }
        if (w05Var.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (w05Var.m()) {
            throw new IllegalStateException(w05Var.j());
        }
        throw new TimeoutException();
    }
}
