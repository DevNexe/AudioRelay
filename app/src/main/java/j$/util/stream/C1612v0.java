package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: j$.util.stream.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1612v0 extends AbstractC1535d {
    private final C1608u0 j;

    C1612v0(C1608u0 c1608u0, AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        super(abstractC1616w0, spliterator);
        this.j = c1608u0;
    }

    C1612v0(C1612v0 c1612v0, Spliterator spliterator) {
        super(c1612v0, spliterator);
        this.j = c1612v0.j;
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final Object a() {
        Boolean boolValueOf;
        AbstractC1616w0 abstractC1616w0 = this.a;
        AbstractC1600s0 abstractC1600s0 = (AbstractC1600s0) this.j.b.get();
        abstractC1616w0.w1(this.b, abstractC1600s0);
        boolean z = abstractC1600s0.b;
        if (z == this.j.a.b && (boolValueOf = Boolean.valueOf(z)) != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final AbstractC1545f d(Spliterator spliterator) {
        return new C1612v0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1535d
    protected final Object i() {
        return Boolean.valueOf(!this.j.a.b);
    }
}
