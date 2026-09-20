package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class Y implements F {
    private final int[] a;
    private int b;
    private final int c;
    private final int d;

    public Y(int[] iArr, int i, int i2, int i3) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 64 | 16384;
    }

    @Override // j$.util.F, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.m(this, consumer);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void d(j$.util.function.L l) {
        int i;
        l.getClass();
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = this.c;
        if (length < i2 || (i = this.b) < 0) {
            return;
        }
        this.b = i2;
        if (i < i2) {
            do {
                l.accept(iArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.c - this.b;
    }

    @Override // j$.util.F, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC1514m.k(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1514m.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC1514m.k(this, i);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean o(j$.util.function.L l) {
        l.getClass();
        int i = this.b;
        if (i < 0 || i >= this.c) {
            return false;
        }
        this.b = i + 1;
        l.accept(this.a[i]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final F trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new Y(this.a, i, i2, this.d);
    }
}
