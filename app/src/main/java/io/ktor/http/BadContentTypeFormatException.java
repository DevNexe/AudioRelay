package io.ktor.http;

/* JADX INFO: loaded from: classes3.dex */
public final class BadContentTypeFormatException extends Exception {
    public BadContentTypeFormatException(String str) {
        super("Bad Content-Type format: ".concat(str));
    }
}
