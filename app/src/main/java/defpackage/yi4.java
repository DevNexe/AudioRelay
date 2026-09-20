package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yi4 {
    public static final yi4 d = new yi4();
    public final long a;
    public final long b;
    public final float c;

    public yi4(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi4)) {
            return false;
        }
        yi4 yi4Var = (yi4) obj;
        if (yu.c(this.a, yi4Var.a) && kt2.a(this.b, yi4Var.b)) {
            return (this.c > yi4Var.c ? 1 : (this.c == yi4Var.c ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        int i = yu.i;
        return Float.floatToIntBits(this.c) + ((kt2.e(this.b) + (xc5.a(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        sb.append((Object) yu.i(this.a));
        sb.append(", offset=");
        sb.append((Object) kt2.i(this.b));
        sb.append(", blurRadius=");
        return dj.b(sb, this.c, ')');
    }

    public yi4() {
        this(hH.d(4278190080L), kt2.b, 0.0f);
    }
}
