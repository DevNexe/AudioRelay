package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ra0 {
    public static final List<pa0> a = na4.L0(ba4.F0(qa0.b()));

    public static final void a(la0 la0Var, Throwable th) {
        Throwable runtimeException;
        Iterator<pa0> it = a.iterator();
        while (it.hasNext()) {
            try {
                it.next().M(la0Var, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    Th.a(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            Th.a(th, new mk0(la0Var));
            sd5 sd5Var = sd5.a;
        } catch (Throwable unused) {
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
