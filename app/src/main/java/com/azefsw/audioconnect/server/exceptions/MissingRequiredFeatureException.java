package com.azefsw.audioconnect.server.exceptions;

import defpackage.ev4;

/* JADX INFO: loaded from: classes.dex */
public final class MissingRequiredFeatureException extends Exception {
    public MissingRequiredFeatureException() {
        super(ev4.l("\n     The client is missing the required feature 'StreamData'.\n         Make sure you're using the latest version of AudioRelay\n    "));
    }
}
