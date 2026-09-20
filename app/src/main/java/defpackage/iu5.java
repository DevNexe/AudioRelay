package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iu5 extends qb7 {
    public final transient int A;
    public final transient Object[] y;
    public final transient int z;

    public iu5(int i, int i2, Object[] objArr) {
        this.y = objArr;
        this.z = i;
        this.A = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Th.S(i, this.A);
        Object obj = this.y[i + i + this.z];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }
}
