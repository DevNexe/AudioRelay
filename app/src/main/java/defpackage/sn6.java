package defpackage;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class sn6 implements Iterator, j$.util.Iterator {
    public final Iterator w;
    public final Collection x;
    public final /* synthetic */ un6 y;

    public sn6(un6 un6Var) {
        this.y = un6Var;
        Collection collection = un6Var.x;
        this.x = collection;
        this.w = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public sn6(un6 un6Var, ListIterator listIterator) {
        this.y = un6Var;
        this.x = un6Var.x;
        this.w = listIterator;
    }

    final void a() {
        un6 un6Var = this.y;
        un6Var.zzb();
        if (un6Var.x != this.x) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        a();
        return this.w.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        a();
        return this.w.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.w.remove();
        un6 un6Var = this.y;
        un6Var.A.A--;
        un6Var.b();
    }
}
