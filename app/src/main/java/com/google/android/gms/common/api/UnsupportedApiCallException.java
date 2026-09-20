package com.google.android.gms.common.api;

import defpackage.tw0;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final tw0 w;

    public UnsupportedApiCallException(tw0 tw0Var) {
        this.w = tw0Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.w));
    }
}
