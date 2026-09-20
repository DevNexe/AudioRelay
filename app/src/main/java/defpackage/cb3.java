package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class cb3<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return OW8.m(Integer.valueOf(((n43) t2).c.b), Integer.valueOf(((n43) t).c.b));
    }
}
