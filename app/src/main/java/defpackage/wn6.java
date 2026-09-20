package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public class wn6 extends un6 implements List {
    public final /* synthetic */ xn6 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn6(xn6 xn6Var, Object obj, @CheckForNull List list, un6 un6Var) {
        super(xn6Var, obj, list, un6Var);
        this.B = xn6Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean zIsEmpty = this.x.isEmpty();
        ((List) this.x).add(i, obj);
        this.B.A++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.x).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.B.A += this.x.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.x).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.x).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.x).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new vn6(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.x).remove(i);
        this.B.A--;
        b();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.x).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List listSubList = ((List) this.x).subList(i, i2);
        un6 un6Var = this.y;
        if (un6Var == null) {
            un6Var = this;
        }
        xn6 xn6Var = this.B;
        xn6Var.getClass();
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.w;
        return z ? new pn6(xn6Var, obj, listSubList, un6Var) : new wn6(xn6Var, obj, listSubList, un6Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new vn6(this, i);
    }
}
