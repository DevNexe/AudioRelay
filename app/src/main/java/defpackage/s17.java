package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class s17 extends wy6 implements RandomAccess, y17, u37 {
    public static final s17 z;
    public int[] x;
    public int y;

    static {
        s17 s17Var = new s17(new int[0], 0);
        z = s17Var;
        s17Var.w = false;
    }

    public s17() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.y)) {
            throw new IndexOutOfBoundsException(Md5A.e("Index:", i, ", Size:", this.y));
        }
        int[] iArr = this.x;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[qa0.a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.x, i, iArr2, i + 1, this.y - i);
            this.x = iArr2;
        }
        this.x[i] = iIntValue;
        this.y++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wy6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = f27.a;
        collection.getClass();
        if (!(collection instanceof s17)) {
            return super.addAll(collection);
        }
        s17 s17Var = (s17) collection;
        int i = s17Var.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.x;
        if (i3 > iArr.length) {
            this.x = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(s17Var.x, 0, this.x, this.y, s17Var.y);
        this.y = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.y) {
            throw new IndexOutOfBoundsException(Md5A.e("Index:", i, ", Size:", this.y));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s17)) {
            return super.equals(obj);
        }
        s17 s17Var = (s17) obj;
        if (this.y != s17Var.y) {
            return false;
        }
        int[] iArr = s17Var.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Integer.valueOf(this.x[i]);
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.y; i2++) {
            i = (i * 31) + this.x[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        b(i);
        int[] iArr = this.x;
        int i2 = iArr[i];
        int i3 = this.y;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.x;
        System.arraycopy(iArr, i2, iArr, i, this.y - i2);
        this.y -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        b(i);
        int[] iArr = this.x;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    @Override // defpackage.d27
    public final d27 zzd(int i) {
        if (i >= this.y) {
            return new s17(Arrays.copyOf(this.x, i), this.y);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i) {
        a();
        int i2 = this.y;
        int[] iArr = this.x;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[qa0.a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.x = iArr2;
        }
        int[] iArr3 = this.x;
        int i3 = this.y;
        this.y = i3 + 1;
        iArr3[i3] = i;
    }

    public s17(int[] iArr, int i) {
        this.x = iArr;
        this.y = i;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
