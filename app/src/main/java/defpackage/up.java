package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class up {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b;

    static {
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        b = Charset.forName("ISO-8859-1");
    }
}
