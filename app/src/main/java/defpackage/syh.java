package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class syh<E> extends ct<E> {
    public static final Object[] z = new Object[0];
    public int w;
    public Object[] x;
    public int y;

    public syh(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = z;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException(GM.a("Illegal Capacity: ", i));
            }
            objArr = new Object[i];
        }
        this.x = objArr;
    }

    @Override // defpackage.ct
    public final int a() {
        return this.y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2 = this.y;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
        }
        if (i == i2) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        e(i2 + 1);
        int iG = g(this.w + i);
        int i3 = this.y;
        if (i < ((i3 + 1) >> 1)) {
            int length = iG == 0 ? this.x.length - 1 : iG - 1;
            int i4 = this.w;
            int length2 = i4 == 0 ? this.x.length - 1 : i4 - 1;
            if (length >= i4) {
                Object[] objArr = this.x;
                objArr[length2] = objArr[i4];
                int i5 = i4 + 1;
                System.arraycopy(objArr, i5, objArr, i4, (length + 1) - i5);
            } else {
                Object[] objArr2 = this.x;
                System.arraycopy(objArr2, i4, objArr2, i4 - 1, objArr2.length - i4);
                Object[] objArr3 = this.x;
                objArr3[objArr3.length - 1] = objArr3[0];
                System.arraycopy(objArr3, 1, objArr3, 0, (length + 1) - 1);
            }
            this.x[length] = e;
            this.w = length2;
        } else {
            int iG2 = g(i3 + this.w);
            if (iG < iG2) {
                Object[] objArr4 = this.x;
                System.arraycopy(objArr4, iG, objArr4, iG + 1, iG2 - iG);
            } else {
                Object[] objArr5 = this.x;
                System.arraycopy(objArr5, 0, objArr5, 1, iG2 - 0);
                Object[] objArr6 = this.x;
                objArr6[0] = objArr6[objArr6.length - 1];
                System.arraycopy(objArr6, iG, objArr6, iG + 1, (objArr6.length - 1) - iG);
            }
            this.x[iG] = e;
        }
        this.y++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        int i2 = this.y;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = this.y;
        if (i == i3) {
            return addAll(collection);
        }
        e(collection.size() + i3);
        int iG = g(this.y + this.w);
        int iG2 = g(this.w + i);
        int size = collection.size();
        if (i < ((this.y + 1) >> 1)) {
            int i4 = this.w;
            int length = i4 - size;
            if (iG2 < i4) {
                Object[] objArr = this.x;
                System.arraycopy(objArr, i4, objArr, length, objArr.length - i4);
                if (size >= iG2) {
                    Object[] objArr2 = this.x;
                    System.arraycopy(objArr2, 0, objArr2, objArr2.length - size, iG2 + 0);
                } else {
                    Object[] objArr3 = this.x;
                    System.arraycopy(objArr3, 0, objArr3, objArr3.length - size, size + 0);
                    Object[] objArr4 = this.x;
                    System.arraycopy(objArr4, size, objArr4, 0, iG2 - size);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.x;
                System.arraycopy(objArr5, i4, objArr5, length, iG2 - i4);
            } else {
                Object[] objArr6 = this.x;
                length += objArr6.length;
                int i5 = iG2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    System.arraycopy(objArr6, i4, objArr6, length, i5);
                } else {
                    System.arraycopy(objArr6, i4, objArr6, length, (i4 + length2) - i4);
                    Object[] objArr7 = this.x;
                    int i6 = this.w + length2;
                    System.arraycopy(objArr7, i6, objArr7, 0, iG2 - i6);
                }
            }
            this.w = length;
            int length3 = iG2 - size;
            if (length3 < 0) {
                length3 += this.x.length;
            }
            c(length3, collection);
        } else {
            int i7 = iG2 + size;
            if (iG2 < iG) {
                int i8 = size + iG;
                Object[] objArr8 = this.x;
                if (i8 <= objArr8.length) {
                    System.arraycopy(objArr8, iG2, objArr8, i7, iG - iG2);
                } else if (i7 >= objArr8.length) {
                    System.arraycopy(objArr8, iG2, objArr8, i7 - objArr8.length, iG - iG2);
                } else {
                    int length4 = iG - (i8 - objArr8.length);
                    System.arraycopy(objArr8, length4, objArr8, 0, iG - length4);
                    Object[] objArr9 = this.x;
                    System.arraycopy(objArr9, iG2, objArr9, i7, length4 - iG2);
                }
            } else {
                Object[] objArr10 = this.x;
                System.arraycopy(objArr10, 0, objArr10, size, iG - 0);
                Object[] objArr11 = this.x;
                if (i7 >= objArr11.length) {
                    System.arraycopy(objArr11, iG2, objArr11, i7 - objArr11.length, objArr11.length - iG2);
                } else {
                    int length5 = objArr11.length - size;
                    System.arraycopy(objArr11, length5, objArr11, 0, objArr11.length - length5);
                    Object[] objArr12 = this.x;
                    System.arraycopy(objArr12, iG2, objArr12, i7, (objArr12.length - size) - iG2);
                }
            }
            c(iG2, collection);
        }
        return true;
    }

    public final void addFirst(E e) {
        e(this.y + 1);
        int length = this.w;
        if (length == 0) {
            length = this.x.length;
        }
        int i = length - 1;
        this.w = i;
        this.x[i] = e;
        this.y++;
    }

    public final void addLast(E e) {
        e(a() + 1);
        this.x[g(a() + this.w)] = e;
        this.y = a() + 1;
    }

    @Override // defpackage.ct
    public final E b(int i) {
        int i2 = this.y;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
        }
        if (i == ps0.J(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int iG = g(this.w + i);
        Object[] objArr = this.x;
        E e = (E) objArr[iG];
        if (i < (this.y >> 1)) {
            int i3 = this.w;
            if (iG >= i3) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, iG - i3);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, iG - 0);
                Object[] objArr2 = this.x;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.w;
                System.arraycopy(objArr2, i4, objArr2, i4 + 1, (objArr2.length - 1) - i4);
            }
            Object[] objArr3 = this.x;
            int i5 = this.w;
            objArr3[i5] = null;
            this.w = i5 != objArr3.length + (-1) ? i5 + 1 : 0;
        } else {
            int iG2 = g(ps0.J(this) + this.w);
            if (iG <= iG2) {
                Object[] objArr4 = this.x;
                int i6 = iG + 1;
                System.arraycopy(objArr4, i6, objArr4, iG, (iG2 + 1) - i6);
            } else {
                Object[] objArr5 = this.x;
                int i7 = iG + 1;
                System.arraycopy(objArr5, i7, objArr5, iG, objArr5.length - i7);
                Object[] objArr6 = this.x;
                objArr6[objArr6.length - 1] = objArr6[0];
                System.arraycopy(objArr6, 1, objArr6, 0, (iG2 + 1) - 1);
            }
            this.x[iG2] = null;
        }
        this.y--;
        return e;
    }

    public final void c(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.x.length;
        while (i < length && it.hasNext()) {
            this.x[i] = it.next();
            i++;
        }
        int i2 = this.w;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.x[i3] = it.next();
        }
        this.y = collection.size() + a();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iG = g(a() + this.w);
        int i = this.w;
        if (i < iG) {
            Arrays.fill(this.x, i, iG, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.x;
            Arrays.fill(objArr, this.w, objArr.length, (Object) null);
            Arrays.fill(this.x, 0, iG, (Object) null);
        }
        this.w = 0;
        this.y = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.x;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == z) {
            if (i < 10) {
                i = 10;
            }
            this.x = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        int i3 = this.w;
        System.arraycopy(objArr, i3, objArr2, 0, objArr.length - i3);
        Object[] objArr3 = this.x;
        int length2 = objArr3.length;
        int i4 = this.w;
        System.arraycopy(objArr3, 0, objArr2, length2 - i4, i4 - 0);
        this.w = 0;
        this.x = objArr2;
    }

    public final E f() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.x[g(ps0.J(this) + this.w)];
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.x[this.w];
    }

    public final int g(int i) {
        Object[] objArr = this.x;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", iA));
        }
        return (E) this.x[g(this.w + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iG = g(a() + this.w);
        int length = this.w;
        if (length < iG) {
            while (length < iG) {
                if (ur1.a(obj, this.x[length])) {
                    i = this.w;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iG) {
            return -1;
        }
        int length2 = this.x.length;
        while (length < length2) {
            if (ur1.a(obj, this.x[length])) {
                i = this.w;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iG; i2++) {
            if (ur1.a(obj, this.x[i2])) {
                length = i2 + this.x.length;
                i = this.w;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.x[g(ps0.J(this) + this.w)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iG = g(a() + this.w);
        int i2 = this.w;
        if (i2 < iG) {
            length = iG - 1;
            if (i2 <= length) {
                while (!ur1.a(obj, this.x[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.w;
                return length - i;
            }
            return -1;
        }
        if (i2 > iG) {
            for (int i3 = iG - 1; -1 < i3; i3--) {
                if (ur1.a(obj, this.x[i3])) {
                    length = i3 + this.x.length;
                    i = this.w;
                    return length - i;
                }
            }
            length = this.x.length - 1;
            int i4 = this.w;
            if (i4 <= length) {
                while (!ur1.a(obj, this.x[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.w;
                return length - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        int iG;
        boolean z2 = false;
        if (!isEmpty()) {
            if (!(this.x.length == 0)) {
                int iG2 = g(this.y + this.w);
                int i = this.w;
                if (i < iG2) {
                    iG = i;
                    while (i < iG2) {
                        Object obj = this.x[i];
                        if (!collection.contains(obj)) {
                            this.x[iG] = obj;
                            iG++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    Arrays.fill(this.x, iG, iG2, (Object) null);
                } else {
                    int length = this.x.length;
                    int i2 = i;
                    boolean z3 = false;
                    while (i < length) {
                        Object[] objArr = this.x;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!collection.contains(obj2)) {
                            this.x[i2] = obj2;
                            i2++;
                        } else {
                            z3 = true;
                        }
                        i++;
                    }
                    iG = g(i2);
                    for (int i3 = 0; i3 < iG2; i3++) {
                        Object[] objArr2 = this.x;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!collection.contains(obj3)) {
                            Object[] objArr3 = this.x;
                            objArr3[iG] = obj3;
                            iG = iG == objArr3.length + (-1) ? 0 : iG + 1;
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    int length2 = iG - this.w;
                    if (length2 < 0) {
                        length2 += this.x.length;
                    }
                    this.y = length2;
                }
            }
        }
        return z2;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.x;
        int i = this.w;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.w = i == objArr.length + (-1) ? 0 : i + 1;
        this.y--;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iG = g(ps0.J(this) + this.w);
        Object[] objArr = this.x;
        E e = (E) objArr[iG];
        objArr[iG] = null;
        this.y = a() - 1;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        int iG;
        boolean z2 = false;
        if (!isEmpty()) {
            if (!(this.x.length == 0)) {
                int iG2 = g(this.y + this.w);
                int i = this.w;
                if (i < iG2) {
                    iG = i;
                    while (i < iG2) {
                        Object obj = this.x[i];
                        if (collection.contains(obj)) {
                            this.x[iG] = obj;
                            iG++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    Arrays.fill(this.x, iG, iG2, (Object) null);
                } else {
                    int length = this.x.length;
                    int i2 = i;
                    boolean z3 = false;
                    while (i < length) {
                        Object[] objArr = this.x;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (collection.contains(obj2)) {
                            this.x[i2] = obj2;
                            i2++;
                        } else {
                            z3 = true;
                        }
                        i++;
                    }
                    iG = g(i2);
                    for (int i3 = 0; i3 < iG2; i3++) {
                        Object[] objArr2 = this.x;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (collection.contains(obj3)) {
                            Object[] objArr3 = this.x;
                            objArr3[iG] = obj3;
                            iG = iG == objArr3.length + (-1) ? 0 : iG + 1;
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    int length2 = iG - this.w;
                    if (length2 < 0) {
                        length2 += this.x.length;
                    }
                    this.y = length2;
                }
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", iA));
        }
        int iG = g(this.w + i);
        Object[] objArr = this.x;
        E e2 = (E) objArr[iG];
        objArr[iG] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.y;
        if (length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        int iG = g(this.y + this.w);
        int i2 = this.w;
        if (i2 < iG) {
            NPO.a0(this.x, tArr, 0, i2, iG, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.x;
            int i3 = this.w;
            System.arraycopy(objArr, i3, tArr, 0, objArr.length - i3);
            Object[] objArr2 = this.x;
            System.arraycopy(objArr2, 0, tArr, objArr2.length - this.w, iG - 0);
        }
        int length2 = tArr.length;
        int i4 = this.y;
        if (length2 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    public syh() {
        this.x = z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        e(collection.size() + a());
        c(g(a() + this.w), collection);
        return true;
    }
}
