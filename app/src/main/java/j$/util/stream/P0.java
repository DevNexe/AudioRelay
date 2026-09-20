package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class P0 extends Q0 implements D0 {
    P0(D0 d0, D0 d1) {
        super(d0, d1);
    }

    @Override // j$.util.stream.F0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void e(Long[] lArr, int i) {
        AbstractC1616w0.B0(this, lArr, i);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1616w0.E0(this, consumer);
    }

    @Override // j$.util.stream.E0
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.H0(this, j, j2);
    }

    @Override // j$.util.stream.F0
    public final j$.util.L spliterator() {
        return new C1552g1(this);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C1552g1(this);
    }
}
