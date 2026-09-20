package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class kg<T> extends SjP<T> {
    public final T[] y;

    /* JADX WARN: Multi-variable type inference failed */
    public kg(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.y = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.w;
        this.w = i + 1;
        return this.y[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.w - 1;
        this.w = i;
        return this.y[i];
    }
}
