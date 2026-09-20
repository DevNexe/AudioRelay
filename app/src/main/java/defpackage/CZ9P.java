package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class CZ9P {
    public static final byN a = new byN();
    public static final F1 b = new F1();
    public static final EQ c = new EQ();
    public static final QnHx d = new QnHx();
    public static final CQf e = new CQf();
    public static final YKK f;

    public static final class CQf implements LPt8Fixed, FJCM {
        public final float a = 0;

        @Override // CZ9P.LPt8Fixed, CZ9P.FJCM
        public final float a() {
            return this.a;
        }

        @Override // CZ9P.FJCM
        public final void b(ij0 ij0Var, int i, int[] iArr, int[] iArr2) {
            CZ9P.a(i, iArr, iArr2, false);
        }

        @Override // CZ9P.LPt8Fixed
        public final void c(int i, ij0 ij0Var, jy1 jy1Var, int[] iArr, int[] iArr2) {
            if (jy1Var == jy1.Ltr) {
                CZ9P.a(i, iArr, iArr2, false);
            } else {
                CZ9P.a(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    public static final class EQ implements FJCM {
        @Override // CZ9P.FJCM
        public final float a() {
            return 0;
        }

        @Override // CZ9P.FJCM
        public final void b(ij0 ij0Var, int i, int[] iArr, int[] iArr2) {
            CZ9P.b(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    public static final class F1 implements LPt8Fixed {
        @Override // CZ9P.LPt8Fixed, CZ9P.FJCM
        public final float a() {
            return 0;
        }

        @Override // CZ9P.LPt8Fixed
        public final void c(int i, ij0 ij0Var, jy1 jy1Var, int[] iArr, int[] iArr2) {
            if (jy1Var == jy1.Ltr) {
                CZ9P.c(i, iArr, iArr2, false);
            } else {
                CZ9P.b(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    public interface FJCM {
        float a();

        void b(ij0 ij0Var, int i, int[] iArr, int[] iArr2);
    }

    public interface LPt8Fixed {
        float a();

        void c(int i, ij0 ij0Var, jy1 jy1Var, int[] iArr, int[] iArr2);
    }

    public static final class NUlFixed implements LPt8Fixed, FJCM {
        public final float a = 0;

        @Override // CZ9P.LPt8Fixed, CZ9P.FJCM
        public final float a() {
            return this.a;
        }

        @Override // CZ9P.FJCM
        public final void b(ij0 ij0Var, int i, int[] iArr, int[] iArr2) {
            CZ9P.d(i, iArr, iArr2, false);
        }

        @Override // CZ9P.LPt8Fixed
        public final void c(int i, ij0 ij0Var, jy1 jy1Var, int[] iArr, int[] iArr2) {
            if (jy1Var == jy1.Ltr) {
                CZ9P.d(i, iArr, iArr2, false);
            } else {
                CZ9P.d(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    public static final class QnHx implements FJCM {
        @Override // CZ9P.FJCM
        public final float a() {
            return 0;
        }

        @Override // CZ9P.FJCM
        public final void b(ij0 ij0Var, int i, int[] iArr, int[] iArr2) {
            CZ9P.c(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    public static final class T23 implements LPt8Fixed, FJCM {
        public final float a;
        public final boolean b;
        public final x81<Integer, jy1, Integer> c;
        public final float d;

        public T23() {
            throw null;
        }

        public T23(float f, boolean z, x81 x81Var) {
            this.a = f;
            this.b = z;
            this.c = x81Var;
            this.d = f;
        }

        @Override // CZ9P.LPt8Fixed, CZ9P.FJCM
        public final float a() {
            return this.d;
        }

        @Override // CZ9P.FJCM
        public final void b(ij0 ij0Var, int i, int[] iArr, int[] iArr2) {
            c(i, ij0Var, jy1.Ltr, iArr, iArr2);
        }

        @Override // CZ9P.LPt8Fixed
        public final void c(int i, ij0 ij0Var, jy1 jy1Var, int[] iArr, int[] iArr2) {
            int i2;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iP0 = ij0Var.p0(this.a);
            boolean z = this.b && jy1Var == jy1.Rtl;
            byN byn = CZ9P.a;
            if (z) {
                i2 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i3 = iArr[length];
                    int iMin2 = Math.min(i2, i - i3);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iP0, (i - iMin2) - i3);
                    i2 = iArr2[length] + i3 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i4 = 0;
                i2 = 0;
                iMin = 0;
                int i5 = 0;
                while (i4 < length2) {
                    int i6 = iArr[i4];
                    int iMin3 = Math.min(i2, i - i6);
                    iArr2[i5] = iMin3;
                    int iMin4 = Math.min(iP0, (i - iMin3) - i6);
                    int i7 = iArr2[i5] + i6 + iMin4;
                    i4++;
                    i5++;
                    iMin = iMin4;
                    i2 = i7;
                }
            }
            int i8 = i2 - iMin;
            x81<Integer, jy1, Integer> x81Var = this.c;
            if (x81Var == null || i8 >= i) {
                return;
            }
            int iIntValue = x81Var.invoke(Integer.valueOf(i - i8), jy1Var).intValue();
            int length3 = iArr2.length;
            for (int i9 = 0; i9 < length3; i9++) {
                iArr2[i9] = iArr2[i9] + iIntValue;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof T23)) {
                return false;
            }
            T23 t23 = (T23) obj;
            return wm0.a(this.a, t23.a) && this.b == t23.b && ur1.a(this.c, t23.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public final int hashCode() {
            int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
            boolean z = this.b;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iFloatToIntBits + r1) * 31;
            x81<Integer, jy1, Integer> x81Var = this.c;
            return i + (x81Var == null ? 0 : x81Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) wm0.c(this.a));
            sb.append(", ");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class YKK implements LPt8Fixed, FJCM {
        public final float a = 0;

        @Override // CZ9P.LPt8Fixed, CZ9P.FJCM
        public final float a() {
            return this.a;
        }

        @Override // CZ9P.FJCM
        public final void b(ij0 ij0Var, int i, int[] iArr, int[] iArr2) {
            CZ9P.e(i, iArr, iArr2, false);
        }

        @Override // CZ9P.LPt8Fixed
        public final void c(int i, ij0 ij0Var, jy1 jy1Var, int[] iArr, int[] iArr2) {
            if (jy1Var == jy1.Ltr) {
                CZ9P.e(i, iArr, iArr2, false);
            } else {
                CZ9P.e(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    public static final class auxFixed implements LPt8Fixed, FJCM {
        public final float a = 0;

        @Override // CZ9P.LPt8Fixed, CZ9P.FJCM
        public final float a() {
            return this.a;
        }

        @Override // CZ9P.FJCM
        public final void b(ij0 ij0Var, int i, int[] iArr, int[] iArr2) {
            CZ9P.f(i, iArr, iArr2, false);
        }

        @Override // CZ9P.LPt8Fixed
        public final void c(int i, ij0 ij0Var, jy1 jy1Var, int[] iArr, int[] iArr2) {
            if (jy1Var == jy1.Ltr) {
                CZ9P.f(i, iArr, iArr2, false);
            } else {
                CZ9P.f(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    public static final class byN implements LPt8Fixed {
        @Override // CZ9P.LPt8Fixed, CZ9P.FJCM
        public final float a() {
            return 0;
        }

        @Override // CZ9P.LPt8Fixed
        public final void c(int i, ij0 ij0Var, jy1 jy1Var, int[] iArr, int[] iArr2) {
            if (jy1Var == jy1.Ltr) {
                CZ9P.b(iArr, iArr2, false);
            } else {
                CZ9P.c(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    static {
        new auxFixed();
        f = new YKK();
        new NUlFixed();
    }

    public static void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = (i - i3) / 2;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = sy4.c(f2);
                f2 += i5;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = sy4.c(f2);
            f2 += i7;
            i2++;
            i6++;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i2 = iArr[length];
                iArr2[length] = i;
                i += i2;
            }
            return;
        }
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            int i5 = iArr[i];
            iArr2[i3] = i4;
            i4 += i5;
            i++;
            i3++;
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = i5;
                i5 += i6;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i2 < length2) {
            int i8 = iArr[i2];
            iArr2[i7] = i5;
            i5 += i8;
            i2++;
            i7++;
        }
    }

    public static void d(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (iArr.length == 0) ^ true ? (i - i3) / iArr.length : 0.0f;
        float f2 = length / 2;
        if (z) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = sy4.c(f2);
                f2 += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = sy4.c(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    public static void e(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = 0.0f;
        float length = iArr.length > 1 ? (i - i3) / (iArr.length - 1) : 0.0f;
        if (z) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = sy4.c(f2);
                f2 += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = sy4.c(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    public static void f(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = sy4.c(f2);
                f2 += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = sy4.c(f3);
            f3 += i7 + length;
            i2++;
            i6++;
        }
    }
}
