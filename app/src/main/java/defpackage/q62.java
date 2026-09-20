package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q62<E> implements Cloneable {
    public static final Object A = new Object();
    public boolean w = false;
    public long[] x;
    public Object[] y;
    public int z;

    public q62() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.x = new long[i4];
        this.y = new Object[i4];
    }

    public final void a(long j, Long l) {
        int i = this.z;
        if (i != 0 && j <= this.x[i - 1]) {
            j(j, l);
            return;
        }
        if (this.w && i >= this.x.length) {
            h();
        }
        int i2 = this.z;
        if (i2 >= this.x.length) {
            int i3 = (i2 + 1) * 8;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.x;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.y;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.x = jArr;
            this.y = objArr;
        }
        this.x[i2] = j;
        this.y[i2] = l;
        this.z = i2 + 1;
    }

    public final void c() {
        int i = this.z;
        Object[] objArr = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.z = 0;
        this.w = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final q62<E> clone() {
        try {
            q62<E> q62Var = (q62) super.clone();
            q62Var.x = (long[]) this.x.clone();
            q62Var.y = (Object[]) this.y.clone();
            return q62Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void h() {
        int i = this.z;
        long[] jArr = this.x;
        Object[] objArr = this.y;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.w = false;
        this.z = i2;
    }

    public final Object i(long j, Long l) {
        Object obj;
        int iD = o70.d(this.x, this.z, j);
        return (iD < 0 || (obj = this.y[iD]) == A) ? l : obj;
    }

    public final void j(long j, E e) {
        int iD = o70.d(this.x, this.z, j);
        if (iD >= 0) {
            this.y[iD] = e;
            return;
        }
        int i = ~iD;
        int i2 = this.z;
        if (i < i2) {
            Object[] objArr = this.y;
            if (objArr[i] == A) {
                this.x[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.w && i2 >= this.x.length) {
            h();
            i = ~o70.d(this.x, this.z, j);
        }
        int i3 = this.z;
        if (i3 >= this.x.length) {
            int i4 = (i3 + 1) * 8;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.x;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.y;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.x = jArr;
            this.y = objArr2;
        }
        int i8 = this.z - i;
        if (i8 != 0) {
            long[] jArr3 = this.x;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.y;
            System.arraycopy(objArr4, i, objArr4, i9, this.z - i);
        }
        this.x[i] = j;
        this.y[i] = e;
        this.z++;
    }

    public final E k(int i) {
        if (this.w) {
            h();
        }
        return (E) this.y[i];
    }

    public final String toString() {
        if (this.w) {
            h();
        }
        int i = this.z;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.z; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.w) {
                h();
            }
            sb.append(this.x[i2]);
            sb.append('=');
            E eK = k(i2);
            if (eK != this) {
                sb.append(eK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
