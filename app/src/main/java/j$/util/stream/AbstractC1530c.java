package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1530c extends AbstractC1616w0 implements InterfaceC1560i {
    private final AbstractC1530c h;
    private final AbstractC1530c i;
    protected final int j;
    private AbstractC1530c k;
    private int l;
    private int m;
    private Spliterator n;
    private boolean o;
    private boolean p;
    private Runnable q;
    private boolean r;

    AbstractC1530c(Spliterator spliterator, int i, boolean z) {
        this.i = null;
        this.n = spliterator;
        this.h = this;
        int i2 = V2.g & i;
        this.j = i2;
        this.m = (~(i2 << 1)) & V2.l;
        this.l = 0;
        this.r = z;
    }

    AbstractC1530c(AbstractC1530c abstractC1530c, int i) {
        if (abstractC1530c.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC1530c.o = true;
        abstractC1530c.k = this;
        this.i = abstractC1530c;
        this.j = V2.h & i;
        this.m = V2.j(i, abstractC1530c.m);
        AbstractC1530c abstractC1530c2 = abstractC1530c.h;
        this.h = abstractC1530c2;
        if (J1()) {
            abstractC1530c2.p = true;
        }
        this.l = abstractC1530c.l + 1;
    }

    private Spliterator L1(int i) {
        int i2;
        int i3;
        AbstractC1530c abstractC1530c = this.h;
        Spliterator spliteratorI1 = abstractC1530c.n;
        if (spliteratorI1 == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC1530c.n = null;
        if (abstractC1530c.r && abstractC1530c.p) {
            AbstractC1530c abstractC1530c2 = abstractC1530c.k;
            int i4 = 1;
            while (abstractC1530c != this) {
                int i5 = abstractC1530c2.j;
                if (abstractC1530c2.J1()) {
                    if (V2.SHORT_CIRCUIT.p(i5)) {
                        i5 &= ~V2.u;
                    }
                    spliteratorI1 = abstractC1530c2.I1(abstractC1530c, spliteratorI1);
                    if (spliteratorI1.hasCharacteristics(64)) {
                        i2 = (~V2.t) & i5;
                        i3 = V2.s;
                    } else {
                        i2 = (~V2.s) & i5;
                        i3 = V2.t;
                    }
                    i5 = i3 | i2;
                    i4 = 0;
                }
                abstractC1530c2.l = i4;
                abstractC1530c2.m = V2.j(i5, abstractC1530c.m);
                i4++;
                AbstractC1530c abstractC1530c3 = abstractC1530c2;
                abstractC1530c2 = abstractC1530c2.k;
                abstractC1530c = abstractC1530c3;
            }
        }
        if (i != 0) {
            this.m = V2.j(i, this.m);
        }
        return spliteratorI1;
    }

    final F0 A1(IntFunction intFunction) {
        AbstractC1530c abstractC1530c;
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (!this.h.r || (abstractC1530c = this.i) == null || !J1()) {
            return y1(L1(0), true, intFunction);
        }
        this.l = 0;
        return H1(abstractC1530c.L1(0), intFunction, abstractC1530c);
    }

    abstract F0 B1(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z, IntFunction intFunction);

    abstract void C1(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2);

    abstract W2 D1();

    final W2 E1() {
        AbstractC1530c abstractC1530c = this;
        while (abstractC1530c.l > 0) {
            abstractC1530c = abstractC1530c.i;
        }
        return abstractC1530c.D1();
    }

    final boolean F1() {
        return V2.ORDERED.p(this.m);
    }

    final /* synthetic */ Spliterator G1() {
        return L1(0);
    }

    F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC1530c abstractC1530c) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator I1(AbstractC1530c abstractC1530c, Spliterator spliterator) {
        return H1(spliterator, new C1525b(0), abstractC1530c).spliterator();
    }

    abstract boolean J1();

    abstract InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2);

    final Spliterator M1() {
        AbstractC1530c abstractC1530c = this.h;
        if (this != abstractC1530c) {
            throw new IllegalStateException();
        }
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        Spliterator spliterator = abstractC1530c.n;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC1530c.n = null;
        return spliterator;
    }

    abstract Spliterator N1(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z);

    final Spliterator O1(Spliterator spliterator) {
        return this.l == 0 ? spliterator : N1(this, new C1520a(0, spliterator), this.h.r);
    }

    @Override // j$.util.stream.AbstractC1616w0
    final void V0(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2) {
        interfaceC1558h2.getClass();
        if (V2.SHORT_CIRCUIT.p(this.m)) {
            W0(spliterator, interfaceC1558h2);
            return;
        }
        interfaceC1558h2.f(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC1558h2);
        interfaceC1558h2.end();
    }

    @Override // j$.util.stream.AbstractC1616w0
    final void W0(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2) {
        AbstractC1530c abstractC1530c = this;
        while (abstractC1530c.l > 0) {
            abstractC1530c = abstractC1530c.i;
        }
        interfaceC1558h2.f(spliterator.getExactSizeIfKnown());
        abstractC1530c.C1(spliterator, interfaceC1558h2);
        interfaceC1558h2.end();
    }

    @Override // j$.util.stream.AbstractC1616w0
    final long a1(Spliterator spliterator) {
        if (V2.SIZED.p(this.m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.InterfaceC1560i, java.lang.AutoCloseable
    public final void close() {
        this.o = true;
        this.n = null;
        AbstractC1530c abstractC1530c = this.h;
        Runnable runnable = abstractC1530c.q;
        if (runnable != null) {
            abstractC1530c.q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.AbstractC1616w0
    final int g1() {
        return this.m;
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final boolean isParallel() {
        return this.h.r;
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final InterfaceC1560i onClose(Runnable runnable) {
        AbstractC1530c abstractC1530c = this.h;
        Runnable runnable2 = abstractC1530c.q;
        if (runnable2 != null) {
            runnable = new D3(runnable2, runnable);
        }
        abstractC1530c.q = runnable;
        return this;
    }

    public final InterfaceC1560i parallel() {
        this.h.r = true;
        return this;
    }

    public final InterfaceC1560i sequential() {
        this.h.r = false;
        return this;
    }

    public Spliterator spliterator() {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        int i = 1;
        this.o = true;
        AbstractC1530c abstractC1530c = this.h;
        if (this != abstractC1530c) {
            return N1(this, new C1520a(i, this), abstractC1530c.r);
        }
        Spliterator spliterator = abstractC1530c.n;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC1530c.n = null;
        return spliterator;
    }

    @Override // j$.util.stream.AbstractC1616w0
    final InterfaceC1558h2 w1(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2) {
        interfaceC1558h2.getClass();
        V0(spliterator, x1(interfaceC1558h2));
        return interfaceC1558h2;
    }

    @Override // j$.util.stream.AbstractC1616w0
    final InterfaceC1558h2 x1(InterfaceC1558h2 interfaceC1558h2) {
        interfaceC1558h2.getClass();
        AbstractC1530c abstractC1530c = this;
        while (abstractC1530c.l > 0) {
            AbstractC1530c abstractC1530c2 = abstractC1530c.i;
            interfaceC1558h2 = abstractC1530c.K1(abstractC1530c2.m, interfaceC1558h2);
            abstractC1530c = abstractC1530c2;
        }
        return interfaceC1558h2;
    }

    final F0 y1(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.h.r) {
            return B1(this, spliterator, z, intFunction);
        }
        A0 a0R1 = r1(a1(spliterator), intFunction);
        w1(spliterator, a0R1);
        return a0R1.build();
    }

    final Object z1(E3 e3) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        return this.h.r ? e3.y(this, L1(e3.P())) : e3.n0(this, L1(e3.P()));
    }
}
