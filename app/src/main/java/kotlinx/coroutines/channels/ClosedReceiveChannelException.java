package kotlinx.coroutines.channels;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ClosedReceiveChannelException extends NoSuchElementException {
    public ClosedReceiveChannelException() {
        super("Channel was closed");
    }
}
