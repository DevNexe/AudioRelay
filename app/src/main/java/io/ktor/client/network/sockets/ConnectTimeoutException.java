package io.ktor.client.network.sockets;

import java.net.ConnectException;

/* JADX INFO: loaded from: classes3.dex */
public final class ConnectTimeoutException extends ConnectException {
    public final Throwable w;

    public ConnectTimeoutException(String str, Throwable th) {
        super(str);
        this.w = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.w;
    }
}
