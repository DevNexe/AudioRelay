package com.google.protobuf;

import defpackage.fe3;
import defpackage.iZUl;
import defpackage.qa0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class ck32 extends LPt8Fixed<Integer> implements SjP.F1, RandomAccess, fe3 {
    public static final ck32 z;
    public int[] x;
    public int y;

    static {
        ck32 ck32Var = new ck32(new int[0], 0);
        z = ck32Var;
        ck32Var.w = false;
    }

    public ck32() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.y)) {
            StringBuilder sbC = iZUl.c("Index:", i, ", Size:");
            sbC.append(this.y);
            throw new IndexOutOfBoundsException(sbC.toString());
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

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        Charset charset = SjP.a;
        collection.getClass();
        if (!(collection instanceof ck32)) {
            return super.addAll(collection);
        }
        ck32 ck32Var = (ck32) collection;
        int i = ck32Var.y;
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
        System.arraycopy(ck32Var.x, 0, this.x, this.y, ck32Var.y);
        this.y = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
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

    public final void c(int i) {
        if (i < 0 || i >= this.y) {
            StringBuilder sbC = iZUl.c("Index:", i, ", Size:");
            sbC.append(this.y);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        c(i);
        return this.x[i];
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck32)) {
            return super.equals(obj);
        }
        ck32 ck32Var = (ck32) obj;
        if (this.y != ck32Var.y) {
            return false;
        }
        int[] iArr = ck32Var.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(d(i));
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
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
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        c(i);
        int[] iArr = this.x;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    public ck32(int[] iArr, int i) {
        this.x = iArr;
        this.y = i;
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
