package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class o3 extends r3 implements j$.util.F {
    o3(j$.util.F f, long j, long j2) {
        super(f, j, j2);
    }

    o3(j$.util.F f, long j, long j2, long j3, long j4) {
        super(f, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.m(this, consumer);
    }

    @Override // j$.util.stream.t3
    protected final Spliterator f(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new o3((j$.util.F) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.g(this, consumer);
    }

    @Override // j$.util.stream.r3
    protected final Object g() {
        return new n3(0);
    }
}
