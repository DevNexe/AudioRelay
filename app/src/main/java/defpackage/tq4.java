package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tq4 {
    public static final long a = FWT.B(14);
    public static final long b = FWT.B(0);
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    static {
        int i = yu.i;
        c = yu.g;
        d = yu.b;
    }

    public static final Object a(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long b(long j, long j2, float f) {
        if (FWT.D(j) || FWT.D(j2)) {
            return ((z55) a(f, new z55(j), new z55(j2))).a;
        }
        if (!((FWT.D(j) || FWT.D(j2)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (a65.a(z55.b(j), z55.b(j2))) {
            return FWT.G(1095216660480L & j, C0239D.y(z55.c(j), z55.c(j2), f));
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) a65.b(z55.b(j))) + " and " + ((Object) a65.b(z55.b(j2)))).toString());
    }
}
