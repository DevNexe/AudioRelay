package io.ktor.client.plugins;

import defpackage.qg1;

/* JADX INFO: loaded from: classes3.dex */
public final class ClientRequestException extends ResponseException {
    public final String w;

    public ClientRequestException(qg1 qg1Var, String str) {
        super(qg1Var, str);
        this.w = "Client request(" + qg1Var.c().d().getMethod().a + ' ' + qg1Var.c().d().getUrl() + ") invalid: " + qg1Var.i() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.w;
    }
}
