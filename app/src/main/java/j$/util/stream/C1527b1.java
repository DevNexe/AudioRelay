package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1527b1 implements C0 {
    final int[] a;
    int b;

    C1527b1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    C1527b1(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
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
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // j$.util.stream.E0
    public final void c(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.E0
    public final void d(Object obj) {
        j$.util.function.L l = (j$.util.function.L) obj;
        for (int i = 0; i < this.b; i++) {
            l.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1616w0.D0(this, consumer);
    }

    @Override // j$.util.stream.F0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void e(Integer[] numArr, int i) {
        AbstractC1616w0.A0(this, numArr, i);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC1616w0.y0(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.G0(this, j, j2);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final j$.util.L spliterator() {
        return j$.util.b0.k(this.a, 0, this.b);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return j$.util.b0.k(this.a, 0, this.b);
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}
