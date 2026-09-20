package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1562i1 extends AbstractC1566j1 {
    C1562i1(F0 f0) {
        super(f0);
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        F0 f0F;
        if (!h()) {
            return false;
        }
        boolean zA = this.d.a(consumer);
        if (!zA) {
            if (this.c == null && (f0F = AbstractC1566j1.f(this.e)) != null) {
                Spliterator spliterator = f0F.spliterator();
                this.d = spliterator;
                return spliterator.a(consumer);
            }
            this.a = null;
        }
        return zA;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (a(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque arrayDequeG = g();
        while (true) {
            F0 f0F = AbstractC1566j1.f(arrayDequeG);
            if (f0F == null) {
                this.a = null;
                return;
            }
            f0F.forEach(consumer);
        }
    }
}
