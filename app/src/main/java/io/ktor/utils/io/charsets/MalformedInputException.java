package io.ktor.utils.io.charsets;

/* JADX INFO: loaded from: classes3.dex */
public class MalformedInputException extends java.nio.charset.MalformedInputException {
    public final String w;

    public MalformedInputException(String str) {
        super(0);
        this.w = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.w;
    }
}
