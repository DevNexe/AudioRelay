package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ta<T> implements Iterator<T>, jv1, j$.util.Iterator {
    public int w = 2;
    public T x;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i = this.w;
        if (!(i != 4)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iH = O.h(i);
        if (iH != 0) {
            if (iH == 2) {
                return false;
            }
            this.w = 4;
            mm0 mm0Var = (mm0) this;
            while (true) {
                Iterator<T> it = mm0Var.y;
                if (!it.hasNext()) {
                    mm0Var.w = 3;
                    break;
                }
                T next = it.next();
                if (mm0Var.A.add((K) mm0Var.z.invoke(next))) {
                    mm0Var.x = next;
                    mm0Var.w = 1;
                    break;
                }
            }
            if (this.w != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.w = 2;
        return this.x;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
