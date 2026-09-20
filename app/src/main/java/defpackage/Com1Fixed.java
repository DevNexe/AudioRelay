package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Com1Fixed<E> extends ck32<E> implements o13<E> {

    public static final class QnHx extends cx1 implements j81<E, Boolean> {
        public final /* synthetic */ Collection<E> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(Collection<? extends E> collection) {
            super(1);
            this.w = collection;
        }

        @Override // defpackage.j81
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.w.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, defpackage.o13
    public o13<E> addAll(Collection<? extends E> collection) {
        u13 u13VarBuilder = builder();
        u13VarBuilder.addAll(collection);
        return u13VarBuilder.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.auxFixed, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.auxFixed, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ck32, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // defpackage.ck32, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, defpackage.o13
    public final o13<E> remove(E e) {
        int iIndexOf = indexOf(e);
        return iIndexOf != -1 ? k(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, defpackage.o13
    public final o13<E> removeAll(Collection<? extends E> collection) {
        return j(new QnHx(collection));
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new jj1.QnHx(this, i, i2);
    }
}
