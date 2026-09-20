package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g70 {
    public static final int[] b = {18, 20, 17, 15};
    public static final int[] c = {65535, 262143, 32767, 8191};
    public static final int[] d = {32767, 8191, 65535, 262143};
    public final long a;

    public static final class QnHx {
        public static int a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException(ex0.b("Can't represent a size of ", i, " in Constraints"));
        }

        public static long b(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int iA = a(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int iA2 = a(i6);
            if (iA + iA2 > 31) {
                throw new IllegalArgumentException(bj0.a("Can't represent a width of ", i6, " and height of ", i5, " in Constraints"));
            }
            if (iA2 == 13) {
                j = 3;
            } else if (iA2 == 18) {
                j = 1;
            } else if (iA2 == 15) {
                j = 2;
            } else {
                if (iA2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j = 0;
            }
            int i7 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
            int i8 = i4 != Integer.MAX_VALUE ? i4 + 1 : 0;
            int i9 = g70.b[(int) j];
            return (((long) i7) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i8) << (i9 + 31));
        }

        public static long c(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return b(i, i, i2, i2);
            }
            throw new IllegalArgumentException(bj0.a("width(", i, ") and height(", i2, ") must be >= 0").toString());
        }

        public static long d(int i) {
            if (i >= 0) {
                return b(0, Integer.MAX_VALUE, i, i);
            }
            throw new IllegalArgumentException(ex0.b("height(", i, ") must be >= 0").toString());
        }
    }

    public /* synthetic */ g70(long j) {
        this.a = j;
    }

    public static long a(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = j(j);
        }
        if ((i5 & 2) != 0) {
            i2 = h(j);
        }
        if ((i5 & 4) != 0) {
            i3 = i(j);
        }
        if ((i5 & 8) != 0) {
            i4 = g(j);
        }
        if (!(i3 >= 0 && i >= 0)) {
            throw new IllegalArgumentException(bj0.a("minHeight(", i3, ") and minWidth(", i, ") must be >= 0").toString());
        }
        if (!(i2 >= i || i2 == Integer.MAX_VALUE)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
            return QnHx.b(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final boolean c(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> (b[i] + 31))) & d[i]) != 0;
    }

    public static final boolean d(long j) {
        return (((int) (j >> 33)) & c[(int) (3 & j)]) != 0;
    }

    public static final boolean e(long j) {
        return g(j) == i(j);
    }

    public static final boolean f(long j) {
        return h(j) == j(j);
    }

    public static final int g(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> (b[i] + 31))) & d[i];
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final int h(long j) {
        int i = ((int) (j >> 33)) & c[(int) (3 & j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int i(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> b[i])) & d[i];
    }

    public static final int j(long j) {
        return ((int) (j >> 2)) & c[(int) (3 & j)];
    }

    public static String k(long j) {
        int iH = h(j);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j);
        return "Constraints(minWidth = " + j(j) + ", maxWidth = " + strValueOf + ", minHeight = " + i(j) + ", maxHeight = " + (iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity") + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g70) {
            return this.a == ((g70) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return k(this.a);
    }
}
