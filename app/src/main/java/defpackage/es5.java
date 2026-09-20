package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class es5 extends qb7 {
    public static final es5 A = new es5(0, new Object[0]);
    public final transient Object[] y;
    public final transient int z;

    public es5(int i, Object[] objArr) {
        this.y = objArr;
        this.z = i;
    }

    @Override // defpackage.qb7, defpackage.ea7
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.y;
        int i = this.z;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.ea7
    public final int b() {
        return this.z;
    }

    @Override // defpackage.ea7
    public final int c() {
        return 0;
    }

    @Override // defpackage.ea7
    public final Object[] d() {
        return this.y;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Th.S(i, this.z);
        Object obj = this.y[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }
}
