package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1481g0;
import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1570k1 implements D0 {
    final long[] a;
    int b;

    C1570k1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    C1570k1(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final E0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.E0
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.E0
    public final void c(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.E0
    public final void d(Object obj) {
        InterfaceC1481g0 interfaceC1481g0 = (InterfaceC1481g0) obj;
        for (int i = 0; i < this.b; i++) {
            interfaceC1481g0.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1616w0.E0(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // j$.util.stream.F0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void e(Long[] lArr, int i) {
        AbstractC1616w0.B0(this, lArr, i);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC1616w0.y0(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.H0(this, j, j2);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final j$.util.L spliterator() {
        return j$.util.b0.l(this.a, 0, this.b);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return j$.util.b0.l(this.a, 0, this.b);
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
