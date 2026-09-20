package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class y94<T> extends z94<T> implements Iterator<T>, z80<sd5>, jv1, j$.util.Iterator {
    public int w;
    public T x;
    public z80<? super sd5> y;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z94
    public final void a(Object obj, z80 z80Var) {
        this.x = obj;
        this.w = 3;
        this.y = z80Var;
    }

    public final RuntimeException b() {
        int i = this.w;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.w);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // defpackage.z80
    public final la0 getContext() {
        return xr0.w;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.w;
            if (i != 0) {
                break;
            }
            this.w = 5;
            z80<? super sd5> z80Var = this.y;
            this.y = null;
            z80Var.x(sd5.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        int i = this.w;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.w = 1;
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.w = 0;
        T t = this.x;
        this.x = null;
        return t;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.z80
    public final void x(Object obj) throws Throwable {
        C0239D.H(obj);
        this.w = 4;
    }
}
