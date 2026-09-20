package j$.util;

import j$.util.function.C1480g;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements InterfaceC1631t, Iterator {
    public final /* synthetic */ PrimitiveIterator.OfInt a;

    private /* synthetic */ r(PrimitiveIterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ InterfaceC1631t a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C1519s ? ((C1519s) ofInt).a : new r(ofInt);
    }

    @Override // j$.util.InterfaceC1631t
    public final /* synthetic */ void c(j$.util.function.L l) {
        this.a.forEachRemaining(j$.util.function.K.a(l));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.InterfaceC1631t, j$.util.Iterator
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

    @Override // j$.util.InterfaceC1631t, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.InterfaceC1631t
    public final /* synthetic */ int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
