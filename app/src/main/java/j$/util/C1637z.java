package j$.util;

import java.util.SortedSet;

/* JADX INFO: renamed from: j$.util.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1637z extends Z {
    final /* synthetic */ SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1637z(SortedSet sortedSet, java.util.Collection collection) {
        super(21, collection);
        this.f = sortedSet;
    }

    @Override // j$.util.Z, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f.comparator();
    }
}
