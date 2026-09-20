package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface o13<E> extends jj1<E>, Collection, jv1 {
    @Override // java.util.List
    o13<E> add(int i, E e);

    @Override // java.util.List, java.util.Collection
    o13<E> add(E e);

    @Override // java.util.List, defpackage.o13
    o13<E> addAll(Collection<? extends E> collection);

    u13 builder();

    o13 j(Com1Fixed.QnHx qnHx);

    o13<E> k(int i);

    @Override // java.util.List, defpackage.o13
    o13<E> remove(E e);

    @Override // java.util.List, defpackage.o13
    o13<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    o13<E> set(int i, E e);
}
