package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mk0 extends RuntimeException {
    public final la0 w;

    public mk0(la0 la0Var) {
        this.w = la0Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.w.toString();
    }
}
