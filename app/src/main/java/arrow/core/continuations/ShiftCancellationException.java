package arrow.core.continuations;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ShiftCancellationException extends CancellationException {
    private ShiftCancellationException() {
        super("Shifted Continuation");
    }
}
