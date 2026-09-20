package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    public GestureCancellationException() {
        super(null);
    }

    public GestureCancellationException(int i) {
        super("The press gesture was canceled.");
    }
}
