package j$.util;

import j$.util.function.C1490l;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1516o implements PrimitiveIterator.OfDouble {
    public final /* synthetic */ InterfaceC1517p a;

    private /* synthetic */ C1516o(InterfaceC1517p interfaceC1517p) {
        this.a = interfaceC1517p;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(InterfaceC1517p interfaceC1517p) {
        if (interfaceC1517p == null) {
            return null;
        }
        return interfaceC1517p instanceof C1515n ? ((C1515n) interfaceC1517p).a : new C1516o(interfaceC1517p);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1517p interfaceC1517p = this.a;
        if (obj instanceof C1516o) {
            obj = ((C1516o) obj).a;
        }
        return interfaceC1517p.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(j$.util.function.Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.a.d(C1490l.a(doubleConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
