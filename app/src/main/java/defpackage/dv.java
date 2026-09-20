package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dv {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    static {
        long j = 3;
        long j2 = j << 32;
        a = (((long) 0) & 4294967295L) | j2;
        b = (((long) 1) & 4294967295L) | j2;
        c = j2 | (((long) 2) & 4294967295L);
        d = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        if (a(j, a)) {
            return "Rgb";
        }
        if (a(j, b)) {
            return "Xyz";
        }
        if (a(j, c)) {
            return "Lab";
        }
        return a(j, d) ? "Cmyk" : "Unknown";
    }
}
