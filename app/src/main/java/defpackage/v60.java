package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class v60<T> implements x94<T> {
    public final AtomicReference<x94<T>> a;

    public v60(ba4.QnHx qnHx) {
        this.a = new AtomicReference<>(qnHx);
    }

    @Override // defpackage.x94
    public final Iterator<T> iterator() {
        x94<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
