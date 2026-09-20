package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.InterfaceC1478f;
import j$.util.function.InterfaceC1487j0;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
class M0 extends AbstractC1545f {
    protected final AbstractC1616w0 h;
    protected final InterfaceC1487j0 i;
    protected final InterfaceC1478f j;

    M0(M0 m0, Spliterator spliterator) {
        super(m0, spliterator);
        this.h = m0.h;
        this.i = m0.i;
        this.j = m0.j;
    }

    M0(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, InterfaceC1487j0 interfaceC1487j0, K0 k0) {
        super(abstractC1616w0, spliterator);
        this.h = abstractC1616w0;
        this.i = interfaceC1487j0;
        this.j = k0;
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final Object a() {
        A0 a0 = (A0) this.i.apply(this.h.a1(this.b));
        this.h.w1(this.b, a0);
        return a0.build();
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final AbstractC1545f d(Spliterator spliterator) {
        return new M0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1545f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC1545f abstractC1545f = this.d;
        if (!(abstractC1545f == null)) {
            e((F0) this.j.apply((F0) ((M0) abstractC1545f).b(), (F0) ((M0) this.e).b()));
        }
        super.onCompletion(countedCompleter);
    }
}
