package j$.util.stream;

import j$.util.AbstractC1514m;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
abstract class P2 implements j$.util.L {
    int a;
    final int b;
    int c;
    final int d;
    Object e;
    final /* synthetic */ Q2 f;

    P2(Q2 q2, int i, int i2, int i3, int i4) {
        this.f = q2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = q2.f;
        this.e = objArr == null ? q2.e : objArr[i];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return ((long) i2) - ((long) this.c);
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.c);
    }

    abstract void f(int i, Object obj, Object obj2);

    @Override // j$.util.L
    /* JADX INFO: renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void d(Object obj) {
        Q2 q2;
        obj.getClass();
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                q2 = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = q2.f[i];
                q2.r(obj2, i4, q2.s(obj2), obj);
                i++;
                i4 = 0;
            }
            q2.r(this.a == i3 ? this.e : q2.f[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
        }
    }

    abstract j$.util.L g(Object obj, int i, int i2);

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1514m.i(this);
    }

    abstract j$.util.L h(int i, int i2, int i3, int i4);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC1514m.k(this, i);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final boolean o(Object obj) {
        obj.getClass();
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        f(i3, obj2, obj);
        int i4 = this.c;
        Object obj3 = this.e;
        Q2 q2 = this.f;
        if (i4 == q2.s(obj3)) {
            this.c = 0;
            int i5 = this.a + 1;
            this.a = i5;
            Object[] objArr = q2.f;
            if (objArr != null && i5 <= i2) {
                this.e = objArr[i5];
            }
        }
        return true;
    }

    @Override // j$.util.L, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.C trySplit() {
        return (j$.util.C) trySplit();
    }

    @Override // j$.util.L, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.L, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.I trySplit() {
        return (j$.util.I) trySplit();
    }

    @Override // j$.util.Spliterator
    public final j$.util.L trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = this.c;
            Q2 q2 = this.f;
            j$.util.L lH = h(i, i2 - 1, i3, q2.s(q2.f[i2 - 1]));
            this.a = i2;
            this.c = 0;
            this.e = q2.f[i2];
            return lH;
        }
        if (i != i2) {
            return null;
        }
        int i4 = this.c;
        int i5 = (this.d - i4) / 2;
        if (i5 == 0) {
            return null;
        }
        j$.util.L lG = g(this.e, i4, i5);
        this.c += i5;
        return lG;
    }
}
