package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jz6 implements Iterator, java.util.Iterator {
    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // j$.util.Iterator
    public final Object next() {
        gz6 gz6Var = (gz6) this;
        int i = gz6Var.w;
        if (i >= gz6Var.x) {
            throw new NoSuchElementException();
        }
        gz6Var.w = i + 1;
        return Byte.valueOf(gz6Var.y.b(i));
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
