package com.azefsw.audioconnect.player.exceptions;

import defpackage.fc2;

/* JADX INFO: loaded from: classes.dex */
public final class ServerVersionTooLowException extends Exception {
    public ServerVersionTooLowException(String str) {
        super(fc2.a("The server version is too low (", str, ")"));
    }
}
