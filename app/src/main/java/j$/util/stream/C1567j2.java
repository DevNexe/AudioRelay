package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1567j2 extends X1 {
    final /* synthetic */ long s;
    final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1567j2(AbstractC1530c abstractC1530c, int i, long j, long j2) {
        super(abstractC1530c, i);
        this.s = j;
        this.t = j2;
    }

    static Spliterator P1(Spliterator spliterator, long j, long j2, long j3) {
        long j4;
        long jMin;
        if (j <= j3) {
            long j5 = j3 - j;
            jMin = j2 >= 0 ? Math.min(j2, j5) : j5;
            j4 = 0;
        } else {
            j4 = j;
            jMin = j2;
        }
        return new y3(spliterator, j4, jMin);
    }

    @Override // j$.util.stream.AbstractC1530c
    final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC1530c abstractC1530c) {
        long jA1 = abstractC1530c.a1(spliterator);
        if (jA1 <= 0 || !spliterator.hasCharacteristics(16384)) {
            return !V2.ORDERED.p(abstractC1530c.g1()) ? AbstractC1616w0.Q0(this, P1(abstractC1530c.O1(spliterator), this.s, this.t, jA1), true, intFunction) : (F0) new C1598r2(this, abstractC1530c, spliterator, intFunction, this.s, this.t).invoke();
        }
        return AbstractC1616w0.Q0(abstractC1530c, AbstractC1616w0.K0(abstractC1530c.E1(), spliterator, this.s, this.t), true, intFunction);
    }

    @Override // j$.util.stream.AbstractC1530c
    final Spliterator I1(AbstractC1530c abstractC1530c, Spliterator spliterator) {
        long jA1 = abstractC1530c.a1(spliterator);
        if (jA1 <= 0 || !spliterator.hasCharacteristics(16384)) {
            return !V2.ORDERED.p(abstractC1530c.g1()) ? P1(abstractC1530c.O1(spliterator), this.s, this.t, jA1) : ((F0) new C1598r2(this, abstractC1530c, spliterator, new S1(2), this.s, this.t).invoke()).spliterator();
        }
        Spliterator spliteratorO1 = abstractC1530c.O1(spliterator);
        long j = this.s;
        return new s3(spliteratorO1, j, AbstractC1616w0.J0(j, this.t));
    }

    @Override // j$.util.stream.AbstractC1530c
    final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        return new C1563i2(this, interfaceC1558h2);
    }
}
