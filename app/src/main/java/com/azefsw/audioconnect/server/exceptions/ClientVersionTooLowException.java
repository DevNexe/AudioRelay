package com.azefsw.audioconnect.server.exceptions;

import defpackage.fc2;

/* JADX INFO: loaded from: classes.dex */
public final class ClientVersionTooLowException extends Exception {
    public ClientVersionTooLowException(String str) {
        super(fc2.a("The client version is too low (", str, ")"));
    }
}
