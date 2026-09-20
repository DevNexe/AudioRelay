package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class sa4 implements Iterator<String>, jv1, j$.util.Iterator {
    public int w;
    public final /* synthetic */ pa4 x;

    public sa4(pa4 pa4Var) {
        this.x = pa4Var;
        this.w = pa4Var.f();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.w > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        pa4 pa4Var = this.x;
        int iF = pa4Var.f();
        int i = this.w;
        this.w = i - 1;
        return pa4Var.g(iF - i);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
