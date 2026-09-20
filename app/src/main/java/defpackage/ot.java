package defpackage;

import io.ktor.utils.io.ClosedWriteChannelException;

/* JADX INFO: loaded from: classes3.dex */
public final class ot {
    public static final ot b = new ot(null);
    public final Throwable a;

    public ot(Throwable th) {
        this.a = th;
    }

    public final Throwable a() {
        Throwable th = this.a;
        return th == null ? new ClosedWriteChannelException("The channel was closed") : th;
    }

    public final String toString() {
        return "Closed[" + a() + ']';
    }
}
