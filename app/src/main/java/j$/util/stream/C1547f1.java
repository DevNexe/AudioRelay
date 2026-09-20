package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1547f1 extends AbstractC1557h1 implements j$.util.F {
    C1547f1(C0 c0) {
        super(c0);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.m(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.g(this, consumer);
    }
}
