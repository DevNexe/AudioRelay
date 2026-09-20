package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1545f extends CountedCompleter {
    static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final AbstractC1616w0 a;
    protected Spliterator b;
    protected long c;
    protected AbstractC1545f d;
    protected AbstractC1545f e;
    private Object f;

    protected AbstractC1545f(AbstractC1545f abstractC1545f, Spliterator spliterator) {
        super(abstractC1545f);
        this.b = spliterator;
        this.a = abstractC1545f.a;
        this.c = abstractC1545f.c;
    }

    protected AbstractC1545f(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        super(null);
        this.a = abstractC1616w0;
        this.b = spliterator;
        this.c = 0L;
    }

    public static long f(long j) {
        long j2 = j / ((long) g);
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    protected abstract Object a();

    protected Object b() {
        return this.f;
    }

    protected final AbstractC1545f c() {
        return (AbstractC1545f) getCompleter();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jF = this.c;
        if (jF == 0) {
            jF = f(jEstimateSize);
            this.c = jF;
        }
        boolean z = false;
        AbstractC1545f abstractC1545f = this;
        while (jEstimateSize > jF && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC1545f abstractC1545fD = abstractC1545f.d(spliteratorTrySplit);
            abstractC1545f.d = abstractC1545fD;
            AbstractC1545f abstractC1545fD2 = abstractC1545f.d(spliterator);
            abstractC1545f.e = abstractC1545fD2;
            abstractC1545f.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC1545f = abstractC1545fD;
                abstractC1545fD = abstractC1545fD2;
            } else {
                abstractC1545f = abstractC1545fD2;
            }
            z = !z;
            abstractC1545fD.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC1545f.e(abstractC1545f.a());
        abstractC1545f.tryComplete();
    }

    protected abstract AbstractC1545f d(Spliterator spliterator);

    protected void e(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
