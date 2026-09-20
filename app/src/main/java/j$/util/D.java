package j$.util;

import j$.util.function.C1480g;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D implements F {
    public final /* synthetic */ java.util.Spliterator.OfInt a;

    private /* synthetic */ D(java.util.Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ F f(java.util.Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof E ? ((E) ofInt).a : new D(ofInt);
    }

    @Override // j$.util.F, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.a.tryAdvance(C1480g.a(consumer));
    }

    @Override // j$.util.F
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void forEachRemaining(j$.util.function.L l) {
        this.a.forEachRemaining(j$.util.function.K.a(l));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.F, j$.util.Spliterator
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

    @Override // j$.util.F
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean tryAdvance(j$.util.function.L l) {
        return this.a.tryAdvance(j$.util.function.K.a(l));
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: tryAdvance */
    public final /* synthetic */ boolean o(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // j$.util.F, j$.util.L, j$.util.Spliterator
    public final /* synthetic */ F trySplit() {
        return f(this.a.trySplit());
    }

    @Override // j$.util.L, j$.util.Spliterator
    public final /* synthetic */ L trySplit() {
        return J.f(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return M.f(this.a.trySplit());
    }
}
