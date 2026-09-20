package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nn4 implements Iterator<Object>, jv1, j$.util.Iterator {
    public int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ mn4 y;

    public nn4(int i, int i2, mn4 mn4Var) {
        this.x = i2;
        this.y = mn4Var;
        this.w = i;
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
        return this.w < this.x;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            return null;
        }
        mn4 mn4Var = this.y;
        Object[] objArr = mn4Var.c;
        int i = this.w;
        this.w = i + 1;
        return objArr[mn4Var.h(i)];
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
