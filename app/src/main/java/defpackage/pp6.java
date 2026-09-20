package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pp6 implements Iterator, j$.util.Iterator {
    public final Iterator w;

    public pp6(Iterator it) {
        it.getClass();
        this.w = it;
    }

    public abstract Object a(Object obj);

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
        return this.w.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return a(this.w.next());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.w.remove();
    }
}
