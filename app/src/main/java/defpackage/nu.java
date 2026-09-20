package defpackage;

import j$.util.function.Consumer;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class nu implements Iterator<Object>, jv1, j$.util.Iterator {
    public final /* synthetic */ Enumeration<Object> w;

    public nu(Enumeration<Object> enumeration) {
        this.w = enumeration;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.w.hasMoreElements();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return this.w.nextElement();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
