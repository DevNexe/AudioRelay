package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Q6g<E> implements Collection<E>, Set<E> {
    public static final int[] A = new int[0];
    public static final Object[] B = new Object[0];
    public static Object[] C;
    public static int D;
    public static Object[] E;
    public static int F;
    public int[] w;
    public Object[] x;
    public int y;
    public Vsm z;

    public Q6g() {
        this(0);
    }

    public static void b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (Q6g.class) {
                if (F < 10) {
                    objArr[0] = E;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    E = objArr;
                    F++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (Q6g.class) {
                if (D < 10) {
                    objArr[0] = C;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    C = objArr;
                    D++;
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (Q6g.class) {
                Object[] objArr = E;
                if (objArr != null) {
                    this.x = objArr;
                    E = (Object[]) objArr[0];
                    this.w = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    F--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (Q6g.class) {
                Object[] objArr2 = C;
                if (objArr2 != null) {
                    this.x = objArr2;
                    C = (Object[]) objArr2[0];
                    this.w = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    D--;
                    return;
                }
            }
        }
        this.w = new int[i];
        this.x = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int iC;
        if (e == null) {
            iC = d();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iC = c(iHashCode, e);
        }
        if (iC >= 0) {
            return false;
        }
        int i2 = ~iC;
        int i3 = this.y;
        int[] iArr = this.w;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.x;
            a(i4);
            int[] iArr2 = this.w;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.x, 0, objArr.length);
            }
            b(iArr, objArr, this.y);
        }
        int i5 = this.y;
        if (i2 < i5) {
            int[] iArr3 = this.w;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.x;
            System.arraycopy(objArr2, i2, objArr2, i6, this.y - i2);
        }
        this.w[i2] = i;
        this.x[i2] = e;
        this.y++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.y;
        int[] iArr = this.w;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.x;
            a(size);
            int i = this.y;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.w, 0, i);
                System.arraycopy(objArr, 0, this.x, 0, this.y);
            }
            b(iArr, objArr, this.y);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final int c(int i, Object obj) {
        int i2 = this.y;
        if (i2 == 0) {
            return -1;
        }
        int iC = o70.c(i2, i, this.w);
        if (iC < 0 || obj.equals(this.x[iC])) {
            return iC;
        }
        int i3 = iC + 1;
        while (i3 < i2 && this.w[i3] == i) {
            if (obj.equals(this.x[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iC - 1; i4 >= 0 && this.w[i4] == i; i4--) {
            if (obj.equals(this.x[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.y;
        if (i != 0) {
            b(this.w, this.x, i);
            this.w = A;
            this.x = B;
            this.y = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i = this.y;
        if (i == 0) {
            return -1;
        }
        int iC = o70.c(i, 0, this.w);
        if (iC < 0 || this.x[iC] == null) {
            return iC;
        }
        int i2 = iC + 1;
        while (i2 < i && this.w[i2] == 0) {
            if (this.x[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iC - 1; i3 >= 0 && this.w[i3] == 0; i3--) {
            if (this.x[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final void e(int i) {
        Object[] objArr = this.x;
        Object obj = objArr[i];
        int i2 = this.y;
        if (i2 <= 1) {
            b(this.w, objArr, i2);
            this.w = A;
            this.x = B;
            this.y = 0;
            return;
        }
        int[] iArr = this.w;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.y = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.x;
                System.arraycopy(objArr2, i4, objArr2, i, this.y - i);
            }
            this.x[this.y] = null;
            return;
        }
        a(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.y--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.w, 0, i);
            System.arraycopy(objArr, 0, this.x, 0, i);
        }
        int i5 = this.y;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.w, i, i5 - i);
            System.arraycopy(objArr, i6, this.x, i, this.y - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.y != set.size()) {
                return false;
            }
            for (int i = 0; i < this.y; i++) {
                try {
                    if (!set.contains(this.x[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.w;
        int i = this.y;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.y <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.z == null) {
            this.z = new Vsm(this);
        }
        Vsm vsm = this.z;
        if (vsm.b == null) {
            vsm.b = new g92.F1();
        }
        return (Iterator<E>) vsm.b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.y - 1; i >= 0; i--) {
            if (!collection.contains(this.x[i])) {
                e(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.y;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.y;
        Object[] objArr = new Object[i];
        System.arraycopy(this.x, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.y * 14);
        sb.append('{');
        for (int i = 0; i < this.y; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.x[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Q6g(int i) {
        if (i == 0) {
            this.w = A;
            this.x = B;
        } else {
            a(i);
        }
        this.y = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.y) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.y));
        }
        System.arraycopy(this.x, 0, tArr, 0, this.y);
        int length = tArr.length;
        int i = this.y;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
