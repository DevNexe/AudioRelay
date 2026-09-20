package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class mu extends ps0 {
    public static final <T> int w0(Iterable<? extends T> iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
