package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {

    @Deprecated
    public final Status w;

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        int i = status.x;
        String str = status.y;
        super(i + ": " + (str == null ? "" : str));
        this.w = status;
    }
}
