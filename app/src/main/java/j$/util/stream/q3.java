package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class q3 extends r3 implements j$.util.I {
    q3(j$.util.I i, long j, long j2) {
        super(i, j, j2);
    }

    q3(j$.util.I i, long j, long j2, long j3, long j4) {
        super(i, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.n(this, consumer);
    }

    @Override // j$.util.stream.t3
    protected final Spliterator f(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new q3((j$.util.I) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.h(this, consumer);
    }

    @Override // j$.util.stream.r3
    protected final Object g() {
        return new p3(0);
    }
}
