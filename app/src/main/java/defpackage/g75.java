package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g75 {
    public final int a;
    public final long[] b;
    public final Object[] c;

    public g75(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    public final int a(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        long[] jArr = this.b;
        int i2 = 0;
        if (i == 0) {
            long j2 = jArr[0];
            if (j2 == j) {
                return 0;
            }
            return j2 > j ? -2 : -1;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = jArr[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final g75 b(long j, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.c;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] != null) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr2 = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                jArr = this.b;
                i = this.a;
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = jArr[i6];
                Object obj2 = objArr[i6];
                if (j2 > j) {
                    jArr2[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr2[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr2[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = jArr[i6];
                    Object obj3 = objArr[i6];
                    if (obj3 != null) {
                        jArr2[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new g75(i5, jArr2, objArr2);
    }
}
