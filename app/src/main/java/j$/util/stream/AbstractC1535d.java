package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1535d extends AbstractC1545f {
    protected final AtomicReference h;
    protected volatile boolean i;

    protected AbstractC1535d(AbstractC1535d abstractC1535d, Spliterator spliterator) {
        super(abstractC1535d, spliterator);
        this.h = abstractC1535d.h;
    }

    protected AbstractC1535d(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        super(abstractC1616w0, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC1545f
    public final Object b() {
        if (!(c() == null)) {
            return super.b();
        }
        Object obj = this.h.get();
        return obj == null ? i() : obj;
    }

    @Override // j$.util.stream.AbstractC1545f, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objI;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jF = this.c;
        if (jF == 0) {
            jF = AbstractC1545f.f(jEstimateSize);
            this.c = jF;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC1535d abstractC1535d = this;
        while (true) {
            objI = atomicReference.get();
            if (objI != null) {
                break;
            }
            boolean z2 = abstractC1535d.i;
            if (!z2) {
                AbstractC1545f abstractC1545fC = abstractC1535d.c();
                while (true) {
                    AbstractC1535d abstractC1535d2 = (AbstractC1535d) abstractC1545fC;
                    if (z2 || abstractC1535d2 == null) {
                        break;
                    }
                    z2 = abstractC1535d2.i;
                    abstractC1545fC = abstractC1535d2.c();
                }
            }
            if (z2) {
                objI = abstractC1535d.i();
                break;
            }
            if (jEstimateSize <= jF || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                objI = abstractC1535d.a();
                break;
            }
            AbstractC1535d abstractC1535d3 = (AbstractC1535d) abstractC1535d.d(spliteratorTrySplit);
            abstractC1535d.d = abstractC1535d3;
            AbstractC1535d abstractC1535d4 = (AbstractC1535d) abstractC1535d.d(spliterator);
            abstractC1535d.e = abstractC1535d4;
            abstractC1535d.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC1535d = abstractC1535d3;
                abstractC1535d3 = abstractC1535d4;
            } else {
                abstractC1535d = abstractC1535d4;
            }
            z = !z;
            abstractC1535d3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC1535d.e(objI);
        abstractC1535d.tryComplete();
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final void e(Object obj) {
        if (!(c() == null)) {
            super.e(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    protected void g() {
        this.i = true;
    }

    @Override // j$.util.stream.AbstractC1545f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return b();
    }

    protected final void h() {
        AbstractC1535d abstractC1535d = this;
        for (AbstractC1535d abstractC1535d2 = (AbstractC1535d) c(); abstractC1535d2 != null; abstractC1535d2 = (AbstractC1535d) abstractC1535d2.c()) {
            if (abstractC1535d2.d == abstractC1535d) {
                AbstractC1535d abstractC1535d3 = (AbstractC1535d) abstractC1535d2.e;
                if (!abstractC1535d3.i) {
                    abstractC1535d3.g();
                }
            }
            abstractC1535d = abstractC1535d2;
        }
    }

    protected abstract Object i();
}
