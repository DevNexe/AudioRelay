package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class N extends AbstractC1535d {
    private final H j;

    N(H h, AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        super(abstractC1616w0, spliterator);
        this.j = h;
    }

    N(N n, Spliterator spliterator) {
        super(n, spliterator);
        this.j = n.j;
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final Object a() {
        boolean z;
        AbstractC1616w0 abstractC1616w0 = this.a;
        F3 f3 = (F3) this.j.d.get();
        abstractC1616w0.w1(this.b, f3);
        Object obj = f3.get();
        if (!this.j.a) {
            if (obj != null) {
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC1545f abstractC1545f = this;
        while (true) {
            if (abstractC1545f != null) {
                AbstractC1545f abstractC1545fC = abstractC1545f.c();
                if (abstractC1545fC != null && abstractC1545fC.d != abstractC1545f) {
                    z = false;
                    break;
                }
                abstractC1545f = abstractC1545fC;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        } else {
            h();
        }
        return obj;
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final AbstractC1545f d(Spliterator spliterator) {
        return new N(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1535d
    protected final Object i() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC1545f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z;
        if (this.j.a) {
            N n = (N) this.d;
            N n2 = null;
            while (n != n2) {
                Object objB = n.b();
                if (objB != null && this.j.c.test(objB)) {
                    e(objB);
                    AbstractC1545f abstractC1545f = this;
                    while (true) {
                        if (abstractC1545f != null) {
                            AbstractC1545f abstractC1545fC = abstractC1545f.c();
                            if (abstractC1545fC != null && abstractC1545fC.d != abstractC1545f) {
                                z = false;
                                break;
                            }
                            abstractC1545f = abstractC1545fC;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        h();
                        break;
                    }
                    AtomicReference atomicReference = this.h;
                    while (!atomicReference.compareAndSet(null, objB) && atomicReference.get() == null) {
                    }
                    break;
                }
                n2 = n;
                n = (N) this.e;
            }
        }
        super.onCompletion(countedCompleter);
    }
}
