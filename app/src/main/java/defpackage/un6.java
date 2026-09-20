package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public class un6 extends AbstractCollection {
    public final /* synthetic */ xn6 A;
    public final Object w;
    public Collection x;

    @CheckForNull
    public final un6 y;

    @CheckForNull
    public final Collection z;

    public un6(xn6 xn6Var, Object obj, @CheckForNull Collection collection, un6 un6Var) {
        this.A = xn6Var;
        this.w = obj;
        this.x = collection;
        this.y = un6Var;
        this.z = un6Var == null ? null : un6Var.x;
    }

    final void a() {
        un6 un6Var = this.y;
        if (un6Var != null) {
            un6Var.a();
        } else {
            this.A.z.put(this.w, this.x);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.x.isEmpty();
        boolean zAdd = this.x.add(obj);
        if (!zAdd) {
            return zAdd;
        }
        this.A.A++;
        if (!zIsEmpty) {
            return zAdd;
        }
        a();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.x.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.A.A += this.x.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    final void b() {
        un6 un6Var = this.y;
        if (un6Var != null) {
            un6Var.b();
        } else if (this.x.isEmpty()) {
            this.A.z.remove(this.w);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.x.clear();
        this.A.A -= size;
        b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.x.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.x.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.x.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.x.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new sn6(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        zzb();
        boolean zRemove = this.x.remove(obj);
        if (zRemove) {
            this.A.A--;
            b();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.x.removeAll(collection);
        if (zRemoveAll) {
            this.A.A += this.x.size() - size;
            b();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.x.retainAll(collection);
        if (zRetainAll) {
            this.A.A += this.x.size() - size;
            b();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.x.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.x.toString();
    }

    final void zzb() {
        Collection collection;
        un6 un6Var = this.y;
        if (un6Var != null) {
            un6Var.zzb();
            if (un6Var.x != this.z) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.x.isEmpty() || (collection = (Collection) this.A.z.get(this.w)) == null) {
                return;
            }
            this.x = collection;
        }
    }
}
