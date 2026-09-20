package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1566j1 implements Spliterator {
    F0 a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    AbstractC1566j1(F0 f0) {
        this.a = f0;
    }

    protected static F0 f(ArrayDeque arrayDeque) {
        while (true) {
            F0 f0 = (F0) arrayDeque.pollFirst();
            if (f0 == null) {
                return null;
            }
            if (f0.j() != 0) {
                int iJ = f0.j();
                while (true) {
                    iJ--;
                    if (iJ >= 0) {
                        arrayDeque.addFirst(f0.a(iJ));
                    }
                }
            } else if (f0.count() > 0) {
                return f0;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.j(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
    }

    protected final ArrayDeque g() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iJ = this.a.j();
        while (true) {
            iJ--;
            if (iJ < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iJ));
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1514m.i(this);
    }

    protected final boolean h() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator == null) {
            ArrayDeque arrayDequeG = g();
            this.e = arrayDequeG;
            F0 f0F = f(arrayDequeG);
            if (f0F == null) {
                this.a = null;
                return false;
            }
            spliterator = f0F.spliterator();
        }
        this.d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC1514m.k(this, i);
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.C trySplit() {
        return (j$.util.C) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.I trySplit() {
        return (j$.util.I) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.L trySplit() {
        return (j$.util.L) trySplit();
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        F0 f0 = this.a;
        if (f0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < f0.j() - 1) {
            F0 f1 = this.a;
            int i = this.b;
            this.b = i + 1;
            return f1.a(i).spliterator();
        }
        F0 f0A = this.a.a(this.b);
        this.a = f0A;
        if (f0A.j() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        F0 f2 = this.a;
        this.b = 0 + 1;
        return f2.a(0).spliterator();
    }
}
