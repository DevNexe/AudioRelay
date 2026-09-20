package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1630z2 extends B {
    C1630z2(AbstractC1530c abstractC1530c) {
        super(abstractC1530c, V2.q | V2.o);
    }

    @Override // j$.util.stream.AbstractC1530c
    public final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC1530c abstractC1530c) {
        if (V2.SORTED.p(abstractC1530c.g1())) {
            return abstractC1530c.y1(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((B0) abstractC1530c.y1(spliterator, true, intFunction)).b();
        Arrays.sort(dArr);
        return new S0(dArr);
    }

    @Override // j$.util.stream.AbstractC1530c
    public final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        interfaceC1558h2.getClass();
        if (V2.SORTED.p(i)) {
            return interfaceC1558h2;
        }
        return V2.SIZED.p(i) ? new E2(interfaceC1558h2) : new C1618w2(interfaceC1558h2);
    }
}
