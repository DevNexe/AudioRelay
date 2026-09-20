package j$.util;

import j$.util.function.C1477e0;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1634w implements PrimitiveIterator.OfLong {
    public final /* synthetic */ InterfaceC1635x a;

    private /* synthetic */ C1634w(InterfaceC1635x interfaceC1635x) {
        this.a = interfaceC1635x;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(InterfaceC1635x interfaceC1635x) {
        if (interfaceC1635x == null) {
            return null;
        }
        return interfaceC1635x instanceof C1633v ? ((C1633v) interfaceC1635x).a : new C1634w(interfaceC1635x);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1635x interfaceC1635x = this.a;
        if (obj instanceof C1634w) {
            obj = ((C1634w) obj).a;
        }
        return interfaceC1635x.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(j$.util.function.Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.a.b(C1477e0.a(longConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
