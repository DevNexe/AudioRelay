package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1552g1 extends AbstractC1557h1 implements j$.util.I {
    C1552g1(D0 d0) {
        super(d0);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.n(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.h(this, consumer);
    }
}
