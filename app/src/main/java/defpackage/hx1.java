package defpackage;

import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hx1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String str = ((gx1) t).b;
        Locale locale = Locale.ROOT;
        return OW8.m(str.toUpperCase(locale), ((gx1) t2).b.toUpperCase(locale));
    }
}
