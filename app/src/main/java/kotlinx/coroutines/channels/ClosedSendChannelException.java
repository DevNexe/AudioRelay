package kotlinx.coroutines.channels;

/* JADX INFO: loaded from: classes3.dex */
public final class ClosedSendChannelException extends IllegalStateException {
    public ClosedSendChannelException() {
        super("Channel was closed");
    }
}
