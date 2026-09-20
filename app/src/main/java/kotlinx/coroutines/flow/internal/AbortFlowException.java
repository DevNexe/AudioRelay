package kotlinx.coroutines.flow.internal;

import defpackage.nz0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class AbortFlowException extends CancellationException {
    public final transient nz0<?> w;

    public AbortFlowException(nz0<?> nz0Var) {
        super("Flow was aborted, no more elements needed");
        this.w = nz0Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
