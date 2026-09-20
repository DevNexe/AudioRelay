package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ho6 extends AbstractSet {
    public final /* synthetic */ jo6 w;

    public ho6(jo6 jo6Var) {
        this.w = jo6Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.w.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        jo6 jo6Var = this.w;
        Map mapA = jo6Var.a();
        return mapA != null ? mapA.keySet().iterator() : new bo6(jo6Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        jo6 jo6Var = this.w;
        Map mapA = jo6Var.a();
        if (mapA != null) {
            return mapA.keySet().remove(obj);
        }
        return jo6Var.g(obj) != jo6.F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.w.size();
    }
}
