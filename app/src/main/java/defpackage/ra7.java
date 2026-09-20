package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ra7 extends vw5 {
    public final int w;
    public int x;
    public final qb7 y;

    public ra7(qb7 qb7Var, int i) {
        int size = qb7Var.size();
        Th.V(i, size);
        this.w = size;
        this.x = i;
        this.y = qb7Var;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        return this.x < this.w;
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean hasPrevious() {
        return this.x > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.x;
        this.x = i + 1;
        return this.y.get(i);
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.x - 1;
        this.x = i;
        return this.y.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.x;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.x - 1;
    }
}
