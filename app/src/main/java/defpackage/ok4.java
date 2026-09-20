package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ok4<K, V> {
    public static int A;
    public static Object[] B;
    public static int C;
    public static Object[] z;
    public int[] w;
    public Object[] x;
    public int y;

    public ok4() {
        this.w = o70.w;
        this.x = o70.x;
        this.y = 0;
    }

    private void a(int i) {
        if (i == 8) {
            synchronized (ok4.class) {
                Object[] objArr = B;
                if (objArr != null) {
                    this.x = objArr;
                    B = (Object[]) objArr[0];
                    this.w = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    C--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ok4.class) {
                Object[] objArr2 = z;
                if (objArr2 != null) {
                    this.x = objArr2;
                    z = (Object[]) objArr2[0];
                    this.w = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A--;
                    return;
                }
            }
        }
        this.w = new int[i];
        this.x = new Object[i << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ok4.class) {
                if (C < 10) {
                    objArr[0] = B;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    B = objArr;
                    C++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ok4.class) {
                if (A < 10) {
                    objArr[0] = z;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    z = objArr;
                    A++;
                }
            }
        }
    }

    public final void b(int i) {
        int i2 = this.y;
        int[] iArr = this.w;
        if (iArr.length < i) {
            Object[] objArr = this.x;
            a(i);
            if (this.y > 0) {
                System.arraycopy(iArr, 0, this.w, 0, i2);
                System.arraycopy(objArr, 0, this.x, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.y != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.y;
        if (i > 0) {
            int[] iArr = this.w;
            Object[] objArr = this.x;
            this.w = o70.w;
            this.x = o70.x;
            this.y = 0;
            c(iArr, objArr, i);
        }
        if (this.y > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final int e(int i, Object obj) {
        int i2 = this.y;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iC = o70.c(i2, i, this.w);
            if (iC < 0 || obj.equals(this.x[iC << 1])) {
                return iC;
            }
            int i3 = iC + 1;
            while (i3 < i2 && this.w[i3] == i) {
                if (obj.equals(this.x[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iC - 1; i4 >= 0 && this.w[i4] == i; i4--) {
                if (obj.equals(this.x[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ok4) {
            ok4 ok4Var = (ok4) obj;
            if (this.y != ok4Var.y) {
                return false;
            }
            for (int i = 0; i < this.y; i++) {
                try {
                    K kI = i(i);
                    V vK = k(i);
                    Object orDefault = ok4Var.getOrDefault(kI, null);
                    if (vK == null) {
                        if (orDefault != null || !ok4Var.containsKey(kI)) {
                            return false;
                        }
                    } else if (!vK.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.y != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.y; i2++) {
                try {
                    K kI2 = i(i2);
                    V vK2 = k(i2);
                    Object obj2 = map.get(kI2);
                    if (vK2 == null) {
                        if (obj2 != null || !map.containsKey(kI2)) {
                            return false;
                        }
                    } else if (!vK2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        return obj == null ? g() : e(obj.hashCode(), obj);
    }

    public final int g() {
        int i = this.y;
        if (i == 0) {
            return -1;
        }
        try {
            int iC = o70.c(i, 0, this.w);
            if (iC < 0 || this.x[iC << 1] == null) {
                return iC;
            }
            int i2 = iC + 1;
            while (i2 < i && this.w[i2] == 0) {
                if (this.x[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iC - 1; i3 >= 0 && this.w[i3] == 0; i3--) {
                if (this.x[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v) {
        int iF = f(obj);
        return iF >= 0 ? (V) this.x[(iF << 1) + 1] : v;
    }

    public final int h(Object obj) {
        int i = this.y * 2;
        Object[] objArr = this.x;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int[] iArr = this.w;
        Object[] objArr = this.x;
        int i = this.y;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final K i(int i) {
        return (K) this.x[i << 1];
    }

    public final boolean isEmpty() {
        return this.y <= 0;
    }

    public final V j(int i) {
        Object[] objArr = this.x;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.y;
        int i4 = 0;
        if (i3 <= 1) {
            c(this.w, objArr, i3);
            this.w = o70.w;
            this.x = o70.x;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.w;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.x;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.x;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.y) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.w, 0, i);
                    System.arraycopy(objArr, 0, this.x, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.w, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.x, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.y) {
            throw new ConcurrentModificationException();
        }
        this.y = i4;
        return v;
    }

    public final V k(int i) {
        return (V) this.x[(i << 1) + 1];
    }

    public final V put(K k, V v) {
        int i;
        int iE;
        int i2 = this.y;
        if (k == null) {
            iE = g();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iE = e(iHashCode, k);
        }
        if (iE >= 0) {
            int i3 = (iE << 1) + 1;
            Object[] objArr = this.x;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iE;
        int[] iArr = this.w;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.x;
            a(i5);
            if (i2 != this.y) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.w;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.x, 0, objArr2.length);
            }
            c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.w;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.x;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.y - i4) << 1);
        }
        int i7 = this.y;
        if (i2 == i7) {
            int[] iArr4 = this.w;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.x;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.y = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public final V remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return j(iF);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int iF = f(k);
        if (iF < 0) {
            return null;
        }
        int i = (iF << 1) + 1;
        Object[] objArr = this.x;
        V v2 = (V) objArr[i];
        objArr[i] = v;
        return v2;
    }

    public final int size() {
        return this.y;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.y * 28);
        sb.append('{');
        for (int i = 0; i < this.y; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kI = i(i);
            if (kI != this) {
                sb.append(kI);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vK = k(i);
            if (vK != this) {
                sb.append(vK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        V vK = k(iF);
        if (obj2 != vK && (obj2 == null || !obj2.equals(vK))) {
            return false;
        }
        j(iF);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iF = f(k);
        if (iF < 0) {
            return false;
        }
        V vK = k(iF);
        if (vK != v && (v == null || !v.equals(vK))) {
            return false;
        }
        int i = (iF << 1) + 1;
        Object[] objArr = this.x;
        Object obj = objArr[i];
        objArr[i] = v2;
        return true;
    }

    public ok4(int i) {
        if (i == 0) {
            this.w = o70.w;
            this.x = o70.x;
        } else {
            a(i);
        }
        this.y = 0;
    }

    public ok4(ok4<K, V> ok4Var) {
        this();
        if (ok4Var != null) {
            int i = ok4Var.y;
            b(this.y + i);
            if (this.y != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(ok4Var.i(i2), ok4Var.k(i2));
                }
            } else if (i > 0) {
                System.arraycopy(ok4Var.w, 0, this.w, 0, i);
                System.arraycopy(ok4Var.x, 0, this.x, 0, i << 1);
                this.y = i;
            }
        }
    }
}
