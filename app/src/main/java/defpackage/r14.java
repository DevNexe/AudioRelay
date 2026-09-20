package defpackage;

import io.reactivex.exceptions.UndeliverableException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class r14 implements m70<Throwable> {
    public volatile List<? extends fv1<? extends Throwable>> w = ps0.M(nl3.a(IOException.class), nl3.a(SocketException.class), nl3.a(InterruptedIOException.class), nl3.a(InterruptedException.class), nl3.a(TimeoutException.class), nl3.a(RejectedExecutionException.class));

    @Override // defpackage.m70
    public final void accept(Throwable th) throws Throwable {
        Throwable th2 = th;
        if (th2 instanceof UndeliverableException) {
            UndeliverableException undeliverableException = (UndeliverableException) th2;
            Throwable cause = undeliverableException.getCause();
            if (cause != null ? XTd3.r(cause, this.w) : false) {
                a62.a.h("error", "undelivered_exception", undeliverableException.getCause().getMessage());
                a62.a.d(undeliverableException, true);
                return;
            }
        }
        a62.a.h("error", "uncaught_exception", th2.getMessage());
        a62.a.d(th2, true);
        throw th2;
    }
}
