package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class sj1<T> implements Iterable<rj1<? extends T>>, jv1 {
    public final h81<Iterator<T>> w;

    public sj1(w2 w2Var) {
        this.w = w2Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<rj1<T>> iterator() {
        return new tj1(this.w.invoke());
    }
}
