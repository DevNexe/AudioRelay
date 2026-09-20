package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mh5 {
    public static final long b = XTd3.c(0.0f, 0.0f);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ mh5(long j) {
        this.a = j;
    }

    public static long a(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = b(j);
        }
        if ((i & 2) != 0) {
            f2 = c(j);
        }
        return XTd3.c(f, f2);
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long d(long j, long j2) {
        return XTd3.c(b(j) - b(j2), c(j) - c(j2));
    }

    public static final long e(long j, long j2) {
        return XTd3.c(b(j2) + b(j), c(j2) + c(j));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mh5) {
            return this.a == ((mh5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append(b(j));
        sb.append(", ");
        sb.append(c(j));
        sb.append(") px/sec");
        return sb.toString();
    }
}
