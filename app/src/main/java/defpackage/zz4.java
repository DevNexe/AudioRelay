package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zz4 {
    public final float a;
    public final float b;

    public zz4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz4)) {
            return false;
        }
        zz4 zz4Var = (zz4) obj;
        return wm0.a(this.a, zz4Var.a) && wm0.a(this.b, zz4Var.b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        sb.append((Object) wm0.c(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) wm0.c(f + f2));
        sb.append(", width=");
        sb.append((Object) wm0.c(f2));
        sb.append(')');
        return sb.toString();
    }
}
