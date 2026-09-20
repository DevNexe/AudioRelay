package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class w37 extends wy6 implements RandomAccess {
    public static final w37 z;
    public Object[] x;
    public int y;

    static {
        w37 w37Var = new w37(0, new Object[0]);
        z = w37Var;
        w37Var.w = false;
    }

    public w37(int i, Object[] objArr) {
        this.x = objArr;
        this.y = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.y)) {
            throw new IndexOutOfBoundsException(Md5A.e("Index:", i, ", Size:", this.y));
        }
        Object[] objArr = this.x;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[qa0.a(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.x, i, objArr2, i + 1, this.y - i);
            this.x = objArr2;
        }
        this.x[i] = obj;
        this.y++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.y) {
            throw new IndexOutOfBoundsException(Md5A.e("Index:", i, ", Size:", this.y));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.x[i];
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.x;
        Object obj = objArr[i];
        int i2 = this.y;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.x;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    @Override // defpackage.d27
    public final /* bridge */ /* synthetic */ d27 zzd(int i) {
        if (i < this.y) {
            throw new IllegalArgumentException();
        }
        return new w37(this.y, Arrays.copyOf(this.x, i));
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.y;
        Object[] objArr = this.x;
        if (i == objArr.length) {
            this.x = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
