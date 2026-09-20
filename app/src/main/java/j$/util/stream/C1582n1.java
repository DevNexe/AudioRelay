package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C1488k;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1582n1 extends AbstractC1597r1 implements InterfaceC1543e2 {
    private final double[] h;

    C1582n1(Spliterator spliterator, AbstractC1616w0 abstractC1616w0, double[] dArr) {
        super(dArr.length, spliterator, abstractC1616w0);
        this.h = dArr;
    }

    C1582n1(C1582n1 c1582n1, Spliterator spliterator, long j, long j2) {
        super(c1582n1, spliterator, j, j2, c1582n1.h.length);
        this.h = c1582n1.h;
    }

    @Override // j$.util.stream.AbstractC1597r1
    final AbstractC1597r1 a(Spliterator spliterator, long j, long j2) {
        return new C1582n1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.AbstractC1597r1, j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }

    @Override // j$.util.stream.InterfaceC1543e2
    public final /* synthetic */ void p(Double d) {
        AbstractC1616w0.q0(this, d);
    }
}
