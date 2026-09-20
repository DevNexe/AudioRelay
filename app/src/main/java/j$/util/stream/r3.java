package j$.util.stream;

import j$.util.AbstractC1514m;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
abstract class r3 extends t3 implements j$.util.L {
    r3(j$.util.L l, long j, long j2) {
        super(l, j, j2, 0L, Math.min(l.estimateSize(), j2));
    }

    r3(j$.util.L l, long j, long j2, long j3, long j4) {
        super(l, j, j2, j3, j4);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void d(Object obj) {
        obj.getClass();
        long j = this.e;
        long j2 = this.a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && ((j$.util.L) this.c).estimateSize() + j3 <= this.b) {
            ((j$.util.L) this.c).d(obj);
            this.d = this.e;
            return;
        }
        while (j2 > this.d) {
            ((j$.util.L) this.c).o(g());
            this.d++;
        }
        while (this.d < this.e) {
            ((j$.util.L) this.c).o(obj);
            this.d++;
        }
    }

    protected abstract Object g();

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
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
    /* JADX INFO: renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final boolean o(Object obj) {
        long j;
        obj.getClass();
        long j2 = this.e;
        long j3 = this.a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.d;
            if (j3 <= j) {
                break;
            }
            ((j$.util.L) this.c).o(g());
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return ((j$.util.L) this.c).o(obj);
    }
}
