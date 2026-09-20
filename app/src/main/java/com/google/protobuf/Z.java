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
public final class Z extends LPt8Fixed<Long> implements RandomAccess, fe3 {
    public long[] x;
    public int y;

    static {
        new Z(new long[0], 0).w = false;
    }

    public Z() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.y)) {
            StringBuilder sbC = iZUl.c("Index:", i, ", Size:");
            sbC.append(this.y);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        long[] jArr = this.x;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[qa0.a(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.x, i, jArr2, i + 1, this.y - i);
            this.x = jArr2;
        }
        this.x[i] = jLongValue;
        this.y++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = SjP.a;
        collection.getClass();
        if (!(collection instanceof Z)) {
            return super.addAll(collection);
        }
        Z z = (Z) collection;
        int i = z.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.x;
        if (i3 > jArr.length) {
            this.x = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(z.x, 0, this.x, this.y, z.y);
        this.y = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(long j) {
        a();
        int i = this.y;
        long[] jArr = this.x;
        if (i == jArr.length) {
            long[] jArr2 = new long[qa0.a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.x = jArr2;
        }
        long[] jArr3 = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        jArr3[i2] = j;
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

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return super.equals(obj);
        }
        Z z = (Z) obj;
        if (this.y != z.y) {
            return false;
        }
        long[] jArr = z.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Long.valueOf(this.x[i]);
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.y; i++) {
            iB = (iB * 31) + SjP.b(this.x[i]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        long[] jArr = this.x;
        long j = jArr[i];
        int i2 = this.y;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.x;
        System.arraycopy(jArr, i2, jArr, i, this.y - i2);
        this.y -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        c(i);
        long[] jArr = this.x;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    public Z(long[] jArr, int i) {
        this.x = jArr;
        this.y = i;
    }

    @Override // com.google.protobuf.LPt8Fixed, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}
