package j$.util.stream;

import j$.util.C1466e;
import j$.util.C1510i;
import j$.util.InterfaceC1517p;
import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC1486j;
import j$.util.function.InterfaceC1494n;
import j$.util.function.InterfaceC1499q;
import j$.util.function.InterfaceC1501t;
import j$.util.function.InterfaceC1504w;
import j$.util.function.InterfaceC1507z;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public interface G extends InterfaceC1560i {
    IntStream D(InterfaceC1504w interfaceC1504w);

    void J(InterfaceC1494n interfaceC1494n);

    C1510i R(InterfaceC1486j interfaceC1486j);

    double U(double d, InterfaceC1486j interfaceC1486j);

    boolean V(InterfaceC1501t interfaceC1501t);

    boolean Z(InterfaceC1501t interfaceC1501t);

    C1510i average();

    G b(InterfaceC1494n interfaceC1494n);

    Stream boxed();

    long count();

    G distinct();

    C1510i findAny();

    C1510i findFirst();

    G h(InterfaceC1501t interfaceC1501t);

    G i(InterfaceC1499q interfaceC1499q);

    InterfaceC1517p iterator();

    InterfaceC1581n0 j(InterfaceC1507z interfaceC1507z);

    G limit(long j);

    void m0(InterfaceC1494n interfaceC1494n);

    C1510i max();

    C1510i min();

    Object o(Supplier supplier, j$.util.function.z0 z0Var, BiConsumer biConsumer);

    G p(j$.util.function.C c);

    G parallel();

    Stream q(InterfaceC1499q interfaceC1499q);

    G sequential();

    G skip(long j);

    G sorted();

    j$.util.C spliterator();

    double sum();

    C1466e summaryStatistics();

    double[] toArray();

    boolean x(InterfaceC1501t interfaceC1501t);
}
