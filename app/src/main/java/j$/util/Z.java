package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class Z implements Spliterator {
    private final java.util.Collection a;
    private java.util.Iterator b = null;
    private final int c;
    private long d;
    private int e;

    public Z(int i, java.util.Collection collection) {
        this.a = collection;
        this.c = (i & 4096) == 0 ? i | 64 | 16384 : i;
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        if (this.b == null) {
            java.util.Collection collection = this.a;
            this.b = collection.iterator();
            this.d = collection.size();
        }
        if (!this.b.hasNext()) {
            return false;
        }
        consumer.accept(this.b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.b != null) {
            return this.d;
        }
        java.util.Collection collection = this.a;
        this.b = collection.iterator();
        long size = collection.size();
        this.d = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        java.util.Iterator it = this.b;
        if (it == null) {
            java.util.Collection collection = this.a;
            java.util.Iterator it2 = collection.iterator();
            this.b = it2;
            this.d = collection.size();
            it = it2;
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
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

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        java.util.Iterator it = this.b;
        if (it == null) {
            java.util.Collection collection = this.a;
            java.util.Iterator it2 = collection.iterator();
            this.b = it2;
            size = collection.size();
            this.d = size;
            it = it2;
        } else {
            size = this.d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.e + 1024;
        if (i > size) {
            i = (int) size;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.e = i2;
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            this.d = j - ((long) i2);
        }
        return new S(objArr, 0, i2, this.c);
    }
}
