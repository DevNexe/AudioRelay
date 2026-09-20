package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class nf1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return OW8.m(Double.valueOf(((ic1) t2).c), Double.valueOf(((ic1) t).c));
    }
}
