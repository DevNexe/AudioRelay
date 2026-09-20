package defpackage;

import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ab1 implements Iterator<Object>, jv1, j$.util.Iterator {
    public final ln4 w;
    public final int x;
    public int y;
    public final int z;

    public ab1(int i, int i2, ln4 ln4Var) {
        this.w = ln4Var;
        this.x = i2;
        this.y = i;
        this.z = ln4Var.C;
        if (ln4Var.B) {
            throw new ConcurrentModificationException();
        }
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
        return this.y < this.x;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        ln4 ln4Var = this.w;
        if (ln4Var.C != this.z) {
            throw new ConcurrentModificationException();
        }
        int i = this.y;
        this.y = fp1.s(ln4Var.w, i) + i;
        return new za1(this, i);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
