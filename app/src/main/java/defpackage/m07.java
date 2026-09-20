package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class m07 extends wy6 implements RandomAccess, u37 {
    public double[] x;
    public int y;

    static {
        new m07(new double[0], 0).w = false;
    }

    public m07() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.y)) {
            throw new IndexOutOfBoundsException(Md5A.e("Index:", i, ", Size:", this.y));
        }
        double[] dArr = this.x;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[qa0.a(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.x, i, dArr2, i + 1, this.y - i);
            this.x = dArr2;
        }
        this.x[i] = dDoubleValue;
        this.y++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wy6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = f27.a;
        collection.getClass();
        if (!(collection instanceof m07)) {
            return super.addAll(collection);
        }
        m07 m07Var = (m07) collection;
        int i = m07Var.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.x;
        if (i3 > dArr.length) {
            this.x = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(m07Var.x, 0, this.x, this.y, m07Var.y);
        this.y = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(double d) {
        a();
        int i = this.y;
        double[] dArr = this.x;
        if (i == dArr.length) {
            double[] dArr2 = new double[qa0.a(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.x = dArr2;
        }
        double[] dArr3 = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        dArr3[i2] = d;
    }

    public final void c(int i) {
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
        if (!(obj instanceof m07)) {
            return super.equals(obj);
        }
        m07 m07Var = (m07) obj;
        if (this.y != m07Var.y) {
            return false;
        }
        double[] dArr = m07Var.x;
        for (int i = 0; i < this.y; i++) {
            if (Double.doubleToLongBits(this.x[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Double.valueOf(this.x[i]);
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i = 0; i < this.y; i++) {
            iA = (iA * 31) + f27.a(Double.doubleToLongBits(this.x[i]));
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        c(i);
        double[] dArr = this.x;
        double d = dArr[i];
        int i2 = this.y;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.x;
        System.arraycopy(dArr, i2, dArr, i, this.y - i2);
        this.y -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        c(i);
        double[] dArr = this.x;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    @Override // defpackage.d27
    public final /* bridge */ /* synthetic */ d27 zzd(int i) {
        if (i >= this.y) {
            return new m07(Arrays.copyOf(this.x, i), this.y);
        }
        throw new IllegalArgumentException();
    }

    public m07(double[] dArr, int i) {
        this.x = dArr;
        this.y = i;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}
