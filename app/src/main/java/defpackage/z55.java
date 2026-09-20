package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z55 {
    public static final a65[] b = {new a65(0), new a65(4294967296L), new a65(8589934592L)};
    public static final long c = FWT.G(0, Float.NaN);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String e(long j) {
        long jB = b(j);
        if (a65.a(jB, 0L)) {
            return "Unspecified";
        }
        if (a65.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!a65.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z55) {
            return this.a == ((z55) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return d(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
