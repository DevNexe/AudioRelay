package defpackage;

import com.facebook.ads.AdError;
import com.revenuecat.purchases.common.UtilsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class gq0 implements Comparable<gq0> {
    public static final QnHx x = new QnHx();
    public static final long y;
    public static final long z;
    public final long w;

    public static final class QnHx {
    }

    static {
        int i = iq0.a;
        y = ps0.y(4611686018427387903L);
        z = ps0.y(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / ((long) UtilsKt.MICROS_MULTIPLIER);
        long j4 = j + j3;
        if (!new o62(-4611686018426L, 4611686018426L).f(j4)) {
            return ps0.y(AY.p(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return ps0.A(ps0.O(j4) + (j2 - ps0.O(j3)));
    }

    public static final void c(StringBuilder sb, int i, int i2, int i3, String str, boolean z2) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strK = mv4.K(String.valueOf(i2), i3);
            int i4 = -1;
            int length = strK.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strK.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z2 || i6 >= 3) {
                sb.append((CharSequence) strK, 0, ((i6 + 2) / 3) * 3);
            } else {
                sb.append((CharSequence) strK, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int d(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i : i;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final long g(long j) {
        return (((((int) j) & 1) == 1) && (n(j) ^ true)) ? j >> 1 : p(j, kq0.MILLISECONDS);
    }

    public static final int l(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ps0.O((j >> 1) % ((long) AdError.NETWORK_ERROR_CODE)) : (j >> 1) % ((long) 1000000000));
    }

    public static int m(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final boolean n(long j) {
        return j == y || j == z;
    }

    public static final long o(long j, long j2) {
        if (n(j)) {
            if ((!n(j2)) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (n(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? ps0.f(j3) : ps0.z(j3);
    }

    public static final long p(long j, kq0 kq0Var) {
        if (j == y) {
            return Long.MAX_VALUE;
        }
        if (j == z) {
            return Long.MIN_VALUE;
        }
        return kq0Var.w.convert(j >> 1, ((((int) j) & 1) == 0 ? kq0.NANOSECONDS : kq0.MILLISECONDS).w);
    }

    public static String q(long j) {
        int i;
        long j2 = j;
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == y) {
            return "Infinity";
        }
        if (j2 == z) {
            return "-Infinity";
        }
        boolean z2 = j2 < 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        if (j2 < 0) {
            j2 = ((long) (((int) j2) & 1)) + ((-(j2 >> 1)) << 1);
            int i2 = iq0.a;
        }
        long jP = p(j2, kq0.DAYS);
        int iP = n(j2) ? 0 : (int) (p(j2, kq0.HOURS) % ((long) 24));
        int iP2 = n(j2) ? 0 : (int) (p(j2, kq0.MINUTES) % ((long) 60));
        int iP3 = n(j2) ? 0 : (int) (p(j2, kq0.SECONDS) % ((long) 60));
        int iL = l(j2);
        boolean z3 = jP != 0;
        boolean z4 = iP != 0;
        boolean z5 = iP2 != 0;
        boolean z6 = (iP3 == 0 && iL == 0) ? false : true;
        if (z3) {
            sb.append(jP);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iP);
            sb.append('h');
            i = i3;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iP2);
            sb.append('m');
            i = i4;
        }
        if (z6) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iP3 != 0 || z3 || z4 || z5) {
                c(sb, iP3, iL, 9, "s", false);
            } else if (iL >= 1000000) {
                c(sb, iL / UtilsKt.MICROS_MULTIPLIER, iL % UtilsKt.MICROS_MULTIPLIER, 6, "ms", false);
            } else if (iL >= 1000) {
                c(sb, iL / AdError.NETWORK_ERROR_CODE, iL % AdError.NETWORK_ERROR_CODE, 3, "us", false);
            } else {
                sb.append(iL);
                sb.append("ns");
            }
            i = i5;
        }
        if (z2 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(gq0 gq0Var) {
        return d(this.w, gq0Var.w);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gq0) {
            return this.w == ((gq0) obj).w;
        }
        return false;
    }

    public final int hashCode() {
        return m(this.w);
    }

    public final String toString() {
        return q(this.w);
    }
}
