package defpackage;

import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class wd5 extends AbstractList<String> implements i22, RandomAccess {
    public final i22 w;

    public class CQf implements Iterator<String>, j$.util.Iterator {
        public final Iterator<String> w;

        public CQf(wd5 wd5Var) {
            this.w = wd5Var.w.iterator();
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.w.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.w.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class QnHx implements ListIterator<String>, j$.util.Iterator {
        public final ListIterator<String> w;

        public QnHx(wd5 wd5Var, int i) {
            this.w = wd5Var.w.listIterator(i);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.w.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.w.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.w.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.w.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.w.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.w.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    public wd5(i22 i22Var) {
        this.w = i22Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.w.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new CQf(this);
    }

    @Override // defpackage.i22
    public final List<?> l() {
        return this.w.l();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new QnHx(this, i);
    }

    @Override // defpackage.i22
    public final void o(lk lkVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w.size();
    }

    @Override // defpackage.i22
    public final i22 t() {
        return this;
    }

    @Override // defpackage.i22
    public final Object w(int i) {
        return this.w.w(i);
    }
}
