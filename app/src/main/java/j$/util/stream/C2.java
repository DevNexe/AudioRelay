package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class C2 extends X1 {
    private final boolean s;
    private final Comparator t;

    C2(AbstractC1530c abstractC1530c) {
        super(abstractC1530c, V2.q | V2.o);
        this.s = true;
        this.t = j$.util.Comparator.CC.a();
    }

    C2(AbstractC1530c abstractC1530c, Comparator comparator) {
        super(abstractC1530c, V2.q | V2.p);
        this.s = false;
        comparator.getClass();
        this.t = comparator;
    }

    @Override // j$.util.stream.AbstractC1530c
    public final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC1530c abstractC1530c) {
        if (V2.SORTED.p(abstractC1530c.g1()) && this.s) {
            return abstractC1530c.y1(spliterator, false, intFunction);
        }
        Object[] objArrO = abstractC1530c.y1(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(objArrO, this.t);
        return new I0(objArrO);
    }

    @Override // j$.util.stream.AbstractC1530c
    public final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        interfaceC1558h2.getClass();
        if (V2.SORTED.p(i) && this.s) {
            return interfaceC1558h2;
        }
        boolean zP = V2.SIZED.p(i);
        Comparator comparator = this.t;
        return zP ? new H2(interfaceC1558h2, comparator) : new D2(interfaceC1558h2, comparator);
    }
}
