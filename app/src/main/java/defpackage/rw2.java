package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rw2 {
    public final long a;
    public final ay2 b;

    public rw2() {
        long jD = hH.d(4284900966L);
        float f = 0;
        by2 by2Var = new by2(f, f, f, f);
        this.a = jD;
        this.b = by2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ur1.a(rw2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        }
        rw2 rw2Var = (rw2) obj;
        return yu.c(this.a, rw2Var.a) && ur1.a(this.b, rw2Var.b);
    }

    public final int hashCode() {
        int i = yu.i;
        return this.b.hashCode() + (xc5.a(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) yu.i(this.a)) + ", drawPadding=" + this.b + ')';
    }
}
