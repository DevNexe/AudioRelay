package io.ktor.client.call;

import defpackage.dw2;
import defpackage.nl3;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedContentTypeException extends IllegalStateException {
    public UnsupportedContentTypeException(dw2 dw2Var) {
        super("Failed to write body: " + nl3.a(dw2Var.getClass()));
    }
}
