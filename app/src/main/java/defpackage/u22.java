package defpackage;

import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class u22<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String str = ((n22) t).a;
        Locale locale = Locale.ROOT;
        return OW8.m(str.toUpperCase(locale), ((n22) t2).a.toUpperCase(locale));
    }
}
