package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kt2 {
    public static final long b = X.a(0.0f, 0.0f);
    public static final long c = X.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long d = X.a(Float.NaN, Float.NaN);
    public static final /* synthetic */ int e = 0;
    public final long a;

    public /* synthetic */ kt2(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final float b(long j) {
        return (float) Math.sqrt((d(j) * d(j)) + (c(j) * c(j)));
    }

    public static final float c(long j) {
        if (j != d) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float d(long j) {
        if (j != d) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static int e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final long f(long j, long j2) {
        return X.a(c(j) - c(j2), d(j) - d(j2));
    }

    public static final long g(long j, long j2) {
        return X.a(c(j2) + c(j), d(j2) + d(j));
    }

    public static final long h(long j, float f) {
        return X.a(c(j) * f, d(j) * f);
    }

    public static String i(long j) {
        if (!X.w(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + fp1.A0(c(j)) + ", " + fp1.A0(d(j)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kt2) {
            return this.a == ((kt2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return e(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
