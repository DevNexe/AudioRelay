package defpackage;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public class kn6 implements Iterator, j$.util.Iterator {
    public final /* synthetic */ xn6 A;
    public final Iterator w;

    @CheckForNull
    public Object x;

    @CheckForNull
    public Collection y = null;
    public Iterator z = vo6.INSTANCE;

    public kn6(xn6 xn6Var) {
        this.A = xn6Var;
        this.w = xn6Var.z.entrySet().iterator();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.w.hasNext() || this.z.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!this.z.hasNext()) {
            Map.Entry entry = (Map.Entry) this.w.next();
            this.x = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.y = collection;
            this.z = collection.iterator();
        }
        return this.z.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.z.remove();
        Collection collection = this.y;
        collection.getClass();
        if (collection.isEmpty()) {
            this.w.remove();
        }
        this.A.A--;
    }
}
