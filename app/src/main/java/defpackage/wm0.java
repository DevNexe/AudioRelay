package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wm0 implements Comparable<wm0> {
    public final float w;

    public /* synthetic */ wm0(float f) {
        this.w = f;
    }

    public static final boolean a(float f, float f2) {
        return ur1.a(Float.valueOf(f), Float.valueOf(f2));
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(wm0 wm0Var) {
        return Float.compare(this.w, wm0Var.w);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wm0) {
            return ur1.a(Float.valueOf(this.w), Float.valueOf(((wm0) obj).w));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.w);
    }

    public final String toString() {
        return c(this.w);
    }
}
