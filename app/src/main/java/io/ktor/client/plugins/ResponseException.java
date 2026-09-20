package io.ktor.client.plugins;

import defpackage.qg1;

/* JADX INFO: loaded from: classes3.dex */
public class ResponseException extends IllegalStateException {
    public ResponseException(qg1 qg1Var, String str) {
        super("Bad response: " + qg1Var + ". Text: \"" + str + '\"');
    }
}
