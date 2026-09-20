package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1586o1 extends AbstractC1597r1 implements InterfaceC1548f2 {
    private final int[] h;

    C1586o1(Spliterator spliterator, AbstractC1616w0 abstractC1616w0, int[] iArr) {
        super(iArr.length, spliterator, abstractC1616w0);
        this.h = iArr;
    }

    C1586o1(C1586o1 c1586o1, Spliterator spliterator, long j, long j2) {
        super(c1586o1, spliterator, j, j2, c1586o1.h.length);
        this.h = c1586o1.h;
    }

    @Override // j$.util.stream.AbstractC1597r1
    final AbstractC1597r1 a(Spliterator spliterator, long j, long j2) {
        return new C1586o1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.AbstractC1597r1, j$.util.stream.InterfaceC1558h2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        g((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC1548f2
    public final /* synthetic */ void g(Integer num) {
        AbstractC1616w0.s0(this, num);
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }
}
