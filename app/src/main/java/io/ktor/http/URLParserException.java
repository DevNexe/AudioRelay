package io.ktor.http;

/* JADX INFO: loaded from: classes3.dex */
public final class URLParserException extends IllegalStateException {
    public URLParserException(String str, Throwable th) {
        super("Fail to parse url: ".concat(str), th);
    }
}
