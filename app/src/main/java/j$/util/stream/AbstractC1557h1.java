package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1557h1 extends AbstractC1566j1 implements j$.util.L {
    AbstractC1557h1(E0 e0) {
        super(e0);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void d(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (o(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.L) spliterator).d(obj);
            return;
        }
        ArrayDeque arrayDequeG = g();
        while (true) {
            E0 e0 = (E0) AbstractC1566j1.f(arrayDequeG);
            if (e0 == null) {
                this.a = null;
                return;
            }
            e0.d(obj);
        }
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final boolean o(Object obj) {
        E0 e0;
        if (!h()) {
            return false;
        }
        boolean zO = ((j$.util.L) this.d).o(obj);
        if (!zO) {
            if (this.c == null && (e0 = (E0) AbstractC1566j1.f(this.e)) != null) {
                j$.util.L lSpliterator = e0.spliterator();
                this.d = lSpliterator;
                return lSpliterator.o(obj);
            }
            this.a = null;
        }
        return zO;
    }
}
