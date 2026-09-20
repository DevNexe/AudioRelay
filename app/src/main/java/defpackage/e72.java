package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class e72 {
    public static final e72 g;
    public static final e72 h;
    public final boolean a;
    public final long b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;

    static {
        long j = zm0.c;
        g = new e72(false, j, Float.NaN, Float.NaN, true, false);
        h = new e72(true, j, Float.NaN, Float.NaN, true, false);
    }

    public e72(boolean z, long j, float f, float f2, boolean z2, boolean z3) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = z2;
        this.f = z3;
    }

    public final boolean a() {
        int i = Build.VERSION.SDK_INT;
        n94<h81<kt2>> n94Var = d72.a;
        return (i >= 28) && !this.f && (this.a || ur1.a(this, g) || i >= 29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e72)) {
            return false;
        }
        e72 e72Var = (e72) obj;
        if (this.a != e72Var.a) {
            return false;
        }
        return ((this.b > e72Var.b ? 1 : (this.b == e72Var.b ? 0 : -1)) == 0) && wm0.a(this.c, e72Var.c) && wm0.a(this.d, e72Var.d) && this.e == e72Var.e && this.f == e72Var.f;
    }

    public final int hashCode() {
        int i = this.a ? 1231 : 1237;
        long j = this.b;
        return ((ry0.b(this.d, ry0.b(this.c, (((int) (j ^ (j >>> 32))) + (i * 31)) * 31, 31), 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        if (this.a) {
            return "MagnifierStyle.TextDefault";
        }
        StringBuilder sb = new StringBuilder("MagnifierStyle(size=");
        sb.append((Object) zm0.c(this.b));
        sb.append(", cornerRadius=");
        sb.append((Object) wm0.c(this.c));
        sb.append(", elevation=");
        sb.append((Object) wm0.c(this.d));
        sb.append(", clippingEnabled=");
        sb.append(this.e);
        sb.append(", fishEyeEnabled=");
        return dj.c(sb, this.f, ')');
    }
}
