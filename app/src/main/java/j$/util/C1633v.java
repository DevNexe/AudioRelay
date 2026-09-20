package j$.util;

import j$.util.function.C1479f0;
import j$.util.function.C1480g;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;
import java.util.PrimitiveIterator;

/* JADX INFO: renamed from: j$.util.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1633v implements InterfaceC1635x, Iterator {
    public final /* synthetic */ PrimitiveIterator.OfLong a;

    private /* synthetic */ C1633v(PrimitiveIterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ InterfaceC1635x a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C1634w ? ((C1634w) ofLong).a : new C1633v(ofLong);
    }

    @Override // j$.util.InterfaceC1635x
    public final /* synthetic */ void b(InterfaceC1481g0 interfaceC1481g0) {
        this.a.forEachRemaining(C1479f0.a(interfaceC1481g0));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1633v) {
            obj = ((C1633v) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.InterfaceC1635x, j$.util.Iterator
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

    @Override // j$.util.InterfaceC1635x, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.InterfaceC1635x
    public final /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
