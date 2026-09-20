package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1542e1 extends AbstractC1557h1 implements j$.util.C {
    C1542e1(B0 b0) {
        super(b0);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.f(this, consumer);
    }
}
