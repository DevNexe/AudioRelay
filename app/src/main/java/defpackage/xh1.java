package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xh1<T> {
    public int[] a;
    public Object[] b;
    public wh1<T>[] c;
    public int d;

    public xh1() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.a = iArr;
        this.b = new Object[50];
        this.c = new wh1[50];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Object obj, Object obj2) {
        int iB;
        wh1<T> wh1Var;
        if (this.d > 0) {
            iB = b(obj);
            if (iB >= 0) {
                wh1Var = e(iB);
            }
            wh1Var.add(obj2);
        }
        iB = -1;
        int i = -(iB + 1);
        int i2 = this.d;
        int[] iArr = this.a;
        if (i2 < iArr.length) {
            int i3 = iArr[i2];
            this.b[i3] = obj;
            wh1Var = this.c[i3];
            if (wh1Var == null) {
                wh1Var = new wh1<>();
                this.c[i3] = wh1Var;
            }
            int i4 = this.d;
            if (i < i4) {
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i + 1, i4 - i);
            }
            this.a[i] = i3;
            this.d++;
        } else {
            int length = iArr.length * 2;
            this.c = (wh1[]) Arrays.copyOf(this.c, length);
            wh1<T> wh1Var2 = new wh1<>();
            this.c[i2] = wh1Var2;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, length);
            this.b = objArrCopyOf;
            objArrCopyOf[i2] = obj;
            int[] iArr3 = new int[length];
            int i5 = this.d;
            while (true) {
                i5++;
                if (i5 >= length) {
                    break;
                } else {
                    iArr3[i5] = i5;
                }
            }
            int i6 = this.d;
            if (i < i6) {
                System.arraycopy(this.a, i, iArr3, i + 1, i6 - i);
            }
            iArr3[i] = i2;
            if (i > 0) {
                NPO.Z(this.a, iArr3, i, 6);
            }
            this.a = iArr3;
            this.d++;
            wh1Var = wh1Var2;
        }
        wh1Var.add(obj2);
    }

    public final int b(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = this.d - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.b[this.a[i3]];
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i2 = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj == obj2) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.b[this.a[i4]];
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.d;
                    while (i5 < i6) {
                        Object obj4 = this.b[this.a[i5]];
                        if (obj4 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i5 + 1);
                        }
                        i5++;
                    }
                    i5 = this.d;
                    return -(i5 + 1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final boolean c(Object obj, tk3 tk3Var) {
        int i;
        wh1<T> wh1Var;
        int iB = b(obj);
        if (iB < 0 || (wh1Var = this.c[(i = this.a[iB])]) == null) {
            return false;
        }
        boolean zRemove = wh1Var.remove(tk3Var);
        if (wh1Var.w == 0) {
            int i2 = iB + 1;
            int i3 = this.d;
            if (i2 < i3) {
                int[] iArr = this.a;
                System.arraycopy(iArr, i2, iArr, iB, i3 - i2);
            }
            int[] iArr2 = this.a;
            int i4 = this.d - 1;
            iArr2[i4] = i;
            this.b[i] = null;
            this.d = i4;
        }
        return zRemove;
    }

    public final void d(T t) {
        int i = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.a[i3];
            wh1<T> wh1Var = this.c[i4];
            wh1Var.remove(t);
            if (wh1Var.w > 0) {
                if (i2 != i3) {
                    int[] iArr = this.a;
                    int i5 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i5;
                }
                i2++;
            }
        }
        int i6 = this.d;
        for (int i7 = i2; i7 < i6; i7++) {
            this.b[this.a[i7]] = null;
        }
        this.d = i2;
    }

    public final wh1<T> e(int i) {
        return this.c[this.a[i]];
    }
}
