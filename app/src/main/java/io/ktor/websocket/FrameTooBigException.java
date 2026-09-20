package io.ktor.websocket;

import defpackage.l90;

/* JADX INFO: loaded from: classes3.dex */
public final class FrameTooBigException extends Exception implements l90<FrameTooBigException> {
    public final long w;

    public FrameTooBigException(long j) {
        this.w = j;
    }

    @Override // defpackage.l90
    public final Throwable a() {
        FrameTooBigException frameTooBigException = new FrameTooBigException(this.w);
        frameTooBigException.initCause(this);
        return frameTooBigException;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Frame is too big: " + this.w;
    }
}
