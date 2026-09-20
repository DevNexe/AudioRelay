package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class O0 extends Q0 implements C0 {
    O0(C0 c0, C0 c1) {
        super(c0, c1);
    }

    @Override // j$.util.stream.F0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void e(Integer[] numArr, int i) {
        AbstractC1616w0.A0(this, numArr, i);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1616w0.D0(this, consumer);
    }

    @Override // j$.util.stream.E0
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.G0(this, j, j2);
    }

    @Override // j$.util.stream.F0
    public final j$.util.L spliterator() {
        return new C1547f1(this);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C1547f1(this);
    }
}
