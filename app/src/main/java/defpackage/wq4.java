package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wq4<E> implements Cloneable {
    public static final Object A = new Object();
    public boolean w = false;
    public int[] x;
    public Object[] y;
    public int z;

    public wq4() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.x = new int[i4];
        this.y = new Object[i4];
    }

    public final void a(int i, E e) {
        int i2 = this.z;
        if (i2 != 0 && i <= this.x[i2 - 1]) {
            j(i, e);
            return;
        }
        if (this.w && i2 >= this.x.length) {
            h();
        }
        int i3 = this.z;
        if (i3 >= this.x.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.x;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.y;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.x = iArr;
            this.y = objArr;
        }
        this.x[i3] = i;
        this.y[i3] = e;
        this.z = i3 + 1;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final wq4<E> clone() {
        try {
            wq4<E> wq4Var = (wq4) super.clone();
            wq4Var.x = (int[]) this.x.clone();
            wq4Var.y = (Object[]) this.y.clone();
            return wq4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean d(int i) {
        if (this.w) {
            h();
        }
        return o70.c(this.z, i, this.x) >= 0;
    }

    public final void h() {
        int i = this.z;
        int[] iArr = this.x;
        Object[] objArr = this.y;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.w = false;
        this.z = i2;
    }

    public final Object i(int i, Integer num) {
        Object obj;
        int iC = o70.c(this.z, i, this.x);
        return (iC < 0 || (obj = this.y[iC]) == A) ? num : obj;
    }

    public final void j(int i, E e) {
        int iC = o70.c(this.z, i, this.x);
        if (iC >= 0) {
            this.y[iC] = e;
            return;
        }
        int i2 = ~iC;
        int i3 = this.z;
        if (i2 < i3) {
            Object[] objArr = this.y;
            if (objArr[i2] == A) {
                this.x[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.w && i3 >= this.x.length) {
            h();
            i2 = ~o70.c(this.z, i, this.x);
        }
        int i4 = this.z;
        if (i4 >= this.x.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.x;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.y;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.x = iArr;
            this.y = objArr2;
        }
        int i9 = this.z - i2;
        if (i9 != 0) {
            int[] iArr3 = this.x;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.y;
            System.arraycopy(objArr4, i2, objArr4, i10, this.z - i2);
        }
        this.x[i2] = i;
        this.y[i2] = e;
        this.z++;
    }

    public final int k() {
        if (this.w) {
            h();
        }
        return this.z;
    }

    public final E l(int i) {
        if (this.w) {
            h();
        }
        return (E) this.y[i];
    }

    public final String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.z * 28);
        sb.append('{');
        for (int i = 0; i < this.z; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.w) {
                h();
            }
            sb.append(this.x[i]);
            sb.append('=');
            E eL = l(i);
            if (eL != this) {
                sb.append(eL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
