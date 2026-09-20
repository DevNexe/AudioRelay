package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
abstract class x3 extends A3 implements j$.util.L {
    x3(j$.util.L l, long j, long j2) {
        super(l, j, j2);
    }

    x3(j$.util.L l, x3 x3Var) {
        super(l, x3Var);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void d(Object obj) {
        obj.getClass();
        AbstractC1529b3 abstractC1529b3U = null;
        while (true) {
            z3 z3VarS = s();
            if (z3VarS == z3.NO_MORE) {
                return;
            }
            z3 z3Var = z3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (z3VarS != z3Var) {
                ((j$.util.L) spliterator).d(obj);
                return;
            }
            if (abstractC1529b3U == null) {
                abstractC1529b3U = u();
            } else {
                abstractC1529b3U.b = 0;
            }
            long j = 0;
            while (((j$.util.L) spliterator).o(abstractC1529b3U)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                abstractC1529b3U.a(obj, q(j));
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

    protected abstract void t(Object obj);

    @Override // j$.util.L
    /* JADX INFO: renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final boolean o(Object obj) {
        obj.getClass();
        while (s() != z3.NO_MORE && ((j$.util.L) this.a).o(this)) {
            if (q(1L) == 1) {
                t(obj);
                return true;
            }
        }
        return false;
    }

    protected abstract AbstractC1529b3 u();
}
