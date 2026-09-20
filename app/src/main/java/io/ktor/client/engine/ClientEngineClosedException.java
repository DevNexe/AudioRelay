package io.ktor.client.engine;

/* JADX INFO: loaded from: classes3.dex */
public final class ClientEngineClosedException extends IllegalStateException {
    public final Throwable w;

    public ClientEngineClosedException() {
        this(0);
    }

    public ClientEngineClosedException(int i) {
        super("Client already closed");
        this.w = null;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.w;
    }
}
