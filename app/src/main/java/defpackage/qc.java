package defpackage;

import java.util.AbstractSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qc<E> extends AbstractSet<E> implements ov1 {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
