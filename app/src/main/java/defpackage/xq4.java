package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xq4 implements Iterator<Object>, jv1, j$.util.Iterator {
    public int w;
    public final /* synthetic */ wq4 x;

    public xq4(wq4<Object> wq4Var) {
        this.x = wq4Var;
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
        return this.w < this.x.k();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.w;
        this.w = i + 1;
        return this.x.l(i);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
