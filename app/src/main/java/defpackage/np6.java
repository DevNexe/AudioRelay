package defpackage;

import com.google.android.gms.internal.ads.zzfsg;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class np6 extends mp6 implements SortedSet {
    public np6(SortedSet sortedSet, zzfsg zzfsgVar) {
        super(sortedSet, zzfsgVar);
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return ((SortedSet) this.w).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.w.iterator();
        it.getClass();
        zzfsg zzfsgVar = this.x;
        zzfsgVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfsgVar.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new np6(((SortedSet) this.w).headSet(obj), this.x);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.w;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.x.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new np6(((SortedSet) this.w).subSet(obj, obj2), this.x);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new np6(((SortedSet) this.w).tailSet(obj), this.x);
    }
}
