package io.ktor.utils.io.core;

import defpackage.ex0;

/* JADX INFO: loaded from: classes3.dex */
public final class InsufficientSpaceException extends Exception {
    public InsufficientSpaceException() {
        super("Not enough free space");
    }

    public InsufficientSpaceException(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder("Not enough free space to write ");
        sb.append(str);
        sb.append(" of ");
        sb.append(i);
        sb.append(" bytes, available ");
        super(ex0.c(sb, i2, " bytes."));
    }
}
