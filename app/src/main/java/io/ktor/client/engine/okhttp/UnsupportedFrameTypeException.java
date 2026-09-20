package io.ktor.client.engine.okhttp;

import defpackage.l90;
import defpackage.p61;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedFrameTypeException extends IllegalArgumentException implements l90<UnsupportedFrameTypeException> {
    public final p61 w;

    public UnsupportedFrameTypeException(p61 p61Var) {
        super("Unsupported frame type: " + p61Var);
        this.w = p61Var;
    }

    @Override // defpackage.l90
    public final Throwable a() {
        UnsupportedFrameTypeException unsupportedFrameTypeException = new UnsupportedFrameTypeException(this.w);
        unsupportedFrameTypeException.initCause(this);
        return unsupportedFrameTypeException;
    }
}
