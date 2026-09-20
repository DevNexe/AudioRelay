package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
final class V extends CountedCompleter {
    private Spliterator a;
    private final InterfaceC1558h2 b;
    private final AbstractC1616w0 c;
    private long d;

    V(V v, Spliterator spliterator) {
        super(v);
        this.a = spliterator;
        this.b = v.b;
        this.d = v.d;
        this.c = v.c;
    }

    V(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2) {
        super(null);
        this.b = interfaceC1558h2;
        this.c = abstractC1616w0;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jF = this.d;
        if (jF == 0) {
            jF = AbstractC1545f.f(jEstimateSize);
            this.d = jF;
        }
        boolean zP = V2.SHORT_CIRCUIT.p(this.c.g1());
        InterfaceC1558h2 interfaceC1558h2 = this.b;
        boolean z = false;
        V v = this;
        while (true) {
            if (zP && interfaceC1558h2.h()) {
                break;
            }
            if (jEstimateSize <= jF || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                v.c.V0(spliterator, interfaceC1558h2);
                break;
            }
            V v2 = new V(v, spliteratorTrySplit);
            v.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                V v3 = v;
                v = v2;
                v2 = v3;
            }
            z = !z;
            v.fork();
            v = v2;
            jEstimateSize = spliterator.estimateSize();
        }
        v.a = null;
        v.propagateCompletion();
    }
}
