package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yu {
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final long a;

    public static final class QnHx {
        public static long a(float f) {
            int i = yu.i;
            js3 js3Var = hv.c;
            if ((0.0f > f ? 1 : (0.0f == f ? 0 : -1)) <= 0 && (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) <= 0) {
                return hH.b(b(f, 0), b(f, 8), b(f, 4), 1.0f, js3Var);
            }
            throw new IllegalArgumentException(("HSL (0.0, 0.0, " + f + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        public static float b(float f, int i) {
            float f2 = (i + 0.0f) % 12.0f;
            return f - (Math.max(-1.0f, Math.min(f2 - 3, Math.min(9 - f2, 1.0f))) * (Math.min(f, 1.0f - f) * 0.0f));
        }
    }

    static {
        new QnHx();
        b = hH.d(4278190080L);
        hH.d(4282664004L);
        c = hH.d(4287137928L);
        hH.d(4291611852L);
        d = hH.d(4294967295L);
        e = hH.d(4294901760L);
        hH.d(4278255360L);
        f = hH.d(4278190335L);
        hH.d(4294967040L);
        hH.d(4278255615L);
        hH.d(4294902015L);
        g = hH.c(0);
        h = hH.b(0.0f, 0.0f, 0.0f, 0.0f, hv.s);
    }

    public /* synthetic */ yu(long j) {
        this.a = j;
    }

    public static final long a(long j, fv fvVar) {
        if (ur1.a(fvVar, f(j))) {
            return j;
        }
        h60 h60VarO = fp1.O(f(j), fvVar, 2);
        float[] fArrN = hH.n(j);
        h60VarO.a(fArrN);
        return hH.b(fArrN[0], fArrN[1], fArrN[2], fArrN[3], fvVar);
    }

    public static long b(long j, float f2) {
        return hH.b(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        float fN;
        float f2;
        if ((63 & j) == 0) {
            fN = (float) ac.n((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fN = (float) ac.n((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fN / f2;
    }

    public static final float e(long j) {
        return (63 & j) == 0 ? ((float) ac.n((j >>> 32) & 255)) / 255.0f : uy0.c((short) ((j >>> 16) & 65535));
    }

    public static final fv f(long j) {
        float[] fArr = hv.a;
        return hv.u[(int) (j & 63)];
    }

    public static final float g(long j) {
        return (63 & j) == 0 ? ((float) ac.n((j >>> 40) & 255)) / 255.0f : uy0.c((short) ((j >>> 32) & 65535));
    }

    public static final float h(long j) {
        return (63 & j) == 0 ? ((float) ac.n((j >>> 48) & 255)) / 255.0f : uy0.c((short) ((j >>> 48) & 65535));
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j));
        sb.append(", ");
        sb.append(g(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        return bl2.c(sb, f(j).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yu) {
            return this.a == ((yu) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return xc5.a(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
