package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class v3 extends x3 implements j$.util.F, j$.util.function.L {
    int e;

    v3(j$.util.F f, long j, long j2) {
        super(f, j, j2);
    }

    v3(j$.util.F f, v3 v3Var) {
        super(f, v3Var);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.m(this, consumer);
    }

    @Override // j$.util.function.L
    public final void accept(int i) {
        this.e = i;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.g(this, consumer);
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }

    @Override // j$.util.stream.A3
    protected final Spliterator r(Spliterator spliterator) {
        return new v3((j$.util.F) spliterator, this);
    }

    @Override // j$.util.stream.x3
    protected final void t(Object obj) {
        ((j$.util.function.L) obj).accept(this.e);
    }

    @Override // j$.util.stream.x3
    protected final AbstractC1529b3 u() {
        return new Z2();
    }
}
