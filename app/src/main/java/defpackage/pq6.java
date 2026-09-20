package defpackage;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class pq6 extends TimeoutException {
    public /* synthetic */ pq6(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
