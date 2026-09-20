package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zm0 {
    public static final long b;
    public static final long c = fp1.l(Float.NaN, Float.NaN);
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        float f = 0;
        b = fp1.l(f, f);
    }

    public static final float a(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float b(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static String c(long j) {
        if (!(j != c)) {
            return "DpSize.Unspecified";
        }
        return ((Object) wm0.c(b(j))) + " x " + ((Object) wm0.c(a(j)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zm0) {
            return this.a == ((zm0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return c(this.a);
    }
}
