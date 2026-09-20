package j$.util;

import j$.util.function.C1480g;
import j$.util.function.C1492m;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A implements C {
    public final /* synthetic */ java.util.Spliterator.OfDouble a;

    private /* synthetic */ A(java.util.Spliterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ C f(java.util.Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof B ? ((B) ofDouble).a : new A(ofDouble);
    }

    @Override // j$.util.C, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.a.tryAdvance(C1480g.a(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.C
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void forEachRemaining(InterfaceC1494n interfaceC1494n) {
        this.a.forEachRemaining(C1492m.a(interfaceC1494n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.C, j$.util.Spliterator
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

    @Override // j$.util.C
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean tryAdvance(InterfaceC1494n interfaceC1494n) {
        return this.a.tryAdvance(C1492m.a(interfaceC1494n));
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: tryAdvance */
    public final /* synthetic */ boolean o(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // j$.util.C, j$.util.L, j$.util.Spliterator
    public final /* synthetic */ C trySplit() {
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
