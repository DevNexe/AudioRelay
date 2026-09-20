package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class R0 extends H0 {
    R0(F0 f0, F0 f1) {
        super(f0, f1);
    }

    @Override // j$.util.stream.F0
    public final void e(Object[] objArr, int i) {
        objArr.getClass();
        F0 f0 = this.a;
        f0.e(objArr, i);
        this.b.e(objArr, i + ((int) f0.count()));
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.F0
    public final Object[] o(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        e(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.F0
    public final F0 q(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.q(j - jCount, j2 - jCount, intFunction);
        }
        return j2 <= jCount ? this.a.q(j, j2, intFunction) : AbstractC1616w0.U0(W2.REFERENCE, this.a.q(j, jCount, intFunction), this.b.q(0L, j2 - jCount, intFunction));
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C1562i1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
