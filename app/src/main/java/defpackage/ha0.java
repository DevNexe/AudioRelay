package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha0 {
    public static final long a = hH.f(0.0f, 0.0f);
    public static final /* synthetic */ int b = 0;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        if (b(j) == c(j)) {
            return "CornerRadius.circular(" + fp1.A0(b(j)) + ')';
        }
        return "CornerRadius.elliptical(" + fp1.A0(b(j)) + ", " + fp1.A0(c(j)) + ')';
    }
}
