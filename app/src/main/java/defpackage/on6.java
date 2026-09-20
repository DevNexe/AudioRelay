package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class on6 extends rn6 implements NavigableSet {
    public final /* synthetic */ xn6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on6(xn6 xn6Var, NavigableMap navigableMap) {
        super(xn6Var, navigableMap);
        this.z = xn6Var;
    }

    @Override // defpackage.rn6
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.w);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.w)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((mn6) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new on6(this.z, ((NavigableMap) ((SortedMap) this.w)).descendingMap());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.w)).floorKey(obj);
    }

    @Override // defpackage.rn6, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.w)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.w)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollFirst() {
        ln6 ln6Var = (ln6) iterator();
        if (!ln6Var.hasNext()) {
            return null;
        }
        Object next = ln6Var.next();
        ln6Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // defpackage.rn6, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.rn6, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new on6(this.z, ((NavigableMap) ((SortedMap) this.w)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new on6(this.z, ((NavigableMap) ((SortedMap) this.w)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new on6(this.z, ((NavigableMap) ((SortedMap) this.w)).tailMap(obj, z));
    }
}
