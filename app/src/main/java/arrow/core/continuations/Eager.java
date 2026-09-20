package arrow.core.continuations;

/* JADX INFO: loaded from: classes.dex */
public final class Eager extends ShiftCancellationException {
    @Override // java.lang.Throwable
    public final String toString() {
        return "ShiftCancellationException(" + getMessage() + ')';
    }
}
