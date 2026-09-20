package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class tj1 implements Iterator, jv1, j$.util.Iterator {
    public final /* synthetic */ int w = 0;
    public int x;
    public final Object y;

    public tj1(Object[] objArr) {
        this.y = objArr;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.w) {
            case 0:
                j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
                break;
            default:
                j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.w) {
        }
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i = this.w;
        Object obj = this.y;
        switch (i) {
            case 0:
                return ((Iterator) obj).hasNext();
            default:
                return this.x < ((Object[]) obj).length;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.w;
        Object obj = this.y;
        switch (i) {
            case 0:
                int i2 = this.x;
                this.x = i2 + 1;
                if (i2 >= 0) {
                    return new rj1(i2, ((Iterator) obj).next());
                }
                ps0.j0();
                throw null;
            default:
                try {
                    int i3 = this.x;
                    this.x = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.x--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        switch (this.w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public tj1(Iterator it) {
        this.y = it;
    }
}
