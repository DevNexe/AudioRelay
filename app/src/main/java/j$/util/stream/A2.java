package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class A2 extends AbstractC1526b0 {
    A2(AbstractC1530c abstractC1530c) {
        super(abstractC1530c, V2.q | V2.o);
    }

    @Override // j$.util.stream.AbstractC1530c
    public final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC1530c abstractC1530c) {
        if (V2.SORTED.p(abstractC1530c.g1())) {
            return abstractC1530c.y1(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((C0) abstractC1530c.y1(spliterator, true, intFunction)).b();
        Arrays.sort(iArr);
        return new C1527b1(iArr);
    }

    @Override // j$.util.stream.AbstractC1530c
    public final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        interfaceC1558h2.getClass();
        if (V2.SORTED.p(i)) {
            return interfaceC1558h2;
        }
        return V2.SIZED.p(i) ? new F2(interfaceC1558h2) : new C1622x2(interfaceC1558h2);
    }
}
