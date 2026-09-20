package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class on4<E> extends Com1Fixed<E> implements jj1<E> {
    public static final on4 x = new on4(new Object[0]);
    public final Object[] w;

    public on4(Object[] objArr) {
        this.w = objArr;
    }

    @Override // defpackage.auxFixed
    public final int a() {
        return this.w.length;
    }

    @Override // java.util.List, defpackage.o13
    public final o13<E> add(int i, E e) {
        Object[] objArr = this.w;
        zc1.d(i, objArr.length);
        Object[] objArr2 = this.w;
        if (i == objArr2.length) {
            return add((Object) e);
        }
        if (objArr2.length < 32) {
            Object[] objArr3 = new Object[objArr2.length + 1];
            NPO.a0(objArr2, objArr3, 0, 0, i, 6);
            System.arraycopy(objArr2, i, objArr3, i + 1, objArr.length - i);
            objArr3[i] = e;
            return new on4(objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        System.arraycopy(objArr2, i, objArrCopyOf, i + 1, (objArr.length - 1) - i);
        objArrCopyOf[i] = e;
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr2[31];
        return new t13(objArrCopyOf, objArr4, objArr.length + 1, 0);
    }

    @Override // defpackage.Com1Fixed, java.util.Collection, java.util.List, defpackage.o13
    public final o13<E> addAll(Collection<? extends E> collection) {
        Object[] objArr = this.w;
        if (collection.size() + objArr.length > 32) {
            u13 u13VarBuilder = builder();
            u13VarBuilder.addAll(collection);
            return u13VarBuilder.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new on4(objArrCopyOf);
    }

    @Override // defpackage.o13
    public final u13 builder() {
        return new u13(this, null, this.w, 0);
    }

    @Override // defpackage.ck32, java.util.List
    public final E get(int i) {
        zc1.c(i, a());
        return (E) this.w[i];
    }

    @Override // defpackage.ck32, java.util.List
    public final int indexOf(Object obj) {
        return oV9.g0(this.w, obj);
    }

    @Override // defpackage.o13
    public final o13 j(Com1Fixed.QnHx qnHx) {
        Object[] objArr = this.w;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) qnHx.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return x;
        }
        AY.t(length, objArrCopyOf.length);
        return new on4(Arrays.copyOfRange(objArrCopyOf, 0, length));
    }

    @Override // defpackage.o13
    public final o13<E> k(int i) {
        zc1.c(i, a());
        if (a() == 1) {
            return x;
        }
        int iA = a() - 1;
        Object[] objArr = this.w;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, iA);
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArrCopyOf, i, a() - i2);
        return new on4(objArrCopyOf);
    }

    @Override // defpackage.ck32, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.w;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (ur1.a(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    @Override // defpackage.ck32, java.util.List
    public final ListIterator<E> listIterator(int i) {
        zc1.d(i, a());
        return new kg(i, a(), this.w);
    }

    @Override // defpackage.ck32, java.util.List
    public final o13<E> set(int i, E e) {
        zc1.c(i, a());
        Object[] objArr = this.w;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = e;
        return new on4(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, defpackage.o13
    public final o13<E> add(E e) {
        Object[] objArr = this.w;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = e;
            return new on4(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new t13(objArr, objArr2, objArr.length + 1, 0);
    }
}
