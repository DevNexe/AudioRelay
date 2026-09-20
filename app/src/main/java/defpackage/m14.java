package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class m14 {
    public static volatile m70<? super Throwable> a;
    public static volatile i91<? super Callable<c54>, ? extends c54> b;
    public static volatile i91<? super Callable<c54>, ? extends c54> c;

    public static c54 a(Callable<c54> callable) {
        try {
            c54 c54VarCall = callable.call();
            mq2.b(c54VarCall, "Scheduler Callable result can't be null");
            return c54VarCall;
        } catch (Throwable th) {
            throw uu0.d(th);
        }
    }

    public static void b(Throwable th) {
        m70<? super Throwable> m70Var = a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            if (!((th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException))) {
                th = new UndeliverableException(th);
            }
        }
        if (m70Var != null) {
            try {
                m70Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static void c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("run is null");
        }
    }
}
