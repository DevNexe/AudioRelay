package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class og4 extends Th {
    public static final LinkedHashSet c0(Set set, Iterable iterable) {
        int size;
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C0239D.A(size));
        linkedHashSet.addAll(set);
        su.x0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final LinkedHashSet d0(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C0239D.A(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
