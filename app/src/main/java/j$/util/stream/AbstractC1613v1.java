package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1613v1 extends CountedCompleter {
    protected final F0 a;
    protected final int b;

    AbstractC1613v1(F0 f0) {
        this.a = f0;
        this.b = 0;
    }

    AbstractC1613v1(AbstractC1613v1 abstractC1613v1, F0 f0, int i) {
        super(abstractC1613v1);
        this.a = f0;
        this.b = i;
    }

    abstract void a();

    abstract C1609u1 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC1613v1 abstractC1613v1B = this;
        while (abstractC1613v1B.a.j() != 0) {
            abstractC1613v1B.setPendingCount(abstractC1613v1B.a.j() - 1);
            int i = 0;
            int iCount = 0;
            while (i < abstractC1613v1B.a.j() - 1) {
                C1609u1 c1609u1B = abstractC1613v1B.b(i, abstractC1613v1B.b + iCount);
                iCount = (int) (((long) iCount) + c1609u1B.a.count());
                c1609u1B.fork();
                i++;
            }
            abstractC1613v1B = abstractC1613v1B.b(i, abstractC1613v1B.b + iCount);
        }
        abstractC1613v1B.a();
        abstractC1613v1B.propagateCompletion();
    }
}
