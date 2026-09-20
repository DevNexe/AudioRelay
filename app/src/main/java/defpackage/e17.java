package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class e17 extends wy6 implements RandomAccess, u37 {
    public float[] x;
    public int y;

    static {
        new e17(0, new float[0]).w = false;
    }

    public e17() {
        this(0, new float[10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.y)) {
            throw new IndexOutOfBoundsException(Md5A.e("Index:", i, ", Size:", this.y));
        }
        float[] fArr = this.x;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[qa0.a(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.x, i, fArr2, i + 1, this.y - i);
            this.x = fArr2;
        }
        this.x[i] = fFloatValue;
        this.y++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wy6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = f27.a;
        collection.getClass();
        if (!(collection instanceof e17)) {
            return super.addAll(collection);
        }
        e17 e17Var = (e17) collection;
        int i = e17Var.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.x;
        if (i3 > fArr.length) {
            this.x = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(e17Var.x, 0, this.x, this.y, e17Var.y);
        this.y = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f) {
        a();
        int i = this.y;
        float[] fArr = this.x;
        if (i == fArr.length) {
            float[] fArr2 = new float[qa0.a(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.x = fArr2;
        }
        float[] fArr3 = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        fArr3[i2] = f;
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
        if (!(obj instanceof e17)) {
            return super.equals(obj);
        }
        e17 e17Var = (e17) obj;
        if (this.y != e17Var.y) {
            return false;
        }
        float[] fArr = e17Var.x;
        for (int i = 0; i < this.y; i++) {
            if (Float.floatToIntBits(this.x[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Float.valueOf(this.x[i]);
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.y; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.x[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        c(i);
        float[] fArr = this.x;
        float f = fArr[i];
        int i2 = this.y;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.x;
        System.arraycopy(fArr, i2, fArr, i, this.y - i2);
        this.y -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        c(i);
        float[] fArr = this.x;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
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
        return new e17(this.y, Arrays.copyOf(this.x, i));
    }

    public e17(int i, float[] fArr) {
        this.x = fArr;
        this.y = i;
    }

    @Override // defpackage.wy6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}
