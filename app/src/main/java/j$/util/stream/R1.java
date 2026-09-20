package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
final class R1 extends AbstractC1545f {
    private final AbstractC1616w0 h;

    R1(R1 r1, Spliterator spliterator) {
        super(r1, spliterator);
        this.h = r1.h;
    }

    R1(AbstractC1616w0 abstractC1616w0, AbstractC1616w0 abstractC1616w1, Spliterator spliterator) {
        super(abstractC1616w1, spliterator);
        this.h = abstractC1616w0;
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final Object a() {
        AbstractC1616w0 abstractC1616w0 = this.a;
        P1 p1U1 = this.h.u1();
        abstractC1616w0.w1(this.b, p1U1);
        return p1U1;
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final AbstractC1545f d(Spliterator spliterator) {
        return new R1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1545f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC1545f abstractC1545f = this.d;
        if (!(abstractC1545f == null)) {
            P1 p1 = (P1) ((R1) abstractC1545f).b();
            p1.k((P1) ((R1) this.e).b());
            e(p1);
        }
        super.onCompletion(countedCompleter);
    }
}
