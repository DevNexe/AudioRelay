package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yh3 {
    public static final QnHx w = new QnHx(0);
    public static final yh3 x = c53.a.b();

    public static final class QnHx extends yh3 implements Serializable {
        public QnHx(int i) {
        }

        @Override // defpackage.yh3
        public final int a(int i) {
            return yh3.x.a(i);
        }

        @Override // defpackage.yh3
        public final byte[] b(byte[] bArr) {
            return yh3.x.b(bArr);
        }

        @Override // defpackage.yh3
        public final byte[] c(byte[] bArr, int i) {
            return yh3.x.c(bArr, i);
        }

        @Override // defpackage.yh3
        public final int d() {
            return yh3.x.d();
        }

        @Override // defpackage.yh3
        public final int e(int i, int i2) {
            return yh3.x.e(i, i2);
        }
    }

    public abstract int a(int i);

    public byte[] b(byte[] bArr) {
        return c(bArr, bArr.length);
    }

    public byte[] c(byte[] bArr, int i) {
        if (!(new pp1(0, bArr.length).g(0) && new pp1(0, bArr.length).g(i))) {
            throw new IllegalArgumentException(qc0.a(iZUl.c("fromIndex (0) or toIndex (", i, ") are out of range: 0.."), bArr.length, '.').toString());
        }
        if (!(i >= 0)) {
            throw new IllegalArgumentException(ex0.b("fromIndex (0) must be not greater than toIndex (", i, ").").toString());
        }
        int i2 = (i + 0) / 4;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int iD = d();
            bArr[i3] = (byte) iD;
            bArr[i3 + 1] = (byte) (iD >>> 8);
            bArr[i3 + 2] = (byte) (iD >>> 16);
            bArr[i3 + 3] = (byte) (iD >>> 24);
            i3 += 4;
        }
        int i5 = i - i3;
        int iA = a(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i3 + i6] = (byte) (iA >>> (i6 * 8));
        }
        return bArr;
    }

    public abstract int d();

    public int e(int i, int i2) {
        int iD;
        int i3;
        int iA;
        int iD2;
        if (!(i2 > i)) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i2) + ").").toString());
        }
        int i4 = i2 - i;
        if (i4 <= 0 && i4 != Integer.MIN_VALUE) {
            do {
                iD2 = d();
            } while (!(i <= iD2 && iD2 < i2));
            return iD2;
        }
        if (((-i4) & i4) == i4) {
            iA = a(31 - Integer.numberOfLeadingZeros(i4));
        } else {
            do {
                iD = d() >>> 1;
                i3 = iD % i4;
            } while ((i4 - 1) + (iD - i3) < 0);
            iA = i3;
        }
        return i + iA;
    }
}
