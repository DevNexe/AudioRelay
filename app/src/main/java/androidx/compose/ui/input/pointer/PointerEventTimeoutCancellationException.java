package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public PointerEventTimeoutCancellationException(long j) {
        super("Timed out waiting for " + j + " ms");
    }
}
