package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class t13<E> extends Com1Fixed<E> {
    public final Object[] w;
    public final Object[] x;
    public final int y;
    public final int z;

    public t13(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.w = objArr;
        this.x = objArr2;
        this.y = i;
        this.z = i2;
        if (a() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + a()).toString());
    }

    public static Object[] s(int i, int i2, Object obj, Object[] objArr) {
        int i3 = (i2 >> i) & 31;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[i3] = obj;
        } else {
            Object obj2 = objArrCopyOf[i3];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrCopyOf[i3] = s(i - 5, i2, obj, (Object[]) obj2);
        }
        return objArrCopyOf;
    }

    @Override // defpackage.auxFixed
    public final int a() {
        return this.y;
    }

    @Override // java.util.List, defpackage.o13
    public final o13<E> add(int i, E e) {
        zc1.d(i, a());
        if (i == a()) {
            return add((Object) e);
        }
        int iR = r();
        if (i >= iR) {
            return e(i - iR, e, this.w);
        }
        pq2 pq2Var = new pq2((Object) null);
        return e(0, pq2Var.w, c(this.w, this.z, i, e, pq2Var));
    }

    @Override // defpackage.o13
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u13<E> builder() {
        return new u13<>(this, this.w, this.x, this.z);
    }

    public final Object[] c(Object[] objArr, int i, int i2, Object obj, pq2 pq2Var) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object[] objArrCopyOf = i3 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            System.arraycopy(objArr, i3, objArrCopyOf, i3 + 1, 31 - i3);
            pq2Var.w = objArr[31];
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrCopyOf2[i3] = c((Object[]) obj2, i4, i2, obj, pq2Var);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrCopyOf2[i3] == null) {
                return objArrCopyOf2;
            }
            Object obj3 = objArr[i3];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrCopyOf2[i3] = c((Object[]) obj3, i4, 0, pq2Var.w, pq2Var);
        }
    }

    public final t13 e(int i, Object obj, Object[] objArr) {
        int iR = r();
        int i2 = this.y;
        int i3 = i2 - iR;
        Object[] objArr2 = this.x;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            System.arraycopy(objArr2, i, objArrCopyOf, i + 1, i3 - i);
            objArrCopyOf[i] = obj;
            return new t13(objArr, objArrCopyOf, i2 + 1, this.z);
        }
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, objArrCopyOf, i + 1, (i3 - 1) - i);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return g(objArr, objArrCopyOf, objArr3);
    }

    public final Object[] f(Object[] objArr, int i, int i2, pq2 pq2Var) {
        Object[] objArrF;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            pq2Var.w = objArr[i3];
            objArrF = null;
        } else {
            Object obj = objArr[i3];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrF = f((Object[]) obj, i - 5, i2, pq2Var);
        }
        if (objArrF == null && i3 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[i3] = objArrF;
        return objArrCopyOf;
    }

    public final t13<E> g(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.y;
        int i2 = i >> 5;
        int i3 = this.z;
        if (i2 <= (1 << i3)) {
            return new t13<>(h(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new t13<>(h(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.ck32, java.util.List
    public final E get(int i) {
        Object[] objArr;
        zc1.c(i, a());
        if (r() <= i) {
            objArr = this.x;
        } else {
            objArr = this.w;
            for (int i2 = this.z; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    public final Object[] h(int i, Object[] objArr, Object[] objArr2) {
        int iA = ((a() - 1) >> i) & 31;
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iA] = objArr2;
        } else {
            objArrCopyOf[iA] = h(i - 5, (Object[]) objArrCopyOf[iA], objArr2);
        }
        return objArrCopyOf;
    }

    @Override // defpackage.o13
    public final o13 j(Com1Fixed.QnHx qnHx) {
        u13<E> u13VarBuilder = builder();
        u13VarBuilder.J(qnHx);
        return u13VarBuilder.c();
    }

    @Override // defpackage.o13
    public final o13<E> k(int i) {
        zc1.c(i, this.y);
        int iR = r();
        Object[] objArr = this.w;
        int i2 = this.z;
        return i >= iR ? p(objArr, iR, i2, i - iR) : p(m(objArr, i2, i, new pq2(this.x[0])), iR, i2, 0);
    }

    @Override // defpackage.ck32, java.util.List
    public final ListIterator<E> listIterator(int i) {
        zc1.d(i, a());
        return new v13(i, a(), (this.z / 5) + 1, this.w, this.x);
    }

    public final Object[] m(Object[] objArr, int i, int i2, pq2 pq2Var) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object[] objArrCopyOf = i3 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            int i4 = i3 + 1;
            System.arraycopy(objArr, i4, objArrCopyOf, i3, 32 - i4);
            objArrCopyOf[31] = pq2Var.w;
            pq2Var.w = objArr[i3];
            return objArrCopyOf;
        }
        int iR = objArr[31] == null ? 31 & ((r() - 1) >> i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= iR) {
            while (true) {
                Object obj = objArrCopyOf2[iR];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArrCopyOf2[iR] = m((Object[]) obj, i5, 0, pq2Var);
                if (iR == i6) {
                    break;
                }
                iR--;
            }
        }
        Object obj2 = objArrCopyOf2[i3];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrCopyOf2[i3] = m((Object[]) obj2, i5, i2, pq2Var);
        return objArrCopyOf2;
    }

    public final Com1Fixed p(Object[] objArr, int i, int i2, int i3) {
        t13 t13Var;
        int i4 = this.y - i;
        Object obj = null;
        if (i4 != 1) {
            Object[] objArr2 = this.x;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                int i6 = i3 + 1;
                System.arraycopy(objArr2, i6, objArrCopyOf, i3, i4 - i6);
            }
            objArrCopyOf[i5] = null;
            return new t13(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new on4(objArr);
        }
        pq2 pq2Var = new pq2(obj);
        Object[] objArrF = f(objArr, i2, i - 1, pq2Var);
        Object obj2 = pq2Var.w;
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr3 = (Object[]) obj2;
        if (objArrF[1] == null) {
            Object obj3 = objArrF[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            t13Var = new t13((Object[]) obj3, objArr3, i, i2 - 5);
        } else {
            t13Var = new t13(objArrF, objArr3, i, i2);
        }
        return t13Var;
    }

    public final int r() {
        return (a() - 1) & (-32);
    }

    @Override // defpackage.ck32, java.util.List
    public final o13<E> set(int i, E e) {
        int i2 = this.y;
        zc1.c(i, i2);
        int iR = r();
        Object[] objArr = this.x;
        Object[] objArr2 = this.w;
        int i3 = this.z;
        if (iR > i) {
            return new t13(s(i3, i, e, objArr2), objArr, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[i & 31] = e;
        return new t13(objArr2, objArrCopyOf, i2, i3);
    }

    @Override // java.util.Collection, java.util.List, defpackage.o13
    public final o13<E> add(E e) {
        int iR = r();
        int i = this.y;
        int i2 = i - iR;
        Object[] objArr = this.x;
        Object[] objArr2 = this.w;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
            objArrCopyOf[i2] = e;
            return new t13(objArr2, objArrCopyOf, i + 1, this.z);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = e;
        return g(objArr2, objArr, objArr3);
    }
}
