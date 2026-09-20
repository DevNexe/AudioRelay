package j$.util;

import j$.util.function.C1480g;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J implements L {
    public final /* synthetic */ java.util.Spliterator.OfPrimitive a;

    private /* synthetic */ J(java.util.Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ L f(java.util.Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof K) {
            return ((K) ofPrimitive).a;
        }
        if (ofPrimitive instanceof java.util.Spliterator.OfDouble) {
            return A.f((java.util.Spliterator.OfDouble) ofPrimitive);
        }
        if (ofPrimitive instanceof java.util.Spliterator.OfInt) {
            return D.f((java.util.Spliterator.OfInt) ofPrimitive);
        }
        return ofPrimitive instanceof java.util.Spliterator.OfLong ? G.f((java.util.Spliterator.OfLong) ofPrimitive) : new J(ofPrimitive);
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
        if (obj instanceof J) {
            obj = ((J) obj).a;
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

    @Override // j$.util.L
    /* JADX INFO: renamed from: forEachRemaining */
    public final /* synthetic */ void d(Object obj) {
        this.a.forEachRemaining(obj);
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

    @Override // j$.util.L
    /* JADX INFO: renamed from: tryAdvance */
    public final /* synthetic */ boolean o(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // j$.util.L, j$.util.Spliterator
    public final /* synthetic */ L trySplit() {
        return f(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return M.f(this.a.trySplit());
    }
}
