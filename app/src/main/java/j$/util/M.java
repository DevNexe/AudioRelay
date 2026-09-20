package j$.util;

import j$.util.function.C1480g;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M implements Spliterator {
    public final /* synthetic */ java.util.Spliterator a;

    private /* synthetic */ M(java.util.Spliterator spliterator) {
        this.a = spliterator;
    }

    public static /* synthetic */ Spliterator f(java.util.Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof Spliterator.Wrapper) {
            return Spliterator.this;
        }
        return spliterator instanceof java.util.Spliterator.OfPrimitive ? J.f((java.util.Spliterator.OfPrimitive) spliterator) : new M(spliterator);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.a.tryAdvance(C1480g.a(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C1480g.a(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return f(this.a.trySplit());
    }
}
