package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym0 {
    public static final long b;
    public static final /* synthetic */ int c = 0;
    public final long a;

    static {
        float f = 0;
        fp1.k(f, f);
        b = fp1.k(Float.NaN, Float.NaN);
    }

    public /* synthetic */ ym0(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float b(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ym0) {
            return this.a == ((ym0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = b;
        long j2 = this.a;
        if (!(j2 != j)) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) wm0.c(a(j2))) + ", " + ((Object) wm0.c(b(j2))) + ')';
    }
}
