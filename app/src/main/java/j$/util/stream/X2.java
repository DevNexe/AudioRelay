package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Supplier;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
abstract class X2 implements Spliterator {
    final boolean a;
    final AbstractC1616w0 b;
    private Supplier c;
    Spliterator d;
    InterfaceC1558h2 e;
    C1520a f;
    long g;
    AbstractC1540e h;
    boolean i;

    X2(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z) {
        this.b = abstractC1616w0;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }

    X2(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z) {
        this.b = abstractC1616w0;
        this.c = c1520a;
        this.d = null;
        this.a = z;
    }

    private boolean g() {
        boolean zA;
        while (this.h.count() == 0) {
            if (!this.e.h()) {
                C1520a c1520a = this.f;
                int i = c1520a.a;
                Object obj = c1520a.b;
                switch (i) {
                    case 4:
                        C1554g3 c1554g3 = (C1554g3) obj;
                        zA = c1554g3.d.a(c1554g3.e);
                        break;
                    case 5:
                        i3 i3Var = (i3) obj;
                        zA = i3Var.d.a(i3Var.e);
                        break;
                    case 6:
                        k3 k3Var = (k3) obj;
                        zA = k3Var.d.a(k3Var.e);
                        break;
                    default:
                        C3 c3 = (C3) obj;
                        zA = c3.d.a(c3.e);
                        break;
                }
                if (zA) {
                    continue;
                }
            }
            if (this.i) {
                return false;
            }
            this.e.end();
            this.i = true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        h();
        int iM = V2.M(this.b.g1()) & V2.f;
        return (iM & 64) != 0 ? (iM & (-16449)) | (this.d.characteristics() & 16448) : iM;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        h();
        return this.d.estimateSize();
    }

    final boolean f() {
        AbstractC1540e abstractC1540e = this.h;
        if (abstractC1540e == null) {
            if (this.i) {
                return false;
            }
            h();
            i();
            this.g = 0L;
            this.e.f(this.d.getExactSizeIfKnown());
            return g();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < abstractC1540e.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return g();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC1514m.k(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        h();
        if (V2.SIZED.p(this.b.g1())) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    final void h() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC1514m.k(this, i);
    }

    abstract void i();

    abstract X2 k(Spliterator spliterator);

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.i) {
            return null;
        }
        h();
        Spliterator spliteratorTrySplit = this.d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return k(spliteratorTrySplit);
    }
}
