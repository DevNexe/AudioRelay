package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class N0 extends Q0 implements B0 {
    N0(B0 b0, B0 b1) {
        super(b0, b1);
    }

    @Override // j$.util.stream.F0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void e(Double[] dArr, int i) {
        AbstractC1616w0.z0(this, dArr, i);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1616w0.C0(this, consumer);
    }

    @Override // j$.util.stream.E0
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.F0(this, j, j2);
    }

    @Override // j$.util.stream.F0
    public final j$.util.L spliterator() {
        return new C1542e1(this);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C1542e1(this);
    }
}
