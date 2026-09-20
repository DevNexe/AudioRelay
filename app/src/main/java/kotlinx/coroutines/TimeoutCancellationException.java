package kotlinx.coroutines;

import defpackage.l90;
import defpackage.ms1;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException implements l90<TimeoutCancellationException> {
    public final transient ms1 w;

    public TimeoutCancellationException(String str, ms1 ms1Var) {
        super(str);
        this.w = ms1Var;
    }

    @Override // defpackage.l90
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.w);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
