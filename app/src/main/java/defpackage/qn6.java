package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public class qn6 extends jn6 implements SortedMap {

    @CheckForNull
    public SortedSet A;
    public final /* synthetic */ xn6 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn6(xn6 xn6Var, SortedMap sortedMap) {
        super(xn6Var, sortedMap);
        this.B = xn6Var;
    }

    public SortedMap b() {
        return (SortedMap) this.y;
    }

    public SortedSet c() {
        return new rn6(this.B, b());
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // defpackage.jn6, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.A;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.A = sortedSetC;
        return sortedSetC;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new qn6(this.B, b().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new qn6(this.B, b().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new qn6(this.B, b().tailMap(obj));
    }
}
