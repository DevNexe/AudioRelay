package io.ktor.client.call;

import defpackage.ve1;

/* JADX INFO: loaded from: classes3.dex */
public final class DoubleReceiveException extends IllegalStateException {
    public final String w;

    public DoubleReceiveException(ve1 ve1Var) {
        this.w = "Response already received: " + ve1Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.w;
    }
}
