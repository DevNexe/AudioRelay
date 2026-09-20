package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class v13<T> extends SjP<T> {
    public final T[] y;
    public final cb5<T> z;

    /* JADX WARN: Multi-variable type inference failed */
    public v13(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.y = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.z = new cb5<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        cb5<T> cb5Var = this.z;
        if (cb5Var.hasNext()) {
            this.w++;
            return cb5Var.next();
        }
        int i = this.w;
        this.w = i + 1;
        return this.y[i - cb5Var.x];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.w;
        cb5<T> cb5Var = this.z;
        int i2 = cb5Var.x;
        if (i <= i2) {
            this.w = i - 1;
            return cb5Var.previous();
        }
        int i3 = i - 1;
        this.w = i3;
        return this.y[i3 - i2];
    }
}
