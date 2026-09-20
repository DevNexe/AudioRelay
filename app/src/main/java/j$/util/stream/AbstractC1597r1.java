package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1597r1 extends CountedCompleter implements InterfaceC1558h2 {
    protected final Spliterator a;
    protected final AbstractC1616w0 b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    AbstractC1597r1(int i, Spliterator spliterator, AbstractC1616w0 abstractC1616w0) {
        this.a = spliterator;
        this.b = abstractC1616w0;
        this.c = AbstractC1545f.f(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    AbstractC1597r1(AbstractC1597r1 abstractC1597r1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC1597r1);
        this.a = spliterator;
        this.b = abstractC1597r1.b;
        this.c = abstractC1597r1.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    abstract AbstractC1597r1 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC1616w0.p0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC1616w0.w0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC1616w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        AbstractC1597r1 abstractC1597r1A = this;
        while (spliterator.estimateSize() > abstractC1597r1A.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC1597r1A.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            abstractC1597r1A.a(spliteratorTrySplit, abstractC1597r1A.d, jEstimateSize).fork();
            abstractC1597r1A = abstractC1597r1A.a(spliterator, abstractC1597r1A.d + jEstimateSize, abstractC1597r1A.e - jEstimateSize);
        }
        abstractC1597r1A.b.w1(spliterator, abstractC1597r1A);
        abstractC1597r1A.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ boolean h() {
        return false;
    }
}
