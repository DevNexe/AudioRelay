package j$.util;

import j$.util.function.C1479f0;
import j$.util.function.C1480g;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class G implements I {
    public final /* synthetic */ java.util.Spliterator.OfLong a;

    private /* synthetic */ G(java.util.Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ I f(java.util.Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof H ? ((H) ofLong).a : new G(ofLong);
    }

    @Override // j$.util.I, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.a.tryAdvance(C1480g.a(consumer));
    }

    @Override // j$.util.I
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void forEachRemaining(InterfaceC1481g0 interfaceC1481g0) {
        this.a.forEachRemaining(C1479f0.a(interfaceC1481g0));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.I
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean tryAdvance(InterfaceC1481g0 interfaceC1481g0) {
        return this.a.tryAdvance(C1479f0.a(interfaceC1481g0));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof G) {
            obj = ((G) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.I, j$.util.Spliterator
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

    @Override // j$.util.I, j$.util.L, j$.util.Spliterator
    public final /* synthetic */ I trySplit() {
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
