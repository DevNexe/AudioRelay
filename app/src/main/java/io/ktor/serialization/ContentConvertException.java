package io.ktor.serialization;

/* JADX INFO: loaded from: classes3.dex */
public class ContentConvertException extends Exception {
    public ContentConvertException(String str) {
        super(str, null);
    }

    public ContentConvertException(Throwable th) {
        super("Illegal input", th);
    }
}
