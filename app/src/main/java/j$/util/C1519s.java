package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1519s implements PrimitiveIterator.OfInt {
    public final /* synthetic */ InterfaceC1631t a;

    private /* synthetic */ C1519s(InterfaceC1631t interfaceC1631t) {
        this.a = interfaceC1631t;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(InterfaceC1631t interfaceC1631t) {
        if (interfaceC1631t == null) {
            return null;
        }
        return interfaceC1631t instanceof r ? ((r) interfaceC1631t).a : new C1519s(interfaceC1631t);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1631t interfaceC1631t = this.a;
        if (obj instanceof C1519s) {
            obj = ((C1519s) obj).a;
        }
        return interfaceC1631t.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(j$.util.function.Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.a.c(j$.util.function.J.a(intConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
