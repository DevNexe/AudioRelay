package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class u13<E> extends ct<E> implements kv1 {
    public su4 A = new su4();
    public Object[] B;
    public Object[] C;
    public int D;
    public o13<? extends E> w;
    public Object[] x;
    public Object[] y;
    public int z;

    public static final class QnHx extends cx1 implements j81<E, Boolean> {
        public final /* synthetic */ Collection<E> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(Collection<? extends E> collection) {
            super(1);
            this.w = collection;
        }

        @Override // defpackage.j81
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.w.contains(obj));
        }
    }

    public u13(o13<? extends E> o13Var, Object[] objArr, Object[] objArr2, int i) {
        this.w = o13Var;
        this.x = objArr;
        this.y = objArr2;
        this.z = i;
        this.B = objArr;
        this.C = objArr2;
        this.D = o13Var.size();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i2, pq2 pq2Var) {
        Object[] objArrA;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            pq2Var.w = objArr[i3];
            objArrA = null;
        } else {
            Object obj = objArr[i3];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrA = A((Object[]) obj, i - 5, i2, pq2Var);
        }
        if (objArrA == null && i3 == 0) {
            return null;
        }
        Object[] objArrS = s(objArr);
        objArrS[i3] = objArrA;
        return objArrS;
    }

    public final void B(int i, int i2, Object[] objArr) {
        Object obj = null;
        if (i2 == 0) {
            this.B = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.C = objArr;
            this.D = i;
            this.z = i2;
            return;
        }
        pq2 pq2Var = new pq2(obj);
        Object[] objArrA = A(objArr, i2, i, pq2Var);
        Object obj2 = pq2Var.w;
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.C = (Object[]) obj2;
        this.D = i;
        if (objArrA[1] == null) {
            this.B = (Object[]) objArrA[0];
            this.z = i2 - 5;
        } else {
            this.B = objArrA;
            this.z = i2;
        }
    }

    public final Object[] C(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] objArrS = s(objArr);
        int i3 = (i >> i2) & 31;
        int i4 = i2 - 5;
        objArrS[i3] = C((Object[]) objArrS[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            objArrS[i3] = C((Object[]) objArrS[i3], 0, i4, it);
        }
        return objArrS;
    }

    public final Object[] D(Object[] objArr, int i, Object[][] objArr2) {
        tj1 tj1Var = new tj1(objArr2);
        int i2 = i >> 5;
        int i3 = this.z;
        Object[] objArrC = i2 < (1 << i3) ? C(objArr, i, i3, tj1Var) : s(objArr);
        while (tj1Var.hasNext()) {
            this.z += 5;
            objArrC = y(objArrC);
            int i4 = this.z;
            C(objArrC, 1 << i4, i4, tj1Var);
        }
        return objArrC;
    }

    public final void E(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.D;
        int i2 = i >> 5;
        int i3 = this.z;
        if (i2 > (1 << i3)) {
            this.B = F(this.z + 5, y(objArr), objArr2);
            this.C = objArr3;
            this.z += 5;
            this.D++;
            return;
        }
        if (objArr == null) {
            this.B = objArr2;
            this.C = objArr3;
            this.D = i + 1;
        } else {
            this.B = F(i3, objArr, objArr2);
            this.C = objArr3;
            this.D++;
        }
    }

    public final Object[] F(int i, Object[] objArr, Object[] objArr2) {
        int iA = ((a() - 1) >> i) & 31;
        Object[] objArrS = s(objArr);
        if (i == 5) {
            objArrS[iA] = objArr2;
        } else {
            objArrS[iA] = F(i - 5, (Object[]) objArrS[iA], objArr2);
        }
        return objArrS;
    }

    public final int G(j81 j81Var, Object[] objArr, int i, int i2, pq2 pq2Var, ArrayList arrayList, ArrayList arrayList2) {
        if (p(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = pq2Var.w;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrV = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) j81Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrV = arrayList.isEmpty() ^ true ? (Object[]) arrayList.remove(arrayList.size() - 1) : v();
                    i2 = 0;
                }
                objArrV[i2] = obj2;
                i2++;
            }
        }
        pq2Var.w = objArrV;
        if (objArr2 != objArrV) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int H(j81<? super E, Boolean> j81Var, Object[] objArr, int i, pq2 pq2Var) {
        Object[] objArrS = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (j81Var.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrS = s(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrS[i2] = obj;
                i2++;
            }
        }
        pq2Var.w = objArrS;
        return i2;
    }

    public final int I(j81<? super E, Boolean> j81Var, int i, pq2 pq2Var) {
        int iH = H(j81Var, this.C, i, pq2Var);
        if (iH == i) {
            return i;
        }
        Object obj = pq2Var.w;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iH, i, (Object) null);
        this.C = objArr;
        this.D -= i - iH;
        return iH;
    }

    public final boolean J(j81<? super E, Boolean> j81Var) {
        int iP = P();
        Object[] objArrZ = null;
        pq2 pq2Var = new pq2(objArrZ);
        boolean z = false;
        if (this.B != null) {
            SjP sjPR = r(0);
            int iH = 32;
            while (iH == 32 && sjPR.hasNext()) {
                iH = H(j81Var, (Object[]) sjPR.next(), 32, pq2Var);
            }
            if (iH == 32) {
                int I = I(j81Var, iP, pq2Var);
                if (I == 0) {
                    B(this.D, this.z, this.B);
                }
                if (I != iP) {
                }
            } else {
                int i = (sjPR.w - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iG = iH;
                while (sjPR.hasNext()) {
                    iG = G(j81Var, (Object[]) sjPR.next(), 32, iG, pq2Var, arrayList2, arrayList);
                    i = i;
                }
                int i2 = i;
                int iG2 = G(j81Var, this.C, iP, iG, pq2Var, arrayList2, arrayList);
                Object obj = pq2Var.w;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iG2, 32, (Object) null);
                Object[] objArrC = arrayList.isEmpty() ? this.B : C(this.B, i2, this.z, arrayList.iterator());
                int size = i2 + (arrayList.size() << 5);
                if (!((size & 31) == 0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (size != 0) {
                    int i3 = size - 1;
                    while (true) {
                        int i4 = this.z;
                        if ((i3 >> i4) != 0) {
                            objArrZ = z(i3, i4, objArrC);
                            break;
                        }
                        this.z = i4 - 5;
                        Object[] objArr2 = objArrC[0];
                        if (objArr2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                        objArrC = objArr2;
                    }
                } else {
                    this.z = 0;
                }
                this.B = objArrZ;
                this.C = objArr;
                this.D = size + iG2;
            }
            z = true;
        } else if (I(j81Var, iP, pq2Var) != iP) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] K(Object[] objArr, int i, int i2, pq2 pq2Var) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrS = s(objArr);
            int i4 = i3 + 1;
            System.arraycopy(objArr, i4, objArrS, i3, 32 - i4);
            objArrS[31] = pq2Var.w;
            pq2Var.w = obj;
            return objArrS;
        }
        int iM = objArr[31] == null ? 31 & ((M() - 1) >> i) : 31;
        Object[] objArrS2 = s(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= iM) {
            while (true) {
                Object obj2 = objArrS2[iM];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArrS2[iM] = K((Object[]) obj2, i5, 0, pq2Var);
                if (iM == i6) {
                    break;
                }
                iM--;
            }
        }
        Object obj3 = objArrS2[i3];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrS2[i3] = K((Object[]) obj3, i5, i2, pq2Var);
        return objArrS2;
    }

    public final Object L(Object[] objArr, int i, int i2, int i3) {
        int iA = a() - i;
        if (iA == 1) {
            Object obj = this.C[0];
            B(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.C;
        Object obj2 = objArr2[i3];
        Object[] objArrS = s(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrS, i3, iA - i4);
        objArrS[iA - 1] = null;
        this.B = objArr;
        this.C = objArrS;
        this.D = (i + iA) - 1;
        this.z = i2;
        return obj2;
    }

    public final int M() {
        if (a() <= 32) {
            return 0;
        }
        return (a() - 1) & (-32);
    }

    public final Object[] N(Object[] objArr, int i, int i2, E e, pq2 pq2Var) {
        int i3 = (i2 >> i) & 31;
        Object[] objArrS = s(objArr);
        if (i == 0) {
            if (objArrS != objArr) {
                ((AbstractList) this).modCount++;
            }
            pq2Var.w = objArrS[i3];
            objArrS[i3] = e;
            return objArrS;
        }
        Object obj = objArrS[i3];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrS[i3] = N((Object[]) obj, i - 5, i2, e, pq2Var);
        return objArrS;
    }

    public final void O(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrV;
        if (!(i3 >= 1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] objArrS = s(objArr);
        objArr2[0] = objArrS;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = i2 - i4;
        int i6 = size + i5;
        if (i6 < 32) {
            System.arraycopy(objArrS, i4, objArr3, size + 1, i5);
        } else {
            int i7 = (i6 - 32) + 1;
            if (i3 == 1) {
                objArrV = objArrS;
            } else {
                objArrV = v();
                i3--;
                objArr2[i3] = objArrV;
            }
            int i8 = i2 - i7;
            System.arraycopy(objArrS, i8, objArr3, 0, i2 - i8);
            System.arraycopy(objArrS, i4, objArrV, size + 1, i8 - i4);
            objArr3 = objArrV;
        }
        Iterator<? extends E> it = collection.iterator();
        e(objArrS, i4, it);
        for (int i9 = 1; i9 < i3; i9++) {
            Object[] objArrV2 = v();
            e(objArrV2, 0, it);
            objArr2[i9] = objArrV2;
        }
        e(objArr3, 0, it);
    }

    public final int P() {
        int i = this.D;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.ct
    public final int a() {
        return this.D;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        zc1.d(i, a());
        if (i == a()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM = M();
        if (i >= iM) {
            m(i - iM, e, this.B);
        } else {
            pq2 pq2Var = new pq2((Object) null);
            m(0, pq2Var.w, h(this.B, this.z, i, e, pq2Var));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Object[] objArrV;
        zc1.d(i, this.D);
        if (i == this.D) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.D - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.C;
            Object[] objArrS = s(objArr);
            System.arraycopy(objArr, i3, objArrS, size2 + 1, P() - i3);
            e(objArrS, i3, collection.iterator());
            this.C = objArrS;
            this.D = collection.size() + this.D;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iP = P();
        int size3 = collection.size() + this.D;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= M()) {
            objArrV = v();
            O(collection, i, this.C, iP, objArr2, size, objArrV);
        } else if (size3 > iP) {
            int i4 = size3 - iP;
            objArrV = u(i4, this.C);
            g(collection, i, i4, objArr2, size, objArrV);
        } else {
            Object[] objArr3 = this.C;
            objArrV = v();
            int i5 = iP - size3;
            System.arraycopy(objArr3, i5, objArrV, 0, iP - i5);
            int i6 = 32 - i5;
            Object[] objArrU = u(i6, this.C);
            int i7 = size - 1;
            objArr2[i7] = objArrU;
            g(collection, i, i6, objArr2, i7, objArrU);
        }
        this.B = D(this.B, i2, objArr2);
        this.C = objArrV;
        this.D = collection.size() + this.D;
        return true;
    }

    @Override // defpackage.ct
    public final E b(int i) {
        zc1.c(i, a());
        ((AbstractList) this).modCount++;
        int iM = M();
        if (i >= iM) {
            return (E) L(this.B, iM, this.z, i - iM);
        }
        pq2 pq2Var = new pq2(this.C[0]);
        L(K(this.B, this.z, i, pq2Var), iM, this.z, 0);
        return (E) pq2Var.w;
    }

    public final o13<E> c() {
        t13 t13Var;
        Object[] objArr = this.B;
        if (objArr == this.x && this.C == this.y) {
            t13Var = this.w;
        } else {
            this.A = new su4();
            this.x = objArr;
            Object[] objArr2 = this.C;
            this.y = objArr2;
            if (objArr == null) {
                t13Var = objArr2.length == 0 ? on4.x : new on4(Arrays.copyOf(objArr2, a()));
            } else {
                t13Var = new t13(objArr, objArr2, a(), this.z);
            }
        }
        this.w = t13Var;
        return (o13<E>) t13Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.B == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int i4 = i >> 5;
        SjP sjPR = r(M() >> 5);
        int i5 = i3;
        Object[] objArrU = objArr2;
        while (sjPR.w - 1 != i4) {
            Object[] objArr3 = (Object[]) sjPR.previous();
            int i6 = 32 - i2;
            System.arraycopy(objArr3, i6, objArrU, 0, 32 - i6);
            objArrU = u(i2, objArr3);
            i5--;
            objArr[i5] = objArrU;
        }
        Object[] objArr4 = (Object[]) sjPR.previous();
        int iM = i3 - (((M() >> 5) - 1) - i4);
        if (iM < i3) {
            objArr2 = objArr[iM];
        }
        O(collection, i, objArr4, 32, objArr, iM, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        zc1.c(i, a());
        if (M() <= i) {
            objArr = this.C;
        } else {
            objArr = this.B;
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

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, pq2 pq2Var) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            pq2Var.w = objArr[31];
            Object[] objArrS = s(objArr);
            System.arraycopy(objArr, i3, objArrS, i3 + 1, 31 - i3);
            objArrS[i3] = obj;
            return objArrS;
        }
        Object[] objArrS2 = s(objArr);
        int i4 = i - 5;
        Object obj3 = objArrS2[i3];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrS2[i3] = h((Object[]) obj3, i4, i2, obj, pq2Var);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = objArrS2[i3]) == null) {
                break;
            }
            objArrS2[i3] = h((Object[]) obj2, i4, 0, pq2Var.w, pq2Var);
        }
        return objArrS2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        zc1.d(i, a());
        return new w13(this, i);
    }

    public final void m(int i, Object obj, Object[] objArr) {
        int iP = P();
        Object[] objArrS = s(this.C);
        if (iP < 32) {
            System.arraycopy(this.C, i, objArrS, i + 1, iP - i);
            objArrS[i] = obj;
            this.B = objArr;
            this.C = objArrS;
            this.D = a() + 1;
            return;
        }
        Object[] objArr2 = this.C;
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, objArrS, i + 1, 31 - i);
        objArrS[i] = obj;
        E(objArr, objArrS, y(obj2));
    }

    public final boolean p(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.A;
    }

    public final SjP r(int i) {
        if (this.B == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int iM = M() >> 5;
        zc1.d(i, iM);
        int i2 = this.z;
        if (i2 == 0) {
            return new cl4(this.B, i);
        }
        return new cb5(this.B, i, iM, i2 / 5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        return J(new QnHx(collection));
    }

    public final Object[] s(Object[] objArr) {
        if (objArr == null) {
            return v();
        }
        if (p(objArr)) {
            return objArr;
        }
        Object[] objArrV = v();
        int length = objArr.length;
        NPO.a0(objArr, objArrV, 0, 0, length > 32 ? 32 : length, 6);
        return objArrV;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zc1.c(i, a());
        if (M() > i) {
            pq2 pq2Var = new pq2((Object) null);
            this.B = N(this.B, this.z, i, e, pq2Var);
            return (E) pq2Var.w;
        }
        Object[] objArrS = s(this.C);
        if (objArrS != this.C) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrS[i2];
        objArrS[i2] = e;
        this.C = objArrS;
        return e2;
    }

    public final Object[] u(int i, Object[] objArr) {
        if (p(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, (32 - i) - 0);
            return objArr;
        }
        Object[] objArrV = v();
        System.arraycopy(objArr, 0, objArrV, i, (32 - i) - 0);
        return objArrV;
    }

    public final Object[] v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A;
        return objArr;
    }

    public final Object[] y(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.A;
        return objArr;
    }

    public final Object[] z(int i, int i2, Object[] objArr) {
        if (!(i2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 == 0) {
            return objArr;
        }
        int i3 = (i >> i2) & 31;
        Object obj = objArr[i3];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object objZ = z(i, i2 - 5, (Object[]) obj);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (p(objArr)) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] objArrV = v();
                System.arraycopy(objArr, 0, objArrV, 0, i4 - 0);
                objArr = objArrV;
            }
        }
        if (objZ == objArr[i3]) {
            return objArr;
        }
        Object[] objArrS = s(objArr);
        objArrS[i3] = objZ;
        return objArrS;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iP = P();
        if (iP < 32) {
            Object[] objArrS = s(this.C);
            objArrS[iP] = e;
            this.C = objArrS;
            this.D = a() + 1;
        } else {
            E(this.B, this.C, y(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iP = P();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iP >= collection.size()) {
            Object[] objArrS = s(this.C);
            e(objArrS, iP, it);
            this.C = objArrS;
            this.D = collection.size() + this.D;
        } else {
            int size = ((collection.size() + iP) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrS2 = s(this.C);
            e(objArrS2, iP, it);
            objArr[0] = objArrS2;
            for (int i = 1; i < size; i++) {
                Object[] objArrV = v();
                e(objArrV, 0, it);
                objArr[i] = objArrV;
            }
            this.B = D(this.B, M(), objArr);
            Object[] objArrV2 = v();
            e(objArrV2, 0, it);
            this.C = objArrV2;
            this.D = collection.size() + this.D;
        }
        return true;
    }
}
