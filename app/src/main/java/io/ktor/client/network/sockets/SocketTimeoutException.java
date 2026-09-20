package io.ktor.client.network.sockets;

/* JADX INFO: loaded from: classes3.dex */
public final class SocketTimeoutException extends java.net.SocketTimeoutException {
    public final Throwable w;

    public SocketTimeoutException(String str, Throwable th) {
        super(str);
        this.w = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.w;
    }
}
