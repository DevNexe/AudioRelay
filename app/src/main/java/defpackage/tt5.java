package defpackage;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class tt5 extends ed7 {
    public final transient tc7 y;
    public final transient qb7 z;

    public tt5(tc7 tc7Var, iu5 iu5Var) {
        this.y = tc7Var;
        this.z = iu5Var;
    }

    @Override // defpackage.ea7
    public final int a(Object[] objArr) {
        return this.z.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.y.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.z.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((bv5) this.y).B;
    }
}
