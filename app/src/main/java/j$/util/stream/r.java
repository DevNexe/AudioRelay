package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.IntFunction;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class r extends X1 {
    r(AbstractC1530c abstractC1530c, int i) {
        super(abstractC1530c, i);
    }

    static J0 P1(AbstractC1530c abstractC1530c, Spliterator spliterator) {
        S1 s1 = new S1(11);
        S1 s2 = new S1(12);
        return new J0((Collection) new C1617w1(W2.REFERENCE, new S1(13), s2, s1, 3).y(abstractC1530c, spliterator));
    }

    @Override // j$.util.stream.AbstractC1530c
    final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC1530c abstractC1530c) {
        if (V2.DISTINCT.p(abstractC1530c.g1())) {
            return abstractC1530c.y1(spliterator, false, intFunction);
        }
        if (V2.ORDERED.p(abstractC1530c.g1())) {
            return P1(abstractC1530c, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new S(new C1584o(0, atomicBoolean, concurrentHashMap), false).y(abstractC1530c, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new J0(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC1530c
    final Spliterator I1(AbstractC1530c abstractC1530c, Spliterator spliterator) {
        if (V2.DISTINCT.p(abstractC1530c.g1())) {
            return abstractC1530c.O1(spliterator);
        }
        return V2.ORDERED.p(abstractC1530c.g1()) ? P1(abstractC1530c, spliterator).spliterator() : new C1544e3(abstractC1530c.O1(spliterator));
    }

    @Override // j$.util.stream.AbstractC1530c
    final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        interfaceC1558h2.getClass();
        if (V2.DISTINCT.p(i)) {
            return interfaceC1558h2;
        }
        return V2.SORTED.p(i) ? new C1588p(interfaceC1558h2) : new C1592q(this, interfaceC1558h2);
    }
}
