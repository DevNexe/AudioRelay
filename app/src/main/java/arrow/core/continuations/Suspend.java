package arrow.core.continuations;

/* JADX INFO: loaded from: classes.dex */
public final class Suspend extends ShiftCancellationException {
    @Override // java.lang.Throwable
    public final String toString() {
        return "ShiftCancellationException(" + getMessage() + ')';
    }
}
