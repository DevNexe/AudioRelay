package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1594q1 extends AbstractC1597r1 {
    private final Object[] h;

    C1594q1(Spliterator spliterator, AbstractC1616w0 abstractC1616w0, Object[] objArr) {
        super(objArr.length, spliterator, abstractC1616w0);
        this.h = objArr;
    }

    C1594q1(C1594q1 c1594q1, Spliterator spliterator, long j, long j2) {
        super(c1594q1, spliterator, j, j2, c1594q1.h.length);
        this.h = c1594q1.h;
    }

    @Override // j$.util.stream.AbstractC1597r1
    final AbstractC1597r1 a(Spliterator spliterator, long j, long j2) {
        return new C1594q1(this, spliterator, j, j2);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}
