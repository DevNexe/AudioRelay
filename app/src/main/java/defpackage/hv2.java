package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hv2<T> {
    public int a;
    public int b;
    public int c;
    public T[] d;

    public hv2() {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.a = iNumberOfLeadingZeros - 1;
        this.c = (int) (iNumberOfLeadingZeros * 0.75f);
        this.d = (T[]) new Object[iNumberOfLeadingZeros];
    }

    public final void a(Object obj) {
        T t;
        Object obj2;
        Object[] objArr = this.d;
        int i = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return;
        }
        objArr[i2] = obj;
        int i3 = this.b + 1;
        this.b = i3;
        if (i3 < this.c) {
            return;
        }
        T[] tArr = this.d;
        int length = tArr.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        T[] tArr2 = (T[]) new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.a = i5;
                this.c = (int) (i4 * 0.75f);
                this.d = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iHashCode2 = t.hashCode() * (-1640531527);
            int i7 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i5;
            if (tArr2[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (tArr2[i7] != null);
            }
            tArr2[i7] = tArr[length];
            i3 = i6;
        }
    }

    public final void b(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        } else {
                            i4 = i3 + 1;
                        }
                    } else if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else {
                    objArr[i] = null;
                    return;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
