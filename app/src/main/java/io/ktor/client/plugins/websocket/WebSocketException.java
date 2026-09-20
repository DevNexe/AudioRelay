package io.ktor.client.plugins.websocket;

/* JADX INFO: loaded from: classes3.dex */
public final class WebSocketException extends IllegalStateException {
    public WebSocketException() {
        super("Max frame size switch is not supported in OkHttp engine.");
    }
}
