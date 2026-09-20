package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class m3 extends r3 implements j$.util.C {
    m3(j$.util.C c, long j, long j2) {
        super(c, j, j2);
    }

    m3(j$.util.C c, long j, long j2, long j3, long j4) {
        super(c, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.l(this, consumer);
    }

    @Override // j$.util.stream.t3
    protected final Spliterator f(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new m3((j$.util.C) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.f(this, consumer);
    }

    @Override // j$.util.stream.r3
    protected final Object g() {
        return new l3(0);
    }
}
