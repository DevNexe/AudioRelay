package defpackage;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class yf1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        CharBuffer charBuffer = sp.a;
        return OW8.m(((Charset) t).name(), ((Charset) t2).name());
    }
}
