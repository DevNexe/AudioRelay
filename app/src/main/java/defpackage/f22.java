package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f22<T> implements pg3<Set<T>> {
    public volatile Set<T> b = null;
    public volatile Set<pg3<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    public f22(Collection<pg3<T>> collection) {
        this.a.addAll(collection);
    }

    @Override // defpackage.pg3
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator<pg3<T>> it = this.a.iterator();
                        while (it.hasNext()) {
                            this.b.add(it.next().get());
                        }
                        this.a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
