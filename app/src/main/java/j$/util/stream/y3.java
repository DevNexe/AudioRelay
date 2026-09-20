package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class y3 extends A3 implements Spliterator, Consumer {
    Object e;

    y3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2);
    }

    y3(Spliterator spliterator, y3 y3Var) {
        super(spliterator, y3Var);
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        while (s() != z3.NO_MORE && this.a.a(this)) {
            if (q(1L) == 1) {
                consumer.p(this.e);
                this.e = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.e = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C1534c3 c1534c3 = null;
        while (true) {
            z3 z3VarS = s();
            if (z3VarS == z3.NO_MORE) {
                return;
            }
            z3 z3Var = z3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (z3VarS != z3Var) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (c1534c3 == null) {
                c1534c3 = new C1534c3();
            } else {
                c1534c3.a = 0;
            }
            long j = 0;
            while (spliterator.a(c1534c3)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jQ = q(j);
            for (int i = 0; i < jQ; i++) {
                consumer.p(c1534c3.b[i]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1514m.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC1514m.k(this, i);
    }

    @Override // j$.util.stream.A3
    protected final Spliterator r(Spliterator spliterator) {
        return new y3(spliterator, this);
    }
}
