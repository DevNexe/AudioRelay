package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class bb3<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return OW8.m(Integer.valueOf(((ab3) t).d.a.b), Integer.valueOf(((ab3) t2).d.a.b));
    }
}
