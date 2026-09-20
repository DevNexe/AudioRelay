package arrow.core;

/* JADX INFO: loaded from: classes.dex */
public final class ArrowCoreInternalException extends RuntimeException {
    static {
        new ArrowCoreInternalException();
    }

    private ArrowCoreInternalException() {
        super("Arrow-Core internal error. Please let us know and create a ticket at https://github.com/arrow-kt/arrow-core/issues/new/choose", null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
