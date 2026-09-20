package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public class rn6 extends mn6 implements SortedSet {
    public final /* synthetic */ xn6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn6(xn6 xn6Var, SortedMap sortedMap) {
        super(xn6Var, sortedMap);
        this.y = xn6Var;
    }

    public SortedMap a() {
        return (SortedMap) this.w;
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new rn6(this.y, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new rn6(this.y, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new rn6(this.y, a().tailMap(obj));
    }
}
