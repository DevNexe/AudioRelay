package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2X<E> implements Cloneable {
    public static byte[] A04;
    public static final Object A05;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{19, 79, 83, 82, 72, 27, 118, 90, 75, 18, 91, 87, 51, 53};
    }

    static {
        A05();
        A05 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C2X() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C2X(int i) {
        this.A01 = false;
        if (i == 0) {
            this.A02 = C2W.A01;
            this.A03 = C2W.A02;
        } else {
            int iA00 = C2W.A00(i);
            this.A02 = new long[iA00];
            this.A03 = new Object[iA00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i) {
        if (this.A01) {
            A04();
        }
        return this.A02[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C2X<E> clone() {
        C2X<E> c2x = null;
        try {
            c2x = (C2X) super.clone();
            c2x.A02 = (long[]) this.A02.clone();
            c2x.A03 = (Object[]) this.A03.clone();
            return c2x;
        } catch (CloneNotSupportedException unused) {
            return c2x;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final E A02(long j, E e) {
        int iA03 = C2W.A03(this.A02, this.A00, j);
        if (iA03 >= 0) {
            Object[] objArr = this.A03;
            if (objArr[iA03] != A05) {
                return (E) objArr[iA03];
            }
        }
        return e;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int o = this.A00;
        int i = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < o; i2++) {
            Object obj = objArr[i2];
            if (obj != A05) {
                if (i2 != i) {
                    jArr[i] = jArr[i2];
                    objArr[i] = obj;
                    objArr[i2] = null;
                }
                i++;
            }
        }
        this.A01 = false;
        this.A00 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j) {
        return A02(j, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i) {
        Object[] objArr = this.A03;
        Object obj = objArr[i];
        Object obj2 = A05;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.A01 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0B(long j, E e) {
        int iA03 = C2W.A03(this.A02, this.A00, j);
        if (iA03 >= 0) {
            this.A03[iA03] = e;
            return;
        }
        int iA04 = iA03 ^ (-1);
        if (iA04 < this.A00) {
            Object[] objArr = this.A03;
            if (objArr[iA04] == A05) {
                this.A02[iA04] = j;
                objArr[iA04] = e;
                return;
            }
        }
        if (this.A01 && this.A00 >= this.A02.length) {
            A04();
            iA04 = C2W.A03(this.A02, this.A00, j) ^ (-1);
        }
        int i = this.A00;
        if (i >= this.A02.length) {
            int iA00 = C2W.A00(i + 1);
            long[] jArr = new long[iA00];
            Object[] objArr2 = new Object[iA00];
            long[] jArr2 = this.A02;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr;
            this.A03 = objArr2;
        }
        int i2 = this.A00;
        if (i2 - iA04 != 0) {
            long[] jArr3 = this.A02;
            System.arraycopy(jArr3, iA04, jArr3, iA04 + 1, i2 - iA04);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, iA04, objArr4, iA04 + 1, this.A00 - iA04);
        }
        this.A02[iA04] = j;
        this.A03[iA04] = e;
        this.A00++;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final String toString() {
        if (A06() <= 0) {
            return A03(12, 2, 126);
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < i; i++) {
            if (i > 0) {
                sb.append(A03(10, 2, 65));
            }
            sb.append(A00(i));
            sb.append('=');
            Object value = A07(i);
            if (value != this) {
                sb.append(value);
            } else {
                sb.append(A03(0, 10, 13));
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
