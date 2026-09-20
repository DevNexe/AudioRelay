package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ks5 extends qb7 {
    public final /* synthetic */ et5 y;

    public ks5(et5 et5Var) {
        this.y = et5Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        et5 et5Var = this.y;
        Th.S(i, et5Var.A);
        int i2 = i + i;
        Object[] objArr = et5Var.z;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y.A;
    }
}
