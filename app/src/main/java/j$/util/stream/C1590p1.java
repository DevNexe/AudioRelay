package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C1475d0;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1590p1 extends AbstractC1597r1 implements InterfaceC1553g2 {
    private final long[] h;

    C1590p1(Spliterator spliterator, AbstractC1616w0 abstractC1616w0, long[] jArr) {
        super(jArr.length, spliterator, abstractC1616w0);
        this.h = jArr;
    }

    C1590p1(C1590p1 c1590p1, Spliterator spliterator, long j, long j2) {
        super(c1590p1, spliterator, j, j2, c1590p1.h.length);
        this.h = c1590p1.h;
    }

    @Override // j$.util.stream.AbstractC1597r1
    final AbstractC1597r1 a(Spliterator spliterator, long j, long j2) {
        return new C1590p1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.AbstractC1597r1, j$.util.stream.InterfaceC1558h2
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        l((Long) obj);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // j$.util.stream.InterfaceC1553g2
    public final /* synthetic */ void l(Long l) {
        AbstractC1616w0.u0(this, l);
    }
}
