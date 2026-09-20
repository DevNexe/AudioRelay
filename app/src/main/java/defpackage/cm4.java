package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cm4 {
    public static final long b = ps0.e(0.0f, 0.0f);
    public static final long c = ps0.e(Float.NaN, Float.NaN);
    public static final /* synthetic */ int d = 0;
    public final long a;

    public /* synthetic */ cm4(long j) {
        this.a = j;
    }

    public static boolean a(long j, Object obj) {
        return (obj instanceof cm4) && j == ((cm4) obj).a;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final float c(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float d(long j) {
        return Math.min(Math.abs(e(j)), Math.abs(c(j)));
    }

    public static final float e(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static String f(long j) {
        if (!(j != c)) {
            return "Size.Unspecified";
        }
        return "Size(" + fp1.A0(e(j)) + ", " + fp1.A0(c(j)) + ')';
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return f(this.a);
    }
}
