package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class sh2<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return OW8.m(Long.valueOf(((je4) t).getCreationTime()), Long.valueOf(((je4) t2).getCreationTime()));
    }
}
