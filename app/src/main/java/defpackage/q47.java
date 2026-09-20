package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class q47 extends AbstractList implements RandomAccess, m27 {
    public final m27 w;

    public q47(m27 m27Var) {
        this.w = m27Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((l27) this.w).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new p47(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new o47(this, i);
    }

    @Override // defpackage.m27
    public final void q(a07 a07Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w.size();
    }

    @Override // defpackage.m27
    public final m27 zze() {
        return this;
    }

    @Override // defpackage.m27
    public final Object zzf(int i) {
        return this.w.zzf(i);
    }

    @Override // defpackage.m27
    public final List zzh() {
        return this.w.zzh();
    }
}
