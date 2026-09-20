package j$.util;

import j$.util.function.C1480g;
import j$.util.function.C1492m;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;
import java.util.PrimitiveIterator;

/* JADX INFO: renamed from: j$.util.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1515n implements InterfaceC1517p, Iterator {
    public final /* synthetic */ PrimitiveIterator.OfDouble a;

    private /* synthetic */ C1515n(PrimitiveIterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ InterfaceC1517p a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C1516o ? ((C1516o) ofDouble).a : new C1515n(ofDouble);
    }

    @Override // j$.util.InterfaceC1517p
    public final /* synthetic */ void d(InterfaceC1494n interfaceC1494n) {
        this.a.forEachRemaining(C1492m.a(interfaceC1494n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1515n) {
            obj = ((C1515n) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.InterfaceC1517p, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C1480g.a(consumer));
    }

    @Override // j$.util.InterfaceC1636y
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.InterfaceC1517p, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Double next() {
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.InterfaceC1517p
    public final /* synthetic */ double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
