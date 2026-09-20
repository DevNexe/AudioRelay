package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class mm0<T, K> extends ta<T> {
    public final HashSet<K> A = new HashSet<>();
    public final Iterator<T> y;
    public final j81<T, K> z;

    /* JADX WARN: Multi-variable type inference failed */
    public mm0(Iterator<? extends T> it, j81<? super T, ? extends K> j81Var) {
        this.y = it;
        this.z = j81Var;
    }
}
