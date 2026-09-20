package defpackage;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ct<E> extends AbstractList<E> implements lv1 {
    public abstract int a();

    public abstract E b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
